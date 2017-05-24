/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import classes.ReaderFile;
import classes.Robot;
import java.io.File;
import java.util.Arrays;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.CANCEL_SELECTION;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Randi Guarcas
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JOpenFile = new javax.swing.JButton();
        JFile = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JOpenFile.setText("Open File");
        JOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOpenFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(JOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JFile)
                .addContainerGap(885, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFile))
                .addContainerGap(424, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JOpenFileActionPerformed
        //Crea un nuevo file chooser para 
        //seleccionar un archivo
        JFileChooser JFile = new JFileChooser();
        FileNameExtensionFilter JFilter = new FileNameExtensionFilter(CANCEL_SELECTION, "txt");
        JFile.setFileFilter(JFilter);
        JFile.showOpenDialog(MainScreen.this);
        //se carga el archivo en memoria
        File file = JFile.getSelectedFile();
        //Agrega la ruta del archivo al JLabel - JFile
        this.JFile.setText(file.toString());
        //Obtiene cada linea del fichero de text
        ReaderFile readerFile = new ReaderFile();
        //se envia el archivo en memoria al metodo open
        readerFile.open(file);
        //se recibe por medio de un array list
        //se envia el array list al robot
        Robot robot = new Robot();
        //Envio de parametro para alfabeto
        robot.alpabethPrefix = "A";
        robot.prefixKeySplit = ":";
        
        //Carga de archivo al robot
        robot.load(readerFile.content);
        // metodo para ver el contenido original del fichero
        robot.getOriginalContent();
        // metodo para cargar el contenido del alfabeto
        robot.getAlphabet();
        // metogo para cargar el contenido limpio
        robot.getCleanContent();
        //metodo para cargar las variables 
        robot.getEnviroment();
        //metodo que cargar todas las terminales
        robot.getTerms();
        //metodo para cargar la function primera
        robot.getFirstLogic();
        //System.out.println(robot.getBigStruct());
    }//GEN-LAST:event_JOpenFileActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JFile;
    private javax.swing.JButton JOpenFile;
    // End of variables declaration//GEN-END:variables
}