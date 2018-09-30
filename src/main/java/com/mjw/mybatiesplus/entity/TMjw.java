package com.mjw.mybatiesplus.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author mjw
 * @since 2018-09-17
 */
public class TMjw implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
