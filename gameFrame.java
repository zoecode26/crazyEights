package crazyeights;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random; 
import java.util.Collections;
import javax.swing.JButton;


public class gameFrame extends javax.swing.JFrame {
    
    int players;
    String name;
    int player;
    String card;
    int alreadyRun = 0;
    int winner = 0;
    boolean pickup = false;
    boolean cardPlayed = false;
    String suitSelected = "";
    boolean eightPlayed = false;
    boolean compEightPlayed = false;
    String compSuitSelected;
    boolean twoplayed = false;
    boolean compTwoPlayed = false;
    int total = 0;
    ArrayList <String> generatedCards = new ArrayList <String>();
    ArrayList <String> player1Cards = new ArrayList <String>();
    ArrayList <String> player2Cards = new ArrayList <String>();
    ArrayList <String> player3Cards = new ArrayList <String>();
    ArrayList <String> player4Cards = new ArrayList <String>();

    
    
    public gameFrame() {   
        initComponents(); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        backGroundPanel = new javax.swing.JPanel();
        startMenu = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        playersLabel = new javax.swing.JLabel();
        twoBtn = new javax.swing.JRadioButton();
        threeBtn = new javax.swing.JRadioButton();
        fourBtn = new javax.swing.JRadioButton();
        okBtn = new javax.swing.JButton();
        card2 = new javax.swing.JButton();
        card3 = new javax.swing.JButton();
        card4 = new javax.swing.JButton();
        card5 = new javax.swing.JButton();
        card6 = new javax.swing.JButton();
        card7 = new javax.swing.JButton();
        card8 = new javax.swing.JButton();
        card9 = new javax.swing.JButton();
        card10 = new javax.swing.JButton();
        card11 = new javax.swing.JButton();
        card12 = new javax.swing.JButton();
        card13 = new javax.swing.JButton();
        card14 = new javax.swing.JButton();
        card15 = new javax.swing.JButton();
        card16 = new javax.swing.JButton();
        card17 = new javax.swing.JButton();
        card18 = new javax.swing.JButton();
        card19 = new javax.swing.JButton();
        card20 = new javax.swing.JButton();
        card1 = new javax.swing.JButton();
        topCard = new javax.swing.JButton();
        pile = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        suitPanel = new javax.swing.JPanel();
        suitLabel = new javax.swing.JLabel();
        heartsBtn = new javax.swing.JButton();
        clubsBtn = new javax.swing.JButton();
        spadesBtn = new javax.swing.JButton();
        diamondsBtn = new javax.swing.JButton();
        textField = new javax.swing.JTextField();
        P2Label = new javax.swing.JLabel();
        P3Label = new javax.swing.JLabel();
        P4Label = new javax.swing.JLabel();
        mainMenuBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backGroundPanel.setBackground(new java.awt.Color(0, 102, 51));

        startMenu.setBackground(new java.awt.Color(0, 102, 51));
        startMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 2));
        startMenu.setForeground(new java.awt.Color(255, 255, 51));

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 51));
        usernameLabel.setText("Username:");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        playersLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        playersLabel.setForeground(new java.awt.Color(255, 255, 51));
        playersLabel.setText("Players:");

        twoBtn.setBackground(new java.awt.Color(0, 102, 51));
        buttonGroup1.add(twoBtn);
        twoBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        twoBtn.setForeground(new java.awt.Color(255, 255, 51));
        twoBtn.setText("2");

        threeBtn.setBackground(new java.awt.Color(0, 102, 51));
        buttonGroup1.add(threeBtn);
        threeBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        threeBtn.setForeground(new java.awt.Color(255, 255, 51));
        threeBtn.setText("3");

        fourBtn.setBackground(new java.awt.Color(0, 102, 51));
        buttonGroup1.add(fourBtn);
        fourBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fourBtn.setForeground(new java.awt.Color(255, 255, 51));
        fourBtn.setText("4");

        okBtn.setBackground(new java.awt.Color(255, 255, 51));
        okBtn.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 18)); // NOI18N
        okBtn.setForeground(new java.awt.Color(0, 102, 51));
        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout startMenuLayout = new javax.swing.GroupLayout(startMenu);
        startMenu.setLayout(startMenuLayout);
        startMenuLayout.setHorizontalGroup(
            startMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startMenuLayout.createSequentialGroup()
                .addGroup(startMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(startMenuLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(usernameLabel))
                    .addGroup(startMenuLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(startMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(startMenuLayout.createSequentialGroup()
                                .addComponent(twoBtn)
                                .addGap(31, 31, 31)
                                .addComponent(threeBtn)
                                .addGap(30, 30, 30)
                                .addComponent(fourBtn))))
                    .addGroup(startMenuLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(startMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playersLabel))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        startMenuLayout.setVerticalGroup(
            startMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playersLabel)
                .addGap(12, 12, 12)
                .addGroup(startMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twoBtn)
                    .addComponent(threeBtn)
                    .addComponent(fourBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card2.setPreferredSize(new java.awt.Dimension(100, 140));
        card2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card2ActionPerformed(evt);
            }
        });

        card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card3.setPreferredSize(new java.awt.Dimension(100, 140));
        card3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card3ActionPerformed(evt);
            }
        });

        card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card4.setPreferredSize(new java.awt.Dimension(100, 140));
        card4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card4ActionPerformed(evt);
            }
        });

        card5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card5.setPreferredSize(new java.awt.Dimension(100, 140));
        card5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card5ActionPerformed(evt);
            }
        });

        card6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card6.setPreferredSize(new java.awt.Dimension(100, 140));
        card6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card6ActionPerformed(evt);
            }
        });

        card7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card7.setPreferredSize(new java.awt.Dimension(100, 140));
        card7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card7ActionPerformed(evt);
            }
        });

        card8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card8.setPreferredSize(new java.awt.Dimension(100, 140));
        card8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card8ActionPerformed(evt);
            }
        });

        card9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card9.setPreferredSize(new java.awt.Dimension(100, 140));
        card9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card9ActionPerformed(evt);
            }
        });

        card10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card10.setPreferredSize(new java.awt.Dimension(100, 140));
        card10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card10ActionPerformed(evt);
            }
        });

        card11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card11.setPreferredSize(new java.awt.Dimension(100, 140));
        card11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card11ActionPerformed(evt);
            }
        });

        card12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card12.setPreferredSize(new java.awt.Dimension(100, 140));
        card12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card12ActionPerformed(evt);
            }
        });

        card13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card13.setPreferredSize(new java.awt.Dimension(100, 140));
        card13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card13ActionPerformed(evt);
            }
        });

        card14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card14.setPreferredSize(new java.awt.Dimension(100, 140));
        card14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card14ActionPerformed(evt);
            }
        });

        card15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card15.setPreferredSize(new java.awt.Dimension(100, 140));
        card15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card15ActionPerformed(evt);
            }
        });

        card16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card16.setPreferredSize(new java.awt.Dimension(100, 140));
        card16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card16ActionPerformed(evt);
            }
        });

        card17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card17.setPreferredSize(new java.awt.Dimension(100, 140));
        card17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card17ActionPerformed(evt);
            }
        });

        card18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card18.setPreferredSize(new java.awt.Dimension(100, 140));
        card18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card18ActionPerformed(evt);
            }
        });

        card19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card19.setPreferredSize(new java.awt.Dimension(100, 140));
        card19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card19ActionPerformed(evt);
            }
        });

        card20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card20.setPreferredSize(new java.awt.Dimension(100, 140));
        card20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card20ActionPerformed(evt);
            }
        });

        card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        card1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        card1.setPreferredSize(new java.awt.Dimension(100, 140));
        card1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card1ActionPerformed(evt);
            }
        });

        topCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/green.jpg"))); // NOI18N
        topCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        topCard.setEnabled(false);
        topCard.setPreferredSize(new java.awt.Dimension(100, 141));

        pile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/BACK.jpg"))); // NOI18N
        pile.setEnabled(false);
        pile.setName("asdf"); // NOI18N
        pile.setPreferredSize(new java.awt.Dimension(100, 141));
        pile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pileActionPerformed(evt);
            }
        });

        nextBtn.setBackground(new java.awt.Color(255, 255, 0));
        nextBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nextBtn.setForeground(new java.awt.Color(102, 102, 102));
        nextBtn.setText("NEXT");
        nextBtn.setEnabled(false);
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        suitPanel.setBackground(new java.awt.Color(0, 102, 51));
        suitPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        suitPanel.setForeground(new java.awt.Color(255, 255, 0));

        suitLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        suitLabel.setForeground(new java.awt.Color(102, 102, 102));
        suitLabel.setText("Suit:");

        heartsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/H.jpg"))); // NOI18N
        heartsBtn.setEnabled(false);
        heartsBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        heartsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heartsBtnActionPerformed(evt);
            }
        });

        clubsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/C.jpg"))); // NOI18N
        clubsBtn.setEnabled(false);
        clubsBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        clubsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubsBtnActionPerformed(evt);
            }
        });

        spadesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/S.jpg"))); // NOI18N
        spadesBtn.setEnabled(false);
        spadesBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        spadesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spadesBtnActionPerformed(evt);
            }
        });

        diamondsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crazyeights/D.jpg"))); // NOI18N
        diamondsBtn.setEnabled(false);
        diamondsBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        diamondsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diamondsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout suitPanelLayout = new javax.swing.GroupLayout(suitPanel);
        suitPanel.setLayout(suitPanelLayout);
        suitPanelLayout.setHorizontalGroup(
            suitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, suitPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(suitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, suitPanelLayout.createSequentialGroup()
                        .addComponent(suitLabel)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, suitPanelLayout.createSequentialGroup()
                        .addGroup(suitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heartsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spadesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(suitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clubsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diamondsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))))
        );
        suitPanelLayout.setVerticalGroup(
            suitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(suitLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(suitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heartsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clubsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(suitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spadesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diamondsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        textField.setEditable(false);
        textField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField.setText("ENTER YOUR USERNAME AND AMOUNT OF PLAYERS USING THE MENU TO THE LEFT");

        P2Label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        P2Label.setForeground(new java.awt.Color(102, 102, 102));
        P2Label.setText("P2 cards left:");

        P3Label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        P3Label.setForeground(new java.awt.Color(102, 102, 102));
        P3Label.setText("P3 cards left:");

        P4Label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        P4Label.setForeground(new java.awt.Color(102, 102, 102));
        P4Label.setText("P4 cards left:");

        mainMenuBtn.setBackground(new java.awt.Color(255, 255, 0));
        mainMenuBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mainMenuBtn.setForeground(new java.awt.Color(102, 102, 102));
        mainMenuBtn.setText("MAIN MENU");
        mainMenuBtn.setEnabled(false);
        mainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backGroundPanelLayout = new javax.swing.GroupLayout(backGroundPanel);
        backGroundPanel.setLayout(backGroundPanelLayout);
        backGroundPanelLayout.setHorizontalGroup(
            backGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGroundPanelLayout.createSequentialGroup()
                        .addGroup(backGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backGroundPanelLayout.createSequentialGroup()
                                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backGroundPanelLayout.createSequentialGroup()
                                .addComponent(startMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(backGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(backGroundPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(backGroundPanelLayout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(topCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addGroup(backGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(P3Label)
                                            .addComponent(P4Label)
                                            .addComponent(P2Label))
                                        .addGap(92, 92, 92)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backGroundPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGroundPanelLayout.createSequentialGroup()
                                .addGroup(backGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nextBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(suitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(23, 23, 23))))
                    .addGroup(backGroundPanelLayout.createSequentialGroup()
                        .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backGroundPanelLayout.createSequentialGroup()
                                .addComponent(card19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(card20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(mainMenuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        backGroundPanelLayout.setVerticalGroup(
            backGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(backGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(startMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backGroundPanelLayout.createSequentialGroup()
                        .addGroup(backGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(topCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backGroundPanelLayout.createSequentialGroup()
                        .addGroup(backGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backGroundPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(P2Label)
                                .addGap(31, 31, 31)
                                .addComponent(P3Label)
                                .addGap(32, 32, 32)
                                .addComponent(P4Label))
                            .addComponent(suitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(backGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainMenuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1132, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void diamondsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diamondsBtnActionPerformed
        if (heartsBtn.isEnabled()&&clubsBtn.isEnabled()&&spadesBtn.isEnabled()&&diamondsBtn.isEnabled()){
            suitSelected = "D";
            eightPlayed = true;
            suitPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102), 2));
            suitLabel.setForeground(new java.awt.Color(102,102,102));
            heartsBtn.setEnabled(false);
            clubsBtn.setEnabled(false);
            spadesBtn.setEnabled(false);
            textField.setText("SUIT SET TO DIAMONDS, PRESS NEXT TO PASS PLAY TO PLAYER 2");
        }
    }//GEN-LAST:event_diamondsBtnActionPerformed

    private void spadesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spadesBtnActionPerformed
        if (heartsBtn.isEnabled()&&clubsBtn.isEnabled()&&spadesBtn.isEnabled()&&diamondsBtn.isEnabled()){
            suitSelected = "S";
            eightPlayed = true;
            suitPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102), 2));
            suitLabel.setForeground(new java.awt.Color(102,102,102));
            heartsBtn.setEnabled(false);
            clubsBtn.setEnabled(false);
            diamondsBtn.setEnabled(false);
            textField.setText("SUIT SET TO SPADES, PRESS NEXT TO PASS PLAY TO PLAYER 2");
        }
    }//GEN-LAST:event_spadesBtnActionPerformed

    private void clubsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubsBtnActionPerformed
        if (heartsBtn.isEnabled()&&clubsBtn.isEnabled()&&spadesBtn.isEnabled()&&diamondsBtn.isEnabled()){
            suitSelected = "C";
            eightPlayed = true;
            suitPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102), 2));
            suitLabel.setForeground(new java.awt.Color(102,102,102));
            heartsBtn.setEnabled(false);
            spadesBtn.setEnabled(false);
            diamondsBtn.setEnabled(false);
            textField.setText("SUIT SET TO CLUBS, PRESS NEXT TO PASS PLAY TO PLAYER 2");
        }
    }//GEN-LAST:event_clubsBtnActionPerformed

    private void heartsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heartsBtnActionPerformed
        if (heartsBtn.isEnabled()&&clubsBtn.isEnabled()&&spadesBtn.isEnabled()&&diamondsBtn.isEnabled()){
            suitSelected = "H";
            eightPlayed = true;
            suitPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102), 2));
            suitLabel.setForeground(new java.awt.Color(102,102,102));
            clubsBtn.setEnabled(false);
            spadesBtn.setEnabled(false);
            diamondsBtn.setEnabled(false);
            textField.setText("SUIT SET TO HEARTS, PRESS NEXT TO PASS PLAY TO PLAYER 2");
        }
    }//GEN-LAST:event_heartsBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        JButton[] allCards = new JButton[]{card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13, card14, card15, card16, card17, card18, card19, card20};

        if (player == 1 && compTwoPlayed == true){
            compTwoPlayed = false;
            cardPlayed = true;
        }
         
        if (!(heartsBtn.isEnabled()&& diamondsBtn.isEnabled()&& spadesBtn.isEnabled() && clubsBtn.isEnabled())){
            int hearts = 0;
            int clubs = 0;
            int diamonds = 0;
            int spades = 0;
            if ((player == 1 && (cardPlayed == true || alreadyRun == 1))|| player == 2||player == 3||player == 4){
                if (player != players){
                    player ++;
                }
                else{
                    player = 1;
                }
                if (player == 1){
                    textField.setText("IT'S YOUR TURN - PRESS NEXT TO PASS PLAY TO NEXT PLAYER");
                }
                else if (player == 2){
                    textField.setText("IT'S PLAYER 2's TURN - PRESS NEXT TO PASS PLAY TO NEXT PLAYER");
                }
                else if (player == 3){
                    textField.setText("IT'S PLAYER 3's TURN - PRESS NEXT TO PASS PLAY TO NEXT PLAYER");
                }
                else{
                    textField.setText("IT'S PLAYER 4's TURN - PRESS NEXT TO PASS PLAY TO NEXT PLAYER");
                }
                int counter;
                String item;
                String currentCard = generatedCards.get(0);
                String compCard;
                String cardToAdd;
                ArrayList <String> playerCards = new ArrayList <String>();
                ArrayList <String> playable = new ArrayList <String>();
                ArrayList <Integer> suitAmounts = new ArrayList <Integer>();

                if(player == 2){
                    playerCards = player2Cards;
                }
                if (player == 3){
                    playerCards = player3Cards;
                }
                if (player == 4){
                    playerCards = player4Cards;
                }

                
                //IF NO PICKUP TWO HAS BEEN PLAYED
                if (twoplayed == false && compTwoPlayed == false){
                    for (counter = 0;counter<playerCards.size();counter++){
                        item = playerCards.get(counter);
                        if (eightPlayed == false && compEightPlayed == false){
                            if (((item.substring(0,1)).equals(currentCard.substring(0,1)))||((item.substring(1,2)).equals(currentCard.substring(1,2))||((item.substring(0,1)).equals("8")))){
                                playable.add(item);
                            }
                        }
                        else{
                            if (eightPlayed == true){
                                if(item.substring(1,2).equals(suitSelected)){
                                    playable.add(item);
                                }
                            }
                            else if (compEightPlayed == true){
                                if(item.substring(1,2).equals(compSuitSelected)){
                                    playable.add(item);
                                }
                            }
                        }
                    }

                    if (playable.size()>0){
                        if (compEightPlayed == true){
                            compEightPlayed = false;
                        }
                        if (eightPlayed == true){
                            eightPlayed = false;
                        }
                        heartsBtn.setEnabled(false);
                        diamondsBtn.setEnabled(false);
                        clubsBtn.setEnabled(false);
                        spadesBtn.setEnabled(false);
                        Collections.sort(playable);
                        compCard = playable.get(0);
                        generatedCards.add(0,compCard);
                        playerCards.remove(compCard);
                        
                        if (compCard.substring(0,1).equals("2")){
                            compTwoPlayed = true;
                        }

                        if (compCard.substring(0,1).equals("8")){
                            compEightPlayed = true;
                            for (counter = 0;counter<playerCards.size();counter++){
                                item = playerCards.get(counter);
                                if(item.substring(1,2).equals("H")){
                                    hearts++;
                                }
                                else if(item.substring(1,2).equals("D")){
                                    diamonds++;
                                }
                                else if(item.substring(1,2).equals("C")){
                                    clubs++;
                                }
                                else if(item.substring(1,2).equals("S")){
                                    spades++;
                                }
                            }

                            suitAmounts.add(hearts);
                            suitAmounts.add(diamonds);
                            suitAmounts.add(clubs);
                            suitAmounts.add(spades);
                            Collections.sort(suitAmounts);
                            Collections.reverse(suitAmounts);

                            if (suitAmounts.get(0).equals(hearts)){
                                compSuitSelected = "H";
                                heartsBtn.setEnabled(true);
                            }
                            else if (suitAmounts.get(0).equals(diamonds)){
                                compSuitSelected = "D";
                                diamondsBtn.setEnabled(true);
                            }
                            else if (suitAmounts.get(0).equals(clubs)){
                                compSuitSelected = "C";
                                clubsBtn.setEnabled(true);
                            }
                            else{
                                compSuitSelected = "S";
                                spadesBtn.setEnabled(true);
                            }

                            String textSuit;
                            if (compSuitSelected.equals("H")){
                                textSuit = "HEARTS";
                            }
                            else if (compSuitSelected.equals("D")){
                                textSuit = "DIAMONDS";
                            }
                            else if (compSuitSelected.equals("C")){
                                textSuit = "CLUBS";
                            }
                            else{
                                textSuit = "SPADES";
                            }
                            textField.setText("PLAYER "+player+" HAS CHANGED THE SUIT TO "+textSuit);
                        }
                    }
                    else{
                        if (generatedCards.size()>0){
                            cardToAdd = generatedCards.get(generatedCards.size()-1);
                            playerCards.add(cardToAdd);
                            generatedCards.remove(cardToAdd);
                        }
                        else{
                            textField.setText("CARDS RAN OUT - IT'S A DRAW!");
                            gameOver();
                        }
                    }

                    if (player == (2)){
                        int newlength = player2Cards.size();
                        P2Label.setText("P2 cards left: "+newlength);
                    }
                    else if (player == (3)){
                        int newlength = player3Cards.size();
                        P3Label.setText("P3 cards left: "+newlength);
                    }
                    if (player == (4)){
                        int newlength = player4Cards.size();
                        P4Label.setText("P4 cards left: "+newlength);
                    }

                    if(playerCards.size()<1){
                        if (player == 2){
                            winner = 2;
                            textField.setText("PLAYER 2 WINS");
                        }
                        else if (player == 3){
                            winner = 3;
                            textField.setText("PLAYER 3 WINS");
                        }
                        else{
                            winner = 4;
                            textField.setText("PLAYER 4 WINS");
                        }

                        gameOver();
                        scoring();
                        
                        
                        
                    }
                
                }
                //USER TO COMP
                else if (twoplayed == true){
                    textField.setText("PLAYER 2 MISSES A TURN TO PICK UP 2");
                    for (int i = 0;i<2;i++){
                        player2Cards.add(generatedCards.get(generatedCards.size()-1));
                        generatedCards.remove(generatedCards.get(generatedCards.size()-1));
                        int newlength = player2Cards.size();
                        P2Label.setText("P2 cards left: "+newlength);
                    }
                    twoplayed = false;
                }
                //COMP TO USER
                else if (compTwoPlayed == true){
                    if (player == 1){
                        textField.setText("YOU MISS A TURN TO PICK UP 2 - PRESS NEXT TO CONTINUE");
                        for (int i = 0;i<2;i++){
                            player1Cards.add(generatedCards.get(generatedCards.size()-1));
                            generatedCards.remove(generatedCards.get(generatedCards.size()-1));
                            setCards();
                        }
                    }
                    //COMP TO COMP
                    else{
                        textField.setText("PLAYER "+player+" MISSES A TURN TO PICK UP 2");
                        for (int i = 0;i<2;i++){
                            playerCards.add(generatedCards.get(generatedCards.size()-1));
                            generatedCards.remove(generatedCards.get(generatedCards.size()-1));
                            int newlength = playerCards.size();
                            if (player == 3){
                                P3Label.setText("P3 cards left: "+newlength);
                            }
                            else if (player == 4){
                                P4Label.setText("P4 cards left: "+newlength);
                            }
                        }
                        compTwoPlayed = false;
                    }
                }

                alreadyRun = 0;
                cardPlayed = false;
                setCards();
            }
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void pileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pileActionPerformed
        JButton[] allCards = new JButton[]{card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13, card14, card15, card16, card17, card18, card19, card20};

        if (generatedCards.size()>0){
            if (compTwoPlayed == false){
            String cardToAdd;
            int counter;
            String item;
            String currentCard;
            int cardsToPlay = 0;

            currentCard = generatedCards.get(0);
            for (counter = 0;counter<player1Cards.size();counter++){
                item = player1Cards.get(counter);
                if (compEightPlayed == false && eightPlayed == false){
                    if (item.substring(0,1).equals(currentCard.substring(0,1))){
                        cardsToPlay++;
                    }
                    else if (item.substring(1,2).equals(currentCard.substring(1,2))){
                        cardsToPlay++;
                    }
                    else if (item.substring(0,1).equals("8")){
                        cardsToPlay++;
                    }
                }
                else if (compEightPlayed == true && eightPlayed == false){
                    if (item.substring(1,2).equals(compSuitSelected)){
                        cardsToPlay++;
                    }
                    else if (item.substring(0,1).equals("8")){
                        cardsToPlay++;
                    }
                }
                else if (compEightPlayed == false && eightPlayed == true){
                    if (item.substring(1,2).equals(suitSelected)){
                        cardsToPlay++;
                    }
                    else if (item.substring(0,1).equals("8")){
                        cardsToPlay++;
                    }
                }
            }

            if (cardsToPlay == 0 && alreadyRun!=1){
                pickup = true;
            }

            if (pickup == true){
                cardToAdd = generatedCards.get(generatedCards.size()-1);
                player1Cards.add(cardToAdd);
                generatedCards.remove(cardToAdd);
                setCards();
                pickup = false;
                alreadyRun = 1;
            }

            if (player1Cards.size()>20){
                textField.setText("YOU LOSE, GAME OVER!");
                gameOver();
                scoring();


            }
        }
        }
        
        else{
            textField.setText("CARDS RAN OUT - IT'S A DRAW!");
            gameOver();
        }
    }//GEN-LAST:event_pileActionPerformed

    private void card1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card1ActionPerformed
        try{
            card = player1Cards.get(0);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card1ActionPerformed

    private void card20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card20ActionPerformed
        try{
            card = player1Cards.get(19);
            userPlay();
        }
        catch (Exception e){
        }
    }//GEN-LAST:event_card20ActionPerformed

    private void card19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card19ActionPerformed
        try{
            card = player1Cards.get(18);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card19ActionPerformed

    private void card18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card18ActionPerformed
        try{
            card = player1Cards.get(17);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card18ActionPerformed

    private void card17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card17ActionPerformed
        try{
            card = player1Cards.get(16);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card17ActionPerformed

    private void card16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card16ActionPerformed
        try{
            card = player1Cards.get(15);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card16ActionPerformed

    private void card15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card15ActionPerformed
        try{
            card = player1Cards.get(14);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card15ActionPerformed

    private void card14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card14ActionPerformed
        try{
            card = player1Cards.get(13);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card14ActionPerformed

    private void card13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card13ActionPerformed
        try{
            card = player1Cards.get(12);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card13ActionPerformed

    private void card12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card12ActionPerformed
        try{
            card = player1Cards.get(11);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card12ActionPerformed

    private void card11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card11ActionPerformed
        try{
            card = player1Cards.get(10);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card11ActionPerformed

    private void card10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card10ActionPerformed
        try{
            card = player1Cards.get(9);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card10ActionPerformed

    private void card9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card9ActionPerformed
        try{
            card = player1Cards.get(8);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card9ActionPerformed

    private void card8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card8ActionPerformed
        try{
            card = player1Cards.get(7);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card8ActionPerformed

    private void card7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card7ActionPerformed
        try{
            card = player1Cards.get(6);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card7ActionPerformed

    private void card6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card6ActionPerformed
        try{
            card = player1Cards.get(5);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card6ActionPerformed

    private void card5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card5ActionPerformed
        try{
            card = player1Cards.get(4);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card5ActionPerformed

    private void card4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card4ActionPerformed
        try{
            card = player1Cards.get(3);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card4ActionPerformed

    private void card3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card3ActionPerformed
        try{
            card = player1Cards.get(2);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card3ActionPerformed

    private void card2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card2ActionPerformed
        try{
            card = player1Cards.get(1);
            userPlay();
        }
        catch (Exception e){
        }

    }//GEN-LAST:event_card2ActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        JButton[] allCards = new JButton[]{card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13, card14, card15, card16, card17, card18, card19, card20};

        
        int pos;
        char letter;
        int lettercount;
        boolean alphabet = false;
        boolean namelength = false;
        boolean playerselect = false;
        lettercount = 0;
        player = 1;
        textField.setText("IT'S YOUR TURN - PRESS NEXT TO PASS PLAY TO THE NEXT PLAYER");

        name = nameField.getText();

        //this loop checks that evey character of the name string is a letter
        for (pos=0;pos<name.length();pos++){
            letter = name.charAt(pos);
            if ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')){
                lettercount++;
            }
            if (lettercount == name.length()){
                alphabet = true;
            }
        }

        if ((name.length()>1)&&name.length()<17){
            namelength = true;
        }
        if (twoBtn.isSelected()){
            players = 2;
            playerselect = true;
            P2Label.setText("P2 cards left: 7");
            P2Label.setForeground(new java.awt.Color(255,255,51));
        }
        else if (threeBtn.isSelected()){
            players = 3;
            playerselect = true;
            P2Label.setText("P2 cards left: 5");
            P3Label.setText("P3 cards left: 5");
            P2Label.setForeground(new java.awt.Color(255,255,51));
            P3Label.setForeground(new java.awt.Color(255,255,51));
        }
        else if (fourBtn.isSelected()){
            players = 4;
            playerselect = true;
            P2Label.setText("P2 cards left: 5");
            P3Label.setText("P3 cards left: 5");
            P4Label.setText("P4 cards left: 5");
            P2Label.setForeground(new java.awt.Color(255,255,51));
            P3Label.setForeground(new java.awt.Color(255,255,51));
            P4Label.setForeground(new java.awt.Color(255,255,51));
        }

        if (alphabet == true && namelength == true && playerselect == true){
            shuffleCards();
            startMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102), 2));
            usernameLabel.setForeground(new java.awt.Color(102,102,102));
            nameField.setEnabled(false);
            playersLabel.setForeground(new java.awt.Color(102,102,102));
            twoBtn.setEnabled(false);
            threeBtn.setEnabled(false);
            fourBtn.setEnabled(false);
            okBtn.setEnabled(false);
            okBtn.setForeground(new java.awt.Color(102,102,102));
            twoBtn.setForeground(new java.awt.Color(102,102,102));
            threeBtn.setForeground(new java.awt.Color(102,102,102));
            fourBtn.setForeground(new java.awt.Color(102,102,102));
            topCard.setEnabled(true);
            pile.setEnabled(true);
            nextBtn.setEnabled(true);
            nextBtn.setForeground(new java.awt.Color(0,102,51));
            
            for (JButton button : allCards){
                button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,51), 2)); 
            }     
        }
        else if (namelength == false){
            textField.setText("USERNAME MUST BE 2-16 CHARATERS LONG");
        }
        else if (alphabet == false){
            textField.setText("USERNAME MUST CONTAIN ONLY LETTERS");
        }
        else if (playerselect == false){
            textField.setText("AN AMOUNT OF PLAYERS MUST BE SELECTED");
        }
    }//GEN-LAST:event_okBtnActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void mainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuBtnActionPerformed
        new mainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mainMenuBtnActionPerformed
    
    private void gameOver() {
        JButton[] allCards = new JButton[]{card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13, card14, card15, card16, card17, card18, card19, card20};
        topCard.setEnabled(false);
        pile.setEnabled(false);
        nextBtn.setEnabled(false);
        nextBtn.setForeground(new java.awt.Color(102,102,102));
        suitPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102), 2));
        suitLabel.setForeground(new java.awt.Color(102,102,102));
        heartsBtn.setEnabled(false);
        diamondsBtn.setEnabled(false);
        clubsBtn.setEnabled(false);
        spadesBtn.setEnabled(false);

        for (JButton button : allCards){
            button.setEnabled(false);
            button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102), 2)); 
        } 

        P2Label.setForeground(new java.awt.Color(102,102,102));
        P3Label.setForeground(new java.awt.Color(102,102,102));
        P4Label.setForeground(new java.awt.Color(102,102,102));
        mainMenuBtn.setEnabled(true);
        mainMenuBtn.setForeground(new java.awt.Color(0,102,51));
    } 
    
    private void shuffleCards (){
        String numbers [] = {"1","2","3","4","5","6","7","8","9","J","Q","K","A"};
        String suits [] = {"H","D","S","C"};
        Random rand = new Random();
        int pos;
        boolean match;
        int randomNumber;
        int randomSuit;
        
        
        
        while (generatedCards.size()<52){
            match = false;
            randomNumber = rand.nextInt(13);
            randomSuit = rand.nextInt(4);
            String cardNumber = numbers[randomNumber];
            String cardSuit = suits [randomSuit];
            String card = cardNumber+cardSuit;
            
            for (pos = 0;pos <generatedCards.size();pos++){
                if (card.equals(generatedCards.get(pos))){
                    match = true;
                }
            }
            if (match == false){
                generatedCards.add(card);
            }
        }
        
        
        dealCards();
    }
    
    private void dealCards (){
        int maxCards;
        int pos;

        
        
        if (players == 2){
            maxCards = 7;
        }
        else {
            maxCards = 5;
        }
        //Adds card to players hand, then removes it from deck
        while (player1Cards.size()<maxCards){
            player1Cards.add(generatedCards.get(0));
            generatedCards.remove(0);
        }
        while (player2Cards.size()<maxCards){
            player2Cards.add(generatedCards.get(0));
            generatedCards.remove(0);
        }
        //Only executed if third and fourth players exist given the player selection
        if (players > 2){
            while (player3Cards.size()<maxCards){
                player3Cards.add(generatedCards.get(0));
                generatedCards.remove(0);
            }
        }
        if (players > 3){
            while (player4Cards.size()<maxCards){
                player4Cards.add(generatedCards.get(0));
                generatedCards.remove(0);
            }
        }
        setCards();
    }
    private void scoring () {
            if (winner == 1){
                try{ 
                    BufferedWriter writer = new BufferedWriter (new FileWriter("scores.txt",true));
                    writer.append(total+","+name+"\n");
                    writer.close();
                }
                catch(IOException e){
                    System.out.println("Data could not be written to selected file");
                }
            }
    }
    
    
    private void setCards (){
        JButton[] allCards = new JButton[]{card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13, card14, card15, card16, card17, card18, card19, card20};
        if (generatedCards.size()>0){
            topCard.setIcon(new javax.swing.ImageIcon(getClass().getResource(generatedCards.get(0)+".jpg")));

            for (int i=0;i<allCards.length;i++){
                try{
                    (allCards[i]).setIcon(new javax.swing.ImageIcon(getClass().getResource(player1Cards.get(i)+".jpg")));
                }
                catch(Exception e){
                    (allCards[i]).setIcon(new javax.swing.ImageIcon(getClass().getResource("green.jpg")));
                }
            }
        }
        else{
            textField.setText("CARDS RAN OUT - IT'S A DRAW!");
            gameOver();
        }
    }
    
    private void userPlay (){
        JButton[] allCards = new JButton[]{card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13, card14, card15, card16, card17, card18, card19, card20};
        if (player == 1 && cardPlayed == false && compTwoPlayed == false){
            String playerCardNumber;
            String playerCardSuit;
            String pileCardNumber;
            String pileCardSuit;
            String currentCard;


            playerCardNumber = card.substring(0,1);
            playerCardSuit = card.substring(1,2);

            currentCard = generatedCards.get(0);
            pileCardNumber = currentCard.substring(0,1);
            pileCardSuit = currentCard.substring(1,2);
            

            
            if (compEightPlayed == false && eightPlayed == false){
                if ((playerCardNumber.equals(pileCardNumber))||(playerCardSuit.equals(pileCardSuit))||(playerCardNumber.equals("8"))){
                    player1Cards.remove(card);
                    generatedCards.add(0,card);
                    total++;
                    setCards();
                    cardPlayed = true;
                    if (playerCardNumber.equals("8")){
                        suitPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,51), 2));
                        suitLabel.setForeground(new java.awt.Color(255,255,51));
                        heartsBtn.setEnabled(true);
                        clubsBtn.setEnabled(true);
                        spadesBtn.setEnabled(true);
                        diamondsBtn.setEnabled(true);
                        textField.setText("SELECT A SUIT FROM THE PANEL IN THE TOP RIGHT");
                    }  
                    else if (playerCardNumber.equals("2")){
                        twoplayed = true;
                    }
                }
            }
            
            else if (compEightPlayed == true){
                if (playerCardSuit.equals(compSuitSelected)||(playerCardNumber.equals("8"))){
                    player1Cards.remove(card);
                    generatedCards.add(0,card);
                    total++;
                    setCards();
                    cardPlayed = true;
                    compEightPlayed = false;
                    eightPlayed = false;
                    heartsBtn.setEnabled(false);
                    diamondsBtn.setEnabled(false);
                    clubsBtn.setEnabled(false);
                    spadesBtn.setEnabled(false);
                    //COPY FROM HERE
                    if (playerCardNumber.equals("8")){
                        suitPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,51), 2));
                        suitLabel.setForeground(new java.awt.Color(255,255,51));
                        heartsBtn.setEnabled(true);
                        clubsBtn.setEnabled(true);
                        spadesBtn.setEnabled(true);
                        diamondsBtn.setEnabled(true);
                        textField.setText("SELECT A SUIT FROM THE PANEL IN THE TOP RIGHT");
                    } 
                    else if (playerCardNumber.equals("2")){
                        twoplayed = true;
                    }
                }
            }
            
            else if (eightPlayed == true){
                if (playerCardSuit.equals(suitSelected)||(playerCardNumber.equals("8"))){
                    player1Cards.remove(card);
                    generatedCards.add(0,card);
                    setCards();
                    total++;
                    cardPlayed = true;
                    compEightPlayed = false;
                    eightPlayed = false;
                    heartsBtn.setEnabled(false);
                    diamondsBtn.setEnabled(false);
                    clubsBtn.setEnabled(false);
                    spadesBtn.setEnabled(false);
                    if (playerCardNumber.equals("8")){
                        suitPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,51), 2));
                        suitLabel.setForeground(new java.awt.Color(255,255,51));
                        heartsBtn.setEnabled(true);
                        clubsBtn.setEnabled(true);
                        spadesBtn.setEnabled(true);
                        diamondsBtn.setEnabled(true);
                        textField.setText("SELECT A SUIT FROM THE PANEL IN THE TOP RIGHT");
                    }
                    else if (playerCardNumber.equals("2")){
                        twoplayed = true;
                    }
                }
            }
        }
        
        
        if (cardPlayed == true){
            if(player1Cards.size()<1){
                winner = 1;
                textField.setText("YOU WIN!");
                gameOver();
                scoring();

                
            }
            
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
            java.util.logging.Logger.getLogger(gameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gameFrame().setVisible(true);
                
            }
            
        });
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel P2Label;
    private javax.swing.JLabel P3Label;
    private javax.swing.JLabel P4Label;
    private javax.swing.JPanel backGroundPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton card1;
    private javax.swing.JButton card10;
    private javax.swing.JButton card11;
    private javax.swing.JButton card12;
    private javax.swing.JButton card13;
    private javax.swing.JButton card14;
    private javax.swing.JButton card15;
    private javax.swing.JButton card16;
    private javax.swing.JButton card17;
    private javax.swing.JButton card18;
    private javax.swing.JButton card19;
    private javax.swing.JButton card2;
    private javax.swing.JButton card20;
    private javax.swing.JButton card3;
    private javax.swing.JButton card4;
    private javax.swing.JButton card5;
    private javax.swing.JButton card6;
    private javax.swing.JButton card7;
    private javax.swing.JButton card8;
    private javax.swing.JButton card9;
    private javax.swing.JButton clubsBtn;
    private javax.swing.JButton diamondsBtn;
    private javax.swing.JRadioButton fourBtn;
    private javax.swing.JButton heartsBtn;
    private javax.swing.JButton mainMenuBtn;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton okBtn;
    private javax.swing.JButton pile;
    private javax.swing.JLabel playersLabel;
    private javax.swing.JButton spadesBtn;
    private javax.swing.JPanel startMenu;
    private javax.swing.JLabel suitLabel;
    private javax.swing.JPanel suitPanel;
    private javax.swing.JTextField textField;
    private javax.swing.JRadioButton threeBtn;
    private javax.swing.JButton topCard;
    private javax.swing.JRadioButton twoBtn;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
