package abc.day0103;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCreate {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        conn = DBConnection.getConnection();
        if (conn == null) {
            System.out.println("连接失败");
            System.exit(-1);
        }
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("drop database test");
            stmt.executeUpdate("create database test");
            stmt.executeUpdate("use test");
            stmt.executeUpdate("create table product (id int(3) not null primary key," +
                    "pname VARCHAR(30) not null, " +
                    "price decimal(8,2) not null," +
                    "stock int(5) not null," +
                    "type VARCHAR(10) not null)");
            stmt.executeUpdate("insert into product values(101,'苹果手机', 2000.06, 8, '电子')");
            stmt.executeUpdate("insert into product values(102,'相机',    4000.06, 20, '家电')");
            stmt.executeUpdate("insert into product values(103,'笔记本',  5400.06, 10, '电子')");
            stmt.executeUpdate("insert into product values(104,'平板电脑', 2300.06, 15, '电子')");
        } catch (SQLException e) {
            System.out.println("失败");
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            DBConnection.closeConnection(conn);
        }
    }
}
