package service;

import dto.AccountDto;
import dto.UserDto;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;



public class BankService 
{
	List<UserDto> uList = new ArrayList<UserDto>(5);
	List<AccountDto> accList = new ArrayList<AccountDto>(10);
	
	public BankService()
	{
		uList.add(new UserDto(100,"장희정", "8253jang@daumt.net", "010-8875-8253", false));
		uList.add(new UserDto(200, "이효리", "lee@daum.net", "010-2222-3333", false));
		uList.add(new UserDto(300, "송중기", "song@naver.com", "010-5554-2222", false));
		uList.add(new UserDto(400, "삼순이", "sam@daum.net", "010-2222-2222", false));
		
		
		accList.add(new AccountDto(1, "1111-1111", 1000000, 100));
		accList.add(new AccountDto(2, "2222-2222", 250000, 100));
		accList.add(new AccountDto(3, "3333-3333", 350000, 100));
		
		accList.add(new AccountDto(4, "4444-4444", 150000, 200));
		accList.add(new AccountDto(5, "5555-5555", 250000, 200));
		
		accList.add(new AccountDto(6, "6666-6666", 350000, 300));
		
		
	}//생성자 끝
	
	/**
	 * 특정 사용자의 계좌 목록을 배열로 리턴하는 메소드를 작성한다.
	 * @param int userSeq
	 * @return List<AccountDto>
	 */
	
	public List<AccountDto> findByAccount(int userSeq)
	{
		List<AccountDto> shallowCopyList = new ArrayList<AccountDto>();
		for(AccountDto a : accList)
		{
			if(a.getUserSeq() == userSeq)
			{
				shallowCopyList.add(a);
			}
			
			
		}
		return shallowCopyList;
		
		
	}
	
	public UserDto findByName(int userSeq)
	{
		for(UserDto u : uList)
		{
			if(u.getUserSeq()==userSeq)
			{
				return u;
			}
			
			
		}
		return null;
		
	}
	
	public List<AccountDto> findByAllaccount()
	{
		return accList;
		
	}
	
	public List<AccountDto> sortByBalance()
	{
		List<AccountDto> sortList = new ArrayList<AccountDto>(accList);
				
		Collections.sort(sortList);
		
		return sortList;
		
	}
	
	public List<AccountDto> sortByUserSeq()
	{
		List<AccountDto> sortList = new ArrayList<AccountDto>(accList);
		
		Collections.sort(sortList, new Comparator<AccountDto>() 
		{
			public int compare(AccountDto o1, AccountDto o2)
			{
				return o1.getUserSeq()-o2.getUserSeq();
			}
			
			
			
			
		});
		
		return sortList;
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
