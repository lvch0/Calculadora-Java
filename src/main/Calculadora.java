package main;

import java.awt.Color;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Calculadora extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");

    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JLabel();
        txtOperacion = new javax.swing.JLabel();
        btnOscu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnIgual = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnExpo = new javax.swing.JButton();
        btnPorcen = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnDivi = new javax.swing.JButton();
        btnNuev = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnCinc = new javax.swing.JButton();
        btnOch = new javax.swing.JButton();
        btnSiet = new javax.swing.JButton();
        btnCuat = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(240, 252, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(81, 93, 93));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 72, 328, 50));

        txtOperacion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(81, 93, 93));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 320, 34));

        btnOscu.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btnOn.jpg")); // NOI18N
        btnOscu.setBorderPainted(false);
        btnOscu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOscuActionPerformed(evt);
            }
        });
        jPanel1.add(btnOscu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIgual.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(81, 93, 93));
        btnIgual.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn2.jpg")); // NOI18N
        btnIgual.setText("=");
        btnIgual.setBorderPainted(false);
        btnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIgual.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn2.jpg")); // NOI18N
        btnIgual.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel2.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 296, 50, 50));

        btnC1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnC1.setForeground(new java.awt.Color(81, 93, 93));
        btnC1.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1.png.jpg")); // NOI18N
        btnC1.setText("C");
        btnC1.setBorderPainted(false);
        btnC1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnC1.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1.png.jpg")); // NOI18N
        btnC1.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 16, 50, 50));

        btnExpo.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        btnExpo.setForeground(new java.awt.Color(81, 93, 93));
        btnExpo.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1.png.jpg")); // NOI18N
        btnExpo.setText("CE");
        btnExpo.setBorderPainted(false);
        btnExpo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExpo.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1.png.jpg")); // NOI18N
        btnExpo.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnExpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpoActionPerformed(evt);
            }
        });
        jPanel2.add(btnExpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 16, 50, 50));

        btnPorcen.setFont(new java.awt.Font("Verdana", 0, 19)); // NOI18N
        btnPorcen.setForeground(new java.awt.Color(81, 93, 93));
        btnPorcen.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1.png.jpg")); // NOI18N
        btnPorcen.setText("%");
        btnPorcen.setBorderPainted(false);
        btnPorcen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPorcen.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1.png.jpg")); // NOI18N
        btnPorcen.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnPorcen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcenActionPerformed(evt);
            }
        });
        jPanel2.add(btnPorcen, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 16, 50, 50));

        btnDot.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnDot.setForeground(new java.awt.Color(81, 93, 93));
        btnDot.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnDot.setText(".");
        btnDot.setBorderPainted(false);
        btnDot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDot.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnDot.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });
        jPanel2.add(btnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 296, 50, 50));

        btnMulti.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnMulti.setForeground(new java.awt.Color(81, 93, 93));
        btnMulti.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1.png.jpg")); // NOI18N
        btnMulti.setText("x");
        btnMulti.setBorderPainted(false);
        btnMulti.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMulti.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1.png.jpg")); // NOI18N
        btnMulti.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });
        jPanel2.add(btnMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 86, 50, 50));

        btnResta.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnResta.setForeground(new java.awt.Color(81, 93, 93));
        btnResta.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1.png.jpg")); // NOI18N
        btnResta.setText("-");
        btnResta.setBorderPainted(false);
        btnResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResta.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1.png.jpg")); // NOI18N
        btnResta.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel2.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 156, 50, 50));

        btnSuma.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(81, 93, 93));
        btnSuma.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1.png.jpg")); // NOI18N
        btnSuma.setText("+");
        btnSuma.setBorderPainted(false);
        btnSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuma.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1.png.jpg")); // NOI18N
        btnSuma.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 226, 50, 50));

        btnDivi.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnDivi.setForeground(new java.awt.Color(81, 93, 93));
        btnDivi.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1.png.jpg")); // NOI18N
        btnDivi.setText("/");
        btnDivi.setBorderPainted(false);
        btnDivi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDivi.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1.png.jpg")); // NOI18N
        btnDivi.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnDivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiviActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivi, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 16, 50, 50));

        btnNuev.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnNuev.setForeground(new java.awt.Color(81, 93, 93));
        btnNuev.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnNuev.setText("9");
        btnNuev.setBorderPainted(false);
        btnNuev.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuev.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnNuev.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnNuev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuev, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 86, 50, 50));

        btnSeis.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnSeis.setForeground(new java.awt.Color(81, 93, 93));
        btnSeis.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnSeis.setText("6");
        btnSeis.setBorderPainted(false);
        btnSeis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeis.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnSeis.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 156, 50, 50));

        btnTres.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnTres.setForeground(new java.awt.Color(81, 93, 93));
        btnTres.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnTres.setText("3");
        btnTres.setBorderPainted(false);
        btnTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTres.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnTres.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        jPanel2.add(btnTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 226, 50, 50));

        btnDos.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnDos.setForeground(new java.awt.Color(81, 93, 93));
        btnDos.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnDos.setText("2");
        btnDos.setBorderPainted(false);
        btnDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDos.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnDos.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        jPanel2.add(btnDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 226, 50, 50));

        btnCinc.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnCinc.setForeground(new java.awt.Color(81, 93, 93));
        btnCinc.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnCinc.setText("5");
        btnCinc.setBorderPainted(false);
        btnCinc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCinc.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnCinc.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnCinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincActionPerformed(evt);
            }
        });
        jPanel2.add(btnCinc, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 156, 50, 50));

        btnOch.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnOch.setForeground(new java.awt.Color(81, 93, 93));
        btnOch.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnOch.setText("8");
        btnOch.setBorderPainted(false);
        btnOch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOch.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnOch.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnOch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchActionPerformed(evt);
            }
        });
        jPanel2.add(btnOch, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 86, 50, 50));

        btnSiet.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnSiet.setForeground(new java.awt.Color(81, 93, 93));
        btnSiet.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnSiet.setText("7");
        btnSiet.setBorderPainted(false);
        btnSiet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSiet.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnSiet.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnSiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSietActionPerformed(evt);
            }
        });
        jPanel2.add(btnSiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 86, 50, 50));

        btnCuat.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnCuat.setForeground(new java.awt.Color(81, 93, 93));
        btnCuat.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnCuat.setText("4");
        btnCuat.setBorderPainted(false);
        btnCuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCuat.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnCuat.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnCuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatActionPerformed(evt);
            }
        });
        jPanel2.add(btnCuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 156, 50, 50));

        btnUno.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnUno.setForeground(new java.awt.Color(81, 93, 93));
        btnUno.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnUno.setText("1");
        btnUno.setBorderPainted(false);
        btnUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUno.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnUno.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        jPanel2.add(btnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 226, 50, 50));

        btnCero.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnCero.setForeground(new java.awt.Color(81, 93, 93));
        btnCero.setIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnCero.setText("0");
        btnCero.setBorderPainted(false);
        btnCero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCero.setPressedIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn3.jpg")); // NOI18N
        btnCero.setRolloverIcon(new javax.swing.ImageIcon("C:\\Calculadora\\Calculadora\\Img\\btn1 presion.jpg")); // NOI18N
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });
        jPanel2.add(btnCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 296, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 340, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSietActionPerformed
        addNumber("7");
        btnIgual.doClick();
    }//GEN-LAST:event_btnSietActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        addNumber("2");
        btnIgual.doClick();
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiviActionPerformed
        addNumber("/");
    }//GEN-LAST:event_btnDiviActionPerformed

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnExpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpoActionPerformed
        String texto = txtOperacion.getText().substring(0, txtOperacion.getText().length() - 1);
        txtOperacion.setText(texto);
        btnIgual.doClick();
    }//GEN-LAST:event_btnExpoActionPerformed

    private void btnPorcenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcenActionPerformed
        addNumber("%");
    }//GEN-LAST:event_btnPorcenActionPerformed

    private void btnOchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchActionPerformed
        addNumber("8");
        btnIgual.doClick();
    }//GEN-LAST:event_btnOchActionPerformed

    private void btnNuevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevActionPerformed
        addNumber("9");
        btnIgual.doClick();
    }//GEN-LAST:event_btnNuevActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        addNumber("6");
        btnIgual.doClick();
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnCincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincActionPerformed
        addNumber("5");
        btnIgual.doClick();
    }//GEN-LAST:event_btnCincActionPerformed

    private void btnCuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatActionPerformed
        addNumber("4");
        btnIgual.doClick();
    }//GEN-LAST:event_btnCuatActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        addNumber("3");
        btnIgual.doClick();
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        addNumber("1");
        btnIgual.doClick();
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        addNumber("0");
        btnIgual.doClick();
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        addNumber(".");
        btnIgual.doClick();
    }//GEN-LAST:event_btnDotActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        addNumber("*");
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        addNumber("-");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        addNumber("+");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        try {
            String resultado = se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnIgualActionPerformed

    boolean modoOscuro = false;

    private void btnOscuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOscuActionPerformed
        if (!modoOscuro) {
            jPanel1.setBackground(Color.decode("#122641"));
            jPanel2.setBackground(Color.decode("#213651"));
            txtOperacion.setForeground(Color.decode("#258d8e"));
            txtResultado.setForeground(Color.decode("#258d8e"));

            cambiarColorBtn1(btnC1);
            cambiarColorBtn1(btnExpo);
            cambiarColorBtn1(btnPorcen);
            cambiarColorBtn1(btnDivi);
            cambiarColorBtn1(btnMulti);
            cambiarColorBtn1(btnResta);
            cambiarColorBtn1(btnSuma);

            cambiarColorBtn2(btnCero);
            cambiarColorBtn2(btnUno);
            cambiarColorBtn2(btnDos);
            cambiarColorBtn2(btnTres);
            cambiarColorBtn2(btnCuat);
            cambiarColorBtn2(btnCinc);
            cambiarColorBtn2(btnSeis);
            cambiarColorBtn2(btnSiet);
            cambiarColorBtn2(btnOch);
            cambiarColorBtn2(btnNuev);
            cambiarColorBtn2(btnDot);

            btnOscu.setIcon(new ImageIcon("C:/Calculadora/Calculadora/Img/btnOff.jpg"));
            btnIgual.setIcon(new ImageIcon("C:/Calculadora/Calculadora/Img/btn2Dark.jpg"));
            btnIgual.setPressedIcon(new ImageIcon("C:/Calculadora/Calculadora/Img/btn2Dark.jpg"));
            btnIgual.setRolloverIcon(new ImageIcon("C:/Calculadora/Calculadora/Img/btn1Presion.jpg"));
            btnIgual.setForeground(Color.decode("#213651"));

            modoOscuro = true;
        } else {
            Calculadora frame = new Calculadora();
            this.dispose();
            frame.setVisible(true);
        }
    }//GEN-LAST:event_btnOscuActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    public void cambiarColorBtn1(JButton btn) {
        btn.setIcon(new ImageIcon("C:/Calculadora/Calculadora/Img/btn1Dark.jpg"));
        btn.setPressedIcon(new ImageIcon("C:/Calculadora/Calculadora/Img/btn1Dark.jpg"));
        btn.setRolloverIcon(new ImageIcon("C:/Calculadora/Calculadora/Img/btn1Presion.jpg"));
        btn.setForeground(Color.decode("#08998c"));
    }

    public void cambiarColorBtn2(JButton btn) {
        btn.setIcon(new ImageIcon("C:/Calculadora/Calculadora/Img/btn3Dark.jpg"));
        btn.setPressedIcon(new ImageIcon("C:/Calculadora/Calculadora/Img/btn3Dark.jpg"));
        btn.setRolloverIcon(new ImageIcon("C:/Calculadora/Calculadora/Img/btn1Presion.jpg"));
        btn.setForeground(Color.decode("#73879f"));
    }

    public void addNumber(String digito) {
        txtOperacion.setText(txtOperacion.getText() + digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinc;
    private javax.swing.JButton btnCuat;
    private javax.swing.JButton btnDivi;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnExpo;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnNuev;
    private javax.swing.JButton btnOch;
    private javax.swing.JButton btnOscu;
    private javax.swing.JButton btnPorcen;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiet;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
