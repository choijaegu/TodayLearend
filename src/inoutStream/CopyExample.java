package inoutStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample 
{

	public static void main(String[] args) 
	{
		String originalFileName = "C:/Temp/test.jpg";
		String targetFileName= "C:/Temp/test2.jpg";
		
		try(InputStream is = new FileInputStream(originalFileName);
			OutputStream os = new FileOutputStream(targetFileName);)
		{
			byte [] data = new byte[1024];
			
			while(true)
			{
				int num = is.read(data);
				if(num ==-1)break;
				os.write(data,0,num);
			}
			os.flush();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("복사가 잘 되었습니다.");
		
		
	}

}
