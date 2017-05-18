package com.test;

import java.util.Date;
import java.util.Formatter;
import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Property;

import com.persistence.util.DateUtil;
import com.persistence.util.HibernateUtil;
import com.school.Entity.Attendence;
import com.school.Entity.Parents;
import com.school.Entity.Student;

public class Demo {
public static void main(String ...args ) {
	try{
		
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
	//	Attendence attendence=new Attendence(date, status, remarks);
		/*Parents parents=new Parents("shyam", "kumar", "singh", "shyam@gmail.com", DateUtil.getDateTimeForAccessManagement("10/10/1957"),
				9582345843l	, 9582345843l);
		
		Student student=new Student("ramesh", "singh", "kumar", "ramesh@gmail.com",
				DateUtil.getDateTimeForAccessManagement("10/10/1987"),9582345843l, 9582345843l, DateUtil.getDateTimeForAccessManagement("10/10/2015"), 
				"Active",parents);
		session.save(student);*/
		
		String hql="from Student stu inner join fetch stu.parents order by stu.fname desc";
		Query q=session.createQuery(hql);
		
	/*	Criteria ct=session.createCriteria(Student.class).addOrder(
				Property.forName("sid").desc());*/
		List<Student> li=q.list();
		
		for(Student st : li){
			System.out.println(st);
		}
	/*	Student stu=(Student) session.load(Student.class, 1);
		System.out.println(stu);*/
		tx.commit();
		session.close();
	}catch (Exception e) {
		// TODO: handle exception
	}
}
}
 