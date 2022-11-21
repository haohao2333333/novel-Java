# novel-Java

- 前台项目（更新中）：[GitHub](https://github.com/haohao2333333/novel-vue) ｜ [码云]()
- 后台项目（更新中）：[GitHub](https://github.com/haohao2333333/novel-admin) ｜ [码云]()
- 后端项目（更新中）：[GitHub](https://github.com/haohao2333333/novel-Java) ｜ [码云]()

## 技术

- 前端技术：Vue, vuex, element-plus, axios
- 后端技术：Spring Boot, Mybatis-plus, pagehelper, Spring Security, swagger, Spring Cloud, Spring Cloud Alibaba, elasticsearch, redis
- 开发环境: Java 17, MySQL 8, node 16, Maven 3.8, redis 7,IDEA 2022(可选)

### 前端技术选型

|     技术     | 版本 |
| :----------: | :--: |
|    Vue.js    | 3.2  |
|  Vue Router  | 4.0  |
|    axios     | 0.27 |
| element-plus | 2.2  |

### 后端技术选型

|         技术         |    版本    |
| :------------------: | :--------: |
|     Spring Boot      |   2.7.0    |
|     Spring Cloud     |  2021.0.3  |
| Spring Cloud Alibaba | 2021.0.1.0 |
|       swagger        |   3.0.0    |
|     Mybatis-plus     |   3.5.2    |
|      PageHelper      |   1.4.2    |

## 目录结构

- nas-alibaba
  - nas-nacos
  - nas-sentinel
  - nas-seata
  - nas-rocketmq
- nas-commom-db - 数据库连接模块
- nas-common - 公共库模块
- nas-security
  - nas-gateway - 网关服务，负责请求转发和鉴权功能
  - nas-oauth2 - 认证服务，负责对登录用户进行认证
- nas-service
  - nas-audio - 音频微服务
  - nas-novel - 小说微服务
  - nas-user - 用户微服务
  - nas-video - 视频微服务
- nas-service-api - 实体类模块

## 代码使用方法

### 1.拉取项目

***1.git 下载***

```
git clone https://github.com/haohao2333333/novel-admin.git
```

***2.直接下载***

```
github code download
```

### 2.启动nacos

1. **下载[nacos](https://github.com/alibaba/nacos/releases/tag/2.1.2)服务注册中心**

2. **解压**

3. **打开bin目录**

4. **点击startup.exe开启nacos微服务** 

   ```
   (目录下 命令行: startup.cmd -m standalone)
   ```

5. **浏览器输入http://loalhost:8848 访问官网 账号: nacos 密码: nacos**

6. **启动失败 百度一下nacos单机模式启动**

### 3.创建MySQL表

1. **打开下载项目的doc/sql**
2. **将novel_system.sql录入到自己的数据库**

### 4.打开IDEA

- nas-audio - 音频微服务
- nas-novel - 小说微服务
- nas-user - 用户微服务
- nas-video - 视频微服务

1. **进入以上四个服务的application.yaml, 修改mysql的密码**
2. **进入以上四个服务的Java/com/haohao/服务名/Application 启动**

## API 接口

1. 项目配置了swagger3
2. 若要查看小说微服务的接口文档, 服务启动后在浏览器输入http://localhost:10087/swagger-ui/index.html即可, 其他服务亦是
## 项目截图

### 前台截图

### 后台截图

#### 1.登录截图
![image](https://user-images.githubusercontent.com/117864397/202909250-8058ec2c-b476-4109-b07f-4e627ae30972.png)
#### 2.用户列表
![image](https://user-images.githubusercontent.com/117864397/202909396-d500ebf9-0bb6-4f2a-ae0d-da6fe84da321.png)
#### 3.添加用户
![image](https://user-images.githubusercontent.com/117864397/202909575-e2b32cd4-2be5-4036-9af0-a9fddafc1391.png)
#### 4.编辑用户
![image](https://user-images.githubusercontent.com/117864397/202909715-2ab7cd15-b8cc-4546-bc25-d1ab25e8d088.png)
