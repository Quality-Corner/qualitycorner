FROM ubuntu:18.04

# Install SSH
RUN apt-get update && apt-get install -y openssh-server

# Install sudo
RUN apt-get install -y sudo

# Create devuser and add to sudoers
RUN useradd -m -s /bin/bash devuser
RUN echo 'devuser:REPLACEME' | chpasswd
RUN usermod -aG sudo devuser

CMD service ssh start && tail -f
