package ch18.sec06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharactorConvertStreamExample 
{

	public static void main(String[] args) 
	{
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
		
	}
	public static void write(String str)
	{
		try (Writer writer = new FileWriter("C:/Temp/text.txt");)
		{
			writer.write(str);
			writer.flush();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	public static String read()
	{
		String str = null;
		try(Reader reader = new FileReader("C:/Temp/test.txt");)
		{
			char[] data = new char[100];
			int num = reader.read(data);
			str = new String(data,0,num);
				
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return str;
	}

}
