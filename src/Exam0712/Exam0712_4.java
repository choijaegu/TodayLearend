package Exam0712;

public class Exam0712_4 
{

	public static void main(String[] args) 
	{
		outer : for(int a = 0; a < 4 ; a++ ) //행
		{
			for(int b = 0 ; b < 6; b++)  //열
			{	
				if (b==3) 
					break outer ;
				
				System.out.print("아자"+" ");
				
			}System.out.println();
		}
	}

}
