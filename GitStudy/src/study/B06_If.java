package study;

public class B06_If {
	public static void main(String[] args) {
		/*
		 if¹®
		 -()¾ÈÀÇ °ªÀÌ trueÀÏ¶§ {}¾ÈÀÇ ³»¿ëÀ» ½ÇÇàÇÑ´Ù
		 -()¾ÈÀÇ °ªÀÌ falseÀÏ¶§´Â {}¾ÈÀÇ ³»¿ëÀ» ¹«½ÃÇÑ´Ù
		 -{}¾È¿¡ µé¾î°¥ ³»¿ëÀÌ ÇÑÁÙÀÌ¸é {}¸¦ »ý·«ÇÒ¼öÀÖ´Ù
		
		 else if¹®
		 -À§¿¡ ÀÖ´Â if¹®ÀÌ ½ÇÇàµÇÁö ¾Ê¾Ò´Ù¸é if¹®Ã³·³ µ¿ÀÛÇÑ´Ù
		 -else if´Â ´Üµ¶À¸·Î »ç¿ëÇÒ¼ö ¾ø´Ù
		 -else if´Â ¿©·¯¹ø »ç¿ëÇÒ¼ö ÀÖ´Ù
		
		else¹®
		-À§¿¡ ÀÖ´Â if,else if°¡ ¸ðµÎ ½ÇÇàµÇÁö¾Ê´Â´Ù¸é {}¾ÈÀÇ ³»¿ëÀ» ¹«Á¶°Ç ½ÇÇàÇÑ´Ù
		-if¹Ù·Î ´ÙÀ½¿¡ »ç¿ëÇÒ¼öµµ ÀÖ´Ù
		 *else°¡ ºÙ¾îÀÖ´Â Á¶°Ç¹®Àº ¹«Á¶°Ç ÇÑ¹øÀº ½ÇÇàµÈ´Ù
*/
		
		int a = -8;
		if (a==5) { 
			System.out.println("Hello");
		}else if(a>0) {
		System.out.println("niec to meet you.");
		}else if(a>-10) {
			System.out.println("Greeting");
		}else if(a>-20) {
			System.out.println("Good to see you");
		}
		
		
		
		
		char ch ='°¡';
		if (ch >= '°¡' && ch <='ÆR') {
			System.out.println("ch¾ÈÀÇ°ªÀº ÇÑ±ÛÀÔ´Ï´Ù");
		}else if((ch >= 0x3040 && ch <=0x309F) || (ch >= 0x30A0 && ch <=0x30FF )) {
			System.out.println("ch¾ÈÀÇ °ªÀº ÀÏº»¾î ÀÔ´Ï´Ù");
		}
		else {
			System.out.println("ch¾ÈÀÇ°ªÀº ÀÏº»¾îµµ ÇÑ±Ûµµ ¾Æ´Õ´Ï´Ù");
		}
		System.out.println("ÇÁ·Î±×·¥ÀÌ ³¡³µ½À´Ï´Ù");
	}

}
