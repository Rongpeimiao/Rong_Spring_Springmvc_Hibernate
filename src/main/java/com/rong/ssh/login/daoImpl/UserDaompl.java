package com.rong.ssh.login.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.rong.ssh.login.dao.UserDao;
import com.rong.ssh.login.entity.UserDTO;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
@Repository
public class UserDaompl extends HibernateDaoSupport implements UserDao {

	 //HibernateDaoSupport来操作数据库更加方便

    //用来注入sessionFactory（不注入会报错）
	
	 //redis连接池  
    @Autowired  
    public JedisPool jedisPool;  
    
    @Resource(name = "sessionFactory")
    public void setSessionFactoryOverride(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    @Override
    public UserDTO find(String userName,String password){
    	
    	  //获取redis操作对象  
        Jedis jedis = jedisPool.getResource();  
      //选择redis的db2  
        jedis.select(0);  
        System.out.println("Connection to server sucessfully");  
        //设置 redis 字符串数据  
        jedis.set("w3ckey", "Redis tutorial");  
        // 获取存储的数据并输出  
        System.out.println("Stored string in redis:: "+ jedis.get("w3ckey"));  
        //关闭连接  
        jedis.close();
        
        //注意：以下是HQL语句
        List<?> users = getHibernateTemplate().find("from UserDTO where userName=? and password=?",userName,password);
        return users.size()>0?(UserDTO)users.get(0):null;//假数据，后期要通过Hibernate去数据库取
    }

}
