//��������
/*
����: ������ķ����,�߱����ֺ�����״̬, �߱����,����,ϴ��3����Ϊ
*/
class Servant//����಻��Ҫmain����,�ȴ���������
{
	String name;
	int age;
	void shopping()
	{
		System.out.println("���");
	}
	void cook()
	{
		System.out.println("����");
	}
	void washDishes()
	{
		System.out.println("ϴ��");
	}
}
//����Ա
class Coder
{
	void coding()
	{
		System.out.println("����д����");
	}
}

public class  ServantDemo
{
	//������
	public static void main(String[] args) 
	{
		Servant s1 = new Servant();//����һ����ķ����

		//��������
		s1.age = 17;//��s1���������״̬��ֵ
		s1.name = "С��";//��s1���������״̬��ֵ
		System.out.println(s1.name + ","+ s1.age);

		//����s1��������\����\ϴ����Ϊ
		s1.shopping();
		s1.cook();
		s1.washDishes();

		//���ó���Աд����Ĺ���
		Coder c1 = new Coder();
		c1.coding();

		/*����: ��ʾ���ʵ�������̺��ڴ����,
		����: ������ķ���� s2 s3
		��s2 s3 ������״̬��ֵ
		����s2 s3 ��ӡ������ı仯
		*/
		Servant s2 = new Servant();
		Servant s3 = new Servant();

		s2.name = "С��";
		s2.age = 20;

		s3.name = "С��";
		s3.age = 22;
		System.out.println(s2.name +"," + s2.age);//С��,20
		System.out.println(s3.name +"," + s3.age);//С��,22


		s3 = s2;//�Ѷ���s2���ڴ��е����õ�ַ,����һ�ݸ� s3, s3���õ�s2������״̬(name,age)
		s1 = null;//����s1�������κ�һ���ڴ�
		System.out.println(s3.name +"," + s3.age);//С��,20
		System.out.println(s2.name +"," + s2.age);//С��,20
		System.out.println(s1.name +"," + s1.age);//���ֿ�ָ��

	}
}
/*
�ܽ�:
 1. �����������е���д����Ĺ���, Ҫ�ȴ����� ��������Աд����Ĺ���, �ٴ�������Ա����,���ſ��Ե���;
 2. �����ĸ�ֵ�൱�ڰѶ������ڴ������õ�ַ��ֵ����һ������;
*/