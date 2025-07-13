# select the image to run express application
# since the alpine is used to create the node image, 
# it will be the smallest image for node
FROM node:lts-alpine3.20

# set the working directory
# the directory where you want to copy the application source code
# if the directory does not exist, the WORKDIR command 
# will create it inside the image
WORKDIR /src

# copy all the files in the current directory to 
# the working directory in the image
# first .: current local machine directory
# second .: working directory in the image (WORKDIR - /src)
COPY . .

# install all the dependencies while building the image
RUN npm install

# expose the port 4000 as the express app is listening on 4000
EXPOSE 4000

# when the container starts, lets start the express application
CMD node server.js
