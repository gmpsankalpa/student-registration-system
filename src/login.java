
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userid = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        loinbuttton = new javax.swing.JLabel();
        developer = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        userid.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20));
        userid.setBorder(null);
        userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridActionPerformed(evt);
            }
        });
        jPanel1.add(userid);
        userid.setBounds(580, 190, 250, 30);

        password.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); 
        password.setBorder(null);
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(580, 304, 250, 30);

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpg")));
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(840, 0, 30, 40);

        minimize.setBackground(new java.awt.Color(255, 255, 255));
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/-.jpg"))); 
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize);
        minimize.setBounds(800, 0, 30, 40);

        loinbuttton.setBackground(new java.awt.Color(255, 255, 255));
        loinbuttton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login button 2.png"))); 
        loinbuttton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loinbuttton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loinbutttonMouseClicked(evt);
            }
        });
        loinbuttton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loinbutttonKeyPressed(evt);
            }
        });
        jPanel1.add(loinbuttton);
        loinbuttton.setBounds(620, 370, 160, 40);

        developer.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.add(developer);
        developer.setBounds(10, 460, 180, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log_img.jpg"))); 
        jPanel1.add(background);
        background.setBounds(0, 0, 880, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void useridActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {
        this.setState(JFrame.ICONIFIED);
    }

    private void loinbutttonMouseClicked(java.awt.event.MouseEvent evt) {
               

        String usi = userid.getText();
        String pas = password.getText();
        if (usi.equals("admin") && pas.equals("1234")) {
            

            new DashBoard().setVisible(true);
            this.dispose();
            userid.setText(null);
            password.setText(null);          
           
        } else {
            JOptionPane.showMessageDialog(null, "Login ID or Password incorret");
            userid.setText(null);
            password.setText(null);

        }
    }

    private void loinbutttonKeyPressed(java.awt.event.KeyEvent evt) {

    }

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {
         String usi = userid.getText();
        String pas = password.getText();
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            
         if (usi.equals("admin") && pas.equals("1234")) {            
            new DashBoard().setVisible(true);
            this.dispose();
            userid.setText(null);
            password.setText(null);          
           
        } else {
            JOptionPane.showMessageDialog(null, "Login ID or Password incorret");
            userid.setText(null);
            password.setText(null);

             }
        }
    }

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new login().setVisible(true);
            }
        });
    }
  
    private javax.swing.JLabel background;
    private javax.swing.JLabel developer;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loinbuttton;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField userid;
   
}
