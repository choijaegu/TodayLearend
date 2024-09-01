package ch18.sec07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineExample 
{

	public static void main(String[] args) 
	{
		int lineNo;
		try(BufferedReader br = new BufferedReader(new FileReader("src/ch18/sec07/ReadLineExample.java"));)
		{	
			lineNo = 1;
			while(true)
			{
				String str = br.readLine();
				if(str == null)break;
				System.out.println(lineNo+"\t"+str);
				lineNo++;
				
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
