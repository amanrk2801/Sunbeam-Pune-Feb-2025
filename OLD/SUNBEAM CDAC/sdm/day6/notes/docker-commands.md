# Docker

## image

- image registry
  - collection of docker images
  - types
    - private
      - hosted by an organization for its own use
      - only organization has an access to such registry
    - public
      - hosted for general public
      - the main registry hosted by docker is available at https://hub.docker.com (default)

```bash

# get the list of images available on the machine
> docker image ls

# download or pull an image from registry
# > docker image pull <image name>
> docker image pull hello-world
> docker image pull node
> docker image pull httpd
> docker image pull mysql
> docker image pull mongo

# get details of a selected image
# > docker image inspect <image name or id>
> docker image inspect hello-world

# remove a selected image
# > docker image rm <image name or id>
> docker image rm hello-world

# build the image
# -t: tag (image name)
# .: context (where the Dockerfile exists)
# > docker image build -t <image name> .
> docker image build -t mywebsite .

```

## container

```bash

# get the list of running containers
# states: RUNNING (up)
> docker container ls

# get the list of all containers
# states: CREATED, STOPPED (exited), RUNNING (up)
> docker container ls -a

# create a container
# > docker container create <image name or id>
> docker container create hello-world

# start a created/stopped container
# > docker container start <container name or id>
> docker container start 0619

# remove a stopped / exited container
# > docker container rm <container name or id>
> docker container rm 0619

# remove a running container
# > docker container rm --force <container name or id>
> docker container rm --force 0619

# run (create and start immediately) a container
# > docker container run <image name or id>
> docker container run hello-world

# run a container with name
# container name must be unique: multiple containers with same name can not run at the same time
# by default the container starts in attached mode
# - the container gets attached with the terminal where it gets started
# > docker container run --name <container name> <image name>
> docker container run --name c1 hello-world


# run a container im detached (in background) mode
# -i: the container can be interactive
# -t: get the terminal/teletype of container when needed
# -d: run the container in detached mode
> docker container run --name <container name> -i -t -d <image name or id>
> docker container run --name <container name> -itd <image name or id>

# run a container with port forwarding enabled
# > docker container run -itd --name <container name> -p <source port>:<container port> <image name>
> docker container run -itd --name httpd -p 8000:80 httpd

# run a container with volume attached
# > docker container run -itd --name <container name> -v <volume name>:<mount directory> <image name>


# execute a command inside a RUNNING container
# > docker container exec <container name or id> <command>
> docker container exec httpd date

# get the terminal of a container to execute command(s)
> docker container exec -it <container name> bash
> docker container exec -it <container name> sh

```

## Dockerfile

- image: set of instructions
- used to create a custom image
- used to containerize an application
- contains the command(s) along with their parameter
- commands

  - FROM
    - used to decide the base image
    - the custom image will use all the contents of base image
    - it is mandatory to set the base image for every custom image
  - COPY
    - used to copy the file(s) / directories from local machine to the image
    - e.g. COPY index.html /usr/local/apache2/htdocs
      - this command will copy the file named index.html from current directory to the /usr/local/apache2/htdocs of image
  - EXPOSE
    - used to expose the port from the container
  - RUN
    - will execute the command immediately at the time of creating an image
    - dockerfile may refer to multiple RUN commands
  - CMD
    - will execute the command only when the container gets created
    - there must be only one CMD in a given Dockerfile since the container can run one and only one command (specified in the CMD)
  - WORKDIR
    - set the working directory

- create a custom image
  - create a file named Dockerfile
  - configure the Dockerfile to containerize the application
  - build the image
  - create a container

## exercise

- run mysql inside container

```bash

# pull the mysql image
> docker image pull mysql

# create a container to run mysql
> docker container -itd --name mysql -e MYSQL_ROOT_PASSWORD=root -v mysql-volume:/var/lib/mysql mysql

```

## volume

- used to persist the data
- volume = storage

```bash

# get the list of volumes
> docker volume ls

# create a volume
# > docker volume create <volume name>
> docker volume create mysql-volume

```

# docker swarm

## swarm

```bash

# check if the cluster is already started
> docker info | grep Swarm

# create a swarm (cluster)
> docker swarm init

# stop the swarm
> docker swarm leave --force

```

## node

- a machine with docker installed
- every machine part of a swarm is known as node

```bash

# get the list of nodes which are part of this swarm
> docker node ls

# get details of selected node
> docker node inspect <node id>


```

## service

- used to manage the containers
- used as load balancer

```bash

# get the list of services
> docker service ls

# create service
# > docker service create --name <service name> --replicas <desired count> <image name>
> docker service create --name httpd --replicas 5 httpd

# create service with port forwarding
# > docker service create --name <service name> --replicas <desired count> -p <source port>:<container port> <image name>
> docker service create --name httpd --replicas 5 -p 8000:80 httpd

# scale the service
# > docker service scale <service name>=<new desired count>
> docker service scale service1=10

# get the containers list created by service
# > docker service ps <service name>
> docker service ps httpd

# remove a service
# > docker service rm <service name>
> docker service rm httpd

```
