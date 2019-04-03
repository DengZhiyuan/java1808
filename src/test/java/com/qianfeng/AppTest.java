package com.qianfeng;

import com.qianfeng.dto.WxbGood;
import com.qianfeng.dto.WxbGoodSku;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testCase1() {
        try {
            //
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.cfg.xml");
            //创建session工厂
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //打开session
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //新增
            WxbGood good = new WxbGood();
            good.setGoodId("111111");
            good.setGoodName("888");
            sqlSession.insert("com.qianfeng.dto.WxbGood.save",good);
            //提交事务
            sqlSession.commit();
            //关闭连接
            sqlSession.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 关联查询:一对多
     */
    @Test
    public void testCase2(){
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis.cfg.xml");
            //构造模式
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
            //工厂模式
            SqlSession session = sessionFactory.openSession();

            WxbGood good = session.selectOne("com.qianfeng.dto.WxbGood.queryGoodAndSkuInfo");
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 关联查询:多对一
     */
    @Test
    public void testCase3(){
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis.cfg.xml");
            //构造模式
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
            //工厂模式
            SqlSession session = sessionFactory.openSession();

            List<WxbGoodSku> bookList = session.selectList("com.qianfeng.dto.WxbGoodSku.queryGoodAndSkuInfo");
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
