
import dbconnect.DbConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Iphone {

    String name;
    int price, model;

    public Iphone(int model) {
        try {
            PreparedStatement ps = DbConnect.connect().prepareStatement("select * from iphone where model=?");
            ps.setString(1, "" + model);
            ResultSet rs = ps.executeQuery();
            rs.next();
            price = Integer.parseInt("" + rs.getObject("price"));
            name = "" + rs.getObject("name");
            this.model = model;

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public Iphone() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name");
        name = s.nextLine();
        System.out.println("Enter price");
        price = Integer.parseInt(s.nextLine());
        System.out.println("Enter model");
        model = Integer.parseInt(s.nextLine());
    }

    public Iphone(String name, int model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice(int price) {
        return price;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Iphone{" + "name=" + name + ", price=" + price + ", model=" + model + '}';
    }

    public boolean save() {
        try {
            PreparedStatement statement = DbConnect.connect().prepareStatement("insert into iphone values(?,?,?)");
            statement.setString(1, name);
            statement.setString(3, "" + price);
            statement.setString(2, "" + model);
            statement.executeUpdate();

            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }

    public boolean update() {
        try {
            PreparedStatement statement = DbConnect.connect().prepareStatement("update iphone set name=? , price=? where model=?");
            statement.setString(1, name);
            statement.setString(3, "" + model);
            statement.setString(2, "" + price);
            statement.executeUpdate();

            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            return false;
        }
    }

    public static void main(String args[]) {
        Iphone i = new Iphone(324);
        System.out.println(i);
        i.name = "Pappu";
        //i.save(); ye query save k liye h.
        i.update();
    }
}
