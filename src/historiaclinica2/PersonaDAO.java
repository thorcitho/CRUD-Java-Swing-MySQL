/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package historiaclinica2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    private MySQL mysql;

    public PersonaDAO() {
        mysql = new MySQL();
    }

    public void crear(Persona persona) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = mysql.Conexion(conn);
            String sql = "INSERT INTO personas (dni, nombres, apellidopa, apellidoma) VALUES (?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, persona.getDni());
            ps.setString(2, persona.getNombres());
            ps.setString(3, persona.getApellidoPa());
            ps.setString(4, persona.getApellidoMa());
            ps.executeUpdate();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public Persona leer(String dni) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Persona persona = null;
        try {
            conn = mysql.Conexion(conn);
            String sql = "SELECT * FROM personas WHERE dni = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                persona = new Persona();
                persona.setDni(rs.getString("dni"));
                persona.setNombres(rs.getString("nombres"));
                persona.setApellidoPa(rs.getString("apellidopa"));
                persona.setApellidoMa(rs.getString("apellidoma"));
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return persona;
    }

    public void actualizar(Persona persona) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = mysql.Conexion(conn);
            String sql = "UPDATE personas SET nombres = ?, apellidopa = ?, apellidoma = ? WHERE dni = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, persona.getNombres());
            ps.setString(2, persona.getApellidoPa());
            ps.setString(3, persona.getApellidoMa());
            ps.setString(4, persona.getDni());
            ps.executeUpdate();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public void eliminar(String dni) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = mysql.Conexion(conn);
            String sql = "DELETE FROM personas WHERE dni = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, dni);
            ps.executeUpdate();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public List<Persona> listarTodos() throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        List<Persona> personas = new ArrayList<>();
        try {
            conn = mysql.Conexion(conn);
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM personas");
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setDni(rs.getString("dni"));
                persona.setNombres(rs.getString("nombres"));
                persona.setApellidoPa(rs.getString("apellidopa"));
                persona.setApellidoMa(rs.getString("apellidoma"));
                personas.add(persona);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return personas;
    }
}
