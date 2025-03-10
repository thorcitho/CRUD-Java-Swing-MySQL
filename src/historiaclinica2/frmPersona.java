/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package historiaclinica2;

import historiaclinica2.Persona;
import historiaclinica2.PersonaDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author HP
 */
public class frmPersona extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmPersona
     */
    private PersonaDAO personaDAO;

    public frmPersona() {
        initComponents();
        setTitle("Gestión de Personas");
        personaDAO = new PersonaDAO();
        cargarPersonas();
        mejorarUI();
        
        setResizable(true);
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
    }

    private void mejorarUI() {
        // Establecer colores con tonos verdes
        Color primaryColor = new Color(34, 139, 34);  // Verde bosque
        Color secondaryColor = new Color(240, 255, 240);  // Honeydew (verde muy claro)
        Color accentColor = new Color(50, 205, 50);  // Lima verde
        Font labelFont = new Font("Arial", Font.BOLD, 12);

        // Aplicar estilos a los componentes existentes
        lblCRUD.setFont(new Font("Arial", Font.BOLD, 18));
        lblCRUD.setForeground(new Color(0, 100, 0));  // Verde oscuro

        JTextField[] textFields = {txtDNI, txtNombres, txtApellidoPa, txtApellidoMa};
        JLabel[] labels = {lblDNI, lblNombres, lblApellidoPa, lblApellidoMa};

        for (JTextField field : textFields) {
            field.setBackground(secondaryColor);
            field.setFont(new Font("Arial", Font.PLAIN, 12));
            field.setBorder(BorderFactory.createCompoundBorder(
                    field.getBorder(),
                    BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        }

        for (JLabel label : labels) {
            label.setFont(labelFont);
            label.setForeground(primaryColor);
        }

        JButton[] buttons = {btnGuardar, btnBuscar, btnActualizar, btnEliminar, btnLimpiar};
        for (JButton btn : buttons) {
            btn.setBackground(accentColor);
            btn.setForeground(Color.WHITE);
            btn.setFocusPainted(false);
            btn.setFont(new Font("Arial", Font.BOLD, 12));
            btn.setBorder(BorderFactory.createEmptyBorder(8, 15, 8, 15));
        }

        // Mejorar la apariencia de la tabla
        tblPersonas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblPersonas.getTableHeader().setReorderingAllowed(false);
        tblPersonas.setRowHeight(25);
        tblPersonas.setGridColor(new Color(144, 238, 144));  // Verde claro
        tblPersonas.getTableHeader().setBackground(primaryColor);
        tblPersonas.getTableHeader().setForeground(Color.WHITE);
        tblPersonas.setSelectionBackground(accentColor);
        tblPersonas.setSelectionForeground(Color.WHITE);

        // Ajustar el fondo del panel principal si es posible
        if (this.getContentPane() instanceof JPanel) {
            ((JPanel) this.getContentPane()).setBackground(new Color(240, 255, 240));  // Honeydew
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCRUD = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApellidoPa = new javax.swing.JLabel();
        lblApellidoMa = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidoPa = new javax.swing.JTextField();
        txtApellidoMa = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        scrollPanePersonas = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();

        lblCRUD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCRUD.setForeground(new java.awt.Color(0, 153, 0));
        lblCRUD.setText("CRUD");

        lblDNI.setText("DNI :");

        lblNombres.setText("Nombres :");

        lblApellidoPa.setText("Apellido Paterno :");

        lblApellidoMa.setText("Apellido Materno :");

        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        txtApellidoPa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPaActionPerformed(evt);
            }
        });

        txtApellidoMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMaActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "Nombres", "Apellido Paterno", "Apellido Materno"
            }
        ));
        scrollPanePersonas.setViewportView(tblPersonas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(btnLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(lblCRUD))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDNI)
                                    .addComponent(lblNombres)
                                    .addComponent(lblApellidoPa)
                                    .addComponent(lblApellidoMa))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDNI)
                                        .addComponent(txtNombres)
                                        .addComponent(txtApellidoPa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtApellidoMa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(scrollPanePersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCRUD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNI)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoPa)
                    .addComponent(txtApellidoPa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoMa)
                    .addComponent(txtApellidoMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnBuscar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanePersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        Persona persona = new Persona();
        persona.setDni(txtDNI.getText());
        persona.setNombres(txtNombres.getText());
        persona.setApellidoPa(txtApellidoPa.getText());
        persona.setApellidoMa(txtApellidoMa.getText());

        try {
            personaDAO.crear(persona);
            JOptionPane.showMessageDialog(this, "Persona guardada exitosamente");
            limpiarCampos();
            cargarPersonas();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String dni = txtDNI.getText();
        try {
            Persona persona = personaDAO.leer(dni);
            if (persona != null) {
                txtNombres.setText(persona.getNombres());
                txtApellidoPa.setText(persona.getApellidoPa());
                txtApellidoMa.setText(persona.getApellidoMa());
            } else {
                JOptionPane.showMessageDialog(this, "Persona no encontrada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        Persona persona = new Persona();
        persona.setDni(txtDNI.getText());
        persona.setNombres(txtNombres.getText());
        persona.setApellidoPa(txtApellidoPa.getText());
        persona.setApellidoMa(txtApellidoMa.getText());

        try {
            personaDAO.actualizar(persona);
            JOptionPane.showMessageDialog(this, "Persona actualizada exitosamente");
            limpiarCampos();
            cargarPersonas();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String dni = txtDNI.getText();
        try {
            personaDAO.eliminar(dni);
            JOptionPane.showMessageDialog(this, "Persona eliminada exitosamente");
            limpiarCampos();
            cargarPersonas();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al eliminar: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtApellidoPaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoPaActionPerformed

    private void txtApellidoMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMaActionPerformed

    private void cargarPersonas() {
        try {
            List<Persona> personas = personaDAO.listarTodos();
            DefaultTableModel model = new DefaultTableModel(
                    new Object[][]{},
                    new String[]{"DNI", "Nombres", "Apellido Paterno", "Apellido Materno"}
            ) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Esto hace que la tabla no sea editable
                }
            };
            for (Persona p : personas) {
                model.addRow(new Object[]{p.getDni(), p.getNombres(), p.getApellidoPa(), p.getApellidoMa()});
            }
            tblPersonas.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar personas: " + ex.getMessage());
        }
    }

    private void limpiarCampos() {
        txtDNI.setText("");
        txtNombres.setText("");
        txtApellidoPa.setText("");
        txtApellidoMa.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel lblApellidoMa;
    private javax.swing.JLabel lblApellidoPa;
    private javax.swing.JLabel lblCRUD;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JScrollPane scrollPanePersonas;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTextField txtApellidoMa;
    private javax.swing.JTextField txtApellidoPa;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
