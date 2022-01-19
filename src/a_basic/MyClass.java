package a_basic;
class MyClass {

//	String name;
//
//	   public MyClass() {
//		   this("이름없음");	
//	       System.out.println("생성자 실행");
//	   }
//
//	   public MyClass( String name ) {
//
//	      this.name = name;
//	      
//	   }  
//
//	public static void main ( String [] args ) {
//
//	      MyClass  my = new MyClass();
//	      System.out.println(my);
//
//	}
	
	private int x, y;

    private double z;

    public void method ( int a, int b, double c ) {

        x = a;

        y = b;

        z = c;

    }

    public  void method ( int a, double b, int c ) {

        method( a, c, b );

    }
//    public  void method ( int a, double b, int c ) {
//
//        this( a, c, b );
//
//}
    void  method( int a, int b) {

    	x = a;

    	                   y = b;

    	              }
}   