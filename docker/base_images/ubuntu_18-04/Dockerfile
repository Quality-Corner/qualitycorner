FROM ubuntu:18.04
RUN apt-get update && \
    yes | apt-get install ansible

COPY ./home/jenkins/jenkins_slave/workspace/Docker_Deploy_Learning/docker/ansible .