/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.CBRController;
import javax.swing.JTable;
import javax.swing.UIManager;
import representation.TableModelCaso;

/**
 *
 * @author Zilly
 */
public class MainGUI extends javax.swing.JFrame {

    private CBRController controller;
    private TableModelCaso tabelaCasos;
    
    /**
     * Creates new form MainGUI
     * @param tabelaCasos
     * @param controller
     */
    public MainGUI(TableModelCaso tabelaCasos, CBRController controller) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        
        this.tabelaCasos = tabelaCasos;
        this.controller = controller;
        
        initComponents();
    }

    public JTable getjTableTodosOsCasos() {
        return jTableTodosOsCasos;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipoQuery = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelNovaQuery = new javax.swing.JPanel();
        jPanelTipoQuery = new javax.swing.JPanel();
        jRadioButtonQueryRetruco = new javax.swing.JRadioButton();
        jRadioButtonQueryVale4 = new javax.swing.JRadioButton();
        jRadioButtonQueryTruco = new javax.swing.JRadioButton();
        jRadioButtonQueryEnvido = new javax.swing.JRadioButton();
        jRadioButtonQueryGeral = new javax.swing.JRadioButton();
        jPanelTodosOsCasos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTodosOsCasos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTipoQuery.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Consulta", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        buttonGroupTipoQuery.add(jRadioButtonQueryRetruco);
        jRadioButtonQueryRetruco.setText("Retruco");

        buttonGroupTipoQuery.add(jRadioButtonQueryVale4);
        jRadioButtonQueryVale4.setText("Vale Quatro");
        jRadioButtonQueryVale4.setToolTipText("");

        buttonGroupTipoQuery.add(jRadioButtonQueryTruco);
        jRadioButtonQueryTruco.setText("Truco");

        buttonGroupTipoQuery.add(jRadioButtonQueryEnvido);
        jRadioButtonQueryEnvido.setText("Envido");

        buttonGroupTipoQuery.add(jRadioButtonQueryGeral);
        jRadioButtonQueryGeral.setSelected(true);
        jRadioButtonQueryGeral.setText("Geral");

        javax.swing.GroupLayout jPanelTipoQueryLayout = new javax.swing.GroupLayout(jPanelTipoQuery);
        jPanelTipoQuery.setLayout(jPanelTipoQueryLayout);
        jPanelTipoQueryLayout.setHorizontalGroup(
            jPanelTipoQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoQueryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonQueryTruco)
                    .addComponent(jRadioButtonQueryRetruco)
                    .addComponent(jRadioButtonQueryVale4)
                    .addComponent(jRadioButtonQueryGeral)
                    .addComponent(jRadioButtonQueryEnvido))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTipoQueryLayout.setVerticalGroup(
            jPanelTipoQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoQueryLayout.createSequentialGroup()
                .addComponent(jRadioButtonQueryGeral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonQueryEnvido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonQueryTruco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonQueryRetruco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonQueryVale4))
        );

        javax.swing.GroupLayout jPanelNovaQueryLayout = new javax.swing.GroupLayout(jPanelNovaQuery);
        jPanelNovaQuery.setLayout(jPanelNovaQueryLayout);
        jPanelNovaQueryLayout.setHorizontalGroup(
            jPanelNovaQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNovaQueryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTipoQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1276, Short.MAX_VALUE))
        );
        jPanelNovaQueryLayout.setVerticalGroup(
            jPanelNovaQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNovaQueryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTipoQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(437, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nova Consulta", jPanelNovaQuery);

        jTableTodosOsCasos.setModel(tabelaCasos);
        jTableTodosOsCasos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableTodosOsCasos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTodosOsCasosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTodosOsCasos);

        javax.swing.GroupLayout jPanelTodosOsCasosLayout = new javax.swing.GroupLayout(jPanelTodosOsCasos);
        jPanelTodosOsCasos.setLayout(jPanelTodosOsCasosLayout);
        jPanelTodosOsCasosLayout.setHorizontalGroup(
            jPanelTodosOsCasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTodosOsCasosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1373, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTodosOsCasosLayout.setVerticalGroup(
            jPanelTodosOsCasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTodosOsCasosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Todos os Casos", jPanelTodosOsCasos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableTodosOsCasosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTodosOsCasosMouseClicked
        controller.selecionaCaso();
    }//GEN-LAST:event_jTableTodosOsCasosMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainGUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipoQuery;
    private javax.swing.JPanel jPanelNovaQuery;
    private javax.swing.JPanel jPanelTipoQuery;
    private javax.swing.JPanel jPanelTodosOsCasos;
    private javax.swing.JRadioButton jRadioButtonQueryEnvido;
    private javax.swing.JRadioButton jRadioButtonQueryGeral;
    private javax.swing.JRadioButton jRadioButtonQueryRetruco;
    private javax.swing.JRadioButton jRadioButtonQueryTruco;
    private javax.swing.JRadioButton jRadioButtonQueryVale4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableTodosOsCasos;
    // End of variables declaration//GEN-END:variables
}
