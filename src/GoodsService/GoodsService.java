package GoodsService;

import java.util.ArrayList; 
import Goods.Goods;
import java.util.List;
import StartView.StartView;

public class GoodsService 
{
	StartView start = new StartView();
	List<Goods> list = new ArrayList<Goods>(); 
	
	public int insert(Goods goods)
	{	
		
		List<Goods> good = start.Start();
		for( Goods g : good )
		{
			if(g != goods)
			{
				return 1;
			}
			else if( g == goods)
			{
				return 0;
			}
			
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
