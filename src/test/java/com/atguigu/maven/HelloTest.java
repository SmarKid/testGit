package com.atguigu.maven;

import org.junit.Test;

public class HelloTest {
	
	@Test
	public void testHello(){
		Hello hello = new Hello();
		String maven=hello.sayHello("Maven");
		System.out.println(maven);
		System.out.println("更新1");
		System.out.println("更新2");
		System.out.println("创建分支");
		System.out.println("主干添加");
	}
	
}
