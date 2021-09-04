/**
 * El propósito de la clase, es servir de vista para el login de NetU Cliente
 */
package vista;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginGUI extends javax.swing.JFrame implements Runnable {
    
    private ActionListener actionEscucha;
    private KeyListener keyEscucha;
      
    public LoginGUI(ActionListener al, KeyListener kl) {
        
        actionEscucha = al;
        keyEscucha = kl;
    }
    
    public void cerrar(){
        this.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new RoundJTextField(100);
        lblPass = new javax.swing.JLabel();
        txtPass = new RoundJPasswordtField(15);
        btnMostrarPassword = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Iniciar sesión");
        setBounds(new java.awt.Rectangle(3, 3, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/netU_icon.png")));

        panelLogin.setBackground(new java.awt.Color(240, 242, 245));
        panelLogin.setForeground(new java.awt.Color(250, 250, 250));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotipo_netU.png"))); // NOI18N

        btnLogin.setBackground(new java.awt.Color(242, 242, 247));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login_icon.png"))); // NOI18N
        btnLogin.setToolTipText("Inicia sesión");
        btnLogin.setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(217, 217, 232));

        lblCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/code_icon.png"))); // NOI18N
        lblCodigo.setLabelFor(txtCodigo);

        txtCodigo.setBackground(new java.awt.Color(242, 242, 247));
        txtCodigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCodigo.setText("Código");
        txtCodigo.setToolTipText("Escribe tu código de empleado");
        txtCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCodigo.setName("txtCodigo"); // NOI18N
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });

        lblPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/password_icon.png"))); // NOI18N
        lblPass.setLabelFor(txtPass);

        txtPass.setBackground(new java.awt.Color(242, 242, 247));
        txtPass.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPass.setText("Contraseña ");
        txtPass.setToolTipText("Escribe tu contraseña");
        txtPass.setEchoChar((char) 0);
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });

        btnMostrarPassword.setBackground(new java.awt.Color(242, 242, 247));
        btnMostrarPassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMostrarPassword.setForeground(new java.awt.Color(235, 30, 0));
        btnMostrarPassword.setText("Mostrar");
        btnMostrarPassword.setToolTipText("Ver contraseña");
        btnMostrarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblCodigo)
                        .addGap(12, 12, 12)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblPass)
                        .addGap(12, 12, 12)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPass)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMostrarPassword)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(242, 242, 247));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 30, 0));
        jLabel1.setText("Entrar");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lblLogo))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnLogin)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblLogo)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * El propósito del método asignar un placeholder al textField del código
     * cuando se pierda el foco
     *
     * @param evt El evento
     */
    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost

        if (txtCodigo.getText().trim().equals("")) {
            txtCodigo.setText("Código");
        }
    }//GEN-LAST:event_txtCodigoFocusLost
    /**
     * El propósito del método quitar el placeholder del textField cuando se
     * gane el foco
     *
     * @param evt El evento
     */
    private void txtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusGained

        if (txtCodigo.getText().equals("Código")) {
            txtCodigo.setText("");
        }

    }//GEN-LAST:event_txtCodigoFocusGained
    /**
     * El propósito del método quitar el placeholder del passwordField cuando se
     * gane el foco
     *
     * @param evt El evento
     */
    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained

        String password = String.valueOf(txtPass.getPassword());

        if (password.equals("Contraseña ")) {
            txtPass.setText("");
        }

        txtPass.setEchoChar('*');
    }//GEN-LAST:event_txtPassFocusGained
    /**
     * El propósito del método asignar un placeholder al textField de la
     * contraseña cuando se pierda el foco
     *
     * @param evt El evento
     */
    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        String password = String.valueOf(txtPass.getPassword());

        if (password.equals("Contraseña ") || password.toLowerCase().equals("")) {
            txtPass.setText("Contraseña ");
            txtPass.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_txtPassFocusLost
    /**
     * El propósito del método es asignar el evento de mostrar la contraseña
     * cuando se de click en el botón 'Mostrar'
     *
     * @param evt El evento
     */
    private void btnMostrarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPasswordActionPerformed
        String password = String.valueOf(txtPass.getPassword());
        if (!password.equals("Contraseña ")) {
            if (btnMostrarPassword.getText().equals("Mostrar")) {
                btnMostrarPassword.setText("Ocultar");
                txtPass.setEchoChar((char) 0);
            } else {
                btnMostrarPassword.setText("Mostrar");
                txtPass.setEchoChar('*');
            }
        } else {
            Toolkit.getDefaultToolkit().beep();
        }

    }//GEN-LAST:event_btnMostrarPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnMostrarPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPass;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables

    /**
     * El propósito del método es obtener el código digitado
     *
     * @return Devuelve el código escrito si es uno aceptable, -1 si no lo es y
     * 0 si no ha escrito nada (si está el placeholder)
     */
    public int getCodigo() {

        int codigo;

        if (!txtCodigo.getText().equals("Código")) {
            try {

                codigo = Integer.parseInt(txtCodigo.getText().trim());

            } catch (NumberFormatException ne) {

                codigo = -1;

            }
        } else {
            codigo = 0;
        }

        return codigo;
    }

    /**
     * El propósito del método es devolver la contraseña escrita
     *
     * @return Deuvelve la contraseña digitada, sino hay alguna devuelve un
     * String vacío
     */
    public String getPassword() {
        String passwordField = String.valueOf(txtPass.getPassword());
        String password = "";
        if (!passwordField.equals("Contraseña ")) {

            password = passwordField;
        }
        return password;
    }

    /**
     * El propósito del método es asiganr una escucha al botón del login
     *
     * @param al Quien escucha
     */
    public void addActionListener(ActionListener al) {

        btnLogin.addActionListener(al);

    }

    /**
     * El propósito del método es asignar escuchas de teclado para evitar que el
     * Empleado ingrese datos erróneos en los textFields del Form
     *
     * @param kl Quiene escucha
     */
    public void addKeyListener(KeyListener kl) {
        txtPass.addKeyListener(kl);
        txtCodigo.addKeyListener(kl);
    }

    /**
     * El propósito del método es devolver el botón del login para comparar
     * cuando se de un evento
     *
     * @return El botón de login
     */
    public JButton getBtnLogin() {
        return btnLogin;
    }

    /**
     * El propósito del método es devolver textField del código para comparar
     * cuando se de un evento Ktyped
     *
     * @return El textField de códgio
     */
    public JTextField getTxtCodigo() {
        return txtCodigo;
    }

    /**
     * El propósito del método es devolver el passwordField del login para
     * comparar cuando se de un evento
     *
     * @return El passwordField del login
     */
    public JPasswordField getTxtPass() {
        return txtPass;
    }

    public void desplegarMensaje(int tipo, String titulo, String mensaje) {

        Toolkit.getDefaultToolkit().beep();

        JOptionPane.showMessageDialog(null, mensaje, titulo,
                JOptionPane.PLAIN_MESSAGE, obtenerIcono("/imagenes/error_icon.png"));

    }

    /**
     * El propósito del método es obtener un icono relacionado con la URl para
     * desplegar JOptionPane personalizados
     *
     * @return El icono relacionado con la url
     */
    public Icon obtenerIcono(String url) {

        Icon icono;
        icono = new ImageIcon(new ImageIcon(getClass().getResource(""
                + url)).getImage());

        return icono;
    }

    @Override
    public void run() {
        initComponents();
        addActionListener(actionEscucha);
        addKeyListener(keyEscucha);
        lblLogo.requestFocus();
        setVisible(true);
        setResizable(false);
    }

}
