# Docker swarm

## setup

```bash

# check if the machine (node) is a part of any swarm
# execute the following command and check the status of Swarm mode
> docker system info
> docker system info | grep Swarm

# initialize a swarm on the node
# note: the node on which the swarm is initialized, is considered to be a manager
> docker swarm init

# create a token for worker
> docker swarm join-token worker

# create a token for manager
> docker swarm join-token manager

# leave node the current swarm
> docker swarm leave --force

```

## node

```bash

# get the list of nodes
> docker node ls

# get the details of selected node
# > docker node inspect <node id>

# remove a selected node
# > docker node rm <node id>

# promote a worker
# > docker node promote <worker id>

# demote a manager
# > docker node demote <manager id>
```

## service

- performs
  - container management
  - scaling
  - load balancing
  - node management

```bash

# get the list of services
> docker service ls

# create a service
# - -p: used to publish a port on service
# > docker service create --name <service name> -p <host port>:<container port> <image>
> docker service create --name httpd-service -p 9090:80 httpd

# get the containers (tasks) created by the service
# > docker service ps <service name>
> docker service ps httpd-service

# scale (up or down) the service
# > docker service scale <service name>=<new desired count>

# remove selected service
# > docker service rm <service name or id>



```
