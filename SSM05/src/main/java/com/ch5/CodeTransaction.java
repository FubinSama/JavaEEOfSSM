package com.ch5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Repository("codeTransaction")
public class CodeTransaction {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSourceTransactionManager txManager;

    public String test(){
        //默认事务定义，例如隔离级别、传播行为等
        TransactionDefinition tf = new DefaultTransactionDefinition();
        //开启事务ts
        TransactionStatus ts = txManager.getTransaction(tf);
        String message = "执行成功，没有事务回滚！";
        try {
            String sql = "delete from user";
            String sql1 = "insert into user values(?, ?, ?)";
            Object[] param = {1, "wfb", "男"};
            jdbcTemplate.update(sql);
            jdbcTemplate.update(sql1, param);
            jdbcTemplate.update(sql1, param);
            txManager.commit(ts);
        } catch (Exception e) {
            txManager.rollback(ts);
            message = "主键重复， 事务回滚！";
            e.printStackTrace();
        }
        return message;
    }
}
