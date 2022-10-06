package com.solvd.buildingCompany.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyBatisFactory {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyBatisFactory.class);
    private static final MyBatisFactory myBatisFactory = new MyBatisFactory();
    private static SqlSessionFactory sqlSessionFactory;

    private MyBatisFactory() {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
