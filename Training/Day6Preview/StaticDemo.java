//��ʾstatic ���η��ص�

//����һ����: ����

class Person
{
	String name;
	int age;

	//�������������
	static int totalNum = 5; //�˵������������״̬,��static ����

    //�Զ��幹����
	Person(String n, int a)
	{
		name = n;
		age = a;
		totalNum ++ ;
	}

	//�������� ������
	void die()
	{
		totalNum --;
		System.out.println("ȥ��");
	}

	//���������������, �÷��������ڶ���
	static void destroy()
	{
		totalNum = 0;
		System.out.println("�������");
	}

}
//��ʾstatic ���η����ص�
public class  StaticDemo
{
	public static void main(String[] args) 
	{

		System.out.println(Person.totalNum);//����p1ǰ,��һ��Ŀǰ��������
		Person p1 = new Person("Will",17);//����һ��Person����,����ֵ
		Person p2 = new Person("Bill",18);
		System.out.println(Person.totalNum);//����������������

		System.out.println(p1.totalNum);//7
		System.out.println(p2.totalNum);//7
		//�˴�ͨ�������뿴��: ͨ������ȥ����static��Ա,������Ȼ��ͨ����������
		
		p2.die();
		System.out.println(Person.totalNum);//6  �������die���������

		Person.destroy(); //����������𷽷�
		System.out.println(Person.totalNum);// 0 ��������������� 
	}
}
/*
�ܽ�:
1):static���εĳ�Ա(�ֶ�/����),����������ļ��ض�����.
2):�����ڶ���Ĵ���.
3):static���εĳ�Ա�������͵����ж���������. ͨ������ȥ����static��Ա,�䱾����Ȼʹ����������,�Ͷ���û���κι�ϵ(ͨ�������뿴��).
4):ֱ��ʹ����������static��Ա

*/