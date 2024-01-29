# spring-analysis-jdbc

> spring-jdbc 使用第三方数据库连接池,对sql的执行进行了简单的封装.


## 1. JDBC
### 1.1 对外提供接口
- 驱动管理 - DriverManager
- 驱动接口 - Driver
- 连接 - Connection
- 语句封装 - Statement
- 结果集 - ResultSet

### 1.2 各厂商实现
mysql-connector-java

### 1.3 Java SPI机制
本质上是通过反射创建实现类.

实现思路:
1. 固定配置文件路径 - META-INFO/services
2. 固定配置文件名为接口类型 - org.example.HelloService
3. 固定配置文件内容为接口实现类 - org.example.HelloServicePlusImpl

```
# 使用时通过调用JavaAPI,进行指定路径的搜索.
ServiceLoader<HelloService> loadedDrivers = ServiceLoader.load(HelloService.class);

# ServiceLoader 实现了Iterable接口,在调用Iterable接口内的方法时,进行反射创建实例.

```

## 2. 数据库连接池
常用数据库连接池:
1. Druid
2. Hikari
3. c3p0

## 3. spring-jdbc
使用时,需要给JdbcTemplate配置数据库连接池.