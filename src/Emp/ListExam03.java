package Emp;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;




public class ListExam03 
{
	List<Emp> list = new ArrayList<Emp>();
	
	
	public ListExam03()
	{
		list.add(new Emp(10,"장희정",20,"오리역"));
		list.add(new Emp(50,"이나영",25,"서울"));
		list.add(new Emp(30,"정미미",22,"서울"));
		list.add(new Emp(40,"정나라",30,"오리역"));
		list.add(new Emp(20,"김소희",27,"대구"));
	
	
		for(Emp e:list)
		{
			System.out.println(e);
		}
	
	

	}
	
	/**
	 * 사원번호에 해당하는 사원정보를 검색
	 * 
	 * @param args
	 */
	public Emp findByEmpno(int empno)
	{
		
		
		/*for(int i =0; i <list.size();i++)
		{		
			Emp e=list.get(i);
			if(e.getEmpno()==empno)
			{
				return e;
			}
			
			
			
		}*/
		
		
		for(Emp e:list)
		{
			if(e.getEmpno()==empno)
				return e;
		}
		
		return null;
		
		
	}
	
	/**
	 * 동일한 주소의 사월들 검색
	 * @param args
	 */
	
	
	public List<Emp>findByAddr(String addr)
	{
		List<Emp> shallowCopyList = new ArrayList<Emp>();
		for(Emp e: list)
		{
			if(e.getAddr().equals(addr))
			{
				shallowCopyList.add(e);
			}
			
			
			
		}
		return shallowCopyList;
		
	}
	
	/**
	 * 사원번호를 기준으로 정렬하기
	 * :Comparable을 구현한 객체를 정렬할 수 있다.
	 * @param args
	 */
	public List<Emp> sortByEmpno()
	{
		List<Emp> sortList = new ArrayList<Emp>(list);
		
		Collections.sort(sortList);
		
		
		
		
		return sortList;
	}
	
	
	
	
	
/**
 * 나이를 기준으로 정렬하기
 * :Comparator
 * @param args
 */
	public List<Emp> sortByAge()
	{
		List<Emp> sortList = new ArrayList<Emp>(list);
		
		Collections.sort(sortList, new Comparator<Emp>()
				{
				
					public int compare(Emp o1, Emp o2)
					{
						return o1.getAge()-o2.getAge();
						
						
					}
			
			
			
			
				});
				return sortList;
		
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{ 
		ListExam03 le = new ListExam03();
		System.out.println("1. 사원번호 검색");
		Emp emp = le.findByEmpno(30);
		System.out.println(emp);
		
		System.out.println("2. 주소 검색");
		List<Emp> resultList = le.findByAddr("서울");
		for(Emp e:resultList)
		{
			System.out.println(e);
		}
		
		System.out.println("3. 사원번호 정렬---");
		resultList = le.sortByEmpno();
		for(Emp e:resultList)
		{
			System.out.println(e);
		}
		
		System.out.println("4. 나이 정렬---");
		resultList = le.sortByAge();
		for(Emp e: resultList)
		{
			System.out.println(e);
		}
		

	}

}
///////////////////////////////////////////
class AgeComparator implements Comparator<Emp>
{
	
	public int compare(Emp o1, Emp o2)
	{
		return o1.getAge()-o2.getAge();
	}
	
	
	
	
	
}