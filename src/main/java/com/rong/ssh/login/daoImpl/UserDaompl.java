package com.rong.ssh.login.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.rong.ssh.login.dao.UserDao;
import com.rong.ssh.login.entity.UserDTO;
@Repository
public class UserDaompl extends HibernateDaoSupport implements UserDao {

	 //HibernateDaoSupport来操作数据库更加方便

    //用来注入sessionFactory（不注入会报错）
    @Resource(name = "sessionFactory")
    public void setSessionFactoryOverride(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    @Override
    public UserDTO find(String userName,String password){
        //注意：以下是HQL语句
        List<?> users = getHibernateTemplate().find("from UserDTO where userName=? and password=?",userName,password);
        return users.size()>0?(UserDTO)users.get(0):null;//假数据，后期要通过Hibernate去数据库取
    }

}
