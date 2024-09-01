package Exam0712;

public class Exam0712 
{

	public static void main(String[] args) 
	{
		Exam0712 ex = new Exam0712();
		int k = ex.methodExam01(3);
		System.out.println("리턴 값 : "+k);
		
		ex.methodExam02();
		
		ex.methodExam03(8);
		
		String l = ex.methodExam04(3);
		System.out.println("리턴 값: "+l);
	}

	
	
	/*
	Method이름 : methodExam01
	자기자신만 접근가능
	Return Type : 정수
	Parameter : 정수1개
	(구현부에서)하는일 : 
	인수로 받은(들어온)정수를 출력하고 인수에 2를 곱해 return
	 */
	
	private int methodExam01(int i)
	{
		System.out.println("들어온 인수 : "+i);
		return i*2;
	}
	
	
	
	/*
	Method이름 : methodExam02
	어디에서나 아무나 접근가능
	Return 안함	
	Parameter 없음
	(구현부에서)하는일 : 아무거나 출력
	 */
	public void methodExam02()
	{
		System.out.println("나는야 뿡뿡이");
	}
	
	/*
	Method이름 : methodExam03
	같은pakage내에서 아무나 접근가능
	Return Type : Return 안함
	Parameter : 정수1개	
	(구현부에서)하는일 : 인수로 받은(들어온) 정수를 출력하고
		그수가 짝수라면 "짝수",홀수라면"홀수" 출력
	 */
	
	void methodExam03(int i)
	{
		System.out.print(i+"는 ");
		if (i%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
	}
	
	/*
	Method이름 : methodExam04
	상속관계라면 어디서나 접근가능
	Return Type : String타입
	Parameter : 정수1개	
	(구현부에서)하는일 : 인수로 받은(들어온) 정수를 출력하고
		그수가 짝수라면 "짝수",홀수라면"홀수" 리턴
	 */
	
	protected String methodExam04(int i)
	{
		System.out.print("출력 값: "+i+"\n");
		if (i%2==0)
			return "짝수";
		else 
			return "홀수";
	}
}
