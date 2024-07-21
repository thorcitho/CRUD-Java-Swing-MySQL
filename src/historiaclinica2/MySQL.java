/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package historiaclinica2;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class MySQL {

    static Connection conn = null;
    static Statement st = null;
    static ResultSet rs = null;
    static PreparedStatement ps = null;
    static String bd = "historiaclinica2";
    static String login = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost/" + bd;

    public static Connection Conexion(Connection conn) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, password);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }

    public static Statement sta(Statement st) throws SQLException {
        conn = Conexion(conn);
        st = conn.createStatement();
        return st;
    }

    public static PreparedStatement psta(PreparedStatement ps) throws
            SQLException {
        conn = Conexion(conn);
        ps = (PreparedStatement) conn.createStatement();
        return ps;
    }

    public Connection getConnection() {
        return conn;
    }

    public void desconectar() {
        conn = null;
        System.out.println("La conexion a la base de datos " + bd +" a terminado");
    }
    public Double GetDataDouble(String colName, String sql) {
        double data = 0;
        try {
            st = sta(st);
            rs = st.executeQuery(sql);
            while (rs.next()) {
                data = rs.getDouble(colName);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    public static ResultSet ConUsu(ResultSet rs) throws SQLException {
        st = sta(st);
        rs = st.executeQuery("select *from usuarios");
        return rs;
    }

    public static ResultSet ConAut(ResultSet rs) throws SQLException {
        st = sta(st);
        rs = st.executeQuery("select *from login");
        return rs;
    }
}
