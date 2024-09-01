package input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample 
{

	public static void main(String[] args) 
	{
		try (InputStream is = new FileInputStream("C:/Temp/test1.db"))
		{
						
			while(true)
			{
			int data = is.read();
			System.out.println(data);
			if(data == -1)
				break;
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

}
