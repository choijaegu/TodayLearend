package Exam0714;

public class Exam0714_2 {

	public static void main(String[] args) 
	{
		//1. 1 ~ 100까지 출력 
		int a = 1;
		while(a<101)
		{
			
			System.out.print(a+"\t");
			a++;
		}System.out.println("\n");
		
		//2. A ~ Z까지 출력
		char b = 'A';
		while(b<='Z')
		{
			System.out.print(b+"\t");
			b++;
		}System.out.println("\n");
		
		//3. 1~ 100 사이의 3의 배수의 합 구해서 출력
		int c = 1;
		int d = 0;
		while(c<101)
		{
			if (c%3==0)
				d+=c;
			c++;
			
		}System.out.print(d);
		System.out.println("\n");
		
		//4. 1~ 100을 10행 10열로 출력(while문안에 while문이용)
		int e = 0;
		int sum = 1;
		while(e<10)
		{
			int f = 0;
			while(f<10)
			{
				System.out.print(sum++ + "\t");
				f++;
			}System.out.println();
		e++;
		}System.out.println("\n");
		
		//5. 구구단 출력 9행 8열
		int g = 1;
		while(g<=9)
		{
			int h =2;
			while(h<=9)
			{	
				int k = g*h;
				System.out.print(h+"*"+g+"="+k+"\t");
				h++;
			}System.out.println();
			g++;
		}
		
		
	}

}
