
package FUNCTION;


public class PERSON {//class hai
    String name;
    int age;
    String address;//valiables
    PERSON(String name,int age,String address ){//constructor
  this.name=name;
  this.age=age;
  this.address=address;
  
   
           
}
    public static void main(String args[]){
        PERSON p=new PERSON("satis",25,"varanasi");//object name hai p
        System.out.println(p.name +" \n" +p.age +"\n "+ p.address);
    }
}
