/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Display;

/**
 *
 * @author marco
 */
public class OperacoesJFrame extends javax.swing.JFrame {
    /**
     * Creates new form OperacoesJFrame
     */
    public OperacoesJFrame() {
        initComponents();
        this.erroAba1.setVisible(false);
        this.erroAba2.setVisible(false);
        this.erroAba3.setVisible(false);
        this.erroAba4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OperacoesjTabbedPane = new javax.swing.JTabbedPane();
        eq1GraujPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        coeficienteAngular = new javax.swing.JTextField();
        coeficienteLinear = new javax.swing.JTextField();
        submitFuncao1Grau = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        erroAba1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        eq1GraujPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        coeficienteA = new javax.swing.JTextField();
        coeficienteB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        coeficienteC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        erroAba2 = new javax.swing.JLabel();
        submitFuncao2Grau = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        eq1GraujPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        multiplicadorMSeno = new javax.swing.JTextField();
        submitFuncaoSeno = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        termoIndependenteSeno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        erroAba3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        eq1GraujPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        multiplicadorMCosseno = new javax.swing.JTextField();
        submitFuncaoCosseno = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        termoIndependenteCosseno = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        erroAba4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Coeficiente Angular");

        jLabel2.setText("Coeficiente Linear");

        coeficienteAngular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coeficienteAngularActionPerformed(evt);
            }
        });

        coeficienteLinear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coeficienteLinearActionPerformed(evt);
            }
        });

        submitFuncao1Grau.setText("Exibir gráfico");
        submitFuncao1Grau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitFuncao1GrauActionPerformed(evt);
            }
        });

        jLabel9.setText("y(x) = ax + b");

        erroAba1.setForeground(new java.awt.Color(255, 0, 0));
        erroAba1.setText("ERRO! Digite apenas números");

        javax.swing.GroupLayout eq1GraujPanel1Layout = new javax.swing.GroupLayout(eq1GraujPanel1);
        eq1GraujPanel1.setLayout(eq1GraujPanel1Layout);
        eq1GraujPanel1Layout.setHorizontalGroup(
            eq1GraujPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eq1GraujPanel1Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(erroAba1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eq1GraujPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(eq1GraujPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eq1GraujPanel1Layout.createSequentialGroup()
                        .addGroup(eq1GraujPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(eq1GraujPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(coeficienteAngular, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coeficienteLinear, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitFuncao1Grau))
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eq1GraujPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))))
        );
        eq1GraujPanel1Layout.setVerticalGroup(
            eq1GraujPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eq1GraujPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(erroAba1)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(eq1GraujPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coeficienteAngular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(eq1GraujPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(coeficienteLinear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitFuncao1Grau)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        OperacoesjTabbedPane.addTab("Funcao de 1º grau", eq1GraujPanel1);

        jLabel3.setText("Coeficiente Principal (a)");

        jLabel4.setText("Coeficiente Secundário (b)");

        coeficienteA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coeficienteAActionPerformed(evt);
            }
        });

        coeficienteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coeficienteBActionPerformed(evt);
            }
        });

        jLabel5.setText("Termo Independente (c)");

        coeficienteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coeficienteCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout eq1GraujPanel2Layout = new javax.swing.GroupLayout(eq1GraujPanel2);
        eq1GraujPanel2.setLayout(eq1GraujPanel2Layout);
        eq1GraujPanel2Layout.setHorizontalGroup(
            eq1GraujPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eq1GraujPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eq1GraujPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(eq1GraujPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(eq1GraujPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(eq1GraujPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(coeficienteA, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(coeficienteB)
                    .addComponent(coeficienteC))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        eq1GraujPanel2Layout.setVerticalGroup(
            eq1GraujPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eq1GraujPanel2Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(eq1GraujPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coeficienteA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(eq1GraujPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coeficienteB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(eq1GraujPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coeficienteC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(52, 52, 52))
        );

        jLabel10.setText("y(x) = ax + bx + c");

        erroAba2.setForeground(new java.awt.Color(255, 0, 0));
        erroAba2.setText("ERRO! Digite apenas números");

        submitFuncao2Grau.setText("Exibir gráfico");
        submitFuncao2Grau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitFuncao2GrauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitFuncao2Grau)
                .addGap(68, 68, 68))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(erroAba2)))
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(46, Short.MAX_VALUE)
                    .addComponent(eq1GraujPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(45, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(erroAba2)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(submitFuncao2Grau)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(33, Short.MAX_VALUE)
                    .addComponent(eq1GraujPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        OperacoesjTabbedPane.addTab("Funcao de 2º grau", jPanel2);

        jLabel6.setText("Multiplicador da função (m)");

        multiplicadorMSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicadorMSenoActionPerformed(evt);
            }
        });

        submitFuncaoSeno.setText("Exibir gráfico");
        submitFuncaoSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitFuncaoSenoActionPerformed(evt);
            }
        });

        jLabel8.setText("termo independente (b)");

        termoIndependenteSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termoIndependenteSenoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout eq1GraujPanel3Layout = new javax.swing.GroupLayout(eq1GraujPanel3);
        eq1GraujPanel3.setLayout(eq1GraujPanel3Layout);
        eq1GraujPanel3Layout.setHorizontalGroup(
            eq1GraujPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eq1GraujPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eq1GraujPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(submitFuncaoSeno)
                    .addGroup(eq1GraujPanel3Layout.createSequentialGroup()
                        .addGroup(eq1GraujPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(eq1GraujPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(multiplicadorMSeno, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(termoIndependenteSeno))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        eq1GraujPanel3Layout.setVerticalGroup(
            eq1GraujPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eq1GraujPanel3Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(eq1GraujPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(multiplicadorMSeno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(eq1GraujPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(termoIndependenteSeno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(submitFuncaoSeno)
                .addContainerGap())
        );

        jLabel11.setText("y(x) = m seno(tx) + b");

        erroAba3.setForeground(new java.awt.Color(255, 0, 0));
        erroAba3.setText("ERRO! Digite apenas números");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(240, 240, 240))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(erroAba3)
                        .addGap(189, 189, 189))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(73, Short.MAX_VALUE)
                    .addComponent(eq1GraujPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(erroAba3)
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addContainerGap(387, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eq1GraujPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(213, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        OperacoesjTabbedPane.addTab("Função Seno", jPanel1);

        jLabel7.setText("Multiplicador da função (m)");

        multiplicadorMCosseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicadorMCossenoActionPerformed(evt);
            }
        });

        submitFuncaoCosseno.setText("Exibir gráfico");
        submitFuncaoCosseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitFuncaoCossenoActionPerformed(evt);
            }
        });

        jLabel12.setText("termo independente (b)");

        termoIndependenteCosseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termoIndependenteCossenoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout eq1GraujPanel4Layout = new javax.swing.GroupLayout(eq1GraujPanel4);
        eq1GraujPanel4.setLayout(eq1GraujPanel4Layout);
        eq1GraujPanel4Layout.setHorizontalGroup(
            eq1GraujPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eq1GraujPanel4Layout.createSequentialGroup()
                .addGroup(eq1GraujPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(eq1GraujPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12)
                        .addGap(252, 252, 252))
                    .addGroup(eq1GraujPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(eq1GraujPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(termoIndependenteCosseno, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitFuncaoCosseno)
                            .addGroup(eq1GraujPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(multiplicadorMCosseno, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        eq1GraujPanel4Layout.setVerticalGroup(
            eq1GraujPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eq1GraujPanel4Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(eq1GraujPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiplicadorMCosseno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(eq1GraujPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(termoIndependenteCosseno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(submitFuncaoCosseno)
                .addContainerGap())
        );

        jLabel13.setText("y(x) = m cosseno(tx) + b");

        erroAba4.setForeground(new java.awt.Color(255, 0, 0));
        erroAba4.setText("ERRO! Digite apenas números");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(erroAba4)
                        .addGap(199, 199, 199))))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(73, Short.MAX_VALUE)
                    .addComponent(eq1GraujPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(erroAba4)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addContainerGap(387, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eq1GraujPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(213, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        OperacoesjTabbedPane.addTab("Cosseno", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(OperacoesjTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(OperacoesjTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coeficienteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coeficienteCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coeficienteCActionPerformed

    private void submitFuncao2GrauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitFuncao2GrauActionPerformed
        try{
            double coeficienteAAux = Double.parseDouble(this.coeficienteA.getText());
            double coeficienteBAux = Double.parseDouble(this.coeficienteB.getText());
            double coeficienteCAux = Double.parseDouble(this.coeficienteC.getText());

            Display display = new Display();
            display.setFuncao2grau(coeficienteAAux, coeficienteBAux, coeficienteCAux);
            display.showDisplay("Função do segundo grau");
        } catch( NumberFormatException e){
            this.erroAba2.setVisible(true);
        }
    }//GEN-LAST:event_submitFuncao2GrauActionPerformed

    private void coeficienteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coeficienteBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coeficienteBActionPerformed

    private void coeficienteAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coeficienteAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coeficienteAActionPerformed

    private void submitFuncao1GrauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitFuncao1GrauActionPerformed
        // TODO add your handling code here:
        try{
            double coeficienteAngularAux = Double.parseDouble(this.coeficienteAngular.getText());
            double coeficienteLinearAux = Double.parseDouble(this.coeficienteLinear.getText());

            Display display = new Display();
            display.setFuncao1grau(coeficienteAngularAux, coeficienteLinearAux);
            display.showDisplay("Função do primeiro grau");
        } catch( NumberFormatException e){
            this.erroAba1.setVisible(true);
        }
    }//GEN-LAST:event_submitFuncao1GrauActionPerformed

    private void coeficienteLinearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coeficienteLinearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coeficienteLinearActionPerformed

    private void coeficienteAngularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coeficienteAngularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coeficienteAngularActionPerformed

    private void multiplicadorMSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicadorMSenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_multiplicadorMSenoActionPerformed

    private void submitFuncaoSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitFuncaoSenoActionPerformed
        try{
            double multiplicadorMAux = Double.parseDouble(this.multiplicadorMSeno.getText());
            double termoIndependenteAux = Double.parseDouble(this.termoIndependenteSeno.getText());

            Display display = new Display();
            display.setSeno(multiplicadorMAux, termoIndependenteAux);
            display.showDisplay("Função seno");
        } catch( NumberFormatException e){
            this.erroAba3.setVisible(true);
        }
    }//GEN-LAST:event_submitFuncaoSenoActionPerformed

    private void termoIndependenteSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termoIndependenteSenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_termoIndependenteSenoActionPerformed

    private void multiplicadorMCossenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicadorMCossenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_multiplicadorMCossenoActionPerformed

    private void submitFuncaoCossenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitFuncaoCossenoActionPerformed
        try{
            double multiplicadorMAux = Double.parseDouble(this.multiplicadorMCosseno.getText());
            double termoIndependenteAux = Double.parseDouble(this.termoIndependenteCosseno.getText());

            Display display = new Display();
            display.setCosseno(multiplicadorMAux, termoIndependenteAux);
            display.showDisplay("Função cosseno");
        } catch( NumberFormatException e){
            this.erroAba4.setVisible(true);
        }
    }//GEN-LAST:event_submitFuncaoCossenoActionPerformed

    private void termoIndependenteCossenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termoIndependenteCossenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_termoIndependenteCossenoActionPerformed

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
            java.util.logging.Logger.getLogger(OperacoesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperacoesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperacoesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperacoesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperacoesJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane OperacoesjTabbedPane;
    private javax.swing.JTextField coeficienteA;
    private javax.swing.JTextField coeficienteAngular;
    private javax.swing.JTextField coeficienteB;
    private javax.swing.JTextField coeficienteC;
    private javax.swing.JTextField coeficienteLinear;
    private javax.swing.JPanel eq1GraujPanel1;
    private javax.swing.JPanel eq1GraujPanel2;
    private javax.swing.JPanel eq1GraujPanel3;
    private javax.swing.JPanel eq1GraujPanel4;
    private javax.swing.JLabel erroAba1;
    private javax.swing.JLabel erroAba2;
    private javax.swing.JLabel erroAba3;
    private javax.swing.JLabel erroAba4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField multiplicadorMCosseno;
    private javax.swing.JTextField multiplicadorMSeno;
    private javax.swing.JButton submitFuncao1Grau;
    private javax.swing.JButton submitFuncao2Grau;
    private javax.swing.JButton submitFuncaoCosseno;
    private javax.swing.JButton submitFuncaoSeno;
    private javax.swing.JTextField termoIndependenteCosseno;
    private javax.swing.JTextField termoIndependenteSeno;
    // End of variables declaration//GEN-END:variables
}
