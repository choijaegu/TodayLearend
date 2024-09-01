package Exam0714;

public class 연습2 
{

	public static void main(String[] args) 
	{
		//구구단 만들기 9행 8열
		for(int a = 1 ; a <= 9 ; a++) //행
		{
			for(int b = 2 ; b <= 9 ; b++)  //열
			{	int i = a*b;
				System.out.print(b+"*"+a+"="+i+"\t");
			}System.out.println();
		}
		
	
	}

}

			

	