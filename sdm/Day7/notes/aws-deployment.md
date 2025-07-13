# AWS

## launch a new instance

- name: web-server
- ami: ubuntu server 24.04
- instance type: t2.micro
- key pair
  - name: dac
  - type: RSA
  - format: .pem

## connecting ec2 instance

```bash

# go to the download directory
> cd ~/Downloads

# change the permissions
> chmod 400 ~/Downloads

# ssh to the ec2 instance
> ssh -i ~/Downloads/dac.pem ubuntu@<public ip address>

```

## install mysql server

- please connect to the ec2 instance and execute the following commands on ec2 instance

```bash

# update the apt cache
> sudo apt-get update

# install mysql
> sudo apt-get install mysql-server

# start the mysql server automatically on startup
> sudo systemctl enable --now mysql

# login with sudo privileges
> sudo mysql

# set root user password
> ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root';

# flush privileges
> FLUSH PRIVILEGES;

```

## configure backend

- please connect to the ec2 instance and execute the following commands on ec2 instance

```bash

# Download and install nvm:
> curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.40.3/install.sh | bash
> \. "$HOME/.nvm/nvm.sh"

# Download and install Node.js:
> nvm install 22

# Verify the Node.js version:
> node -v
> nvm current

# push the server code to git hub repository

```

- unblock required ports
  - select the ec2 instance
  - go to the security settings
  - click on the security groups
  - click the button "edit inbound rules"
  - add following rules
    - rule1: unblock 4000 for express app
      - type: custom port
      - port range: 4000
      - source: anywhere-ipv4
    - rule2: unblock 80 for react app
      - type: custom port
      - port range: 80
      - source: anywhere-ipv4

```bash

# install pm2
> npm install -g pm2

# go to the source code directory
> cd ~/server

# start the express server using pm2
> pm2 start server.js

# get the list of services running
> pm2 list

# restart the service
> pm2 restart <service id>

```

## deploy frontend

- note: please execute these commands on your local machine

```bash

# go to the source code directory

# build the project
# note: this command creates the build of the react app in dist directory
> yarn build

# go to the dist directory
> cd dist

# archive all the files in web.tar
> tar -cvf web.tar .

# upload the web.tar to the ec2 instance
> scp -i ~/Downloads/dac.pem web.tar ubuntu@<public ip of ec2>:~/

```

- execute below commands on ec2 instance

```bash

# install apache
> sudo apt-get install apache2

# move your website to the htdocs
> cd /var/www/html/
> sudo rm -rf *

# move the web.tar to the htdocs
> sudo mv ~/web.tar .

# unarchive web.tar
> sudo tar -xvf web.tar

# install LE certbot
> sudo snap install certbot --classic

# create the LE public cert
> sudo certbot --apache

```
