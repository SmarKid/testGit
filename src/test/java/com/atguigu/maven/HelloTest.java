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
		System.out.println("支线添加");
		System.out.println("在线编辑");
		System.out.println("本地第二次提交前添加");
	}
	
}
