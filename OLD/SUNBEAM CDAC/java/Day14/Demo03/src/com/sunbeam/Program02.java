package com.sunbeam;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Type;

@Target({ ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnn {
	int key();
	String value();
	String name();
}

@MyAnn("My test class")
class Test {

	private int field1;

	public Test() {
	}

	@MyAnn("method1")
	void method1() {

	}

	@MyAnn("method2")
	void method2() {

	}
}


public class Program02 {
	public static void main(String[] args) {

		Class c1 = Test.class;
		Annotation[] ann = c1.getDeclaredAnnotations();
		for (Annotation element : ann) {
			System.out.println(element);
			if (element instanceof MyAnn) {
				MyAnn myann = (MyAnn) element;
				System.out.println(myann.value());
			}
		}
	}

}
