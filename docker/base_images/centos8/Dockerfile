FROM centos

RUN yes | yum update -y && \
        yum install -y openssh-server && \
        yes | yum install sudo && \
        yum install dnf && \
        yes | dnf install python3

# add devuser and add to sudoers
RUN useradd -m -s /bin/bash jenkins
RUN echo 'jenkins:3InchSausage' | chpasswd
# RUN usermod -aG sudo jenkins

ENTRYPOINT service ssh start
