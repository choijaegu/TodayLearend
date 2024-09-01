package Exam0712;

public class Exam0712_3 
{

	public static void main(String[] args) 
	{
		/* [1] 1~10까지 숫자를 출력하다가 6이 나오기 전에 멈추는 코드를 
		 * break문을 사용하여 만들어주세요.
		*/
		for(int i = 1 ; i < 11 ; i++)
		{	
			if(i==6) break;
			System.out.print(i+"\t");
				
		}System.out.println();
		/* [2] 1~10까지 숫자를 출력하다가 5를 빼고 다시 10까지 나오는 결과를 만들어주세요.
		*/
		for(int k = 1 ; k < 11 ; k++)
		{
			if(k==5) continue;
			System.out.print(k+"\t");
		}System.out.println();
		/* [3] 1~10까지 숫자를 출력하다가 6이 나오기 전에 멈춰주세요.
		*/
		for(int l = 1; l < 11 ; l++)
		{
			if(l>5) break;
			System.out.print(l+"\t");
				
		}System.out.println();
		/* [3] 1~10까지 숫자를 출력하다가 6이 나오기 전에 멈춰주세요.
		*/
		for(int m = 1; m < 11 ; m++)
		{
			if(m>5) continue;
			System.out.print(m+"\t");
				
		}System.out.println();
	}
	

}
