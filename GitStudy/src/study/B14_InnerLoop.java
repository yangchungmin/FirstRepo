package study;

public class B14_InnerLoop {
	public static void main(String[] args) {
	
	
		//�ݺ��� ���ο� �ݺ��� ����ϱ�
		for (int i = 0; i < 10; ++i) {
			
			System.out.printf("========================�ٱ��� �ݺ���%d\n",i);
			
			for (int j = 0; j < 8; ++j) {
				
				System.out.printf("--------------------------���� �ݺ���%d-%d\n",i,j);
				
				for (int k = 0; k < 3; ++k) {
					
					System.out.printf("+++++++++++++++++++++���Ͼ��� �ݺ���%d-%d-%d\n",i,j,k);
					
					
				}
			}
		}
	//������ ����غ���

		for (int dan = 2; dan < 10; ++dan) {
			
			System.out.println("######"+dan+"��#####");
			
			for (int gop = 1; gop < 10; ++gop) {
				
				System.out.printf("%dx%d=%d\n",dan,gop,dan*gop);
				
					
				}
			}
		
		
	
	
	
	
	
	}
}
