package E_fianl;

class Parent {
    final String field = "부모님꺼";
    public final void house() { //
        System.out.println("부모님이 만드신 집");
    }
}

class Child extends Parent{
    Child(){
//        field = "내꺼"; // 부모의 field 사용 // 변수 앞에 final붙으면 사용 불가
    }

//    @Override
//    public void house() {
//        System.out.println("물려받은 집");
//    } //부모의 함수를 똑같이 작성하고 내용 변경
}
public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.field);
        p.house();
    }
}
