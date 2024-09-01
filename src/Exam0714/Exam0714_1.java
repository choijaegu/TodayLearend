package Exam0714;

public class Exam0714_1 
{

	public static void main(String[] args) 
	{
		//구구단 5단만 빼고 출력 9행 8열
		outer: for( int a = 1 ; a < 10 ; a++)
		{
			for( int b = 2 ; b < 10 ; b++)
			{	
				if (b==5)
					break
						outer;
				
				int i = a*b;
				
				System.out.print(b+"*"+a+"="+i+"\t");
			}System.out.println("\n");
		}
		
		//구구단 5단까지만 출력
		for( int c = 1; c < 10 ; c++)
		{
			for(int d = 2; d < 10 ; d++)
			{
				if (d==5)
					break;
				int j = c*d;
				System.out.print(d+"*"+c+"="+j+"\t");
			}System.out.println();
		}
	}

}
