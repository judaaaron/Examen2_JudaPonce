
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class loginATM extends javax.swing.JFrame {

    /**
     * Creates new form loginATM
     */
    public loginATM() {
        initComponents();
        setResizable(false);
        setTitle("ATM");
        this.setLocationRelativeTo(null);
        HiloHora h = new HiloHora(jl_hora);
        Thread proceso1 = new Thread(h);
        proceso1.start();

        b.cargarBinario();
        for (Usuarios usi : b.getUsuario()) {
            usuarios.add(usi);
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

        jd_opciones = new javax.swing.JDialog();
        bt_crearUsuario = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fondi = new javax.swing.JLabel();
        jd_usuarios = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_segundoNombre = new javax.swing.JTextField();
        tf_primerApellido = new javax.swing.JTextField();
        tf_segundoApellido = new javax.swing.JTextField();
        tf_contraseña = new javax.swing.JTextField();
        tf_añoNacimiento = new javax.swing.JTextField();
        tf_afiliacion = new javax.swing.JTextField();
        tf_primerNombre = new javax.swing.JTextField();
        cb_usuarios = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tf_id = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        fond = new javax.swing.JLabel();
        jl_hora = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bt_Ingresar = new javax.swing.JButton();
        bt_exit = new javax.swing.JButton();
        tf_user = new javax.swing.JTextField();
        tf_password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        jd_opciones.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_crearUsuario.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        bt_crearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atm_1.png"))); // NOI18N
        bt_crearUsuario.setText("Usuarios");
        bt_crearUsuario.setContentAreaFilled(false);
        bt_crearUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bt_crearUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bt_crearUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atm (1)_1.png"))); // NOI18N
        bt_crearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearUsuarioMouseClicked(evt);
            }
        });
        jd_opciones.getContentPane().add(bt_crearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 130));

        jButton2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atm (2)_1.png"))); // NOI18N
        jButton2.setText("ATM");
        jButton2.setContentAreaFilled(false);
        jButton2.setHideActionText(true);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atm (3)_1.png"))); // NOI18N
        jd_opciones.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 130, 100));

        jButton1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/return (4).png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/return (5).png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jd_opciones.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 150, 100));

        fondi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fila.jpg"))); // NOI18N
        jd_opciones.getContentPane().add(fondi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 340));

        jd_usuarios.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setText("Registrate con tus datos correctos");
        jd_usuarios.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setText("ID Usuario");
        jd_usuarios.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setText("Segundo Nombre");
        jd_usuarios.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel7.setText("Primer Apellido");
        jd_usuarios.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel8.setText("Segundo Apellido");
        jd_usuarios.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel9.setText("Contraseña");
        jd_usuarios.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, 20));

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel10.setText("Año de nacimiento");
        jd_usuarios.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, -1));

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel11.setText("Año de afiliación");
        jd_usuarios.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, -1, -1));
        jd_usuarios.getContentPane().add(tf_segundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 150, -1));
        jd_usuarios.getContentPane().add(tf_primerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 150, -1));
        jd_usuarios.getContentPane().add(tf_segundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 150, -1));
        jd_usuarios.getContentPane().add(tf_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 150, -1));
        jd_usuarios.getContentPane().add(tf_añoNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 150, -1));
        jd_usuarios.getContentPane().add(tf_afiliacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 160, -1));
        jd_usuarios.getContentPane().add(tf_primerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 150, -1));

        cb_usuarios.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        cb_usuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*Usuarios*", "Cliente", "Mantenimiento" }));
        jd_usuarios.getContentPane().add(cb_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 670, 110, 30));

        jButton3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atm (2).png"))); // NOI18N
        jButton3.setText("Registrar Usuario");
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atm (3).png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jd_usuarios.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 710, 200, 100));

        jButton4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/return (4).png"))); // NOI18N
        jButton4.setText("Regresar");
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/return (5).png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jd_usuarios.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 710, 140, 100));
        jd_usuarios.getContentPane().add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 150, -1));

        jLabel12.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel12.setText("Primer Nombre");
        jd_usuarios.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/manATM.jpg"))); // NOI18N
        jd_usuarios.getContentPane().add(fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 0, 690, 820));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_hora.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jl_hora.setText("00:00:00");
        getContentPane().add(jl_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 650, 180, 30));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 70, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 110, -1));

        bt_Ingresar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        bt_Ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atm (2).png"))); // NOI18N
        bt_Ingresar.setText("Ingresar");
        bt_Ingresar.setContentAreaFilled(false);
        bt_Ingresar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bt_Ingresar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bt_Ingresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atm (3).png"))); // NOI18N
        getContentPane().add(bt_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 160, 90));

        bt_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit (2).png"))); // NOI18N
        bt_exit.setContentAreaFilled(false);
        bt_exit.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bt_exit.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bt_exit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit (3).png"))); // NOI18N
        bt_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_exitMouseClicked(evt);
            }
        });
        getContentPane().add(bt_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 110, 90));

        tf_user.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        tf_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(tf_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 150, 30));

        tf_password.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        tf_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 150, 30));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear cuenta");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 120, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cajero.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_exitMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        jd_opciones.pack();
        jd_opciones.setModal(true);
        jd_opciones.setLocationRelativeTo(this);
        jd_opciones.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jd_opciones.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        jd_usuarios.dispose();
        jd_opciones.pack();
        jd_opciones.setModal(true);
        jd_opciones.setLocationRelativeTo(this);
        jd_opciones.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void bt_crearUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearUsuarioMouseClicked
        jd_opciones.dispose();
        jd_usuarios.pack();
        jd_usuarios.setModal(true);
        jd_usuarios.setLocationRelativeTo(this);
        jd_usuarios.setVisible(true);
    }//GEN-LAST:event_bt_crearUsuarioMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        int id2;
        String nombre1, nombre2, apellido1, apellido2, contraseña;
        int cuenta, saldo, id;

    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(loginATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginATM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Ingresar;
    private javax.swing.JButton bt_crearUsuario;
    private javax.swing.JButton bt_exit;
    private javax.swing.JComboBox<String> cb_usuarios;
    private javax.swing.JLabel fond;
    private javax.swing.JLabel fondi;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JDialog jd_opciones;
    private javax.swing.JDialog jd_usuarios;
    private javax.swing.JLabel jl_hora;
    private javax.swing.JTextField tf_afiliacion;
    private javax.swing.JTextField tf_añoNacimiento;
    private javax.swing.JTextField tf_contraseña;
    private javax.swing.JTextField tf_id;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_primerApellido;
    private javax.swing.JTextField tf_primerNombre;
    private javax.swing.JTextField tf_segundoApellido;
    private javax.swing.JTextField tf_segundoNombre;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
ArrayList<Usuarios> usuarios = new ArrayList();

    Binarios b = new Binarios(usuarios);

}
