package f_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList<String>  list = new ArrayList<String>(4);  
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		list.add("rabbit");
		//노란색이 밑줄 생기는 이유 자료형을 명확하게 안해서.
		// 노랜표시 없애려면 generics 지정
	
		for(int i=0; i<list.size(); i++) {
			
			String str = list.get(i); //get이란 함수는 리턴을 해주는데 
									//나는 최상위인 오브젝트로 리턴할테니 너가 알아서 형변환 해라
			System.out.println(str);
		}
		
		for (String msg : list) {  // 향상된 for 문 
			System.out.println(msg);
		}
		
		list.set(0, "tiger");
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
	}
}
