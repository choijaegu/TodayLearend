package Exam0714;

public class 연습3 {

	public static void main(String[] args) {
		outer: for( int a = 1 ; a < 10 ; a++)
		{
			for( int b = 2 ; b < 10 ; b++)
			{	
				if (b==5)
					continue
						outer;
				
				int i = a*b;
				
				System.out.print(b+"*"+a+"="+i+"\t");
			}System.out.println("\n");
		}

	}

}
