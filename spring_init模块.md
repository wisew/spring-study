## 配置文件
总共有4个地方放置，按优先级降序排

file代表模块根目录
- ./file/config/...：猜想<在启动的时候写在file下的会被加载到内存中，因为target并没有生成这个配置文件>
- ./file/...
- classpath/config/...
- classpath/...  
可以通过application-xxx分开配置，具体见项目配置，通过spring.profiles.active指定使用哪一个配置文件
## 包装bean对象
- Emp展示如何通过配置文件包装一个对象
    - 可以Validated(Animal)
- Student展示通过Value注解包装对象，Value注解在使用时如果读取配置文件则只能读取.properties中的配置
## 对象的依赖注入
- 通过xml文档配置
    - xml见spring-mvc.xml
    - 在SpringInitApplication加上ImportResource注解
    - 获取方式见SpringInitApplicationTests
- EmpConfig类配置
## 日志配置
> slf4j实现了log4j、log4j2、logback
日志的适配，通过slf4j的LoggerFactory去获得项目的日志，
切换日志无需改动代码
- 配置默认的LockBack日志    
```
见logback.xml文档  
logback-spring.xml可以指定springProfile，通过spring.profiles.active指定使用哪个  
logback.xml的优先级高于logback-spring.xml
```
- 使用log4j2日志
```
去掉默认的logback配置
引入log4j2日志
具体见pom.xml
配置方式见log4j-dev.xml
动态指定配置只能通过配置application的logging,没有springProfile标签
```
## 静态资源文件路径映射
> 默认的静态资源查找顺序
> - classpath:/META-INF/resources/
> - classpath:/resources/
> - classpath:/static/
> - classpath:/public


示例：webjars > 前段的打包成jar给后段使用，可直接在maven配置
    路径映射:`localhost:8080/webjars/>>>映射到jar包下的META-INF/resources/webjars`

除了上面四个默认的静态资源存放位置，也可以自定义静态资源路径，见application.properties中的注释掉的
## Thymeleaf模板引擎配置
见application.yml
## spring boot热部署
- 取消模板缓存
- 配置pom.xml
- build project
