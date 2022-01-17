package org.springframework.test.own;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shenchuang
 * @date 2022/1/13 11:03 PM
 */
public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Robot1 robot1 = (Robot1)context.getBean("robot1");
		robot1.say();
		Robot2 robot2 = (Robot2)context.getBean("robot2");
		robot2.say();
	}
}
