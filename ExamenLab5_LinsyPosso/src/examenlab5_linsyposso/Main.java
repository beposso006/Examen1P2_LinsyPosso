/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examenlab5_linsyposso;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 29164
 */
public class Main extends javax.swing.JFrame {
//Fila 3 Asiento 1
    ArrayList <Usuarios> usuario = new ArrayList();
    /**
     * Creates new form Main
     */
    public Main() {
        usuario.add(new Civiles("Juan", "Perez", "1234A",new Date(20/02/2006),"Masculino","Cortes"));
        usuario.add(new Civiles("Camila", "Rosales", "5678P",new Date(18/10/1978),"Femenino","Francisco Morazan"));
        usuario.add(new Civiles("Ana", "Fernandez", "9876M",new Date(31/12/1840),"Femenino","Comayagua"));
        usuario.add(new Empleados("Mercadotecnia", "Recursos Humanos", 10,"Camila", "Rosales", "5678P",new Date(18/10/1978),"Femenino","Francisco Morazan"));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Panel_login = new javax.swing.JPanel();
        titulo_lg = new javax.swing.JLabel();
        NC_login = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        contra_lg = new javax.swing.JLabel();
        PF_login = new javax.swing.JPasswordField();
        ingresar_login = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_login.setBackground(new java.awt.Color(204, 204, 204));

        titulo_lg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulo_lg.setForeground(new java.awt.Color(0, 0, 0));
        titulo_lg.setText("LOGIN");

        NC_login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NC_login.setForeground(new java.awt.Color(0, 0, 0));
        NC_login.setText("Nombre Completo");

        contra_lg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contra_lg.setForeground(new java.awt.Color(0, 0, 0));
        contra_lg.setText("Contraseña");

        ingresar_login.setBackground(new java.awt.Color(153, 153, 153));
        ingresar_login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ingresar_login.setForeground(new java.awt.Color(0, 0, 0));
        ingresar_login.setText("Ingresar");
        ingresar_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresar_loginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_loginLayout = new javax.swing.GroupLayout(Panel_login);
        Panel_login.setLayout(Panel_loginLayout);
        Panel_loginLayout.setHorizontalGroup(
            Panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_loginLayout.createSequentialGroup()
                .addGroup(Panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_loginLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(titulo_lg))
                    .addGroup(Panel_loginLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(Panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NC_login, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nombre)
                            .addComponent(contra_lg, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PF_login, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))
                    .addGroup(Panel_loginLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(ingresar_login, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        Panel_loginLayout.setVerticalGroup(
            Panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_loginLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(titulo_lg)
                .addGap(28, 28, 28)
                .addComponent(NC_login, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(contra_lg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PF_login, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(ingresar_login)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        Background.add(Panel_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresar_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresar_loginMouseClicked
         
    }//GEN-LAST:event_ingresar_loginMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel NC_login;
    private javax.swing.JPasswordField PF_login;
    private javax.swing.JPanel Panel_login;
    private javax.swing.JLabel contra_lg;
    private javax.swing.JToggleButton ingresar_login;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JLabel titulo_lg;
    // End of variables declaration//GEN-END:variables
}
