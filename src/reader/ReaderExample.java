package reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample 
{
	public static void main(String[] args) 
	{
		try(Reader reader = new FileReader("C:/Temp/test3.txt");)
		{
			while(true)
			{
				int data = reader.read();
				if(data == -1) break;
				System.out.println((char)data);
			}
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		try(Reader reader = new FileReader("C:/Temp/test3.txt");)
		{
			char[]data = new char[100];
			
			while(true)
			{
				int num = reader.read(data);
				if(num == -1)break;
				for(int i = 0; i<num; i++)
				{
					System.out.println(data[i]);
				}
				
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
}
