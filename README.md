# spring-boot-sample
spring boot sample with cloud by pkrss

author blogs: http://blogs.pkrss.com  
author website: https://www.pkrss.com  

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

pkrss_microsrv_config 18001      config.microsrv.docker.pkrss.com     中心配置
pkrss_microsrv_discovery 18002   discovery.microsrv.docker.pkrss.com  注册发现
pkrss_microsrv_consul 18003      consul.microsrv.docker.pkrss.com     注册发现2
pkrss_microsrv_gateway 18004 gateway.microsrv.docker.pkrss.com  服务网关
pkrss_microsrv_hystrix_dashboard 18005 hystrix_dashboard.microsrv.docker.pkrss.com 服务管理后台


a.microsrv.docker.pkrss.com 19001                              AServer
b.microsrv.docker.pkrss.com 19002                              BServer

