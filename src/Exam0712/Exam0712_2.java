package Exam0712;

public class Exam0712_2 
{

	public static void main(String[] args) 
	{
		Exam0712_2 ex = new Exam0712_2();
		
		int l = ex.methodExam02_01(33,33);
		System.out.println("리턴 값: "+l);
		
		String s1 = ex.methodExam02_02("최재구");
		System.out.println("리턴 값: "+s1);
		
		ex.methodExam02_03(12,"뽀삐뽀삐뽀 뽀삐뽀");
		
		double su = ex.methodExam02_04(3, 10.04, 5);
		System.out.println("리턴 값: "+su);
	}
	
	/*	
	Method이름 : methodExam02_01
	자기자신만 접근가능
	Return Type : 정수
	Parameter : 정수2개	
	(구현부에서)하는일 : 인수로 받은(들어온) 두개의 정수의 합을 출력하고
		두정수의 합이 3의 배수이면 "3의 배수"출력
		두정수의 합 리턴
	 */
	private int methodExam02_01(int i, int j)
	{
		System.out.println("출력 값: "+i+","+j);
		int k = i+j;
		if (k%3==0)
			System.out.println("출력 값: "+"3의 배수" );
			return k;
	}
	
	/*	Method이름 : methodExam02_02
	어디서나 아무나 접근
	Return Type : String
	Parameter : String	
	(구현부에서)하는일 : 인수로 받은(들어온) String에 바보를 붙여서 출력
			     인수로 받은 (들어온)String에 바보를 붙여서 리턴
	 */
	public String methodExam02_02(String s)
	{	
		String s3 = s+" 천재";
		System.out.println("출력 값: "+s3);
		return s3;
	}
	
	/*	
	Method이름 : methodExam02_03
	같은 package에서 아무나 접근가능
	Return Type : 리턴안합
	Parameter : 정수1개 와 String 1개	
	(구현부에서)하는일 : 인수로 받은 정수와 String을 (하나의 String으로) 붙여서 출력
		인수로 받은정수가 4의 배수라면 1출력, 아니라면 0출력
	*/
	void methodExam02_03(int i,String s)
	{
		String s1 = i+" "+s;
		System.out.println("출력 값: "+s1);
		if (i%4==0)
			System.out.println("출력 값 : 1");
		else 
			System.out.println("출력 값 : 0");
	}
	
	/*	
	Method이름 : methodExam02_04
	상속관계라면 어디서나 접근가능
	Return Type : 실수(부동소수형)
	Parameter :첫번째인수(정수),두번째 인수(실수),세번째 인수(정수)	
	(구현부에서)하는일 : 첫번째 인수 곱하기 두번째인수 빼기 세번째인수 결과 출력
			     위의 결과를 리턴
	*/
	protected double methodExam02_04(int i,double j, int k)
	{
		double s = i*j-k;
		System.out.println("출력 값: "+s);
		return s;
	}
	
	
}
