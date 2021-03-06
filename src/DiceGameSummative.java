/*Emma Elliott
April 27,2020
Unit Summative Dice Rolling Game. 
You earn points for certain Rolls while the computer earns points if your rolls to not satisfy certain criteria.
The goal of the game is to get to 10 points first.
 */

/**
 *
 * @author gregelliott
 */
       
public class DiceGameSummative extends javax.swing.JFrame {
    
    //Declaring variables that will be used throughout the program
    int TotalCorrect=0;
    int TotalComputerCorrect=0;
    int DiceRoll1;
    int DiceRoll2;
    int DiceRoll3;
    int ComputerDiceRoll1;
    int ComputerDiceRoll2;
    int ComputerDiceRoll3;
            
    /**
     * Creates new form DiceGameSummative
     */
    public DiceGameSummative() {
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        btnRoll1 = new javax.swing.JButton();
        btnRoll2 = new javax.swing.JButton();
        btnRoll3 = new javax.swing.JButton();
        lblRoll1 = new javax.swing.JLabel();
        lblRoll2 = new javax.swing.JLabel();
        lblRoll3 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblYourScore = new javax.swing.JLabel();
        lblComputerScore = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        lblCScore = new javax.swing.JLabel();
        lblInstructions = new javax.swing.JLabel();
        lblInstructionsText = new javax.swing.JLabel();
        lblComputerRoll1 = new javax.swing.JLabel();
        lblComputerRoll2 = new javax.swing.JLabel();
        lblComputerRoll3 = new javax.swing.JLabel();
        lblCRoll1 = new javax.swing.JLabel();
        lblCRoll2 = new javax.swing.JLabel();
        lblCRoll3 = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        lblOutput = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRoll1.setBackground(new java.awt.Color(255, 204, 204));
        btnRoll1.setText("Roll Dice 1");
        btnRoll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoll1ActionPerformed(evt);
            }
        });

        btnRoll2.setBackground(new java.awt.Color(255, 204, 204));
        btnRoll2.setText("Roll Dice 2");
        btnRoll2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoll2ActionPerformed(evt);
            }
        });

        btnRoll3.setBackground(new java.awt.Color(255, 204, 204));
        btnRoll3.setText("Roll Dice 3");
        btnRoll3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoll3ActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Superclarendon", 0, 24)); // NOI18N
        lblTitle.setText("Dice Game");

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Webp.net-resizeimage.png"))); // NOI18N
        lblImage.setText("jLabel5");

        lblYourScore.setText("Your Score:");

        lblComputerScore.setText("Computer Score:");

        lblInstructions.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblInstructions.setText("Instructions:");

        lblInstructionsText.setFont(new java.awt.Font("Lucida Grande", 0, 9)); // NOI18N
        lblInstructionsText.setText("<html>Press the \"Roll Dice\" Buttons to obtain your 3 rolls. The computer will roll its dice automaticlly. Then press the \"Calculate\" Button to see how many points you get. The object of the game is to get 10 points before the computer gets 10 points. You get 5 points if you roll 3 of a  kind, 3 points if the sum of your rolls is greater than the sum of the computers rolls and 1 point if the product of your rolls is over 30. If none of these are true for your roll, than the computer gets 2 points. <html>");

        lblComputerRoll1.setText("Computer Roll 1:");

        lblComputerRoll2.setText("Computer Roll 2:");

        lblComputerRoll3.setText("Computer Roll 3:");

        btnCalculate.setBackground(new java.awt.Color(255, 51, 51));
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblOutput.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblOutput.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRoll1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRoll2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRoll3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addComponent(lblInstructions))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblYourScore)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblScore))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblComputerScore)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCScore))))
                    .addComponent(lblInstructionsText, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblRoll2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblComputerRoll2)
                                .addGap(18, 18, 18)
                                .addComponent(lblCRoll2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblRoll1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblComputerRoll1)
                                .addGap(18, 18, 18)
                                .addComponent(lblCRoll1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblRoll3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblComputerRoll3)
                                .addGap(18, 18, 18)
                                .addComponent(lblCRoll3)))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCalculate)
                        .addGap(18, 18, 18)
                        .addComponent(lblOutput)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblScore)
                                    .addComponent(lblYourScore))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCScore)
                                    .addComponent(lblComputerScore)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblInstructions)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInstructionsText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComputerRoll1)
                    .addComponent(lblCRoll1)
                    .addComponent(btnRoll1)
                    .addComponent(lblRoll1))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRoll2)
                        .addComponent(lblRoll2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblComputerRoll2)
                            .addComponent(lblCRoll2))
                        .addGap(6, 6, 6)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRoll3)
                    .addComponent(lblRoll3)
                    .addComponent(lblComputerRoll3)
                    .addComponent(lblCRoll3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(lblOutput))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRoll3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoll3ActionPerformed
        // Generates Random number for users and computers third roll
        DiceRoll3=(int)Math.round(Math.random()*5+1);
        lblRoll3.setText(String.valueOf(DiceRoll3));
        
        ComputerDiceRoll3=(int)Math.round(Math.random()*5+1);
        lblCRoll3.setText(String.valueOf(ComputerDiceRoll3));
    }//GEN-LAST:event_btnRoll3ActionPerformed

    private void btnRoll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoll1ActionPerformed
        //Generates Random  number for users and computers first roll
        DiceRoll1=(int)Math.round(Math.random()*5+1);
        lblRoll1.setText(String.valueOf(DiceRoll1));
        
        ComputerDiceRoll1=(int)Math.round(Math.random()*5+1);
        lblCRoll1.setText(String.valueOf(ComputerDiceRoll1));
    }//GEN-LAST:event_btnRoll1ActionPerformed

    private void btnRoll2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoll2ActionPerformed
        //Generates Random number for users and computers second roll
        DiceRoll2=(int)Math.round(Math.random()*5+1);
        lblRoll2.setText(String.valueOf(DiceRoll2));
        
        ComputerDiceRoll2=(int)Math.round(Math.random()*5+1);
        lblCRoll2.setText(String.valueOf(ComputerDiceRoll2));
    }//GEN-LAST:event_btnRoll2ActionPerformed
    //Finds the sum of the users 3 rolls
    public static int sum3nums(int num1,int num2,int num3)
    {
        int sum=num1+num2+num3;
        return(sum);
    }

    //Finds the product of the users 3 rolls
    public static int product3nums(int num1, int num2, int num3)
    {
        int product=num1*num2*num3;
        return(product);
    }
    
    //Finds the sum of the computers 3 rolls
    public static int computersum3nums(int num1, int num2, int num3)
    {
        int computersum=num1+num2+num3;
        return(computersum);
    }
    
    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed

        //An array to hold the values of the users dice rolls
        int [ ] dicerolls = new int [3];

        dicerolls [0] = DiceRoll1;
        dicerolls [1] = DiceRoll2;
        dicerolls [2] = DiceRoll3;
        
        //An array to hold the values of the computers dice rolls
        int [ ] computerdicerolls = new int [3];

        computerdicerolls [0] = ComputerDiceRoll1;
        computerdicerolls [1] = ComputerDiceRoll2;
        computerdicerolls [2] = ComputerDiceRoll3;
        
        
        //Check to see if all three of users dice rolls are the same
        if ((dicerolls[0]==dicerolls[1])&&(dicerolls[1]==dicerolls[2]))
        {
            TotalCorrect=TotalCorrect+5;
            lblScore.setText(String.valueOf(TotalCorrect));
        }  

        //Check to see if the sum of the users dice rolls is greater than the sum of the computers dice rolls
        if(sum3nums(dicerolls[0], dicerolls[1], dicerolls[2])>(computersum3nums(computerdicerolls[0],computerdicerolls[1],computerdicerolls[2])))
        {
            TotalCorrect=TotalCorrect+3;
            lblScore.setText(String.valueOf(TotalCorrect));
        }   
        
        //Check if the product of the users dice rolls is over 30
        if ((product3nums(dicerolls[0],dicerolls[1],dicerolls[2]))>30)
        {
            TotalCorrect=TotalCorrect+1;
            lblScore.setText(String.valueOf(TotalCorrect));
        }
        
        //If none of these statements are true, the computer will now get two points
        if(((dicerolls[0]!=dicerolls[1])||(dicerolls[1]!=dicerolls[2]))&&((sum3nums(dicerolls[0], dicerolls[1], dicerolls[2])<=(computersum3nums(computerdicerolls[0],computerdicerolls[1],computerdicerolls[2]))&&((product3nums(dicerolls[0],dicerolls[1],dicerolls[2]))<=30))))
        {
            TotalComputerCorrect=TotalComputerCorrect+2;
            lblCScore.setText(String.valueOf(TotalComputerCorrect));
        }
        
        //If the user reaches a score of 10, the user wins
        if(TotalCorrect>=10)
        {
            lblOutput.setText("You win!");
        }
        
        //If the computer reaches a score of 10, the computer wins
        if (TotalComputerCorrect>=10)
        {
            lblOutput.setText("Computer wins");
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(DiceGameSummative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiceGameSummative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiceGameSummative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiceGameSummative.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiceGameSummative().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnRoll1;
    private javax.swing.JButton btnRoll2;
    private javax.swing.JButton btnRoll3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lblCRoll1;
    private javax.swing.JLabel lblCRoll2;
    private javax.swing.JLabel lblCRoll3;
    private javax.swing.JLabel lblCScore;
    private javax.swing.JLabel lblComputerRoll1;
    private javax.swing.JLabel lblComputerRoll2;
    private javax.swing.JLabel lblComputerRoll3;
    private javax.swing.JLabel lblComputerScore;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JLabel lblInstructionsText;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JLabel lblRoll1;
    private javax.swing.JLabel lblRoll2;
    private javax.swing.JLabel lblRoll3;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYourScore;
    // End of variables declaration//GEN-END:variables
}
