package cn.zzzcr.springboots.controller;

import cn.zzzcr.springboots.dao.model.MongoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class UserController {


//========================mongodb单数据源测试接口=================================

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("account")
    public MongoUser getUserByAccount(String account){
        Query query = new Query(Criteria.where("userAccount").is(account));

        MongoUser mongoUser = mongoTemplate.findOne(query, MongoUser.class);

        return mongoUser;
    }

//========================mongodb单数据源测试接口=================================



}
