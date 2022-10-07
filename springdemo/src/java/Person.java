import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import dbconnect.DbConnect;


public class Person {
    private String name;
  private int age;

    public Person(String name) {
        try {
            PreparedStatement ps = DbConnect.connect().prepareStatement("select * from person where name=?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            rs.next();
            age = Integer.parseInt("" + rs.getObject("age"));
            this.name = name;

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public Person() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name");
        name = s.nextLine();
        System.out.println("Enter the age");
        age = Integer.parseInt(s.nextLine());

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }

    public boolean save() {
        try {

            PreparedStatement statement = DbConnect.connect().prepareStatement("insert into person values(?,?)");
            statement.setString(1, name);
            statement.setString(2, "" + age);
            statement.executeUpdate();

            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }

    public boolean update() {
        try {
            PreparedStatement statement = DbConnect.connect().prepareStatement("update person set age=? where name=?");
            statement.setString(2, name);
            statement.setString(1, "" + age);
            statement.executeUpdate();

            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }

    public boolean delete() {
        try {
            PreparedStatement statement = DbConnect.connect().prepareStatement("delete from person where name=?");
            statement.setString(1, name);
            statement.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }

    public static void main(String args[]) {
        Person p1 = new Person("riya");
        System.out.println(p1);
        p1.setAge(23);
        p1.update();
       // p1.delete();
        //p1.save();
    }
   
}

