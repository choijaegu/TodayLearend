package StartView;

import java.util.ArrayList;
import java.util.List;
import Goods.Goods;

public class StartView 
{	
	List<Goods> list = new ArrayList<Goods>();
		
	public StartView()
	{
		list.add(new Goods("A01","새우깡", "2500", "짜고 맛나다."));
		list.add(new Goods("A02", "고구마깡", "3500", "고구가맛이 난다."));
		list.add(new Goods("A03" , "감자깡" , "5000" , "감자맛에 고소한맛."));
		list.add(new Goods("A04" , "허니버터칩" , "2200" , "달콤 하다."));
		list.add(new Goods("A05" , "콘칩" , "3000" , "고소하다."));	
	
	} //생성자.
	
	public List<Goods> Start()
	{
		return list;
	}
}
