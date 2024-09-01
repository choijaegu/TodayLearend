package exam0724;

public class StudentTest 
{
	public static void main(String[] args) 
	{
		System.out.println("******학생 관리 프로그램 시작*****");
		StudentService service = new StudentService();
		
		//전체학생 정보 출력
		Student stArr[] = service.selectAll();
		System.out.println("Test stArr =" + stArr);
		StudentEndView.printSelect(stArr);
		
		//이름으로 검색하기
		System.out.println("--3. 이름으로 검색----");
		Student st = service.selectByName("나영");
		if(st==null)
		{
			StudentEndView.printMessage("찾는 정보가 없습니다.");
		}
		else
		{
			StudentEndView.printSearchName(st);
		}
		
		//등록하기
		System.out.println("--1. 등록하기 ---------");
		st=new Student("미미", 25, "오리역");
		
		int result = service.insert(st);
		
		if(result==-1)
		{
			StudentEndView.printMessage("더 이상 추가 할 수 없습니다.");
		}
		else if(result==0)
		{
			StudentEndView.printMessage("이름이 중복되어 추가할 수 없습니다.");
		}
		else
		{
			StudentEndView.printMessage("등록되었습니다.");
		}
		
		System.out.println("----등록완료 후 전체검색------");
		Student Arr[] = service.selectAll();
		StudentEndView.printSelect(Arr);
		
		//수정하기
		System.out.println("---4. 수정하기-----");
		Student upSt = new Student("나영",23,"대전");
		
		result = service.update(upSt);
		if(result==0)
			StudentEndView.printMessage("이름이 잘못되어 수정할 수 없습니다.");
		else
			StudentEndView.printMessage("정보를 수정했습니다.");
		
		System.out.println("****변경 후*****");
		Arr=service.selectAll();
		StudentEndView.printSelect(Arr);
		
	}
	
	
	
	
	
}
