FROM ubuntu:18.04
RUN apt-get update && \
    yes | apt-get install ansible && \
    apt-get install -y openssh-server

ENTRYPOINT service ssh start