# git

## basic workflow

```bash

# initialize an empty repository
> git init

# get the current status of the repository
> git status

# get the short status of the repository
> git status -s

# statuses
# note:
# - there will be two characters in the status
# - first character: shows the status of the file against the staging area
# - second character: shows the status of the file against the working
# ??: no version is created in the repository yet (untracked)
# A : the changes to the file are present in the staging area and will be added to the repository
#  M: the file is modified and present only in working directory
# M : the file is present in the staging area
#
#

# add the changes to the staging area
# > git add <file name(s)>

# add changes to all the files in the current directory
> git add .

# commit the changes to the repository
# > git commit -m <commit message>

# get the difference between the working directory version and the last version present in the repository
# +: the line added in the current version
# -: the line removed from the previous version
> git diff

# get the list of commits
> git log

# get the list of commits with
# - oneline: get only one line description of the log
# - graph: show the graph of the repository
# - color: show the colors while rendering the graph
> git log --oneline --graph --color

# remove all the changes made to the file (from working directory)
# > git checkout <file name>

# move all the changes from staging area to the working directory
> git reset

# remove all the changes from staging area and working directory
# note: please execute this command on your own risk
> git reset --hard

```
