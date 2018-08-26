/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import vista.utilidades.UtilidadesComponente;

/**
 *
 * @author user
 */
public class FrmUsuario extends javax.swing.JDialog {

    /**
     * Creates new form FrmUsuario
     */
    public FrmUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        tabbedSelector21 = new org.edisoncor.gui.tabbedPane.TabbedSelector2();
        jPanel6 = new javax.swing.JPanel();
        buttonSeven1 = new org.edisoncor.gui.button.ButtonSeven();
        buttonSeven3 = new org.edisoncor.gui.button.ButtonSeven();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        cbxTipoBuscar = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        panelCurves2 = new org.edisoncor.gui.panel.PanelCurves();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPrestamos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMultas = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        panel1 = new org.edisoncor.gui.panel.Panel();
        jLabel2 = new javax.swing.JLabel();
        buttonTask1 = new org.edisoncor.gui.button.ButtonTask();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Panel de Usuario");
        setIconImage(UtilidadesComponente.obtenerIcono());
        getContentPane().setLayout(null);

        tabbedSelector21.setBackground(new java.awt.Color(0, 102, 102));
        tabbedSelector21.setForeground(new java.awt.Color(0, 0, 0));
        tabbedSelector21.setColorBackGround(new java.awt.Color(255, 255, 255));
        tabbedSelector21.setColorDeBorde(new java.awt.Color(102, 102, 102));
        tabbedSelector21.setColorDeSegundoBorde(new java.awt.Color(102, 102, 102));
        tabbedSelector21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabbedSelector21.setSelectionColor(new java.awt.Color(148, 169, 169));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        buttonSeven1.setText("Solicitar");
        jPanel6.add(buttonSeven1);
        buttonSeven1.setBounds(390, 360, 150, 30);

        buttonSeven3.setText("Ver informacion");
        jPanel6.add(buttonSeven3);
        buttonSeven3.setBounds(130, 360, 180, 30);
        jPanel6.add(jSeparator1);
        jSeparator1.setBounds(10, 350, 610, 10);

        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblResultados);

        jPanel6.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 640, 250);
        jPanel6.add(txtBuscar);
        txtBuscar.setBounds(110, 30, 540, 20);

        cbxTipoBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Título", "Autor" }));
        jPanel6.add(cbxTipoBuscar);
        cbxTipoBuscar.setBounds(30, 30, 70, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Resultados de Busqueda");
        jPanel6.add(jLabel1);
        jLabel1.setBounds(270, 60, 140, 14);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/ue_biblioteca-mediateca-icono.png"))); // NOI18N
        jLabel8.setText("jLabel2");
        jPanel6.add(jLabel8);
        jLabel8.setBounds(410, 150, 510, 330);

        tabbedSelector21.addTab("Documentos", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);
        jPanel7.add(panelCurves1);
        panelCurves1.setBounds(0, 0, 0, 0);
        jPanel7.add(panelCurves2);
        panelCurves2.setBounds(0, 0, 120, 0);

        tblPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblPrestamos);

        jPanel7.add(jScrollPane2);
        jScrollPane2.setBounds(20, 30, 620, 360);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/ue_biblioteca-mediateca-icono.png"))); // NOI18N
        jLabel7.setText("jLabel2");
        jPanel7.add(jLabel7);
        jLabel7.setBounds(410, 150, 510, 330);

        tabbedSelector21.addTab("Prestamos", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        tblMultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblMultas);

        jPanel8.add(jScrollPane3);
        jScrollPane3.setBounds(20, 20, 630, 350);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/ue_biblioteca-mediateca-icono.png"))); // NOI18N
        jLabel6.setText("jLabel2");
        jPanel8.add(jLabel6);
        jLabel6.setBounds(410, 150, 510, 330);

        tabbedSelector21.addTab("Multas", jPanel8);

        getContentPane().add(tabbedSelector21);
        tabbedSelector21.setBounds(0, 50, 790, 440);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setForeground(new java.awt.Color(255, 255, 255));
        panel1.setColorPrimario(new java.awt.Color(148, 169, 169));
        panel1.setColorSecundario(new java.awt.Color(255, 255, 255));
        panel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Sitka Subheading", 0, 24)); // NOI18N
        jLabel2.setText("Bienvenido al Sistema biliotecario");
        panel1.add(jLabel2);
        jLabel2.setBounds(280, 0, 380, 50);

        buttonTask1.setBackground(new java.awt.Color(148, 169, 169));
        buttonTask1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/Iconolgout.png"))); // NOI18N
        buttonTask1.setText("Cerrar Sesion");
        buttonTask1.setDescription("de usuario");
        panel1.add(buttonTask1);
        buttonTask1.setBounds(0, 0, 200, 50);

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 790, 60);

        setSize(new java.awt.Dimension(802, 526));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmUsuario dialog = new FrmUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonSeven buttonSeven1;
    private org.edisoncor.gui.button.ButtonSeven buttonSeven3;
    private org.edisoncor.gui.button.ButtonTask buttonTask1;
    private javax.swing.JComboBox<String> cbxTipoBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves2;
    private org.edisoncor.gui.tabbedPane.TabbedSelector2 tabbedSelector21;
    private javax.swing.JTable tblMultas;
    private javax.swing.JTable tblPrestamos;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
