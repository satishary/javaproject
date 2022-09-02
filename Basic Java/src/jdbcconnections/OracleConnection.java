package jdbcconnections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OracleConnection {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = DbConnect.connect();
        while (true) {
            System.out.println("0-Exit, 1-Insert, 2-Search, 3-Search All, 4-Update, 5-Delete,6-");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 0:
                    return;
                case 1: {
                    System.out.println("Enter RollNo and Name");
                    String rollno = scanner.nextLine();
                    String name = scanner.nextLine();
                    PreparedStatement statement = connection.prepareStatement("insert into students values(?,?)");
                    statement.setString(1, rollno);
                    statement.setString(2, name);
                    int n = statement.executeUpdate();
                    System.out.println(n + " Rows Inserted ");
                    break;
                }
                case 2: {
                    System.out.println("Enter the rollno");
                    String rollno = scanner.nextLine();
                    PreparedStatement statement = connection.prepareStatement("select * from student where rollno=?");
                    statement.setString(1, rollno);
                    ResultSet rs = statement.executeQuery();
                    if (!rs.next()) {
                        System.out.println("Not found");
                        break;
                    }
                    String name = "" + rs.getObject("name");

                    System.out.println(name);
                    break;
                }
                case 3: {
                    System.out.println("Search All");
                    PreparedStatement statement = connection.prepareStatement("select * from students ");

                    ResultSet rs = statement.executeQuery();
                    System.out.printf("%20s%20s\n", "Roll No", "Name");
                    while (rs.next()) {
                        String name = "" + rs.getObject("name");
                        String rollno = "" + rs.getObject("rollno");
                        System.out.printf("%20s%20s\n", rollno, name);
                    }
                    break;
                }
                case 4: {
                    System.out.println("Update");
                    PreparedStatement ps = connection.prepareStatement("update students SET name=?,rollno=? Where rollno=?");

                    String name,
                            newrollno;
                    System.out.println("name");
                    name = scanner.nextLine();
                    System.out.println("new rollno ");
                    newrollno = scanner.nextLine();
                    System.out.println("previous rollno ");
                    String prevrollno = scanner.nextLine();
                    ps.setString(2, newrollno);
                    ps.setString(1, name);
                    ps.setString(3, prevrollno);
                    int n = ps.executeUpdate();
                    System.out.println(n + " records updated");
                    break;
                }
                case 5: {
                    System.out.println("Delete");
                    PreparedStatement ps = connection.prepareStatement("delete from students Where rollno=?");

                    String rollno;

                    System.out.println("rollno ");
                    rollno = scanner.nextLine();
                    ps.setString(1, rollno);

                    int n = ps.executeUpdate();
                    System.out.println(n + "records deleted");
                    break;
                }
                default:

                    System.out.println("Invalid");
                    break;
            }

        }
    }

}
