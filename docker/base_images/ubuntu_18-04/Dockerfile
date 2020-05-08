FROM ubuntu:18.04

RUN apt-get update && \
    apt-get install -y openssh-server && \
    apt-get install sudo && \
    yes | apt-get install python

# add devuser and add to sudoers
RUN useradd -m -s /bin/bash jenkins
RUN echo 'jenkins:3InchSausage' | chpasswd
RUN usermod -aG sudo jenkins

ENTRYPOINT service ssh start