FROM ubuntu:18.04
RUN apt-get update && \
    yes | apt-get install ansible
RUN cd ../..
COPY . .