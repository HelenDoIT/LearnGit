//匿名对象


public class  Test                                                             
{
	public static void main(String[] args) 
	{
		//喂狗的三种方法
		Person p = new Person(); //创建Person 对象
		Dog d = new Dog(); //创建 Dog对象
		p.feed(d);//通过对象调用方法实现, 语法: 对象变量.方法(实参)

		//第二种
		p.feed(new Dog());//通过创建Dog 匿名对象实现

		//第三种
		new Person().feed(new Dog());//通过创建Person 匿名对象 和 Dog 匿名对象实现
	}
}
    //定义一个类 Dog, 具备吃食物的功能
	class Dog
	{
		void eat()
		{
			System.out.println("吃食物");
		}

	}

	//定义一个类 Person, 具备喂的功能
	class Person
	{
	     void feed(Dog d)//设置了参数的方法, 参数 Dog d 是用来传递值
		{
			d.eat();//对象d 调用方法eat
		}

	}

	/*如果像下面一样定义Person类, 无参数,运行时第11和12行会报错
	class Person 
	{
		void feed()
		{
		    Dog d = new Dog();
			d.eat();
		}
	}
	*/

