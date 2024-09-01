package exam0724;

public class StudentEndView 
{
	/**
	 * 전체검색
	 */
	public static void printSelect(Student[] stArr)
	{
		System.out.println("Endview stArr ="+stArr);
		
		System.out.println("****학생의 정보("+StudentService.count+")명*******");
		for(int i = 0; i < StudentService.count; i++)
		{
			System.out.print("이름: "+stArr[i].getName()+"\t");
			System.out.print("나이: "+stArr[i].getAge()+"\t");
			System.out.println("주소: "+stArr[i].getAddr()+"\n");
		}
		
		
	}
	
	/**
	 * 조건검색
	 * 
	 */
	public static void printSearchName(Student st)
	{
		System.out.println("***"+st.getName()+"님 정보****");
		System.out.printf("나이 : %d | 주소 : %s,%n",st.getAge(),st.getAddr());
		
	}
	
	/**
	 * 검색 or 등록 or 수정결과에 대한 메세지 출력
	 */
	public static void printMessage(String message)
	{
		System.out.println(message);
	}
	
	
}
	