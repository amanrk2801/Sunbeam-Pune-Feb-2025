# minikube

## installation

```bash

# download minikube executable
> curl -LO https://storage.googleapis.com/minikube/releases/latest/minikube-linux-amd64

# install the minikube
> sudo install minikube-linux-amd64 /usr/local/bin/minikube && rm minikube-linux-amd64

# add the following line in ~/.bashrc file
> vim ~/.bashrc
# alias kubectl="minikube kubectl --"

# reload the bashrc changes
> source ~/.bashrc

# or restart the terminal

```

## minikube commands

```bash

# start the cluster
> minikube start

# check the status of cluster
> minikube status

# stop the cluster
> minikube stop

# delete the cluster
> minikube destroy

# open kubernetes control plane
> minikube dashboard

```

## node commands

```bash

# get the list of nodes
> kubectl get node
> kubectl get nodes

# find the details of selected node
# > kubectl describe node <node name>
> kubectl describe node minikube

```

## pod

```bash

# get the list of pods
> kubectl get pods
> kubectl get pod
> kubectl get po

# create a pod
# -f: file name
# > kubectl create -f <pod yaml file>
> kubectl create -f pod1.yaml

# get details of selected pod
# > kubectl describe pod <pod name>
> kubectl describe pod pod1

# delete a selected pod
# > kubectl delete pod <pod name>
> kubectl delete pod pod1

```

## replica set

```bash

# get the list of replica sets
> kubectl get replicasets
> kubectl get rs

# create a replica set
# > kubectl create -f <replica set yaml>
> kubectl create -f rs1.yaml



```
