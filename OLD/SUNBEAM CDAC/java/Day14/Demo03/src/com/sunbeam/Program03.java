package com.sunbeam;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Functional interface
@FunctionalInterface
interface Acceptable{
	void acceptData();
}

public class Program03 {
	public static void main(String[] args) {
	}
}
