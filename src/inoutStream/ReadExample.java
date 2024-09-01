package inoutStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample 
{

	public static void main(String[] args) 
	{
		try(InputStream is = new FileInputStream("C:/Temp/test1.db");)
		{
			while(true)
			{
				int data = is.read();
				if(data ==-1) break;
				System.out.println(data);
			}
			System.out.println("입력이 완료되었습니다.");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
