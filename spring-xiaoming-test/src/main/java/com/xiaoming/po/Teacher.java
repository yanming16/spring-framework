
package com.xiaoming.po;

/**
 * @author liangyi
 * @Date 2020/3/31
 */
public class Teacher {

	private Student student;

	@Override
	public String toString() {
		return "Teacher{" +
				"student=" + student +
				'}';
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(final Student student) {
		this.student = student;
	}
}
