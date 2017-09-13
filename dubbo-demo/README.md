# dubbo 服务结构

## 基本服务组成

1. 定义服务接口: (该接口需单独打包，在服务提供方和消费方共享)
com.alibaba.dubbo.demo.DemoService

2. 服务提供方实现接口（对服务消费方隐藏实现）
com.alibaba.dubbo.demo.provider.DemoServiceImpl

3. 用Spring配置声明暴露服务
dubbo-demo-provider.xml

4. 加载Spring配置
com.zhch.dubbo.demo.provider.Provider

5. 通过Spring配置引用远程服务
dubbo-demo-consumer.xml

6. 加载Spring配置，并调用远程服务：(也可以使用IoC注入)
com.zhch.dubbo.demo.consumer.Consumer

## 用zookeeper作注册中心
只需搭一个原生的Zookeeper 服务器，并将 Quick Start 中Provider和Consumer里的conf/dubbo.properties中的dubbo.registry.addrss的值改为zookeeper://127.0.0.1:2181即可使用。
在provider和consumer中增加zookeeper客户端jar包依赖：
```
<dependency>
    <groupId>org.apache.zookeeper</groupId>
    <artifactId>zookeeper</artifactId>
    <version>3.3.3</version>
</dependency>
<dependency>
    <groupId>com.github.sgroschupf</groupId>
    <artifactId>zkclient</artifactId>
    <version>0.1</version>
</dependency>
```

## 版本控制
version可以在　<dubbo:provider/> <dubbo:consumer/>中设置(全局)，也可以在　<dubbo:service/> bean 中设置(个体)．

## dubbo 管理控制台安装
下载dubbo zip包，解压，进入dubbo-admin目录，运行`mvn package`生成 dubbo-admin 程序，cp到tomcat中运行即可．


refs:  
[8.2 Zookeeper注册中心](https://dubbo.gitbooks.io/dubbo-user-book/references/registry/zookeeper.html)  