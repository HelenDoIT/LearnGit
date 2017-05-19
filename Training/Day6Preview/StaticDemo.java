//演示static 修饰符特点

//创建一个类: 人类

class Person
{
	String name;
	int age;

	//描述人类的总数
	static int totalNum = 5; //人的总数属于类的状态,用static 修饰

    //自定义构造器
	Person(String n, int a)
	{
		name = n;
		age = a;
		totalNum ++ ;
	}

	//描述方法 死了人
	void die()
	{
		totalNum --;
		System.out.println("去世");
	}

	//描述方法人类毁灭, 该方法不属于对象
	static void destroy()
	{
		totalNum = 0;
		System.out.println("人类毁灭");
	}

}
//演示static 修饰符的特点
public class  StaticDemo
{
	public static void main(String[] args) 
	{

		System.out.println(Person.totalNum);//创建p1前,看一下目前的总人数
		Person p1 = new Person("Will",17);//创建一个Person对象,并赋值
		Person p2 = new Person("Bill",18);
		System.out.println(Person.totalNum);//创建对象后的总人数

		System.out.println(p1.totalNum);//7
		System.out.println(p2.totalNum);//7
		//此处通过反编译看到: 通过对象去访问static成员,本质依然是通过类名访问
		
		p2.die();
		System.out.println(Person.totalNum);//6  对象调用die后的总人数

		Person.destroy(); //调用人类毁灭方法
		System.out.println(Person.totalNum);// 0 人类毁灭后的总人数 
	}
}
/*
总结:
1):static修饰的成员(字段/方法),随着所在类的加载而加载.
2):优先于对象的存在.
3):static修饰的成员被该类型的所有对象所共享. 通过对象去访问static成员,其本质依然使用类名访问,和对象没有任何关系(通过反编译看到).
4):直接使用类名访问static成员

*/