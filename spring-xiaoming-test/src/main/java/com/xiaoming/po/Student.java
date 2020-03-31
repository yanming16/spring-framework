
package com.xiaoming.po;

/**
 * @author liangyi
 * @Date 2020/3/31
 */
public class Student {

	private Integer id;
	private String name;

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}
}
