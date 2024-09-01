package shop;

import java.util.Random;

public class MainApp 
{

	public static void main(String[] args) 
	{	
		System.out.println("-----------ShoppingMall OPEN---------");
		ShoppingMall mall = new ShoppingMall();
		
		Random random =new Random();
		for(int i = 0; i <10; i++)
		{
			int age = random.nextInt(55)+1;
			try 
			{
			mall.enter(age);
			}
			catch (NoKidsException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println();
		}
		System.out.println("------------ShoppingMall CLOSE-------------");
		
		System.out.println("예외발생한 손님: "+NoKidsException.count+"명 입니다.");
	}

	
}
