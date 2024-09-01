package Exam0714;

public class Exam0714_4 {

	public static void main(String[] args) 
	{
		/*방정식 4x+5y=60의 모든 해를 구해서 (x,y)의 형태로 출력하시오
		 * 단 x,y는 10이하의 자연수 입니다.
		 */
		for(int a = 1 ; a < 11 ; a++)
		{
			for(int b = 1; b < 11 ; b++)
			{
				int c = (4*a)+(5*b);
				
				if (c==60)
				{
					System.out.println(a+","+b);
				}
			}
		}System.out.println("\n");
		
		
		//while문으로 다시써보기
		int d = 1;
		while(d<11)
		{
			int e = 1;
			while(e<11)
			{
				int f = (4*d)+(5*e);
				
				if(f==60)
					System.out.println(d+","+e);
				e++;
			}
				
			d++;
		}
			
		
	}

}
