# Advanced Java

## Advanced Java
* Contents
    * JDBC
    * Servlets
    * JSPs and Java Beans
    * Filters and Listeners
    * Hibernate/JPA
    * Spring: Beans, Dependency Injection, MVC, REST
    * Spring Boot: Spring Data, Spring REST api
* Prerequisites
    * Java
        * OOP: Class, Object, Inheritance, Interfaces.
        * Exceptions
        * Collections: ArrayList, HashMap.
        * IO: PrintWriter -- printf(), println()
        * Threads: ThreadPool
        * JDBC
        * Functional Programming: Lambda expressions, Method references, Streams, ...

## Agenda
* Maven
* JDBC
* Optional
* Tomcat in STS

## Maven
* Maven is Java Build Tool.
* Maven does following.
	* Download dependencies (jar) from central/remote repository into local repository.
	* Compile source code.
	* Package compiled code into JAR or WAR files.
	* Install/Deploy the packaged code.
* Maven can be installed on any OS as a command line utility -- mvn.
* All modern Java IDEs have built-in support for Maven.

### Maven repositories
* Local repository
	* Maven downloads all dependencies into local repository.
	* Local repository location.
		* Linux: /home/username/.m2
		* Windows: C:/Users/username/.m2
	* Jars from this path are added into project CLASSPATH.
* Central repository
	* Provided by Maven community.
	* https://mvnrepository.com/repos/central
	* Hosts all standard jars published by respective vendors.
	* If jars not present in local repository, they will be downloaded from central repository.
* Remote repository
	* Hosted on a web-server to maintain organization specific dependencies.
	* Similar to central repository.
	* Need to configure in Maven pom.xml or settings.

### pom.xml
* pom.xml is heart of Maven.
* POM - Project Object Model.
* It is located into root of Maven project.
* pom.xml holds build details of the project. 
	* profiles
	* dependencies
	* build plugins

#### dependencies
* `<dependency>`
* Third-party jars to be added into the project.
* Dependency is uniquely identified by the groupId, artifactId and version.
* All jars auto-downloaded from Maven repository and added into project CLASSPATH.

#### profiles
* `<profile>`
* Maven enable building projects in different configurations like dev, test, production, etc.
* It enables doing changes in build steps/config for certain profile.

#### build plugins
* Allows to add user-defined actions in the build process.
* Implemented by frameworks for customization in build process.

### Maven build process
* Maven build process can be understood with build life-cycle, build phases and goals.

#### Build life cycle
* Maven follows certain build life cycle while building any project.
* Maven build life cycles
	* default: Build the project as per given build phase.
	* clean: Deletes all generated files.

#### Build phase
* A build life cycle is divided into sequence of multiple build phases.
* Important build phases in default build life cycle.
	* validate: Check project pom.xml syntax. Downloads all dependencies (if not present in local repository).
	* compile: Compile source code of the project.
	* test: Execute given unit tests against the compiled source code using a suitable unit testing framework.
	* package: Pack the generated files into given package (jar or war).
	* install: Copy the package into the local repository. It can be used in other projects on local machine.
	* deploy: Copy the final package to the remote repository for sharing with other developers and projects.

### Parent POM
* Project pom.xml can be inherited from parent pom.xml using <parent>.
* By default all details (like properties, build, etc) of parent POM are inherited into child POM.
* Child POM can override the changes and can have additional details.
* The final POM (after inheritance) including all settings is referred as Effective POM.

### Reference
* http://tutorials.jenkov.com/maven/maven-tutorial.html
* https://www.youtube.com/watch?v=lMXBrlVFYA0


## JDBC
* JDBC is a specification given in form of interfaces and helper classes.
    * Helper Classes: DriverManager, Date, Timestamp, Blob, ...
    * Interfaces: Driver, Connection, Statement, PreparedStatement, CallableStatement, ResultSet, ...
* JDBC specification is implemented in JDBC drivers (Type IV drivers are vendor specific).
    * e.g. com.mysql.cj.jdbc.Driver -- inherited from java.sql.Driver interface.
* Important Interfaces:
    * Driver -- Responsible for creating db connection.
        * Driver should be registered with DriverManager. Typically registration is auto-completed (in static block) when driver class is loaded first time.
        * In Java SE applications, the driver classes are auto-loaded (due to Java SPI).
        * However, in Java EE applications driver class needs to be loaded explicitly (using Class.forName("(driver class name")).
        * DriverManager choose appropriate driver to connect to the db (as per url).
    * Connection -- Represents db connection.
        * Creates statements.
        * Does transaction management.
    * Statement -- Represents SQL query.
        * Execute query -- executeQuery("SELECT ...") and executeUpdate("non-SELECT ...").
        * Usually queries are built by string concatenation -- lead to SQL injection.
    * PreparedStatement -- Represents parameterized (?) SQL query.
        * Inherited from Statement
        * More efficient -- Query is compiled once and reused multiple times.
            ```Java
            String sql = "DELETE FROM users WHERE id=?";
            PreparedStatement stmt = con.preprareStatement(sql);
            stmt.setInt(1, userId1);
            stmt.executeUpdate(); // -- compile and execute query on db
            stmt.setInt(1, userId2);
            stmt.executeUpdate(); // execute query on db
            stmt.setInt(1, userId3);
            stmt.executeUpdate(); // execute query on db
            ```
    * ResultSet -- To process result of SELECT query.
        ```Java
        try(ResultSet rs = stmt.executeQuery()) {
            while(rs.next()) // fetch next row from db
            {
                int id = rs.getInt("col1");
                String name = rs.getString("col2");
                // ...
            }
        } // rs.close();
        ```

### JDBC Programming Steps
1. Dowload mysql driver and add it in project -- Automated using Maven (pom.xml).
2. Load and register driver class.
    ```Java
    Class.forName("com.mysql.cj.jdbc.Driver");
    // loads given class in JVM
        // execute static block
            // create "Driver" object and calls DriverManager.registerDriver(drv);
    ```
3. Create database connection.
    ```Java
    Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
    // find suitable driver from list of registered drivers
    // calls driver.connect() method to establish db connection
    // return connection
    ```
4. Create SQL statements.
    ```Java
    String sql = "SQL query with parameters";
    PreparedStatement stmt = con.preprareStatement(sql);
    ```
5. Execute the query and process the results.
    ```Java
    stmt.setParameter(1, val); // or stmt.setInt(), stmt.setString(), ...
    int count = stmt.executeUpdate(); // non-SELECT sql
    // OR
    ResultSet rs = stmt.executeQuery(); // SELECT sql
    while(rs.next()) {
        int id = rs.getInt("col1");
        String name = rs.getString("col2");
        // ...
    }
    rs.close();
    ```
6. Close all
    ```Java
    stmt.close();
    con.close();
    ```

### DAOs
* Standard practice to implement JDBC code is through DAL (Data Access Layer) a.k.a. DAO (Data Access Object).
* step1: Implement DBUtil -- Create new connection -- static field: Connection.
* step2: Implement POJO (a.k.a. Entity) classes.
* step3: Define DAO interface with desired methods.
* step4: Implement DAO class with fields Connection, PreparedStatemets.
* step5: Test DAO methods.
    * Open connection.
    * Create DAO object.
    * Invoke methods.
    * Close/Cleanup DAO object.
    * Close connection.

#### Example/Assignment -- Online Voting Systems
* DBUtil implementation
    * static private Connection con;
    * static methods to openConnection(), getConnection(), closeConnection().
* POJO classes
    * Candidate
    * User
* DAO interfaces
    ```Java
    public interface CandidateDao {
        //add a method to get list of all candidates
        List<Candidate> getAllCandidates() throws SQLException;
        // add a method to increment chosen candidate votes
        String updateVotes(int candidateId) throws SQLException;
        // add a method to get top 2 candidates
        List<Candidate> getTop2Candidates() throws SQLException;
        // add a method to get party wise votes
        LinkedHashMap<String, Integer> getPartywiseVotes() throws SQLException;
        // delete candidate details
        String deleteCandidateDetails(int candidateId)throws SQLException;
        // update candidate details
        String updateCandidateDetails(String newParty,int votes,int candidateId)throws SQLException;
    }
    ```
    ```Java
    public interface UserDao {
        //add a method for user's signin
        User signIn(String email, String password) throws SQLException;
        // add a method for getting user details(not admin) born between dates
        List<User> getUserDetails(Date begin, Date end) throws SQLException;
        // add a method for voter reg.
        String voterRegistration(User newVoter) throws SQLException;
        // update password
        String changePassword(String email, String oldPwd, String newPwd) throws SQLException;
        // delete voter details
        String deleteVoterDetails(int voterId) throws SQLException;
        // add a method to update voting status
        String updateVotingStatus(int voterId) throws SQLException
    }
    ```
* DAO classes
    * CandidateDaoImpl class
    * UserDaoImpl class
* Test methods in main()
