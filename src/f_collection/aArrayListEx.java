
package f_collection;
import java.util.ArrayList;

class aArrayListEx
{
	public static void main(String[] args) 
	{
		ArrayList list = dataSet();
		
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		
		for(int i=0; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}

	static ArrayList dataSet()
	{
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;
		
		ArrayList list = new ArrayList(2); //동적인 배열 자기가 스스스로 늘림
										// 갯수가 명확하지 않을때 사용
									//노란색이 밑줄 생기는 이유 자료형을 명확하게 안해서.
									 //arraylist2에서 해결함
		list.add(name);
		list.add(age);
		list.add(height);
		
		return list;
	}
}
