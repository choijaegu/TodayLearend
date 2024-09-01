package Exam0714;

public class Exam0714_3 {

	public static void main(String[] args) 
	{
		/*두 개의 주사위를 던졌을 때 나오는 눈을(눈1,눈2)형태로 출력하고,
		 * 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는
		 * 코드를 작성하라.
		 */
		for(;;)
		{
		int a = (int)(Math.random()*6)+1;
		int b = (int)(Math.random()*6)+1;
			
		int c = a+b;
		
			System.out.println(a+","+b);
			if(c==5)
				break;
		}System.out.println("\n");
		
		//while 문으로 다시 작성
		while(true)
		{
			int d = (int)(Math.random()*6)+1;
			int e = (int)(Math.random()*6)+1;
			int f = d+e;
			
			System.out.println(d+","+e);
			
			if(f==5)
				break;
					
		}
	}

}
