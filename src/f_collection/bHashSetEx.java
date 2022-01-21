package f_collection;
import java.util.HashSet;

public class bHashSetEx 
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<String>(); //순서를 유지하지 않는 데이터의 집합, 중복을 허용하지 않음
		set.add("rabbit");
		set.add("zebra");
		set.add("fox");
		set.add("zebra");
		set.add("elephant");
		set.add("elephant");	
		
		System.out.println( set );		// 로또같은거할때 중복 허용안하게!!!!!!!!
	}
}
