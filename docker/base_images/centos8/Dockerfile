FROM centos

RUN yes | yum update -y && \
        yum install -y openssh-server && \
        yes | yum install sudo && \
        yum install dnf && \
        yes | dnf install python3
RUN yum -y install initscripts && yum clean all

# add devuser and add to sudoers
RUN useradd -m -s /bin/bash jenkins
RUN echo 'jenkins:REPLACEME' | chpasswd
# RUN usermod -aG sudo jenkins

ENTRYPOINT systemctl enable sshd && systemctl restart sshd.service
