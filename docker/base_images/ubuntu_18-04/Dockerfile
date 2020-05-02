FROM ubuntu:18.04
RUN apt-get update && \
    yes | apt-get install ansible
ADD /home/jenkins/jenkins_slave/workspace/Docker_Deploy_Learning/ansible/inventory.txt /