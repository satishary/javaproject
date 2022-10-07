
package inheritance;


public class B extends A {

    public void f2() {
        System.out.println("function f2 in class B");

    }
    public void f3(){
        System.out.println("function f3 in class B");
    }

    public static void main(String[] args) {
  A x1=new A();//object created..
  B x2=new B();
  A x3=new B();
  C x4=new C();
 // B x4=new A(); A is super class B is sub class for A.
                   //A super class me sub class ko store kr skte h but B sub class me A super class ko store ni kr skte..
  x1.f1();//calling x1tof1
  x2.f2();
  x2.f1();
  x3.f3();
  x3=new A();
  x3.f3();
  x4.f3();
  x4.f1();
    }
}
