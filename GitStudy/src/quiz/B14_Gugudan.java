package quiz;

public class B14_Gugudan {
	public static void main(String[] args) {
	
	/*1.�������� ������ ���� ���η� ����غ�����
	 * 2�� : 2x1=2 2x2=4 ....
	 * 3�� : 3x1=3 3x2=6...
	 * 
	 * 2.�������� ���η� ����غ�����
	 * 
	 * 2��		3��
	 * 2x1=2	3x1=3
	 * 2x2=4	3x2=6
	 * 
	
	 */
	

		for (int dan = 2; dan < 10; ++dan) {
			
			System.out.print(dan+"�� : ");
			
			for (int gop = 1; gop < 10; ++gop) {
				
				System.out.printf("%dx%d=%-2d ",dan,gop,dan*gop);
				
					
				}
			System.out.println();
		}
		System.out.println("===========================================");
		for (int line = 0; line < 10; ++line) {
			
			for (int dan = 2; dan < 10; ++dan) {
				if(line==0) {
				System.out.print(dan+"��\t");
				}else {
				System.out.printf("%dx%d=%d\t",dan,line,dan*line);
				}
				
				}
			System.out.println();
			
		}
		
		
	}
}
