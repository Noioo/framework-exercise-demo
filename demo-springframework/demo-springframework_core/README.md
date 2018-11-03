# yag-demo-springcore
## 前述

> Java: `1.8`
>
> Maven: `3`
>
> SpringFramework版本以及各组件成员: `5.1.1.RELEASE`
>
> - spring-context
> - spring-core
> - spring-beans
>
> testNG-`6.14.3`

## 说明
* `aop` - Spring-AOP
* `ioc` - 依赖注入
* `resource` - Spring所提供的一种访问底层资源的方式
* `validation` - 数据验证
* `data_buffers` - Spring所提供的一组抽象来处理各种字节缓冲API(Java NIO)
* `spel` - Spring Expression Language

---

## Bean与依赖注入(`ioc`)

### 基于XML配置的一系列实现(`ioc.xml`)

配置文件: `ioc/xml-config.xml`

以`Bean`结尾: Bean类

以`BeanUser`结尾: Bean的使用者类, 均依赖`Bean`. 

测试: `yag.ioc.XmlConfigTest`

### 基于Java(注解)配置的一系列实现(`ioc.java`)

配置注解扫描: `ioc/java-config.xml`  

以`Bean`结尾: Bean类  

以`BeanUser`结尾: Bean的使用者类, 均依赖`Bean`.  
 
测试: `yag.ioc.JavaConfigTest`

### 关于IoC容器(`ioc.the_container`)

---

## AOP 面向切面编程(`aop`)


## resource 底层资源访问
