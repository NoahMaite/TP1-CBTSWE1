import java.sql.*;
import java.util.*;

public class EmpDao {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/swii5?useTimezone=true&serverTimezone=America/Sao_Paulo",
                "root",
                "root"
            );
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public static int save(Emp e) {
        int status = 0;
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO user905(name,password,email,country) VALUES (?,?,?,?)"
            );

            ps.setString(1, e.getName());
            ps.setString(2, e.getPassword());
            ps.setString(3, e.getEmail());
            ps.setString(4, e.getCountry());

            status = ps.executeUpdate();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return status;
    }

    public static List<Emp> getAllEmployees() {
        List<Emp> list = new ArrayList<>();

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM user905");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Emp e = new Emp();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setPassword(rs.getString(3));
                e.setEmail(rs.getString(4));
                e.setCountry(rs.getString(5));
                list.add(e);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static int delete(int id) {
        int status = 0;

        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM user905 WHERE id=?");

            ps.setInt(1, id);
            status = ps.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}
