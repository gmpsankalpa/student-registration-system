
import java.awt.Color;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {
    private Component frame;
    int Xmouse;
    int Ymouse;

    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel1.setFocusable(true);

        jPanel1.setBackground(new Color(0,0,0,0));
        TextField1.setBackground(new Color(0,0,0,0));
        TextField2.setBackground(new Color(0,0,0,0));
        TextField3.setBackground(new Color(0,0,0,0));
        TextField4.setBackground(new Color(0,0,0,0));
        TextField5.setBackground(new Color(0,0,0,0));
        TextField6.setBackground(new Color(0,0,0,0));
        TextField7.setBackground(new Color(0,0,0,0));
        TextField8.setBackground(new Color(0,0,0,0));

    }

    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        resgister = new javax.swing.JLabel();
        taskbar = new javax.swing.JLabel();
        TextField1 = new javax.swing.JTextField();
        TextField2 = new javax.swing.JTextField();
        TextField3 = new javax.swing.JTextField();
        TextField4 = new javax.swing.JTextField();
        TextField5 = new javax.swing.JTextField();
        TextField6 = new javax.swing.JTextField();
        TextField7 = new javax.swing.JTextField();
        TextField8 = new javax.swing.JTextField();
        from = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ext.png"))); 
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(430, 10, 30, 30);

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/min.png"))); 
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize);
        minimize.setBounds(400, 10, 30, 30);

        resgister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resgister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resgisterMouseClicked(evt);
            }
        });
        jPanel1.add(resgister);
        resgister.setBounds(140, 460, 190, 50);

        taskbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                taskbarMousePressed(evt);
            }
        });
        taskbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                taskbarMouseDragged(evt);
            }
        });
        jPanel1.add(taskbar);
        taskbar.setBounds(0, 0, 470, 40);

        TextField1.setFont(new java.awt.Font("Calibri", 1, 20)); 
        TextField1.setForeground(new java.awt.Color(255, 255, 255));
        TextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField1.setText("Reg No");
        TextField1.setBorder(null);
        TextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField1FocusLost(evt);
            }
        });
        jPanel1.add(TextField1);
        TextField1.setBounds(320, 400, 100, 30);

        TextField2.setFont(new java.awt.Font("Calibri", 1, 20));
        TextField2.setForeground(new java.awt.Color(255, 255, 255));
        TextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField2.setText("Name");
        TextField2.setBorder(null);
        TextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField2FocusLost(evt);
            }
        });
        jPanel1.add(TextField2);
        TextField2.setBounds(90, 90, 330, 30);

        TextField3.setFont(new java.awt.Font("Calibri", 1, 20));
        TextField3.setForeground(new java.awt.Color(255, 255, 255));
        TextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField3.setText("Email");
        TextField3.setBorder(null);
        TextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField3FocusLost(evt);
            }
        });
        jPanel1.add(TextField3);
        TextField3.setBounds(90, 150, 330, 30);

        TextField4.setFont(new java.awt.Font("Calibri", 1, 20));
        TextField4.setForeground(new java.awt.Color(255, 255, 255));
        TextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField4.setText("Location");
        TextField4.setBorder(null);
        TextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField4FocusLost(evt);
            }
        });
        jPanel1.add(TextField4);
        TextField4.setBounds(90, 210, 330, 40);

        TextField5.setFont(new java.awt.Font("Calibri", 1, 20));
        TextField5.setForeground(new java.awt.Color(255, 255, 255));
        TextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField5.setText("Depertment");
        TextField5.setBorder(null);
        TextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField5FocusLost(evt);
            }
        });
        jPanel1.add(TextField5);
        TextField5.setBounds(90, 280, 330, 30);

        TextField6.setFont(new java.awt.Font("Calibri", 1, 20)); 
        TextField6.setForeground(new java.awt.Color(255, 255, 255));
        TextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField6.setText("Phone");
        TextField6.setBorder(null);
        TextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField6FocusLost(evt);
            }
        });
        jPanel1.add(TextField6);
        TextField6.setBounds(90, 340, 330, 30);

        TextField7.setFont(new java.awt.Font("Calibri", 1, 20));
        TextField7.setForeground(new java.awt.Color(255, 255, 255));
        TextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField7.setText("Batch No");
        TextField7.setBorder(null);
        TextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField7FocusLost(evt);
            }
        });
        jPanel1.add(TextField7);
        TextField7.setBounds(40, 400, 110, 30);

        TextField8.setFont(new java.awt.Font("Calibri", 1, 20));
        TextField8.setForeground(new java.awt.Color(255, 255, 255));
        TextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField8.setText("Roll");
        TextField8.setBorder(null);
        TextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextField8FocusLost(evt);
            }
        });
        jPanel1.add(TextField8);
        TextField8.setBounds(180, 400, 100, 30);

        from.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register form_1.png"))); 
        jPanel1.add(from);
        from.setBounds(0, 0, 470, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {
        if (JOptionPane.showConfirmDialog(frame, "Do you want to Close?", "Close Registation Form", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {    
        this.dispose();
        }
    }

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {
       this.setState(JFrame.ICONIFIED);
    }

    private void resgisterMouseClicked(java.awt.event.MouseEvent evt) {
        
           
        JOptionPane.showMessageDialog(null, "Congratulation! Registation Completed");
    TextField1.setText(null);
    TextField2.setText(null);
    TextField3.setText(null);
    TextField4.setText(null);
    TextField5.setText(null);
    TextField6.setText(null);
    TextField7.setText(null);
    TextField8.setText(null);   
        
    }

    private void taskbarMouseDragged(java.awt.event.MouseEvent evt) {
      int x = evt.getXOnScreen();
        int y = evt.getXOnScreen();
        this.setLocation(x - Xmouse, y -Ymouse);
    }

    private void taskbarMousePressed(java.awt.event.MouseEvent evt) {
        Xmouse = evt.getX();
        Ymouse = evt.getY();
    }

    private void TextField2FocusGained(java.awt.event.FocusEvent evt) {
         if(TextField2.getText().equals("Name")){
            TextField2.setText("");
            TextField2.setForeground(Color.WHITE);
        }
    }

    private void TextField2FocusLost(java.awt.event.FocusEvent evt) {
         if(TextField2.getText().equals("")){
            TextField2.setText("Name");
            TextField2.setForeground(new Color(255,255,255));
        }
    }

    private void TextField3FocusGained(java.awt.event.FocusEvent evt) {
       if(TextField3.getText().equals("Email")){
            TextField3.setText("");
            TextField3.setForeground(Color.WHITE);
        }
    }

    private void TextField3FocusLost(java.awt.event.FocusEvent evt) {
          if(TextField3.getText().equals("")){
            TextField3.setText("Email");
            TextField3.setForeground(new Color(255,255,255));
        }
    
    }

    private void TextField4FocusGained(java.awt.event.FocusEvent evt) {
       if(TextField4.getText().equals("Location")){
           TextField4.setText("");
           TextField4.setForeground(Color.WHITE);
        }
    }

    private void TextField4FocusLost(java.awt.event.FocusEvent evt) {
          if(TextField4.getText().equals("")){
            TextField4.setText("Location");
            TextField4.setForeground(new Color(255,255,255));
        }
    }

    private void TextField6FocusGained(java.awt.event.FocusEvent evt) {
        if(TextField6.getText().equals("Phone")){
            TextField6.setText("");
            TextField6.setForeground(Color.WHITE);
        }
    }

    private void TextField6FocusLost(java.awt.event.FocusEvent evt) {
         if(TextField6.getText().equals("")){
            TextField6.setText("Phone");
            TextField6.setForeground(new Color(255,255,255));
        }
    }

    private void TextField7FocusGained(java.awt.event.FocusEvent evt) {
        if(TextField7.getText().equals("Batch No")){
            TextField7.setText("");
            TextField7.setForeground(Color.WHITE);
        }
    }

    private void TextField7FocusLost(java.awt.event.FocusEvent evt) {
        if(TextField7.getText().equals("")){
           TextField7.setText("Batch No");
           TextField7.setForeground(new Color(255,255,255));
        }
    }

    private void TextField8FocusGained(java.awt.event.FocusEvent evt) {
         if(TextField8.getText().equals("Roll")){
            TextField8.setText("");
            TextField8.setForeground(Color.WHITE);
        }
    }

    private void TextField8FocusLost(java.awt.event.FocusEvent evt) {
       if(TextField8.getText().equals("")){
          TextField8.setText("Roll");
          TextField8.setForeground(new Color(255,255,255));
        }
    }

    private void TextField1FocusGained(java.awt.event.FocusEvent evt) {
        if(TextField1.getText().equals("Reg No")){
            TextField1.setText("");
            TextField1.setForeground(Color.WHITE);
        }
    }

    private void TextField1FocusLost(java.awt.event.FocusEvent evt) {
       if(TextField1.getText().equals("")){
          TextField1.setText("Reg No");
          TextField1.setForeground(new Color(255,255,255));
        }
    }

    private void TextField5FocusGained(java.awt.event.FocusEvent evt) {
       if(TextField5.getText().equals("Depertment")){
            TextField5.setText("");
            TextField5.setForeground(Color.WHITE);
        }
    }

    private void TextField5FocusLost(java.awt.event.FocusEvent evt) {
        if(TextField5.getText().equals("")){
          TextField5.setText("Depertment");
          TextField5.setForeground(new Color(255,255,255));
        }
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    private javax.swing.JTextField TextField1;
    private javax.swing.JTextField TextField2;
    private javax.swing.JTextField TextField3;
    private javax.swing.JTextField TextField4;
    private javax.swing.JTextField TextField5;
    private javax.swing.JTextField TextField6;
    private javax.swing.JTextField TextField7;
    private javax.swing.JTextField TextField8;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel from;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel resgister;
    private javax.swing.JLabel taskbar;
}
