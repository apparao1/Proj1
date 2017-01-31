package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.Bike;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory = null;
		Bike pulsor1 = null, pulsor2 = null,basepulsor=null;
		factory = new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		
		pulsor1 = factory.getBean("pulsor1", Bike.class);
		System.out.println(pulsor1);
		pulsor2 = factory.getBean("pulsor2", Bike.class);
		System.out.println(pulsor2);
	}
}
