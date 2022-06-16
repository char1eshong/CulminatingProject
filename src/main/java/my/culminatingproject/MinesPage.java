/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.culminatingproject;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class MinesPage extends javax.swing.JFrame {

    //Private variables for game
    //Creates 2d array of mines
    private static int[][] tileArray = new int [3][4];
    //Multiplier
    private double multi = 1.00;
    //Button clicked variables
    boolean A1bool = false;
    boolean A2bool = false;
    boolean A3bool = false;
    boolean A4bool = false;
    boolean B1bool = false;
    boolean B2bool = false;
    boolean B3bool = false;
    boolean B4bool = false;
    boolean C1bool = false;
    boolean C2bool = false;
    boolean C3bool = false;
    boolean C4bool = false;
    
    /**
     * Creates new form SlotsPage
     */
    public MinesPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cashoutButton = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        betInputTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        multiLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 32)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MINES");

        cashoutButton.setText("Cashout");
        cashoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashoutButtonActionPerformed(evt);
            }
        });

        A2.setText("A,2");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        B3.setText("B,3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B1.setText("B,1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setText("B,2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        A3.setText("A,3");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        A1.setText("A,1");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        A4.setText("A,4");
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        B4.setText("B,4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        C3.setText("C,3");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        C1.setText("C,1");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C4.setText("C,4");
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        C2.setText("C,2");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        betInputTextField.setText("0.00");
        betInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betInputTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Bet Amount:");

        jLabel3.setText("Multiplier:");

        multiLabel.setText("1.00");

        jLabel4.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(betInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cashoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(multiLabel)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(betInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cashoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>                        

    private void cashoutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        //Cashout Button
        A1.setBackground(Color.GRAY);
        randomize();
    }                                             

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(checkTile(2,1) && C2bool == false){
          C2bool = true;
          C2.setBackground(Color.green);  
          multi = multi * 1.3;
          multiLabel.setText("" + multi);
        } else{
            C2.setBackground(Color.red);
            multi = 0.00;
            multiLabel.setText("" + multi);
        }
    }                                  

    private void betInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        //A,1
        
        if(checkTile(0,0) && A1bool == false){
          A1bool = true;
          A1.setBackground(Color.green);  
          multi = multi * 1.3;
          multiLabel.setText("" + multi);
        } else{
            A1.setBackground(Color.red);
            multi = 0.00;
            multiLabel.setText("" + multi);
        }
    }                                  

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(checkTile(0,1) && A2bool == false){
          A2bool = true;
          A2.setBackground(Color.green);  
          multi = multi * 1.3;
          multiLabel.setText("" + multi);
        } else{
            A2.setBackground(Color.red);
            multi = 0.00;
            multiLabel.setText("" + multi);
        }
    }                                  

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(checkTile(0,2) && A3bool == false){
          A3bool = true;
          A3.setBackground(Color.green);  
          multi = multi * 1.3;
          multiLabel.setText("" + multi);
        } else{
            A3.setBackground(Color.red);
            multi = 0.00;
            multiLabel.setText("" + multi);
        }
    }                                  

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(checkTile(0,3) && A4bool == false){
          A4bool = true;
          A4.setBackground(Color.green);  
          multi = multi * 1.3;
          multiLabel.setText("" + multi);
        } else{
            A4.setBackground(Color.red);
            multi = 0.00;
            multiLabel.setText("" + multi);
        }
    }                                  

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(checkTile(1,0) && B1bool == false){
          B1bool = true;
          B1.setBackground(Color.green);  
          multi = multi * 1.3;
          multiLabel.setText("" + multi);
        } else{
            B1.setBackground(Color.red);
            multi = 0.00;
            multiLabel.setText("" + multi);
        }
    }                                  

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(checkTile(1,1) && B2bool == false){
          B2bool = true;
          B2.setBackground(Color.green);  
          multi = multi * 1.3;
          multiLabel.setText("" + multi);
        } else{
            B2.setBackground(Color.red);
            multi = 0.00;
            multiLabel.setText("" + multi);
        }
    }                                  

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(checkTile(1,2) && B3bool == false){
          B3bool = true;
          B3.setBackground(Color.green);  
          multi = multi * 1.3;
          multiLabel.setText("" + multi);
        } else{
            B3.setBackground(Color.red);
            multi = 0.00;
            multiLabel.setText("" + multi);
        }
    }                                  

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(checkTile(1,3) && B4bool == false){
          B4bool = true;
          B4.setBackground(Color.green);  
          multi = multi * 1.3;
          multiLabel.setText("" + multi);
        } else{
            B4.setBackground(Color.red);
            multi = 0.00;
            multiLabel.setText("" + multi);
        }
    }                                  

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(checkTile(2,0) && C1bool == false){
          C1bool = true;
          C1.setBackground(Color.green);  
          multi = multi * 1.3;
          multiLabel.setText("" + multi);
        } else{
            C1.setBackground(Color.red);
            multi = 0.00;
            multiLabel.setText("" + multi);
        }
    }                                  

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(checkTile(2,2) && C3bool == false){
          C3bool = true;
          C3.setBackground(Color.green);  
          multi = multi * 1.3;
          multiLabel.setText("" + multi);
        } else{
            C3.setBackground(Color.red);
            multi = 0.00;
            multiLabel.setText("" + multi);
        }
    }                                  

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(checkTile(2,3) && C4bool == false){
          C4bool = true;
          C4.setBackground(Color.green);  
          multi = multi * 1.3;
          multiLabel.setText("" + multi);
        } else{
            C4.setBackground(Color.red);
            multi = 0.00;
            multiLabel.setText("" + multi);
        }
    }                                  

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
            java.util.logging.Logger.getLogger(MinesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MinesPage().setVisible(true);
            }
        });
    }
    
    public static void randomize(){
        
        //Clear array of all mines
        for (int[] tileArray1 : tileArray) {
            for (int m = 0; m < tileArray[0].length; m++) {
                tileArray1[m] = 0;
            }
        }
            
            int tmpCount = 0;
            
            //Create random location in array and place 1 there
            Random ran = new Random();
            int ranOne = ran.nextInt(3);
            int ranTwo = ran.nextInt(4);
            tileArray[ranOne][ranTwo] = 1;
            
            //Prints array to console
            for (int i =0; i<tileArray.length; i++){
                for(int j=0; j < tileArray[0].length; j++){
                    if(tmpCount < 3){
                        System.out.print(tileArray[i][j] + " ");
                        tmpCount++;
                    } else{
                        System.out.println(tileArray[i][j] + " ");
                        tmpCount = 0;
                    }
                    
                }
                
            }
        }
    
    public static boolean checkTile(int col, int row){
        //Check if tile is == 1 and if so return false
        return tileArray[col][row] == 0;   
    }
    
    public void enableButtons(){
        A1.setEnabled(true);
        A2.setEnabled(true);
        
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JTextField betInputTextField;
    private javax.swing.JButton cashoutButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel multiLabel;
    // End of variables declaration                   
}
