package shop;

public class NoKidsException extends Exception
{
	public static int count;
	
	public NoKidsException()
	{
		super("애들은 가라");
		count++;
		
	}
	
	public NoKidsException(String message)
	{
		super(message);
		count++;
		
	}
	
	
}
