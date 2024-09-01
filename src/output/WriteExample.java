package output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample 
{

	public static void main(String[] args) 
	{	
		/*OutputStream os = null;
		try 
		{
			os = new FileOutputStream("C:/Temp/test1.db");
			
			byte a = 10;
			
			os.write(a);
			
			os.flush();
			
			System.out.println("저장 성공");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				os.close();
			} 
			catch (IOException e) 
			{
				
			}
		}*/
		
		try (OutputStream os = new FileOutputStream("C:/Temp/test1.db",true))
		{
			
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			
			System.out.println("저장 성공");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
