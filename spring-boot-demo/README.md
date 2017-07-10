# spring boot
如果使用了　`spring-boot-starter-parent`，会添加一个　run goal,　可以用　`mvn spring-boot:run`　直接运行.
To gracefully exit the application hit `ctrl-c`.

## 一些注解：

`@Configuration`
`@EnableAutoConfiguration`
`@ComponentScan`
`@RestController`
`@RequestMapping("/")`
`@Import` The @Import annotation can be used to import additional configuration classes. 
主动扫描：Alternatively, you can use `@ComponentScan` to automatically pick up all Spring components, including @Configuration classes.

`ImportResource` If you absolutely must use XML based configuration, we recommend that you still start with a @Configuration class. You can then use an additional @ImportResource annotation to load XML configuration files.

启动自动配置：You need to opt-in to auto-configuration by adding the `@EnableAutoConfiguration` or `@SpringBootApplication` annotations to one of your @Configuration classes.
*@EnableAutoConfiguration 应该只有一个，加在主要的 `Configuration`类上面*

`＠SpringBootApplication`一个相当于使用这三个的默认值`@Configuration, @EnableAutoConfiguration and @ComponentScan`

`@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})`  禁用某些自动配置


按照推荐的结构 (locating your application class in a root package), 添加 `@ComponentScan` 可以不用参数　. All of your application components (`@Component, @Service, @Repository, @Controller` etc.) will be automatically registered as Spring Beans.


## 配置文件
默认配置文件名　`pplication.properties` and YAML variants(.yml)
特定环境配置文件名　`application-{profile}.properties` and YAML variants(.yml),　例如 application-dev.properties, application-test.properties

默认读取配置文件的位置：当前目录/config, 当前目录，classpath/config, classpath, 按优先级下降　


## 示例　demo
demo01  最简单的启动　demo
demo02  @SpringBootApplication注解，分散　Controler
		不同参数　１．路径参数　2. 普通参数
demo03  排除一些 autoConfig
	    指定扫描的包: scanBasePackages
demo04  @ConfigurationProperties 配置到类上面和方法上面
		使用代码取property
demo05  简单定时器
demo06  非 web 项目启动，　main() and run()
demo07  返回html页面, freemarker
demo08  mongodb 配置，手动启动　mongo repository, basePackages 指定扫描路径
		@EnableMongoRepositories(basePackages={ "com.lifeix.leadread.spider"})
demo09  简单的测试用例
demo10  使用　Spring Context 的测试用例
demo11  使用　spring-boot-starter-data-jpa  (Hibernate实现)
		1. 单表查询　(有自动生成方法之类的)
		2. 关联查询
		3. 使用 EntityManager 实现自定义查询, limit






[spring boot 最新文档](https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#getting-started)  
