package f_collection;
import java.util.*;

public class bHashSetLottoEx 
{
	public static void main(String[] args) 
	{
		HashSet lottos = new HashSet();  //중복을 배제할때 set많이씀 주로 phtyon에서 많이 씀
		
		
		while(lottos.size() < 6) {
			int num = (int)(Math.random()*45)+1;
			lottos.add(num);
		}
		System.out.println(lottos);
	}
}


//for(int i =0; i<6; i++) {
//	int num = (int)(Math.random()*45)+1;
//	lottos.add(num);
//}
//
//System.out.println(lottos);