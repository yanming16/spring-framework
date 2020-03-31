
package com.xiaoming.config;

import com.xiaoming.po.Student;
import com.xiaoming.po.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liangyi
 * @Date 2020/3/31
 */
@Configuration
public class TeacherConfig {

	@Bean
	public Teacher teacher() {
		Teacher teacher =  new Teacher();
		Student student = new Student();
		student.setId(2);
		student.setName("daming");
		teacher.setStudent(student);
		return teacher;
	}

}
