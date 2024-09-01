package inoutStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 
{

	public static void main(String[] args) 
	{
		try(InputStream is = new FileInputStream("C:/Temp/test2.db");)
		{
			byte [] data= new byte[100];
			
			while(true)
			{
				int num = is.read(data);
				if(num == -1) break;
				
				for(int i = 0; i<num; i++)
				{
					System.out.println(data[i]);
				}
				
			}
			System.out.println("입력이 완료되었습니다.");
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
		
		
	}

}
