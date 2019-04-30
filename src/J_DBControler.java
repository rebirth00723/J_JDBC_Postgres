import java.sql.*;

public class J_DBControler {

    Connection c = null;

    J_DBControler(String port, String dbName, String user, String pwd) {
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://127.0.0.1:" + port + "/" + dbName,
                            user, pwd);

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }


    public void update() {
        String sql = "UPDATE student SET idno='32134304', phone='0987654321' WHERE name='AMo Chang';";
        try {
            Statement stmt;
            stmt = c.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    public void insert() {
        String sql = "INSERT INTO student VALUES('AMo Chang', '40343123', '1', '22', '0912345678');";

        try {
            Statement stmt;
            stmt = c.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    public void select() {
        String sql = "SELECT * FROM student;";
        ResultSet rs;

        try {
            Statement stmt;
            stmt = c.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                for (int i = 1; i < 6; i++)
                    System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
            stmt.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    public void dropTable() {
        String sql = "DROP TABLE student;";


        try {
            Statement stmt;
            stmt = c.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    public void createTable() {
        String sql = "CREATE TABLE student" +
                "(name     CHAR(20)," +
                "idno      CHAR(10)," +
                "gender    CHAR(1)," +
                "iage      CHAR(3)," +
                "phone     CHAR(12));";
        Statement stmt;

        try {
            stmt = c.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    public void close() {
        try {
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
