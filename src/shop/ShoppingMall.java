package shop;

public class ShoppingMall 
{
	public void enter(int age) throws NoKidsException
	{
		if(age < 18)
		{
			throw new NoKidsException(age+"살 은 입장할 수 없어요.");
		}
		System.out.println(age+"살 님 입장하신걸 환영합니다.");
		
	}
	
	
	
	
}
