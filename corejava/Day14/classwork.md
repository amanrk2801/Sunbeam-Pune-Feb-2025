
# Student class 
# Dbutil ---- Driver load , static Connection getConnection() 
# StudentDao --
#StudentDao Implementation imp 
#Program (Test) 


**************************************************
## Add Employee, Find Employee , Remove Employee , Print Employee
//  id , name , salary
## Employee ( name , empid , salary  ,serializable) 
   List<Employee>empList
   Employee[] getEmployee( )
   void addEmployee(Employee[] employees) , 
   void acceptRecord(int[ ] empid) 
   Employee findEmployee(int empid) 
   boolean removeEmployee(int empid)	 
   void printRecord(Employee emp)
   void printEmployees()
   static void writeRecord(String path) throws Exception 
   static void readRecord(String path)  throws Exception 




public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add Employee");
		System.out.println("2.Find Employee");
		System.out.println("3.Remove Employee");
		System.out.println("4.Update Employee");
		System.out.println("5.Print Employee[ Sorted ]");
		System.out.println("6.Write Record");
		System.out.println("7.Read Record");
		System.out.print("Enter the choice : ");
		return sc.nextInt();
	}




*************************************************
#demo02 
Creating process in java( rt.exec(note) , process.waitfor()) 

##demo04
*Creating the thread in java 
*// thread creation - method 1
// step1: create a new class inherited from thread class and override its run() method.
// step2: create object of that thread class and call its start() method.
*// thread creation - method 2
// step1: create a new class inherited from Runnable interface and implement its run() method.
// step2: create object of Thread class with the object of above Runnable class and call thread's start() method
//class YourRunnable implements ( Thread th2 = new Thread(new YourRunnable());) 

##demo05 - Daemon threads
// thread is by default non-daemon thread (foreground)
// daemon (background) threads are for giving services to non-daemon (foreground) threads.
// when all non-daemon threads in a java process are terminated, the JVM exits.
// due to this all daemon threads are automatically (forcefully) terminated.

// main thread is non-daemon thread (foreground)
* setDaemon()

## demo06 - Thread args
* Print table(num,i,num*i) (call start after join) 
* join() and priority (separate programs) 
*// calling thread i.e. main will wait for completion given thread i.e. th2 
*// calling thread i.e. main will wait for completion given thread i.e. th1 


##demo07 
Thread life cycle


##demo08
#// race condition -- when deposit() and withdraw() methods are not declared synchronized
#// avoid race condition -- when deposit() and withdraw() methods are not declared synchronized
// using "synchronized" block
#// avoid race condition -- declare deposit() and withdraw() methods are as synchronized






