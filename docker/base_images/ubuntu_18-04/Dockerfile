FROM ubuntu:18.04
ARG chngJenkinsPwd='jenkins:3InchSausage'
RUN apt-get update && \
    apt-get install -y openssh-server && \
    apt-get install sudo && \

ENTRYPOINT service ssh start && tail -f