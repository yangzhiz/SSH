package com.lzq.dao;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lzq.entity.User;

//��������඼�������������ֱ���������ã����ϵ��Ǹ��������ϵ����ӣ����������Ҳ�У���Ḳ�Ǹ���
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
