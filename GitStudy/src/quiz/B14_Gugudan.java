package quiz;

public class B14_Gugudan {
	public static void main(String[] args) {
	
	/*1.구구단을 다음과 같이 가로로 출력해보세요
	 * 2단 : 2x1=2 2x2=4 ....
	 * 3단 : 3x1=3 3x2=6...
	 * 
	 * 2.구구단을 세로로 출력해보세요
	 * 
	 * 2단		3단
	 * 2x1=2	3x1=3
	 * 2x2=4	3x2=6
	 * 
	
	 */
	

		for (int dan = 2; dan < 10; ++dan) {
			
			System.out.print(dan+"단 : ");
			
			for (int gop = 1; gop < 10; ++gop) {
				
				System.out.printf("%dx%d=%-2d ",dan,gop,dan*gop);
				
					
				}
			System.out.println();
		}
		System.out.println("===========================================");
		for (int line = 0; line < 10; ++line) {
			
			for (int dan = 2; dan < 10; ++dan) {
				if(line==0) {
				System.out.print(dan+"단\t");
				}else {
				System.out.printf("%dx%d=%d\t",dan,line,dan*line);
				}
				
				}
			System.out.println();
			
		}
		
		
	}
}
