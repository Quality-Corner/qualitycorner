FROM ubuntu:18.04

RUN apt-get update && \
apt-get install -y openssh-server && \
apt-get install sudo && \
yes | apt-get install python

 # add devuser and add to sudoers
RUN useradd -m -s /bin/bash jenkins
# TODO replace password
RUN echo 'jenkins:REPLACEME' | chpasswd
RUN usermod -aG sudo jenkins
CMD service ssh start
CMD tail -f
#ENTRYPOINT service ssh start && tail -f