![2021-12-29 17_03_46-docker-compose yml - Visual Studio Code](https://user-images.githubusercontent.com/55690923/147681351-13c3d22c-cb3e-4a69-9cdc-d88cf470b659.png)


## Useful commands:
```
ifconfig // dla Win ipconfig 

docker run
docker stop; docker rm
docker build
docker create 
docker ps
docker images
docker container ls
docker volume ls
docker inspect //containerID// | grep IPAddress
docker inspect <containerNameOrId> | grep '"IPAddress"' | head -n 1
docker exec -it contID bash


sudo docker-compose up -d
whereis git
netstat -tnlp
chmod +x docker_env.sh //no such a command as script ./

//sudo: docker-compose: command not found//
sudo curl -L https://github.com/docker/compose/releases/download/1.21.0/docker-compose-$(uname -s)-$(uname -m) -o /usr/local/bin/docker-compose; sudo chmod +x /usr/local/bin/docker-compose; sudo ln -s /usr/local/bin/docker-compose /usr/bin/docker-compose

```

## Init
```
vagrant init centos/7
vagrant up
vagrant ssh

vagrant ssh-config >> C:/Users/ ... /.ssh/config

# /usr/bin/ssh init@127.0.0.1 -p 2222

sudo yum upgrade; sudo yum install -y vim; sudo yum install -y net-tools; sudo yum install -y wget; ssh-keygen; sudo yum install -y git; sudo yum install -y maven; 
```

## Static IP
https://www.itzgeek.com/how-tos/linux/centos-how-tos/how-to-configure-static-ip-address-in-centos-7-rhel-7-fedora-26.html


## Partition
```
lsblk; df -h
fdisk /dev/sda 
```
## Docker CE + Docker Compose:
```
sudo yum install -y yum-utils; sudo yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo; sudo yum install -y docker-ce docker-ce-cli containerd.io; yum list docker-ce --showduplicates | sort -r; sudo yum install -y docker-ce-<VERSION_STRING> docker-ce-cli-<VERSION_STRING> containerd.io; sudo systemctl start docker; sudo curl -L "https://github.com/docker/compose/releases/download/1.23.2/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose; sudo chmod +x /usr/local/bin/docker-compose; 
docker version; docker-compose --version
sudo groupadd docker; sudo usermod -aG docker $USER; sudo reboot ; [after reboot] sudo systemctl start docker; sudo systemctl status docker
```
## Jenkins:
```
sudo wget -O /etc/yum.repos.d/jenkins.repo https://pkg.jenkins.io/redhat-stable/jenkins.repo; sudo rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io.key; sudo yum upgrade; sudo yum install -y epel-release java-11-openjdk-devel; sudo yum install -y jenkins; sudo systemctl daemon-reload; sudo systemctl start jenkins; sudo systemctl enable jenkins; sudo systemctl status jenkins


```

## Git
```
git init; git add .; git commit -m "Final"; git remote add origin https:// ... .git
git push -u origin master

vim Dockerfile
docker build -t git .

git clone --depth [depth] [clone-url]
By using git clone --depth 1 repo , only the most recent commit on the default branch (main) is retrieved.
```

## Docker_env
```
docker run --name tomcat -it --rm -p 8888:8080 -d tomcat
docker run --name sonar -it --rm -p 9000:9000 -d sonarqube
docker run --name nexus -it --rm -p 8081:8081 -d sonatype/nexus3
docker run --name selenium_hub -it --rm -p 4441:4441 -d selenium/hub:4.1.0-20211209
docker run --name selenium_node_firefox -it --rm -p 4442:4442 -d selenium/standalone-firefox:4.1.0-20211209
docker run --name selenium_node_chrom -it --rm -p 4444:4444 -d selenium/standalone-chrome:4.1.0-20211209
docker run --name Jenkins -it --rm  -p 8080:8080 -p 50000:50000 -d -v /c/Users/.../app/jenkins:/var/jenkins_home jenkins/jenkins

[vagrant@JeanneBM ~]$ pwd
/home/vagrant
[vagrant@JeanneBM ~]$

```
