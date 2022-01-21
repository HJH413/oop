package f_collection;
import java.util.HashMap;
import java.util.Scanner;


public class HashMapEx 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in);
		
		HashMap  map = new HashMap();
		map.put("javassem", "1111");
		map.put("javassem", "1234"); // 위의 javassem/1111을 덮어버림? 기존값을 덮어스기해서 1234로 처리함
		map.put("kimssem", "1333"); 
		map.put("kimjava", "9999");
		map.put("kimbabo", "1222");
		
		boolean stop = false;
		while( !stop )
		{
			System.out.println("아이디와 패스워드를 입력하세요");
			System.out.print("아이디 -> ");
			String id = input.nextLine();
			System.out.print("패스워드 -> ");
			String password = input.nextLine();			
			
			// 1-1. 입력받은 id가 map에서 key 부분에 해당되는 것이 있다면
			if(map.containsKey(id)) { // key값을 읽는 함수
				// 2-1. 그 아이디와 같은 key의 value값과 입력받은 패스워드가 같다면 로그인 성공
				if(map.get(id).equals(password)) { //<-여러 키 값중에서 생성된 벨류 값들 중에 맞는 것이 있다면 true
					System.out.println("로그인 성공");
					break; // 로그인 성공하면 반복문 종료
					
					//map.get(id).equals(password)
				}
			    // 2-2. 패스워드가 다르다면 출력
				else {
					System.out.println("비밀번호가 일치 하지 않습니다. 다시 로그인 하세요.");
				}
			}	
		   // 1-2. 없다면 해당하는 아이디 없다고 출력
			else {
				System.out.println("-------------------------------------------");
				System.out.println("입력하신 아이디가 존재하지 없습니다. 다시 로그인 하세요.");
				System.out.println("-------------------------------------------");
				continue; // 아래의 조건이 없어서 생략가능
			}
			
		}
	}
}
