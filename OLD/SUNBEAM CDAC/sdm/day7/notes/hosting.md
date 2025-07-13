# cloud

- NOTE:

  - please please please make sure you are in Mumbai region
  - you may get the selected region from top corner

- elastic

  - degree of expanding and shrinking the resources automatically

- services
  - compute:
    - used to create virtual machines
    - e.g.
      - EC2: used to create virtual machine
      - lambda: serverless computing
      - beanstalk: used to deploy the application without configuring VMs
  - storage:
    - used to create storage on cloud
    - types
      - block storage:
        - used to create disks for VMs
        - e.g. EBS (elastic block storage)
      - file storage:
        - used to share files with users for parallel access
        - e.b. EFS (elastic file service)
      - object storage:
        - used to store files as objects
        - e.g. S3 (simple storage service)
  - database services
    - RDS: RDBMS service
      - e.g. MySQL, MariaDB, SQL Server, Oracle
    - NoSQL
      - e.g. Redis, RedShift, DynamoDB (serverless database)
  - container service
    - ECS (Elastic Container Service)
      - AWS manages docker swarm
  - kubernetes services
    - EKS (Elastic Kubernetes Service)

## EC2

- elastic compute cloud
  - used to create EC2 instance (virtual machine)
- attributes
  - name: app-server
  - AMI: Ubuntu 24.04 LTS server
  - architecture: 64 (x86)
  - instance type: t2.micro
    - configuration of CPU and Memory
  - key pair settings
    - name: dac-mar-24
    - type: RSA
    - format: .pem
  - disk storage: 10GB

### connect to the EC2 instance

```bash

# connect to the EC2 instance
# > ssh -i <pem file name> ubuntu@<public ip address of instance>
> ssh -i ~/Downloads/dac-mar-24.pem ubuntu@3.110.179.45

# if you get this error "WARNING: UNPROTECTED PRIVATE KEY FILE!"
> chmod 400 ~/Downloads/dac-mar-24.pem

```

### configure mysql

- execute these commands on ec2 instance

```bash

# update the APT repository
> sudo apt-get update

# install mysql
> sudo apt-get install mysql-server

# open with root access
> sudo mysql

# set root user's password
> ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root';
> FLUSH PRIVILEGES;

# initialize the DB Schema

```

### configure node

```bash

# download curl
> sudo apt-get install -y curl

# update apt repository with node source
> curl -fsSL https://deb.nodesource.com/setup_22.x -o nodesource_setup.sh
> sudo -E bash nodesource_setup.sh

# install nodejs
> sudo apt-get install -y nodejs

```

### configure apache

```bash

# install apache2
> sudo apt-get install apache2

# check the status
> sudo systemctl status apache2

# start apache2 server
> sudo systemctl start apache2

# enable apache2 server for every reboot
> sudo systemctl enable apache2

```

### configure backend

- execute these commands on your machine

```bash

# go to the code directory
# archive the server directory
> tar -cvf server.tar server

# upload the server.tar to ec2 instance
# > scp -i <pem file> <file to be uploaded> ubuntu@<public ip>:~/
> scp -i ~/Downloads/dac-mar-24.pem server.tar ubuntu@3.110.179.45:~/

```

- execute the following commands on ec2 instance

```bash

# extract the server.tar
> tar -xvf server.tar

# install pm2 package to run application server continuously
> sudo npm install -g pm2

# start the server using pm2
> cd server
> pm2 start --name sample-server server.js

# list the servers running using pm2
> pm2 list

# restart all the servers using pm2
> pm2 restart all

```

### configure frontend

- execute these commands on your machine

```bash

# update the backend IP address in config.js
# go to the client directory

# build the react app
> yarn build

# go to build directory
> cd build

# archive all the files in the build directory
> tar -cvf website.tar *

# upload website.tar to ec2 instance
# > scp -i <pem file> <source file> ubuntu@<public ip>:~/
> scp -i ~/Downloads/dac-mar-24.pem website.tar ubuntu@3.110.179.45:~/

```

- execute the following commands on ec2 instance

```bash

# go to /var/www/html
> cd /var/www/html

# remove the existing file(s)
> sudo rm -rf *

# move the website.tar to current directory
> sudo mv ~/website.tar .

# extract the website.tar
> sudo tar -xvf website.tar

```

### configure security

- on EC2 dashboard select the ec2 instance
- select security tab below the list
- click the security group
- click "Edit inbound rules"
- add following ports
  - Type: Custom Port, Port Range: 4000, Source: Any-IPV4
  - Type: Custom Port, Port Range: 80, Source: Any-IPV4
- save the rules
