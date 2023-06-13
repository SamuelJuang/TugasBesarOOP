/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import swing.*;
import exception.*;
import javax.swing.JOptionPane;
import model.Pengguna;
import model.User;
import control.*;
import model.Staff;

/**
 *
 * @author AG SETO GALIH D
 */
public class LoginRegisterView extends javax.swing.JFrame {

    /** Creates new form LoginRegisterView */
    private CardLayout cardLayout;
    private static ColorPallete cp = new ColorPallete();
    private static final String emptyString = "";
    
    private UserControl uc;
    private PenggunaControl pc;
    private StaffControl sc;
    
    public static Staff sLogin, tempStaff;
    public static Pengguna pLogin, tempPengguna;

    public LoginRegisterView() {
        
        uc = new UserControl();
        pc = new PenggunaControl();
        sc = new StaffControl();
        
        initComponents();

        illustrationLogin.setIcon(new FlatSVGIcon("img/illustration/Pharmacist.svg", 0.6f));
        illustrationRegister.setIcon(new FlatSVGIcon("img/illustration/Pharmacist.svg", 0.6f));

        setBackground(new Color(0, 0, 0, 0));

        sudahPunyaAkun.setForeground(new Color(150, 150, 150));
        loginHere.setCursor(new Cursor(Cursor.HAND_CURSOR));
        belumPunyaAkun.setForeground(new Color(150, 150, 150));
        registerHere.setCursor(new Cursor(Cursor.HAND_CURSOR));

        showPassLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (showPassLogin.isSelected()) {
                    //untuk show password
                    inputPasswordLogin.setEchoChar((char) 0);
                    // do something if check box is selected
                } else {
                    //untuk hide password, set dengan character asterisk bulat bulat
                    inputPasswordLogin.setEchoChar((char) 8226);
                    // check box is unselected, do something else
                }
            }
        });
        showPassRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (showPassRegister.isSelected()) {
                    inputPasswordRegister.setEchoChar((char) 0);
                    // do something if check box is selected
                } else {
                    inputPasswordRegister.setEchoChar((char) 8226);
                    // check box is unselected, do something else
                }
            }
        });

        cardLayout = (CardLayout) cardLayoutPanel.getLayout();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardLayoutPanel = new javax.swing.JPanel();
        baseLoginPanel = new panel.LoginRegisterBasePanel();
        leftLoginPanel = new javax.swing.JPanel();
        loginTitle = new javax.swing.JLabel();
        registerHere = new javax.swing.JLabel();
        belumPunyaAkun = new javax.swing.JLabel();
        loginBtn = new swing.component.Button();
        textFieldLoginPanel = new javax.swing.JPanel();
        inputUsernameLogin = new swing.component.TextField();
        inputPasswordLogin = new swing.component.PasswordField();
        showPassLogin = new javax.swing.JCheckBox();
        rightLoginPanel = new swing.GradientPanelRight();
        illustrationLogin = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        slogan = new javax.swing.JLabel();
        btnCloseLogin = new swing.component.ButtonOutLine();
        baseRegisterPanel = new panel.LoginRegisterBasePanel();
        leftRegisterPanel = new javax.swing.JPanel();
        registerTitle = new javax.swing.JLabel();
        loginHere = new javax.swing.JLabel();
        sudahPunyaAkun = new javax.swing.JLabel();
        registerBtn = new swing.component.Button();
        textFieldRegisterPanel = new javax.swing.JPanel();
        showPassRegister = new javax.swing.JCheckBox();
        inputUsernameRegister = new swing.component.TextField();
        inputNamaRegister = new swing.component.TextField();
        inputNoTelpRegister = new swing.component.TextField();
        inputAlamatRegister = new swing.component.TextField();
        inputPasswordRegister = new swing.component.PasswordField();
        rightRegisterPanel = new swing.GradientPanelRight();
        illustrationRegister = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        slogan1 = new javax.swing.JLabel();
        btnCloseRegister = new swing.component.ButtonOutLine();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        cardLayoutPanel.setOpaque(false);
        cardLayoutPanel.setLayout(new java.awt.CardLayout());

        leftLoginPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftLoginPanel.setOpaque(false);

        loginTitle.setBackground(new java.awt.Color(0, 0, 0));
        loginTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        loginTitle.setForeground(new java.awt.Color(0, 153, 0));
        loginTitle.setText("Login");

        registerHere.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registerHere.setForeground(new java.awt.Color(0, 153, 0));
        registerHere.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerHere.setText("Register");
        registerHere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerHereMouseClicked(evt);
            }
        });

        belumPunyaAkun.setForeground(new java.awt.Color(102, 102, 102));
        belumPunyaAkun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        belumPunyaAkun.setText("Belum punya akun?");

        loginBtn.setText("Login");
        loginBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        textFieldLoginPanel.setOpaque(false);
        textFieldLoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputUsernameLogin.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        inputUsernameLogin.setLabelText("Username");
        textFieldLoginPanel.add(inputUsernameLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 290, -1));

        inputPasswordLogin.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        inputPasswordLogin.setLabelText("Password");
        textFieldLoginPanel.add(inputPasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 290, -1));

        showPassLogin.setForeground(cp.getColor(1)
        );
        showPassLogin.setText("Show Password");
        showPassLogin.setBorder(null);
        showPassLogin.setContentAreaFilled(false);
        showPassLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showPassLogin.setFocusPainted(false);
        showPassLogin.setFocusable(false);
        showPassLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textFieldLoginPanel.add(showPassLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        javax.swing.GroupLayout leftLoginPanelLayout = new javax.swing.GroupLayout(leftLoginPanel);
        leftLoginPanel.setLayout(leftLoginPanelLayout);
        leftLoginPanelLayout.setHorizontalGroup(
            leftLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLoginPanelLayout.createSequentialGroup()
                .addGroup(leftLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftLoginPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(leftLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(leftLoginPanelLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(belumPunyaAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(registerHere, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        leftLoginPanelLayout.setVerticalGroup(
            leftLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLoginPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(textFieldLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(leftLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(belumPunyaAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerHere, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        illustrationLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        title.setFont(new java.awt.Font("Segoe UI", 1, 29)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Apotek Tumbuh Bersama");

        slogan.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        slogan.setForeground(new java.awt.Color(255, 255, 255));
        slogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slogan.setText("Pelopor Utama Sehat Jiwa Raga");

        btnCloseLogin.setText("X");
        btnCloseLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightLoginPanelLayout = new javax.swing.GroupLayout(rightLoginPanel);
        rightLoginPanel.setLayout(rightLoginPanelLayout);
        rightLoginPanelLayout.setHorizontalGroup(
            rightLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLoginPanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(rightLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(slogan, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(illustrationLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightLoginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCloseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        rightLoginPanelLayout.setVerticalGroup(
            rightLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLoginPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCloseLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(slogan)
                .addGap(48, 48, 48)
                .addComponent(illustrationLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout baseLoginPanelLayout = new javax.swing.GroupLayout(baseLoginPanel);
        baseLoginPanel.setLayout(baseLoginPanelLayout);
        baseLoginPanelLayout.setHorizontalGroup(
            baseLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseLoginPanelLayout.createSequentialGroup()
                .addComponent(leftLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        baseLoginPanelLayout.setVerticalGroup(
            baseLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cardLayoutPanel.add(baseLoginPanel, "layoutLogin");

        leftRegisterPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftRegisterPanel.setOpaque(false);

        registerTitle.setBackground(new java.awt.Color(0, 0, 0));
        registerTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        registerTitle.setForeground(new java.awt.Color(0, 153, 0));
        registerTitle.setText("Register");

        loginHere.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginHere.setForeground(new java.awt.Color(0, 153, 0));
        loginHere.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginHere.setText("Login");
        loginHere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginHereMouseClicked(evt);
            }
        });

        sudahPunyaAkun.setForeground(new java.awt.Color(102, 102, 102));
        sudahPunyaAkun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sudahPunyaAkun.setText("Sudah punya akun?");

        registerBtn.setText("Register");
        registerBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        textFieldRegisterPanel.setOpaque(false);
        textFieldRegisterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showPassRegister.setForeground(cp.getColor(1)
        );
        showPassRegister.setText("Show Password");
        showPassRegister.setBorder(null);
        showPassRegister.setContentAreaFilled(false);
        showPassRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showPassRegister.setFocusPainted(false);
        showPassRegister.setFocusable(false);
        showPassRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textFieldRegisterPanel.add(showPassRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        inputUsernameRegister.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        inputUsernameRegister.setLabelText("Username");
        textFieldRegisterPanel.add(inputUsernameRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 290, -1));

        inputNamaRegister.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        inputNamaRegister.setLabelText("Nama Lengkap");
        textFieldRegisterPanel.add(inputNamaRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 290, -1));

        inputNoTelpRegister.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        inputNoTelpRegister.setLabelText("Nomor Telepon");
        textFieldRegisterPanel.add(inputNoTelpRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 290, -1));

        inputAlamatRegister.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        inputAlamatRegister.setLabelText("Alamat");
        textFieldRegisterPanel.add(inputAlamatRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 290, -1));

        inputPasswordRegister.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        inputPasswordRegister.setLabelText("Password");
        textFieldRegisterPanel.add(inputPasswordRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 290, -1));

        javax.swing.GroupLayout leftRegisterPanelLayout = new javax.swing.GroupLayout(leftRegisterPanel);
        leftRegisterPanel.setLayout(leftRegisterPanelLayout);
        leftRegisterPanelLayout.setHorizontalGroup(
            leftRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftRegisterPanelLayout.createSequentialGroup()
                .addGroup(leftRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftRegisterPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(leftRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(leftRegisterPanelLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(sudahPunyaAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(loginHere, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        leftRegisterPanelLayout.setVerticalGroup(
            leftRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftRegisterPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(registerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(textFieldRegisterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(leftRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sudahPunyaAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginHere, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        illustrationRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        title1.setFont(new java.awt.Font("Segoe UI", 1, 29)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Apotek Tumbuh Bersama");

        slogan1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        slogan1.setForeground(new java.awt.Color(255, 255, 255));
        slogan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slogan1.setText("Pelopor Utama Sehat Jiwa Raga");

        btnCloseRegister.setText("X");
        btnCloseRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightRegisterPanelLayout = new javax.swing.GroupLayout(rightRegisterPanel);
        rightRegisterPanel.setLayout(rightRegisterPanelLayout);
        rightRegisterPanelLayout.setHorizontalGroup(
            rightRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightRegisterPanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(rightRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(slogan1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(illustrationRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightRegisterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCloseRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        rightRegisterPanelLayout.setVerticalGroup(
            rightRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightRegisterPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCloseRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(slogan1)
                .addGap(48, 48, 48)
                .addComponent(illustrationRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout baseRegisterPanelLayout = new javax.swing.GroupLayout(baseRegisterPanel);
        baseRegisterPanel.setLayout(baseRegisterPanelLayout);
        baseRegisterPanelLayout.setHorizontalGroup(
            baseRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseRegisterPanelLayout.createSequentialGroup()
                .addComponent(leftRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightRegisterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        baseRegisterPanelLayout.setVerticalGroup(
            baseRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftRegisterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightRegisterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cardLayoutPanel.add(baseRegisterPanel, "layoutRegister");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cardLayoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cardLayoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearLoginComponents() {
        inputUsernameLogin.setText(emptyString);
        inputPasswordLogin.setText(emptyString);
        showPassLogin.setSelected(false);
    }

    private void clearRegisterComponents() {
        inputUsernameRegister.setText(emptyString);
        inputNamaRegister.setText(emptyString);
        inputNoTelpRegister.setText(emptyString);
        inputAlamatRegister.setText(emptyString);
        inputPasswordRegister.setText(emptyString);
        showPassRegister.setSelected(false);
    }
    
    public void usernameLoginKosongException() throws UsernameKosongException{
        if(inputUsernameLogin.getText().isEmpty()){
            throw new UsernameKosongException();
        }
    }
    
    public void passwordLoginKosongException() throws PasswordKosongException{
        if(inputPasswordLogin.getPassword().length == 0){
            throw new PasswordKosongException();
        }
    }
    
    public void usernameRegisterKosongException() throws UsernameKosongException{
        if(inputUsernameRegister.getText().isEmpty()){
            throw new UsernameKosongException();
        }
    }
    
    public void passwordRegisterKosongException() throws PasswordKosongException{
        if(inputPasswordRegister.getPassword().length == 0){
            throw new PasswordKosongException();
        }
    }
    
    public void uniqueException() throws UniqueException{
       for(int i=0; i<uc.countDataUser(); i++){
           if(uc.uniqueUser(inputNamaRegister.getText()) == true){
               throw new UniqueException();
           }
       }
    }

    private void registerHereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerHereMouseClicked
        // TODO add your handling code here:
        clearLoginComponents();
        cardLayout.show(cardLayoutPanel, "layoutRegister");
    }//GEN-LAST:event_registerHereMouseClicked

    private void loginHereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginHereMouseClicked
        // TODO add your handling code here:
        clearRegisterComponents();
        cardLayout.show(cardLayoutPanel, "layoutLogin");
    }//GEN-LAST:event_loginHereMouseClicked

    private void btnCloseLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseLoginActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseLoginActionPerformed

    private void btnCloseRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseRegisterActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseRegisterActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        try{
//           usernameLoginKosongException();
//           passwordLoginKosongException();
            
            //Async process agar animasi tidak lag saat ditekan sembari menunggu memproses query
            Thread newThread = new Thread(() -> {
                if(inputUsernameLogin.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Username tidak boleh kosong!");
                }else if(inputPasswordLogin.getPassword().length == 0){
                    JOptionPane.showMessageDialog(null, "Password tidak boleh kosong!");
                }else{
                    String temp = String.valueOf(inputPasswordLogin.getPassword());
                    String temp2 = inputUsernameLogin.getText();
                    int index = uc.checkLoginUser(temp2, temp);
                    int indexStaff = sc.findStaff(index);
                    
                    System.out.println(index);
                    if(inputUsernameLogin.getText().equals("master") && temp.equals("master")){
                        JOptionPane.showMessageDialog(null, "Login as Master!");
                        SuperAdminView sav = new SuperAdminView();
                        this.dispose();
                        sav.setVisible(true);
                    }else if(indexStaff != -1){
                        tempStaff = sc.returnStaff(indexStaff);
                        sLogin = new Staff(tempStaff.getNIP(), tempStaff.getNama(), null, tempStaff.getNoTelp(), tempStaff.getAlamat(), tempStaff.getRole(), tempStaff.getUser());
                        System.out.println(sLogin.getRole().getIdRole());
                        switch (sLogin.getRole().getIdRole()) {
                            case 4:
                                JOptionPane.showMessageDialog(null, "Login as " + sc.returnName(index) + " - Kepala Gudang");
                                KepalaGudangView kgv = new KepalaGudangView(sLogin);
                                this.dispose();
                                kgv.setVisible(true);
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "Login as " + sc.returnName(index) + " - Apoteker");
                                ApotekerView av = new ApotekerView(sLogin);
                                this.dispose();
                                av.setVisible(true);
                                break;
                            case 6:
                                JOptionPane.showMessageDialog(null, "Login as " + sc.returnName(index) + " - Kasir");
                                KasirView kv = new KasirView(sLogin);
                                this.dispose();
                                kv.setVisible(true);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Error");
                                break;
                        }
                    }else if(index != -1){
                        System.out.println(index);
                        JOptionPane.showMessageDialog(null, "Login as " + pc.returnNamePengguna(index));
                        String pw = String.valueOf(inputPasswordLogin.getPassword());
                        User uLogin = new User(index, inputUsernameLogin.getText(), pw);
                        System.out.println(uLogin.getUsername());
                        tempPengguna = pc.findPengguna(uLogin.getIdUser(), uLogin);
                        pLogin = new Pengguna(tempPengguna.getIdPengguna(), tempPengguna.getNama(), tempPengguna.getNoTelp(), tempPengguna.getAlamat(), uLogin);
                        System.out.println(pLogin.getNama());
                        System.out.println(pLogin.getNoTelp());
                        PenggunaView pv = new PenggunaView(pLogin);
                        this.dispose();
                        pv.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "User tidak ditemukan!");   
                    }
                }
            });
            //Async
            newThread.start();     
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        try{
//            usernameRegisterKosongException();
//            passwordRegisterKosongException();
            //Async process agar animasi tidak lag saat ditekan sembari menunggu memproses query
            Thread newThread = new Thread(() -> {
                if(inputUsernameRegister.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Username tidak boleh kosong!");
                }else if(uc.uniqueUser(inputUsernameRegister.getText()) == false){
                    JOptionPane.showMessageDialog(null, "Username telah digunakan!");
                }else if(inputNamaRegister.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong!");
                }else if(inputNoTelpRegister.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nomor telepon tidak boleh kosong!");
                }else if(inputAlamatRegister.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Alamat tidak boleh kosong!");
                }else if(inputPasswordRegister.getPassword().length == 0){
                    JOptionPane.showMessageDialog(null, "Password tidak boleh kosong!");
                }else{
                    String pw = String.valueOf(inputPasswordRegister.getPassword());
                    User u = new User(-1, inputUsernameRegister.getText(), pw);
                    uc.insertDataUser(u);
                    Pengguna p = new Pengguna(0, inputNamaRegister.getText(), inputNoTelpRegister.getText(), inputAlamatRegister.getText(), u);
                    pc.insertPengguna(p);

                    JOptionPane.showMessageDialog(null, "Berhasil Mendaftarkan " + p.getNama());
                    clearRegisterComponents();
                    cardLayout.show(cardLayoutPanel, "layoutLogin");
                }
            });
            //Async
            newThread.start();
                
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginRegisterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private panel.LoginRegisterBasePanel baseLoginPanel;
    private panel.LoginRegisterBasePanel baseRegisterPanel;
    private javax.swing.JLabel belumPunyaAkun;
    private swing.component.ButtonOutLine btnCloseLogin;
    private swing.component.ButtonOutLine btnCloseRegister;
    private javax.swing.JPanel cardLayoutPanel;
    private javax.swing.JLabel illustrationLogin;
    private javax.swing.JLabel illustrationRegister;
    private swing.component.TextField inputAlamatRegister;
    private swing.component.TextField inputNamaRegister;
    private swing.component.TextField inputNoTelpRegister;
    private swing.component.PasswordField inputPasswordLogin;
    private swing.component.PasswordField inputPasswordRegister;
    private swing.component.TextField inputUsernameLogin;
    private swing.component.TextField inputUsernameRegister;
    private javax.swing.JPanel leftLoginPanel;
    private javax.swing.JPanel leftRegisterPanel;
    private swing.component.Button loginBtn;
    private javax.swing.JLabel loginHere;
    private javax.swing.JLabel loginTitle;
    private swing.component.Button registerBtn;
    private javax.swing.JLabel registerHere;
    private javax.swing.JLabel registerTitle;
    private swing.GradientPanelRight rightLoginPanel;
    private swing.GradientPanelRight rightRegisterPanel;
    private javax.swing.JCheckBox showPassLogin;
    private javax.swing.JCheckBox showPassRegister;
    private javax.swing.JLabel slogan;
    private javax.swing.JLabel slogan1;
    private javax.swing.JLabel sudahPunyaAkun;
    private javax.swing.JPanel textFieldLoginPanel;
    private javax.swing.JPanel textFieldRegisterPanel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
