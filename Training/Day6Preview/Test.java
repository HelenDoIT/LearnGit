//��������


public class  Test                                                             
{
	public static void main(String[] args) 
	{
		//ι�������ַ���
		Person p = new Person(); //����Person ����
		Dog d = new Dog(); //���� Dog����
		p.feed(d);//ͨ��������÷���ʵ��, �﷨: �������.����(ʵ��)

		//�ڶ���
		p.feed(new Dog());//ͨ������Dog ��������ʵ��

		//������
		new Person().feed(new Dog());//ͨ������Person �������� �� Dog ��������ʵ��
	}
}
    //����һ���� Dog, �߱���ʳ��Ĺ���
	class Dog
	{
		void eat()
		{
			System.out.println("��ʳ��");
		}

	}

	//����һ���� Person, �߱�ι�Ĺ���
	class Person
	{
	     void feed(Dog d)//�����˲����ķ���, ���� Dog d ����������ֵ
		{
			d.eat();//����d ���÷���eat
		}

	}

	/*���������һ������Person��, �޲���,����ʱ��11��12�лᱨ��
	class Person 
	{
		void feed()
		{
		    Dog d = new Dog();
			d.eat();
		}
	}
	*/

