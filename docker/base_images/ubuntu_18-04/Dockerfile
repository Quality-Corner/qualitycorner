FROM ubuntu:18.04
RUN apt-get update && \
    apt-get install -y openssh-server

# add jenkins and add to sudoers
RUN useradd -m -s /bin/bash jenkins
RUN echo 'jenkins:3InchSausage' | chpasswd
RUN usermod -aG sudo jenkins

CMD service ssh start && tail -f