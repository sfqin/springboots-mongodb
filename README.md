# springboot2.x 整合 mongodb demo

>>项目默认为单数据源运行

## 单数据源
1. 配置文件 application.properties （9-17行）
2. 实体类 cn.zzzcr.springboots.dao.model.MongoUser 对应 mongodb中的一个集合中（文档结构） @Document(collection = "文档名称") 标注是哪个文档结构映射
3. Dao接口 cn.zzzcr.springboots.dao.MongoDao
4. Dao实现类 cn.zzzcr.springboots.dao.impl.MongoDaoImpl 直接注入 MongoTemplate ，使用 MongoTemplate 操作mongodb
5. 测试类 cn.zzzcr.springboots.controller.UserController
6. 使用 postman 测试接口

## 多数据源
1. 配置文件 application.properties ==> 注释单数据源配置（9-17行），打开多数据源配置（21-35行）
2. 实体类 cn.zzzcr.springboots.dao.model.MongoUser1 对应不同数据源的 文档结构
3. dao.config 包下对多数据源进行配置 ==> 打开Mongo1Config 与 Mongo2Config 文件中的第10行注释
4. 注释 cn.zzzcr.springboots.dao.impl.MongoDaoImpl 第12行
5. 测试类 cn.zzzcr.springboots.controller.UserController ==> 注释单数据源测试代码（25-36行），打开多数据源测试代码（41-65行）
6. 使用 postman 测试接口





