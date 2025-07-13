# Kubernetes

## installation (minikube)

```bash

# download minikube for linux
> curl -LO https://github.com/kubernetes/minikube/releases/latest/download/minikube-linux-amd64

# install minikube
> sudo install minikube-linux-amd64 /usr/local/bin/minikube && rm minikube-linux-amd64

# open ~/.bashrc and add the following line
# alias kubectl="minikube kubectl --"
> vim ~/.bashrc

# restart the terminal or
> source ~/.bashrc

```

## cluster management

```bash

# check the cluster status
> minikube status

# create a cluster
# note: this command will create a linux virtual machine (container)
> minikube start

# connect the linux virtual machine
> minikube ssh

# stop the cluster
# note: this command will NOT delete the cluster
> minikube stop

# delete the cluster
# note: once deleted, the cluster can not be retrieved
> minikube delete

# get the cluster info
> kubectl cluster-info

# start the minikube dashboard
> minikube dashboard

# expose a service for outside access
# > minikube service <service name>
> minikube service mywebsite

```

## generic commands

```bash

# get list of object
# > kubectl get <object type>

# get details of selected object
# > kubectl describe <object type> <object name>

# delete an object
# > kubectl delete <object type> <object name>

```

## node

```bash

# get the list of nodes
> kubectl get nodes

# get details of a selected node
# > kubectl describe node <node name>

# delete a node
# > kubectl delete node <node name>

```

## namespace

```bash

# get list of namespaces
> kubectl get namespaces
> kubectl get ns

# get details of selected namespace
# > kubectl describe ns <ns name>

# create a new namespace
# > kubectl create ns <ns name>
> kubectl create ns myns

# delete a namespace
# note: all the members of the namespace will also get deleted
# > kubectl delete ns <ns name>
> kubectl delete ns myns

```

## pod

```bash

# get the list of pods in default namespace
> kubectl get pods

# get the list of pods with more details
> kubectl get pods -o wide

# get the list of pods in a selected namespace
# > kubectl get pods -n <ns name>
> kubectl get pods -n kube-system

# create a pod using yaml file
# > kubectl create -f <file name>

# get details of selected pod
# > kubectl describe pod <pod name>
> kubectl describe pod pod1

# delete selected pod
# > kubectl delete pod <pod name>
> kubectl delete pod pod1

```

## service

```bash

# get list of services
> kubectl get services
> kubectl get svc

# create a new service
# > kubectl create -f <file name>

# get details of selected service
# > kubectl describe service <service name>

```
