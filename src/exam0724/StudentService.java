package exam0724;

public class StudentService 
{
	private Student [] stArr = new Student [10];
	
	public static int count;
	
	
	public StudentService() 
	{
		stArr[StudentService.count++]=create("희정",20,"서울");
		stArr[count++] = this.create("나영", 24,"대구");
		stArr[count++] = this.create("민희", 22, "대전");
				
	}
	
	private Student create(String name, int age, String addr)
	{
		Student st1 = new Student(name,age,addr);
		return st1;
		
	}
	
	/**
	 * 전체학생의 정보 조회하기.
	 * 
	 */
	
	
	public Student[] selectAll()
	{
		System.out.println("Service stArr ="+stArr);
		
		return stArr;
	}
	
	/**
	 * 이름에 해당하는 학생의 정보 검색하기
	 *  : 이름은 중복안됨!
	 *  : 찾으면 객체를 리턴하고 못 찾으면 null 리턴
	 *  
	 */
	
	public Student selectByName(String name)
	{
		for(int i = 0; i< this.count; i++)
		{
			Student st = stArr[i];
			if(st.getName().equals(name))
			{
				return st;
			}
			
			
		}
		return null;
		
	}
	
	/**
	 * 학생의 정보등록하기
	 *  : 배열의 길이를 벗어났는지 체크 = -1
	 *  : 이름이 중복인지 체크 = 0
	 *  :유효성체크가 완료되면 등록한다 = 1
	 */ 
	public int insert(Student st)
	{
		if(count==stArr.length)
			return -1;
		
		Student searchStudent = this.selectByName(st.getName());
		if(searchStudent != null)
			return 0;
		
		stArr[count++] = st;
		
		return 1;
	}
	
	/**
	 * 이름에 해당하는 학생의 나이와 주소 변경하기
	 *  : 이름에 해당하는 정보가 없으면 0 리턴
	 *  : 정보가 있으면 수정하고 1을 리턴한다.
	 */
	public int update(Student st)
	{
		Student searchSt = this.selectByName(st.getName());
		if(searchSt == null)
			return 0;
		
		searchSt.setAge(st.getAge());
		searchSt.setAddr(st.getAddr());
		
		return 1;
	}
	
	
	
}
