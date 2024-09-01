package Exam0716;

import java.util.Scanner;

public class EncapsulationExam실습 {

	int weight = 80;
	String password = "1234";
	//1)패스워드를 넣으면 몸무게를 알려주는 메소드
	public void getWeight(String password)
	{
		if (isPassword(password))
		{
			System.out.println("몸무게: "+this.weight);
		}
		else 
		{
			System.out.println("비밀번호가 올바르지 않습니다.");
		}
	}
	
	//2)패스워드를 넣으면 몸무게를 변경시켜주는 메소드
	public void setWeight(String password, int newWeight)
	{
		if (isPassword(password))
		{
			System.out.println("몸무게가 수정되었습니다.");
			this.weight = newWeight;
		}
		else
		{
			System.out.println("비밀번호가 올바르지 않습니다.");
		}
	}
	
	//3)패스워드를 넣으면 비밀번호를 변경시켜주는 메소드
	void settWeight(String oldPassword, String newPassword)
	{
		if(isPassword(oldPassword))
		{
			System.out.println("패스워드가 변경되었습니다.");
			this.password = newPassword;
		}
		else
		{
			System.out.println("비밀번호가 올바르지 않습니다.");
		}
	}
	
	//4)boolean형으로 패스워드가 맞는지 틀린지 true,false를 만들어주는 메소드
	boolean isPassword(String password)
	{	
		
		if(this.password.equals(password))
		return true;
		else
		return false;
		
	}
	
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);
		boolean run=true;
		EncapsulationExam실습 ec = new EncapsulationExam실습();
		
		while(run) 
		{
			
			System.out.println("---------------------------------------------------------------------");
			System.out.println("1.몸무게 검색  | 2.몸무게 변경   | 3. 비밀번호 변경  |  9.종료");
			System.out.println("---------------------------------------------------------------------");
			System.out.print("선택> ");
			
			int menu = sc.nextInt();
			
			switch(menu)
			{
				case 1: 
						System.out.print("비밀번호를 입력해주세요:");
						String pa1 = sc.next();
						
						ec.getWeight(pa1);
						break;
						
				case 2:
						System.out.print("비밀번호를 입력해주세요:");
						String pa2 = sc.next();
						System.out.print("변경할 몸무게를 입력해주세요:");
						int we1 = sc.nextInt();
						
						ec.setWeight(pa2,we1);
						break;
						
				case 3:
						System.out.print("기존 비밀번호를 입력해주세요:");
						String pa3 = sc.next();
						System.out.print("변경할 비밀번호를 입력해주세요:");
						String pa4 = sc.next();
						
						ec.settWeight(pa3, pa4);
						break;
				
				case 9:
						run = false;
			}
		}System.out.println("프로그램을 종료하겠습니다.");
	}
}
