
package com.xiaoming.test;

import com.xiaoming.config.TeacherConfig;
import com.xiaoming.po.Teacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liangyi
 * @Date 2020/3/31
*/
public class SimpleDemoTest {

	public static void main(String[] args) {
		final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TeacherConfig.class);
		final Teacher teacher = (Teacher) applicationContext.getBean("teacher");
		System.out.println(teacher);
	}
}
