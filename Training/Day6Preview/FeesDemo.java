//ѧ���ɷ�״̬����

/*
4��ѧ����,������ѧ��δ�ɷ�,�ҳ�δ�ɷѵ�ѧ��,����ɷ�
����:
1.����ѧ������(����,Ĭ�Ͻɷ�״̬��δ�ɷ� false)
2.����ɷѷ���fee, �ѽɷ�״̬����Ϊ �ѽɷ� true
3.����һ������,���ڴ洢����ѧ������
4.ʹ��ѭ�����������е�ÿһ��Ԫ��
5.�жϵ�ǰѧ�������Ƿ�ɷ�,���û��,����ýɷѷ���; ��ӡ����ɷ�״̬,����ֱ�ۿ����������ú��ѧ������ɷ�״̬
*/

public class  FeesDemo
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.name = "��һ";
		s1.isFee = true;

		Student s2 = new Student();
		s2.name = "Ǯ��";
		s2.isFee = false;

		Student s3 = new Student();
		s3.name = "����";
		s3.isFee = false;

		Student s4 = new Student();
		s4.name = "����";
		s4.isFee = true;

		System.out.println("��ʱ�����ɷ�״̬"+ s3.isFee);//false

		//��������
		Student[] arr = new Student[]{s1,s2,s3,s4}; 

		//��ѭ���������������ÿһ��Ԫ��
		for (Student ele: arr)//foreach�﷨: for(����Ԫ������ ���� : ������)
		{
			if (!ele.isFee)//����ö���δ�ɷ�,����ýɷѷ���;
			{
				ele.fee();//ͨ��������÷����﷨: �������.����(ʵ��);
			}
		}

		System.out.println("��ʱ�����ɷ�״̬"+ s3.isFee);//true
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
