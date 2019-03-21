package cn.zzzcr.springboots.dao;

import cn.zzzcr.springboots.dao.model.MongoUser;

public interface MongoDao {


    MongoUser getUserByAccount(String account);

}
