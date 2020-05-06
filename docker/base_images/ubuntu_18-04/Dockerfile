FROM ubuntu:18.04
ARG chngJenkinsPwd= jenkins:3InchSausage
RUN apt-get update && \
    apt-get install -y openssh-server && \
    apt-get install sudo && \


# add jenkins and add to sudoers
RUN useradd -m -s /bin/bash jenkins
RUN echo ${chngJenkinsPwd} | chpasswd
RUN usermod -aG sudo jenkins

ENTRYPOINT service ssh start && tail -f