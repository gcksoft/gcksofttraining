package com.gcksoft.staticNonStatic;

public class StaticAndNonStaticMethodDemo {
	int k=10;
	static int a =10;
	
    //predefind method
	public static void main(String[] args) {
		int c =10;
		//calling static variable 
		    System.out.println(a);
		    
		//customised static method calling
		System.out.println(c);
		int res = add(2,4);
		System.out.println(res);
		
		
		//customised non-static method calling
		//object creation for the class
		StaticAndNonStaticMethodDemo object = new StaticAndNonStaticMethodDemo();
		System.out.println(object.k);
		object.add(2,4);
		float result = object.add1(3,5);
		System.out.println(result);
		

	}
	
	//void - it won't return anything
	public static void add2(int a, int b) {
		int result = a+b;
		System.out.println(result);//6
		result = result+9;
		System.out.println(result);//15
	}
	
	//custmised method 
	//static method
	//Other then void - it will return a value based on return data(int) type 
	public static int add(int a, int b) {
		int result = a+b;
		System.out.println(result);//6
		result = result+9;
		System.out.println(result);//15
		return result;
	}
	
	//custmised method 
	//non-static/dynamic/instance method
	//Here return type is float
	public float add1(int i,int j) {
		return i+j;
	}

}
