package com.lzq.dao;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lzq.entity.User;

//如果整个类都纳入事务管理，则直接这样配置（类上的是父、方法上的是子，如果方法上也有，则会覆盖父）
//@Transactional
public class UserDaoImpl extends HibernateTemplate  implements UserDao {

	@Override
	//@Transactional(propagation=Propagation.REQUIRED,noRollbackForClassName="Exception")
	public void addUser(User user) {
		System.out.println("---------addUser()-------------");
		this.save(user);
	}
	
	@Override
	//@Transactional(rollbackForClassName="com.lzq.exception.myException")
	public void delUser(String userName) {
		System.out.println("---------delUser()-------------");
		this.delete(this.load(User.class, userName));
	}

	@Override
	public void modifyUser(User user) {
		System.out.println("---------modifyUser()-------------");
		this.update(user);
	}
	
	//@Transactional(readOnly = true)
	public void selectUser(){
		
	}

}
