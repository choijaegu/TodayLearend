package Exam0716;

public class simple 
{
	static int s[][]=new int [][] {{1,2,3,4,5,},{6,7,8,9},{10,11,12,13}};
	static int w[] = new int[] {16,17,18,19};
	public static void main(String[] args) 
	{
		System.out.println(s);
		System.out.println(s[2]);
		System.out.println(s[0][1]);
		System.out.println("\n");
	
		System.out.println(w);
		System.out.println(w[2]);
		
		s[0] = w;
		
		System.out.println(s[0][4]);
		
			
			

		
	}
}