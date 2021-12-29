# docker build -t git .

FROM centos:7
MAINTAINER JeanneBM

WORKDIR /GIT

#RUN yum install openssh-server sudo nano epel-release openssl certmonger; systemctl enable sshd.service -y

RUN yum update -y
RUN yum install git -y
RUN git --version

RUN mkdir Repo
RUN cd Repo
RUN git init

EXPOSE 22
