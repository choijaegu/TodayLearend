package Exam0714;

import java.util.Scanner;

class method01
{
	
	public static int Total(int a, int b, int c)
		{
			int d = a+b+c;
			return d;
		}
}

class method02
{
	public static double Average(int a, int b, int c)
	{
		double d = (a+b+c)/3;
		return d;
	}
}

class method03
{
	public static char Grade(int a, int b, int c)
	{	
		int d = ((a+b+c)/3)/10*10;
		char e = 'A';
		switch(d)
		{
			case 100 : e= 'A'; 	break;
			case 90 : e= 'A';	break;
			case 80 : e= 'B';	break;
			case 70 : e= 'C';	break;
			case 60 : e= 'D';	break;
			default : e = 'F';
		}
		return e;
	}
}

public class Exam0714_6 
{

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		
		
		

		
		while(run)
		{	
			System.out.println("1. 성적표 구하기 2. 종료");
			System.out.print("선택=> ");
			int menu = sc.nextInt();
			
			switch(menu)
			{
				case 1: 
						System.out.println("이름을 입력해주세요.");
						System.out.print("이름:");
						String name = sc.next();
						System.out.println();
						
						System.out.println("국어 점수를 입력해주세요.");
						System.out.print("국어:");
						int kor = sc.nextInt();
						System.out.println();
						
						System.out.println("수학 점수를 입력해주세요.");
						System.out.print("수학:");
						int mat = sc.nextInt();
						System.out.println();
						
						System.out.println("영어 점수를 입력해주세요.");
						System.out.print("영어:");
						int eng = sc.nextInt();
						System.out.println();
						
						int tot = method01.Total(kor, mat, eng);
						double ave = method02.Average(kor, mat, eng);
						char gra = method03.Grade(kor, mat, eng);
						System.out.println("당신의 성적은 총점:"+tot+" ,"+"평균:"+ave+" ,"+"등급:"+gra+" 입니다.");
						System.out.println();
						break;
				case 2 : 
						run=false;
				}
		}System.out.println("\n"+"프로그램을 종료합니다.");
	}

}
