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