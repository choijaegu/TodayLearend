package ex0801;

import java.util.Scanner;

public class BankApplication 
{
	Scanner sc= new Scanner(System.in);
	Account acc[] = new Account[100];
	static int count = 0;
	
	public void Insert()
	{
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		
		System.out.println("계좌번호 :");
		String accountNum = sc.nextLine();
		System.out.println("계좌주 :");
		String name = sc.nextLine();
		System.out.println("초기입금액 :");
		int balance = Integer.parseInt(sc.nextLine());
		
		acc[count++] = new Account(accountNum, name, balance);
		
		System.out.println("결과: 계좌가 생성되었습니다.");
		
		List();
		
		
	}
	
	public void List()
	{
		for(int i = 0; i<count; i++)
		{
			
			System.out.println(acc[i].getAccountNum()+"  "+acc[i].getName()+"  "+acc[i].getBalance());
		}
		
		
		
	}
	
	
	
	
	public BankApplication()
	{
		boolean run = true;
		
		while(run)
		{
			System.out.println("----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("----------------------------------");
			
			System.out.print("메뉴선택=>");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu)
			{
				case 1:Insert();
				break;
				
				case 2:List();
				break;
			
			
			
			
			
			
			
			
			
			
			
			
			
			}
			
			
			
			
			
		}
		
		
		
	}
	
	public static void main(String[] args) 
	{
		new BankApplication();
	}

}
