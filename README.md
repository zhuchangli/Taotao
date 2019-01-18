淘淘商城(IDEA)
===========
运行环境:
-------
 IDEA18.3+Maven3.6.0+MySQL8.0.13+Tomcat1.7+Ubuntu18.04

参考某培训机构,利用IDEA实现.项目设计功能

#### 项目功能:
1,功能聚合工程搭建,ssm框架整合;
2,商品添加,商品列表展示,商品添加中的商品类目选择;

#### 技术选型
1,数据库: mysql  
2,Dao层: mybatis,数据库连接池 (德鲁伊druid)  
3,缓存: redis  
4,Service层: spring  
5,表现层:  springmvc ,jstl , EasyUI, jsp   
6,Web服务器: tomcat   
7,工程管理: maven  

#### 教程
总体参考: 
[项目实战之淘淘商城](https://blog.csdn.net/yerenyuan_pku/column/info/15737/)
[参考工程1](https://github.com/MrSorrow/taotao) 
[参考工程2](https://github.com/williamHappy/tao-shopping-mall)
[视频教程](https://www.bilibili.com/video/av14344869/?spm_id_from=333.788.videocard.2)

##### 提交到git仓库
[博客](https://blog.csdn.net/qq_35246620/article/details/69668846)
##### 聚合工程搭建:
[参考博客1](https://blog.csdn.net/williamhappy/article/details/54376855#%E4%B8%80-%E9%A1%B9%E7%9B%AE%E5%B7%A5%E7%A8%8B%E7%9B%AE%E5%BD%95)
[参考博客2](https://blog.csdn.net/for_my_life/article/details/78939078)

##### SSM整合测试
1, taotao-manager-web 缺失Java和resource目录: [博客](https://blog.csdn.net/u014756827/article/details/52497572)

##### 首页展示
问题1:java.lang.ClassCastException: com.github.pagehelper.PageHelper cannot be cast to org.apache.ibatis.plugin.Interceptor [博客](https://blog.csdn.net/Code_shadow/article/details/81281541)
 
##### 商品列表展示
1, 在新的pagehelper.version 为5.1.8中 不需要原教程中使用的pagehelper-fix jar包
