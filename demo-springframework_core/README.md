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

### Bean与依赖注入

#### 基于XML配置的一系列实现(`yag.di.xml`)
> `BeanUser`就是依赖Bean类的类. 

配置文件: 
* `di/xml-config.xml`

Bean类
* `MethodBean.java` - 一个只有一个方法的Bean类, 许多BeanUser都将调用这个方法.
* `PojoBean.java` - POJO模式的Bean类, 用于一些传值实现. 

依赖注入(`injection_bean_user`)
* `ConstructionBeanUser.java` - 构造注入
* `SetterBeanUser.java` - 设值注入

自动装配(`byname_bytype`)
* `ByNameBeanUser.java` - byName
* `ByTypeBeanUser.java` - byType 

使用`@Autowired`(`annotation_autowired`)
* `AttributeAutowiredBeanUser.java` - 在属性上
* `ConstructionAutowiredBeanUser.java` - 在构造函数上
* `SetterAutowiredBeanUser.java` - 在Setter方法上

使用`@Qualifier`(`annotation_qualifier`)
* `ConstructionQualifierBeanUser.java` - 在构造函数上
* `SetterQualifierBeanUser.java` - Setter方法上

> `test/java`测试: `yag.di.XmlConfigTest`


#### 基于Java(注解)配置的一系列实现(`yag.di.java`)

配置文件: 
* 注解扫描: `di/java-config.xml`

Bean类: 
* `HelloWorld` 

依赖注入(`injection`)
* Setter: `injection.BeanUser`



> `test/java`测试: `yag.di.JavaConfigTest`
