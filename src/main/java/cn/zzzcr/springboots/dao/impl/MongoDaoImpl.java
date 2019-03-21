package cn.zzzcr.springboots.dao.impl;

import cn.zzzcr.springboots.dao.MongoDao;
import cn.zzzcr.springboots.dao.model.MongoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


@Repository
public class MongoDaoImpl implements MongoDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public MongoUser getUserByAccount(String account) {

        Query query = new Query(Criteria.where("userAccount").is(account));
        MongoUser mongoUser = mongoTemplate.findOne(query, MongoUser.class);
        return mongoUser;
    }

}
