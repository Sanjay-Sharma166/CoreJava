package com.yash.Reflection;

import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class ReflectionDemo {

	public static void main(String[] args) throws ClassNotFoundException
	{
		Class c= Class.forName("com.yash.Reflection.Employee");
		System.out.println(c);
		
		System.out.println("Super Class: "+c.getSuperclass());
		int mod= c.getModifiers();
		System.out.println("mod: "+mod);
		
		System.out.println("Access specifier:"+Modifier.toString(mod));
		
		Class[] classes=c.getInterfaces();
		for (Class cls: classes)
		{
			System.out.println(cls+" hashcode"+cls.hashCode());
		}
		Field[] fields= c.getDeclaredFields();
		for(Field field : fields)
		{
			System.out.println(field+" hashcode "+field.hashCode());
		}
		
		Constructor[] constructors= c.getConstructors();
		System.out.println(constructors.length);
		for(Constructor constructor : constructors)
		{
			System.out.println(constructor+" hashcode "+constructor.hashCode());
		}
	}

}

