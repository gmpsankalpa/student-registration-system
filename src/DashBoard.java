
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class DashBoard extends javax.swing.JFrame {
    private Component frame;

   
    public DashBoard() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        register = new javax.swing.JLabel();
        options = new javax.swing.JLabel();
        dashboard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(770, 460, 30, 30);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoutD.png"))); 
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(10, 460, 110, 30);

        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        jPanel1.add(register);
        register.setBounds(440, 230, 180, 50);

        options.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/options.png"))); 
        jPanel1.add(options);
        options.setBounds(90, 70, 600, 380);

        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dashboard_1.jpg"))); 
        jPanel1.add(dashboard);
        dashboard.setBounds(0, 0, 811, 499);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        pack();
    }

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {
       if (JOptionPane.showConfirmDialog(frame, "Do you want to Close?", "Close Registation Form", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {    
        System.exit(0);
        }
    }

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to Logout !", "Logout", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            login log = new login();
            this.dispose();
            log.show();
        }
    }

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {
        
        Register reg = new Register();
            
            reg.show();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }
    
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel options;
    private javax.swing.JLabel register;
  
}
