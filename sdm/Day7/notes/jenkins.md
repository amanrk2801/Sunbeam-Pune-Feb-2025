# Jenkins

## installation

```bash

# update apt cache
> sudo apt-get update

# install jdk
> sudo apt-get install -y openjdk-17-jdk

# download the jenkins apt repository key
> sudo wget -O /etc/apt/keyrings/jenkins-keyring.asc \
  https://pkg.jenkins.io/debian-stable/jenkins.io-2023.key

# add the jenkins apt repository
> echo "deb [signed-by=/etc/apt/keyrings/jenkins-keyring.asc]" \
  https://pkg.jenkins.io/debian-stable binary/ | sudo tee \
  /etc/apt/sources.list.d/jenkins.list > /dev/null

# update apt cache
> sudo apt-get update

# install jenkins
> sudo apt-get install -y jenkins

# check the status of jenkins
> sudo systemctl status jenkins

# start the jenkins service
> sudo systemctl start jenkins

# auto start jenkins on startup
> sudo systemctl enable jenkins

```

## configuration

```bash

# visit the url: http://localhost:8080
# get the initial password
> sudo cat /var/lib/jenkins/secrets/initialAdminPassword

# please install the suggested plugins

```

## jenkins job

```bash

# create a custom image
# > docker image build -t <docker hub username>/website .

# login with docker hub using auth token
# > echo <docker hub token> | docker login -u <docker hub username> --password-stdin

# push the image to docker hub
# > docker image push <docker hub username>/<image name>

# create a service to run the application with multiple containers
# > docker service create --name website -p 9090:80 <docker hub username>/<image name>


```

```bash

# make sure the jenkins has the docker group privileges
> sudo usermod -aG docker jenkins

# restart the jenkins server
> sudo systemctl restart jenkins

# set the /usr/bin in environment PATH variable
# export PATH=$PATH:/usr/bin

# remove the running service
/usr/bin/docker service rm website

# sleep for 10 seconds till the container is getting removed
sleep 10

# remove the existing image version
# /usr/bin/docker image rm amitksunbeam/website

# rebuild the new version of docker image
/usr/bin/docker image build -t amitksunbeam/website .

# login using docker hub token
echo <token> | /usr/bin/docker login -u amitksunbeam --password-stdin

# push the image to docker hub
/usr/bin/docker image push amitksunbeam/website

# create the service with latest changes
/usr/bin/docker service create --name website -p 9090:80 amitksunbeam/website

```
