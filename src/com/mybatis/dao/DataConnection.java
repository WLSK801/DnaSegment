package com.mybatis.dao;
/**
 * 数据库调用类，由于使用了Spring，已废弃
 * 
 * @author WLSK801
 * @version 2017.03.17
 */
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.entity.Segment;

public class DataConnection {
	
	public void insertRow(Segment seg) {
		// mybatis的配置文件
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = null;
        SqlSession sqlSession = null;
        try {
        	inputStream = Resources.getResourceAsStream(resource);
            // 1. create factory
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                    .build(inputStream);
            // 2. get SqlSession
            sqlSession = sqlSessionFactory.openSession();
            // 3. manipulate database buy sqlsession
            // 第一个参数：映射文件中的statement的Id,等于namespace + "." + statement的id;
            // 第二个参数:指定和映射文件中所匹配的parameterType类型的参数;
            // sqlSession.selectOne结果是与映射文件所匹配的resultType类型的对象;
            sqlSession.insert("test.insertSegment", seg);
            //执行提交事务
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
	}
}
