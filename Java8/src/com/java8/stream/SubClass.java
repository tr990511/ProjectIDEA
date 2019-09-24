package com.java8.stream;

import com.java8.interfaceNew.MyInterface;
import com.java8.optional.MyFun;

public class SubClass /*extends MyClass*/ implements MyFun, MyInterface {

	@Override
	public String getName() {
		return MyInterface.super.getName();
	}

}
