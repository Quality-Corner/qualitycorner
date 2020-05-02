FROM ubuntu:18.04
RUN apt-get update && \
    yes | apt-get install ansible
COPY inventory.txt ubuntu_updates.yml .