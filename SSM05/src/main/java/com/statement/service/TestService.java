package com.statement.service;

public interface TestService {
    int save(String sql, Object[] param);
    int delete(String sql, Object[] param);
}
