package com.jf.css.factory.casetwo.impl;

import org.springframework.stereotype.Component;

import com.jf.css.factory.casetwo.Person;

/**
 * @author 江峰
 * @email feng.jiang@marketin.cn
 * @create 2020-12-09 10:50:51
 * @since
 */
@Component
public class Man implements Person {

	@Override
	public Integer getKey() {
		return 1;
	}

	@Override
	public void say() {
		System.out.println("I am man");
	}
}
