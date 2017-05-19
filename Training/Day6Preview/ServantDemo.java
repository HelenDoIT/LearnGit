//创建对象
/*
需求: 描述保姆对象,具备名字和年龄状态, 具备买菜,做饭,洗碗3种行为
*/
class Servant//这个类不需要main方法,等待别的类调用
{
	String name;
	int age;
	void shopping()
	{
		System.out.println("买菜");
	}
	void cook()
	{
		System.out.println("做饭");
	}
	void washDishes()
	{
		System.out.println("洗碗");
	}
}
//程序员
class Coder
{
	void coding()
	{
		System.out.println("疯狂的写代码");
	}
}

public class  ServantDemo
{
	//测试类
	public static void main(String[] args) 
	{
		Servant s1 = new Servant();//创建一个保姆对象

		//操作对象
		s1.age = 17;//给s1对象的年龄状态赋值
		s1.name = "小丽";//给s1对象的名字状态赋值
		System.out.println(s1.name + ","+ s1.age);

		//调用s1对象的买菜\做饭\洗碗行为
		s1.shopping();
		s1.cook();
		s1.washDishes();

		//调用程序员写代码的功能
		Coder c1 = new Coder();
		c1.coding();

		/*需求: 演示象的实例化过程和内存分析,
		步骤: 创建保姆对象 s2 s3
		给s2 s3 的年龄状态赋值
		操作s2 s3 打印操作后的变化
		*/
		Servant s2 = new Servant();
		Servant s3 = new Servant();

		s2.name = "小花";
		s2.age = 20;

		s3.name = "小玲";
		s3.age = 22;
		System.out.println(s2.name +"," + s2.age);//小花,20
		System.out.println(s3.name +"," + s3.age);//小玲,22


		s3 = s2;//把对象s2在内存中的引用地址,复制一份给 s3, s3引用的s2的所有状态(name,age)
		s1 = null;//设置s1不引用任何一块内存
		System.out.println(s3.name +"," + s3.age);//小花,20
		System.out.println(s2.name +"," + s2.age);//小花,20
		System.out.println(s1.name +"," + s1.age);//出现空指针

	}
}
/*
总结:
 1. 想在主方法中调用写代码的功能, 要先创建类 描述程序员写代码的功能, 再创建程序员对象,最后才可以调用;
 2. 对象间的赋值相当于把对象在内存中引用地址赋值给另一个对象;
*/