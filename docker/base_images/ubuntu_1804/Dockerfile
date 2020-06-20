FROM ubuntu:18.04

# Install SSH
RUN apt-get update && apt-get install -y openssh-server

# Install sudo
RUN apt-get install -y sudo

# install ansible
RUN apt-get install -t ansible

# Create devuser and add to sudoers
RUN useradd -m -s /bin/bash jenkins
# TODO replace password
RUN echo 'jenkins:jenkins' | chpasswd
RUN usermod -aG sudo jenkins

CMD service ssh start && tail -f
