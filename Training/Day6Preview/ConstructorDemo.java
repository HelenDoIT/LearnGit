//��ʾ�Զ��幹����, �������Ƿ�ɹ�; �ٶ���һ��������,֤����������������

class Person
{
	String name;

	//�Զ��幹����
	Person(String n)
	{
		name = n;
	}

	//�ٶ���һ���ݲ����Ĺ�����
	Person()
	{
		System.out.println("�޲���");
	}
}

public class ConstructorDemo
{
	public static void main(String[] args) 
	{
		
		Person p1 = new Person();//��ʾ����Person�����޲����Ĺ����� 
		p1.name = "Will";
	    System.out.println(p1.name);
		System.out.println("-------------------");
		
		Person p2 = new Person("Bill");//��ʾ����Person�����в����Ĺ�����
		System.out.println(p2.name);
	}
}
/*
�ܽ�:
1. ����������ʵ���ڵ��ù�����
2. ��������һ������ķ���,Ҳ���Դ�������.

*/