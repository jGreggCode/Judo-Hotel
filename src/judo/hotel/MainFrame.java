package judo.hotel;

// Imports
import com.formdev.flatlaf.FlatLightLaf; // This import is for the design 
// FlatLaf is a modern open-source cross-platform Look and Feel for Java Swing desktop applications

import javax.swing.*;

/**
 *
 * @author Jude Abrea
 */

// Delete this line of comment after reading. Just mind the MainFrame.java and Reservation.java. Don't mind the other file or classes it's like a css just a design for components

public class MainFrame extends javax.swing.JFrame {
    
    // Button Group makes sure that only one option is chosen from a group of options (3hour, 6hours...)
    ButtonGroup buttonGroup = new ButtonGroup(); // Button Group Class Initialization: Class initialization in Java refers to the process of preparing a class for use
    
    public MainFrame() {
        initComponents();
        
        // Setting the panel's round borders (Design)
        roundPanel.setRoundBorders(10, 10, 10, 10);
        roundPanel2.setRoundBorders(30, 30, 30, 30);
        
        // Don't mind this, just to know how to center a component using a null layout
        int frameWidth = this.getWidth();
        int frameHeight = this.getHeight();

        int componentWidth = labelTitle.getWidth();
        int componentHeight = labelTitle.getHeight();

        int centerX = (frameWidth - componentWidth) / 2;
        int centerY = (frameHeight - componentHeight) / 2;
        System.out.println("Center Pixel: (" + centerX + ", " + centerY + ")");
        // ---------------------------
        
        // Setting the placeholder for each textfields
        txtFirstName.setHint("First Name");
        txtLastName.setHint("Last Name");
        txtEmail.setHint("Email");
        txtNumber.setHint("Contact Number");
        txtAddress.setHint("Address");
        txtCity.setHint("City");
        txtZipCode.setHint("Zip Code");
        txtDate.setHint("Date");
        txtPeople.setHint("Number of people ");
        
        // Grouping the related radio buttons, adding it to the buttonGroup class initialized in line 16
        buttonGroup.add(rb3);
        buttonGroup.add(rb6);
        buttonGroup.add(rb12);
        buttonGroup.add(rb24);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelClose = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        labelReservation = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        roundPanel2 = new judo.hotel.RoundPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        roundPanel = new judo.hotel.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumber = new judo.hotel.ModifiedTextField();
        txtLastName = new judo.hotel.ModifiedTextField();
        txtFirstName = new judo.hotel.ModifiedTextField();
        txtAddress = new judo.hotel.ModifiedTextField();
        txtZipCode = new judo.hotel.ModifiedTextField();
        txtPeople = new judo.hotel.ModifiedTextField();
        txtCity = new judo.hotel.ModifiedTextField();
        cbRoom = new judo.hotel.ComboBoxSuggestion();
        btnSend = new judo.hotel.ModifiedButton();
        txtEmail = new judo.hotel.ModifiedTextField();
        txtDate = new judo.hotel.ModifiedTextField();
        checkAgree = new javax.swing.JCheckBox();
        rb24 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        rb3 = new javax.swing.JRadioButton();
        rb6 = new javax.swing.JRadioButton();
        rb12 = new javax.swing.JRadioButton();
        labelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1220, 740));
        setMinimumSize(new java.awt.Dimension(1220, 740));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        labelClose.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        labelClose.setForeground(new java.awt.Color(255, 255, 255));
        labelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelClose.setText("X");
        labelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit(evt);
            }
        });
        getContentPane().add(labelClose);
        labelClose.setBounds(10, 12, 24, 30);

        labelTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitle.setText("JUDO HOTEL");
        getContentPane().add(labelTitle);
        labelTitle.setBounds(535, 30, 150, 40);

        labelReservation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelReservation.setText("R E S E R V A T I O N  F O R M");
        getContentPane().add(labelReservation);
        labelReservation.setBounds(515, 70, 200, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Reservations");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 140, 120, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("<html>Your luxurious escape awaits in our <b>Deluxe Hotel Room</b>. Elegance, comfort, and sophistication converge to create a haven that surpasses expectations, providing an unforgettable retreat for the discerning traveler.</html>");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 290, 330, 100);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("<html>Step into tranquility and simplicity with our thoughtfully designed <b>Standard Room</b>. This inviting space is meticulously crafted to provide a cozy and relaxing retreat, offering a perfect blend of comfort and convenience.</html>");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 180, 330, 100);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pic1.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 460, 280, 180);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("FEATURED ROOM!");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 430, 130, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel10.setText("<html>Check our <font color='blue'>website</font> to view rooms images and details.</html>");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 650, 290, 16);

        roundPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Executive Room");
        roundPanel2.add(jLabel5);
        jLabel5.setBounds(20, 10, 120, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel7.setText("<html>Where luxury meets an awe-inspiring cityscape. As you step into this sophisticated haven, you are greeted by a tastefully designed and modern comfort.</html>");
        roundPanel2.add(jLabel7);
        jLabel7.setBounds(20, 40, 150, 110);

        getContentPane().add(roundPanel2);
        roundPanel2.setBounds(340, 460, 190, 180);

        roundPanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CONTACT INFORMATION");
        roundPanel.add(jLabel1);
        jLabel1.setBounds(130, 20, 220, 25);
        roundPanel.add(txtNumber);
        txtNumber.setBounds(240, 130, 210, 30);
        roundPanel.add(txtLastName);
        txtLastName.setBounds(210, 80, 240, 30);
        roundPanel.add(txtFirstName);
        txtFirstName.setBounds(20, 80, 180, 30);
        roundPanel.add(txtAddress);
        txtAddress.setBounds(20, 180, 430, 30);
        roundPanel.add(txtZipCode);
        txtZipCode.setBounds(290, 230, 160, 30);
        roundPanel.add(txtPeople);
        txtPeople.setBounds(20, 380, 250, 30);
        roundPanel.add(txtCity);
        txtCity.setBounds(20, 230, 260, 30);

        cbRoom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Standard Room", "Deluxe Room", "Executive Room" }));
        roundPanel.add(cbRoom);
        cbRoom.setBounds(20, 280, 430, 28);

        btnSend.setBackground(new java.awt.Color(0, 51, 255));
        btnSend.setText("<html><b>SEND</b><html>");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send(evt);
            }
        });
        roundPanel.add(btnSend);
        btnSend.setBounds(20, 490, 170, 26);
        roundPanel.add(txtEmail);
        txtEmail.setBounds(20, 130, 210, 30);
        roundPanel.add(txtDate);
        txtDate.setBounds(20, 330, 250, 30);

        checkAgree.setText("<html>I agree and consent to the use of my submitted information in accordance with the <b>Data Privacy Policy and Cookies Policy</b> of Judo Hotel.</html>");
        roundPanel.add(checkAgree);
        checkAgree.setBounds(20, 430, 430, 40);

        rb24.setText("24 Hours");
        rb24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb24ActionPerformed(evt);
            }
        });
        roundPanel.add(rb24);
        rb24.setBounds(380, 390, 70, 21);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Choose desire stay duration");
        roundPanel.add(jLabel8);
        jLabel8.setBounds(290, 330, 152, 16);

        rb3.setText("3 Hours");
        roundPanel.add(rb3);
        rb3.setBounds(290, 360, 70, 21);

        rb6.setText("6 Hours");
        roundPanel.add(rb6);
        rb6.setBounds(290, 390, 64, 21);

        rb12.setText("12 Hours");
        roundPanel.add(rb12);
        rb12.setBounds(380, 360, 70, 21);

        getContentPane().add(roundPanel);
        roundPanel.setBounds(670, 140, 470, 540);

        labelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Header.jpg"))); // NOI18N
        getContentPane().add(labelBackground);
        labelBackground.setBounds(0, 0, 1220, 740);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit
        // TODO add your handling code here:
        // This code means the application will close or dismiss
        System.exit(0);
    }//GEN-LAST:event_exit

    private void rb24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb24ActionPerformed

    
    private void send(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send
        // TODO add your handling code here:
        String hour;
        
        // If-else statement to get the value of selected radio button or if there is no selected
        if (rb3.isSelected()) {
            hour = "3 hours";
        } else if (rb6.isSelected()) {
            hour = "6 hours";
        } else if (rb12.isSelected()) {
            hour = "6 hours";
        } else if (rb24.isSelected()) {
            hour = "24 hours";
        } else {
            // If none is selected Hour variable will be set to "" or empty string
            hour = "";
        }
        
        // Agreement check box must be checked
        if (checkAgree.isSelected()) {
        
            // Getting the values of the textfields and combo box
            String fullname = txtFirstName.getText() + " " + txtLastName.getText();
            String email = txtEmail.getText();
            String number = txtNumber.getText();
            String address = txtAddress.getText();
            String city = txtCity.getText();
            String room = (String) cbRoom.getSelectedItem();
            String date = txtDate.getText();
            int people = 0;
            
            // Try catch statement, to catch exeptions to avoid runtime error
            try {
                people = Integer.parseInt(txtPeople.getText());
            } catch (Exception e) {
                // Error message if number of people is not a number
                JOptionPane.showMessageDialog(null, "Error: Number of people must be a number! (Ex: 2)", "Error", JOptionPane.ERROR_MESSAGE);
            }
           
            try {
                Reservation reserve = new Reservation(fullname, email, number, address, city, room, date, hour, people);
                reserve.sendReservation();
                clearAll();
            } catch (IllegalArgumentException e) {

                // Error message if there's an illegal argument like empty fields or invalid email
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } else {
            // Error message if Agreement is unchecked
            JOptionPane.showMessageDialog(null, "Error: Please indicate that you agree to the Data privacy and Cookies policy.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_send

    // Clearing method
    // NOTE! "Methods" promotes code reusability and helps avoid duplicating code. Yet this method was used one time only lol
    public void clearAll() {
        // Clear the text in textfields
        ModifiedTextField textFields[] = {txtFirstName, txtLastName, txtEmail, txtNumber, txtAddress, txtCity, txtDate, txtPeople, txtZipCode};
        
        for (ModifiedTextField text: textFields) {
            text.setText("");
        }
        
        // Set the selected index of combo box to the first index
        cbRoom.setSelectedIndex(0);
        // Clear the sellection in button group
        buttonGroup.clearSelection();
        
    }
    /**
     * @param args the command line arguments
     */
    
    // Main method
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        // Set the Flatlaf light theme
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private judo.hotel.ModifiedButton btnSend;
    private judo.hotel.ComboBoxSuggestion cbRoom;
    private javax.swing.JCheckBox checkAgree;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelBackground;
    private javax.swing.JLabel labelClose;
    private javax.swing.JLabel labelReservation;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JRadioButton rb12;
    private javax.swing.JRadioButton rb24;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb6;
    private judo.hotel.RoundPanel roundPanel;
    private judo.hotel.RoundPanel roundPanel2;
    private judo.hotel.ModifiedTextField txtAddress;
    private judo.hotel.ModifiedTextField txtCity;
    private judo.hotel.ModifiedTextField txtDate;
    private judo.hotel.ModifiedTextField txtEmail;
    private judo.hotel.ModifiedTextField txtFirstName;
    private judo.hotel.ModifiedTextField txtLastName;
    private judo.hotel.ModifiedTextField txtNumber;
    private judo.hotel.ModifiedTextField txtPeople;
    private judo.hotel.ModifiedTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
