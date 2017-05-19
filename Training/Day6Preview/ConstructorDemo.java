//演示自定义构造器, 看调用是否成功; 再定义一个构造器,证明构造器方法重载

class Person
{
	String name;

	//自定义构造器
	Person(String n)
	{
		name = n;
	}

	//再定义一个屋参数的构造器
	Person()
	{
		System.out.println("无参数");
	}
}

public class ConstructorDemo
{
	public static void main(String[] args) 
	{
		
		Person p1 = new Person();//表示调用Person类中无参数的构造器 
		p1.name = "Will";
	    System.out.println(p1.name);
		System.out.println("-------------------");
		
		Person p2 = new Person("Bill");//表示调用Person类中有参数的构造器
		System.out.println(p2.name);
	}
}
/*
总结:
1. 创建对象其实是在调用构造器
2. 构造器是一种特殊的方法,也可以存在重载.

*/