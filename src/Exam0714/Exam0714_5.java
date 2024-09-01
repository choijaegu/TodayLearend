package Exam0714;

import java.util.Scanner;
public class Exam0714_5 {

	public static void main(String[] args) 
	{
		//은행 인출기 만들기.
		Scanner sc = new Scanner(System.in);
		
		int balance = 0;
		
		boolean run = true;
		
		System.out.print("이름을 입력해주세요: ");
		String name = sc.next();
		
		while(run)
		{	
			
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1. 예금 2. 출금 3.잔고 4.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택>");
			
			int menu = sc.nextInt();
			
			switch(menu)
			{
				case 1: 
						System.out.print("예금액: ");
						int save = sc.nextInt();
							balance +=save;
							break;
						
				case 2 : 
						System.out.print("출금액: ");
						int out = sc.nextInt();
							balance -=out;
							break;
							
				case 3 : 
						System.out.println("현재 "+name+"님의 잔액은 "+balance+"원 입니다.");
						break;
						
				case 4 : 
						run = false;
			}
		}System.out.print("\n"+"프로그램을 종료합니다.");
		
	}

}
