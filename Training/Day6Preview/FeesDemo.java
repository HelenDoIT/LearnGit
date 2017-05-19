//学生缴费状态案例

/*
4名学生中,有两名学生未缴费,找出未缴费的学生,让其缴费
步骤:
1.描述学生对象(名字,默认缴费状态是未缴费 false)
2.定义缴费方法fee, 把缴费状态设置为 已缴费 true
3.创建一个数组,用于存储所有学生对象
4.使用循环迭出数组中的每一个元素
5.判断当前学生对象是否缴费,如果没有,则调用缴费方法; 打印对象缴费状态,可以直观看到方法调用后的学生对象缴费状态
*/

public class  FeesDemo
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.name = "赵一";
		s1.isFee = true;

		Student s2 = new Student();
		s2.name = "钱二";
		s2.isFee = false;

		Student s3 = new Student();
		s3.name = "张三";
		s3.isFee = false;

		Student s4 = new Student();
		s4.name = "李四";
		s4.isFee = true;

		System.out.println("此时张三缴费状态"+ s3.isFee);//false

		//创建数组
		Student[] arr = new Student[]{s1,s2,s3,s4}; 

		//用循环迭代出素组里的每一个元素
		for (Student ele: arr)//foreach语法: for(数组元素类型 变量 : 数组名)
		{
			if (!ele.isFee)//如果该对象未缴费,则调用缴费方法;
			{
				ele.fee();//通过对象调用方法语法: 对象变量.方法(实参);
			}
		}

		System.out.println("此时张三缴费状态"+ s3.isFee);//true
	}
}

class Student
{
	String name;
	boolean isFee = false;
	void fee()
	{
		isFee = true;
	}
}
