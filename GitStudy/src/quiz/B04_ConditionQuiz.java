package quiz;

public class B04_ConditionQuiz {
	public static void main(String[] args) {
		int a=11,b=12,c=14,hour=13,d=15,e=45,year = 2100,
			minage = 20,chulage =18,minbirth = 7,chulbirth =10;
		boolean powerOn =false;
		String str = "yes";
		/*
        [ �˸��� �񱳿����� �������� ]
            
        1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
        2. int�� ���� b�� ¦���� �� true                
        3. int�� ���� c�� 7�� ����� �� true
        4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true
        5. int�� ���� d�� e�� ���̰� 30�� �� true                
        6. int�� ���� year�� 400���� ������ �������� true  
                      �Ǵ� 4�� ������ �������� 100���� ����������� ���� �� true
        7. �μ��� ö������ 2�� ������ true
        8. �μ��� ö������ ������ 3�� ������ true  
        9. boolean�� ���� powerOn�� false�� �� true
        10. ���ڿ� �������� str�� "yes"�� �� true
*/        
		System.out.println(a>10 && a<20 );
		System.out.println(b%2 == 0 );
		System.out.println(c%7 == 0 );
		System.out.println(!(hour <0 || hour>=24) && hour>=12 );
		System.out.println(Math.abs(d-e) == 30);
		System.out.println(year%400 ==0 || (year%4 ==0 && 
				year%100 != 0) );
		System.out.println(minage-chulage == 2);
		System.out.println(minbirth + 3 == chulbirth);
	    System.out.println(!powerOn);
		//���ڿ�(������ Ÿ��)�� ==���� ���ϸ�ȵȴ�.
	    //������ Ÿ���� ���� ���Ҷ��� �ش�Ŭ������ ���� �Ǿ��ִ� equals()��� 
	    //�޼��带 �̿��ؾ��Ѵ�
	    System.out.println(str == "yes");
		System.out.println(str.equals("yes"));
		
		
		//�⺻�� Ÿ�԰� ������ Ÿ���� ������
		//-�⺻Ÿ���� ���ε������� ũ�⸦ �����ϱ� ����(�������� ���̴� �޸𸮸� ���,Stack)
		//-������ Ÿ���� ���� �������� ũ�⸦ �����ϱ� ��ƴ�(�������� ������ �޸𸮸� ���,Heap)
		
		String str1="yes";
		String str2=new String("yes");
		
		//����Ǵ� �ּҰ� �޶�  false�� ����
		System.out.println("str1 == str2" + (str == str2));
		//equals�� �ּҾ��� ���빰�� ��Ȯ�� �ľ�����
		System.out.println("str1.equals(str2)" + str1.equals(str2));
		
		
		
	}
}
