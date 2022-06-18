package INHERITANCE;

public class PERSON {

    String name, address;
    int age;

    public PERSON(String n, String ad, int ag) {
        name = n;
        address = ad;
        age = ag;
    }

    public String toString() {
        return "Name=" + name + ",Address=" + address + ",Age=" + age;
        
    }
    public static void main(String args[]){//it is main method
        PERSON p=new PERSON("shubham" ,"varanasi",23);
        System.out.println(p);
}
    
}