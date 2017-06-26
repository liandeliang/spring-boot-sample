# spring-boot-sample
spring boot sample with cloud by pkrss

author blogs: http://blogs.pkrss.com  
author website: https://www.pkrss.com  

# What

1. test two demo project a and b call other feignclient service
1. test zuul api proxy
1. test docker with spring boot

# how to build

build without generate docker image:  
$ mvn install

build with generate docker image:  
$ mvn clean package -D maven.test.skip=true -P docker

# prepare

install consul in host: consul.third.docker.pkrss.com

# how to run

$ mvn spring-boot:run

# port

** here is hosts profile **

' 192.168.x.x is your local network ip  
192.168.x.x consul.third.docker.pkrss.com  
192.168.x.x consul.microsrv.docker.pkrss.com  
192.168.x.x config.microsrv.docker.pkrss.com  
192.168.x.x discovery.microsrv.docker.pkrss.com  
192.168.x.x gateway.microsrv.docker.pkrss.com  


** here is port table **

| module     | port      | host     | description                        |
|:-----------|:--------- |:-------- |:---------------------------------- |
| consul     | tcp: 8300 8400 8500 8600\n udp:8301 8302 | consul.third.docker.pkrss.com |
| pkrss_microsrv_config | 18001 | config.microsrv.docker.pkrss.com | spring cloud config server |
| pkrss_microsrv_discovery | 18002 | discovery.microsrv.docker.pkrss.com  | spring cloud service discovery |
| pkrss_microsrv_consul | 18003 | consul.microsrv.docker.pkrss.com | spring cloud ??? (dns and profile?, i not sure) |
| pkrss_microsrv_gateway | 18004 | gateway.microsrv.docker.pkrss.com | spring api gateway |
| pkrss_microsrv_hystrix_dashboard | 18005 | hystrix_dashboard.microsrv.docker.pkrss.com | spring boot hystrix background monitor server |
| a.microsrv.docker.pkrss.com | 19001 | AServer | user demo 1 |
| b.microsrv.docker.pkrss.com | 19002 | BServer | user demo 2 |

* develop

1. how to change spring boot cloud config password in this sample project:  
   see it in: pkrss-microsrv-config\src\main\resources\bootstrap.yml
   
2. some urls  	
	http://<eurekaserver>/eureka/apps
	
other drafts:  
Docker 1.12 Swarm Mode集群实战(第三章): https://sanwen8.cn/p/34e2EJX.html
Docker 实战（五）：Docker Swarm Mode: http://www.tuicool.com/articles/nUbIn2z
基于docker1.12创建swarm集群: https://yq.aliyun.com/articles/58886

# run in aliyun 

。。。
      
# other docker command

(if is swarm mode, need manager)

list all node:  
$ docker node ls

list all container:  
$ docker ps

in docker container run command:  
$ docker exec -it mynginx /bin/sh /root/runoob.sh  
$ docker exec -it $(docker ps | grep pkrss-microsrv-b | awk {'print $1'}) ping consul.local  

# china aliyun docker accelerate
docker for windows: Setting > Daemon > Registry mirrors: add: xxxxxx.mirror.aliyuncs.com

# create new node
see: https://docs.docker.com/machine/drivers/hyper-v/
in china, download https://github.com/boot2docker/boot2docker/releases/download/v17.05.0-ce/boot2docker.iso save to %userprofile%\.docker\machine\cache\boot2docker.iso
docker-machine create -d hyperv --hyperv-virtual-switch "DockerNAT" --hyperv-disk-size "5000" --hyperv-memory "1024" manager
see: 一步步创建第一个Docker App —— 2. 创建 Docker化 主机 http://www.cnblogs.com/zhxshseu/p/011245978fc443fbc6f273ad7e22ed7c.html


