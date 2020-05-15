- eureka-server-1
- eureka-provider-1
- eureka-consumer-1

这三个是一个整体，想要注册多个一样的服务，就将 provider 的端口改一下启动即可

服务都带上了`server.servlet.context-path=`，==测试时候多加注意==

eureka-consumer-2 是有关 Feign 的样例，测试时候替代 eureka-consumer-1 即可

