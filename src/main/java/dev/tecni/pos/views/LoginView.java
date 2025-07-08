package dev.tecni.pos.views;

/**
 * Login View
 * @author TecniDEV
 */
public class LoginView extends javax.swing.JFrame
{
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginView.class.getName());

    /**
     * Creates new form LoginView
     */
    public LoginView()
    {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mnuLogin = new javax.swing.JMenuBar();
        space = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso a TD POS");
        setResizable(false);

        space.setText(" ");
        space.setEnabled(false);
        mnuLogin.add(space);

        setJMenuBar(mnuLogin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar mnuLogin;
    private javax.swing.JMenu space;
    // End of variables declaration//GEN-END:variables
}
