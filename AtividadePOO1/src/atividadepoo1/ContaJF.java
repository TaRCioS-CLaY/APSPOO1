/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadepoo1;

/**
 *
 * @author darks
 */
public class ContaJF extends javax.swing.JFrame{
    Conta cConta = new ContaCorrente();// instancia uma conta corrente
    Conta pConta = new ContaPoupanca(); // instancia uma conta poupança
    
    /**
     * Creates new form ContaJF
     */
    public ContaJF() {
        initComponents();
        valorBX.setEditable(false); // não deixa o usuário alterar o valor 
        valorBX.setText(""); // a caixa de valor fica em branco
        percentBX.setEditable(false); // não deixa o usuário mudar o valor da porcentagem
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        corrLBL = new javax.swing.JLabel();
        correnteLBL = new javax.swing.JLabel();
        valorBX = new javax.swing.JTextField();
        sacarBTN = new javax.swing.JButton();
        verificarBTN = new javax.swing.JButton();
        depositarBTN = new javax.swing.JButton();
        novoBTN = new javax.swing.JButton();
        cCorrenteBTN = new javax.swing.JRadioButton();
        modificadorLBL = new javax.swing.JLabel();
        cPoupancaBTN = new javax.swing.JRadioButton();
        modificadorPer = new javax.swing.JToggleButton();
        testeLBL = new javax.swing.JLabel();
        percentBX = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        poupancaLBL = new javax.swing.JLabel();
        pouLBL = new javax.swing.JLabel();
        totalLBL = new javax.swing.JLabel();
        toLBL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        corrLBL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        corrLBL.setText("Corrente:");

        correnteLBL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        valorBX.setText("0");
        valorBX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorBXActionPerformed(evt);
            }
        });

        sacarBTN.setText("Sacar");
        sacarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacarBTNActionPerformed(evt);
            }
        });

        verificarBTN.setText("Verificar Saldo");
        verificarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarBTNActionPerformed(evt);
            }
        });

        depositarBTN.setText("Depositar");
        depositarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositarBTNActionPerformed(evt);
            }
        });

        novoBTN.setText("Recomeçar");
        novoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoBTNActionPerformed(evt);
            }
        });

        buttonGroup1.add(cCorrenteBTN);
        cCorrenteBTN.setText("Conta Corrente");
        cCorrenteBTN.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cCorrenteBTNItemStateChanged(evt);
            }
        });
        cCorrenteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCorrenteBTNActionPerformed(evt);
            }
        });

        modificadorLBL.setText("Sem Percentual");

        buttonGroup1.add(cPoupancaBTN);
        cPoupancaBTN.setText("Conta Poupança");
        cPoupancaBTN.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cPoupancaBTNItemStateChanged(evt);
            }
        });

        modificadorPer.setText("Taxa de Percentual");
        modificadorPer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                modificadorPerItemStateChanged(evt);
            }
        });

        percentBX.setText("0");

        jLabel2.setText("R$");

        jLabel3.setText("%");

        jLabel4.setText("Escolha o tipo:");

        poupancaLBL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        pouLBL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pouLBL.setText("Poupança:");

        totalLBL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        toLBL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toLBL.setText("Total:");

        jLabel1.setText("Selecionado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cPoupancaBTN)
                    .addComponent(cCorrenteBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(novoBTN)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(corrLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(correnteLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pouLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(poupancaLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(toLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(modificadorLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(percentBX, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(modificadorPer)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorBX, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(testeLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(depositarBTN)
                                .addGap(18, 18, 18)
                                .addComponent(sacarBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(verificarBTN)))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novoBTN)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cCorrenteBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cPoupancaBTN)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(testeLBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valorBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositarBTN)
                    .addComponent(sacarBTN)
                    .addComponent(verificarBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificadorPer)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificadorLBL)
                    .addComponent(percentBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corrLBL)
                    .addComponent(correnteLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pouLBL)
                    .addComponent(poupancaLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(toLBL)
                    .addComponent(totalLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorBXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorBXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorBXActionPerformed

    private void cCorrenteBTNItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cCorrenteBTNItemStateChanged
        if ( cCorrenteBTN.isSelected()){// testa se o botao da conta corrente ta selecionado
            testeLBL.setText("Corrente");// se estiver ele escreve "Corrente" como o tipo da conta
            valorBX.setEditable(true); // e deixa o usuário escrever o valor
        }
    }//GEN-LAST:event_cCorrenteBTNItemStateChanged

    private void cCorrenteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCorrenteBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCorrenteBTNActionPerformed

    private void depositarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositarBTNActionPerformed
     if ( cCorrenteBTN.isSelected()){// testa se o botao da conta corrente ta selecionado 
            if ( modificadorPer.isSelected()){// testa se o modificador de porcentagem ta ativo
               cConta.depositar(Double.parseDouble(valorBX.getText()));// se estiver ele faz o deposito
               cConta.atualiza(Double.parseDouble(percentBX.getText())); // e atualiza o valor
            }else{
               cConta.depositar(Double.parseDouble(valorBX.getText()));// senão ele só faz o deposito
            }      
        }else if(cPoupancaBTN.isSelected()){// testa se o botao da conta poupança ta selecionado 
            if ( modificadorPer.isSelected()){// testa se o modificador de porcentagem ta ativo
               pConta.depositar(Double.parseDouble(valorBX.getText()));// se estiver ele faz o deposito 
               pConta.atualiza(Double.parseDouble(percentBX.getText()));// e atualiza o valor
            }else{
               pConta.depositar(Double.parseDouble(valorBX.getText())); // senão ele só faz o deposito
            } 
        } 
        
    }//GEN-LAST:event_depositarBTNActionPerformed

    private void modificadorPerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_modificadorPerItemStateChanged
        
        if ( modificadorPer.isSelected()){// testa se o modificador de porcentagem ta ativo
            modificadorLBL.setText("Com Percentual de");// se estiver ele escreve Com percentual de no label
            percentBX.setEditable(true);// e deixa o usuário escrever na caixa de percentual
        }else{
            percentBX.setText("0");// senão ele escreve 0 na caixa de percentual
            percentBX.setEditable(false);// e não deixa o usuário escrever
            modificadorLBL.setText("Sem Percentual");// e escreve Sem percentual no label
        }
    }//GEN-LAST:event_modificadorPerItemStateChanged

    private void cPoupancaBTNItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cPoupancaBTNItemStateChanged
        if(cPoupancaBTN.isSelected()){
            testeLBL.setText("Poupança");
            valorBX.setEditable(true);
        }
    }//GEN-LAST:event_cPoupancaBTNItemStateChanged

    private void verificarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarBTNActionPerformed
      correnteLBL.setText(String.format("%.2f", cConta.getSaldo()));
      poupancaLBL.setText(String.format("%.2f", pConta.getSaldo()));
      
      double corS = cConta.getSaldo();
      double pouS = pConta.getSaldo();
//      totalLBL.setText(String.valueOf(corS + pouS));
    totalLBL.setText(String.format("%.2f",(corS + pouS))); 
    
       
        
        
    }//GEN-LAST:event_verificarBTNActionPerformed

    private void novoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoBTNActionPerformed
        cConta.setSaldo(0);
        pConta.setSaldo(0);
        valorBX.setText("");
        
    }//GEN-LAST:event_novoBTNActionPerformed

    private void sacarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacarBTNActionPerformed
    if ( cCorrenteBTN.isSelected()){
      cConta.sacar(Double.parseDouble(valorBX.getText()));
    }else if(cPoupancaBTN.isSelected()){
      pConta.sacar(Double.parseDouble(valorBX.getText()));
    }         
        
        
        
        
    }//GEN-LAST:event_sacarBTNActionPerformed

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
            java.util.logging.Logger.getLogger(ContaJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContaJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContaJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContaJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContaJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cCorrenteBTN;
    private javax.swing.JRadioButton cPoupancaBTN;
    private javax.swing.JLabel corrLBL;
    private javax.swing.JLabel correnteLBL;
    private javax.swing.JButton depositarBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel modificadorLBL;
    private javax.swing.JToggleButton modificadorPer;
    private javax.swing.JButton novoBTN;
    private javax.swing.JTextField percentBX;
    private javax.swing.JLabel pouLBL;
    private javax.swing.JLabel poupancaLBL;
    private javax.swing.JButton sacarBTN;
    private javax.swing.JLabel testeLBL;
    private javax.swing.JLabel toLBL;
    private javax.swing.JLabel totalLBL;
    private javax.swing.JTextField valorBX;
    private javax.swing.JButton verificarBTN;
    // End of variables declaration//GEN-END:variables
}
