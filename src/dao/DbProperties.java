package dao;

/**
 * DB연동을 위한 로드,연결,닫기
 */


public class DbProperties 
{
	/**
	 * 로드(static이라 메인보다 먼저 나옴)
	 */
	static
	{
		
		Class.forName(DbProperties.DRIVER_NAME);
	}
	
	
	
	
	
}
