package z_etc;


class  tttt {

    public double method( ) {   return   36.7;    }

}

class Child extends tttt {

    double method( double d ) { return d; }

}



//class Parent {
//
//    int  i = 7;
//
//    public int get() {  return i ; }
//
//}
//
//class Child extends Parent {
//
//    int  i = 5 ;
//
//    public int get() {  return i ; }
//
//}
//
//public class Testt {
//
//    public static void main ( String [] args ) {
//
//        Parent  p = new Parent ();
//
//        System.out.println("“--------------------1---------------------");
//
//        System.out.println( p.i );
//
//        System.out.println( p.get( ) );
//
//        Child  c = new Child ();
//
//        System.out.println("“--------------------1---------------------");
//
//        System.out.println( c.i );
//
//        System.out.println( c.get( ) );
//
//        Parent  p2 = new Child ();
//
//        System.out.println("“--------------------1---------------------");
//
//        System.out.println( p2.i );
//
//        System.out.println( p2.get( ) );
//
//    }