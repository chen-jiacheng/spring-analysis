# spring-analysis-mybatis


> MyBatis 是 Apache 的一个开源项目iBatis,2010项目迁移到GoogleCode 改名为MyBatis.


MyBatis 是一个优秀的持久层框架.


## 1. MyBatis 单独使用

## 2. Spring 整合 MyBatis

## 3. 源码分析
### 3.1 sqlSessionFactory 的创建

1. ApplicationListener
    - EventListener
2. FactoryBean<T>
3. InitializingBean

### 3.2 MapperFactoryBean 的创建
1. SqlSessionDaoSupport
2. FactoryBean<T>

### 3.3 MapperScannerConfigurer 的创建
1. BeanDefinitionRegistryPostProcessor
2. InitializingBean
3. ApplicationContextAware
4. BeanNameAware