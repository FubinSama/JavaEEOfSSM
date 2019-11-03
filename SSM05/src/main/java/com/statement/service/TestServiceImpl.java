package com.statement.service;

import com.statement.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("testService")
@Transactional //在SpringMVC中通常使用service层进行事务管理
//加上Transactional注解就可以指定这个类需要受Spring的事务管理
//注意：Transactional注解只能针对public属性范围内的方法添加
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public int save(String sql, Object[] param) {
        return testDao.save(sql, param);
    }

    @Override
    public int delete(String sql, Object[] param) {
        return testDao.delete(sql, param);
    }
}
