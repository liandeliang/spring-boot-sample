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
$ mvn install -P docker

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

module               port     host
---------------------------------------------------
consul  :tcp         8300 8400 8500 8600    consulagent
        :udp         8301 8302

pkrss_microsrv_config 18001      config.microsrv.docker.pkrss.com     # spring cloud config server
pkrss_microsrv_discovery 18002   discovery.microsrv.docker.pkrss.com  # spring cloud service discovery
pkrss_microsrv_consul 18003      consul.microsrv.docker.pkrss.com     # spring cloud ??? (dns and profile?, i not sure)
pkrss_microsrv_gateway 18004 gateway.microsrv.docker.pkrss.com  	  # spring api gateway
pkrss_microsrv_hystrix_dashboard 18005 hystrix_dashboard.microsrv.docker.pkrss.com # spring boot hystrix background monitor server

a.microsrv.docker.pkrss.com 19001                              AServer # user demo 1
b.microsrv.docker.pkrss.com 19002                              BServer # user demo 2

* develop

1. how to change spring boot cloud config password in this sample project:
   see it in: pkrss-microsrv-config\src\main\resources\bootstrap.yml
   
2. some urls
	
	http://<eurekaserver>/eureka/apps
