
package com.xiaoming.test;

import com.xiaoming.po.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author liangyi
 * @Date 2020/3/31
 */
class SimpleDemoTestTest {
	@Test
	public void test() {
		final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-student.xml");
		final Teacher teacher = (Teacher) applicationContext.getBean("teacher");
		System.out.println(teacher);
	}

}