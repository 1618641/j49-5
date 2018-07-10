package org.java.service;

import org.java.dao.InfDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 马果 on 2018/7/9.
 */
@Service("infService")
public class InfService {
    @Autowired
    private InfDao dao;

    public void add(){
        dao.add();
    }
}
