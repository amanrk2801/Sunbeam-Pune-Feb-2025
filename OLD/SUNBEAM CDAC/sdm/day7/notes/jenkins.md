# jenkins

## installation

```bash

# download the key
> sudo wget -O /usr/share/keyrings/jenkins-keyring.asc https://pkg.jenkins.io/debian-stable/jenkins.io-2023.key

# add the key into apt repo
> echo "deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc]" \
    https://pkg.jenkins.io/debian-stable binary/ | sudo tee \
    /etc/apt/sources.list.d/jenkins.list > /dev/null

# install the jenkins
> sudo apt-get update
> sudo apt-get install fontconfig openjdk-17-jre
> sudo apt-get install jenkins

# check the jenkins service status
> sudo systemctl status jenkins

# start the jenkins service
> sudo systemctl start jenkins

# auto enable the jenkins service on every boot
> sudo systemctl enable jenkins


# visit the localhost:8080 url to install required jenkins plugins

```

## build using jenkins

```bash

# remove existing service
> docker service rm mywebsite

# remove existing image
> docker image rm mywebsite

# build the image with latest changes
> docker build -t mywebsite .

# create a service for running the latest changes
> docker service create --name mywebsite --replicas 5 -p 8000:80 mywebsite

```
