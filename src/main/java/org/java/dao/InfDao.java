package org.java.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by 马果 on 2018/7/9.
 */
@Repository
public class InfDao {

    public void add(){
        System.out.println("向数据库添加了数据");
    }
}
