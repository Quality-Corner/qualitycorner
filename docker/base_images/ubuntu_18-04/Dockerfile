FROM ubuntu:18.04

RUN apt-get update && \
    apt-get install -y openssh-server && \
    apt-get install sudo

ENTRYPOINT service ssh start && tail -f