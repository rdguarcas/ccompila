/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import classes.Content;
import classes.First;
import classes.Last;
import classes.ReaderFile;
import classes.Robot;
import classes.Stack;
import classes.Struct;
import classes.Symbol;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.CANCEL_SELECTION;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Randi Guarcas
 */
public class MainScreen extends javax.swing.JFrame {
ArrayList<String> originalContent;
String[] alphabet;
ArrayList<String> enviroments;
ArrayList<String> terms;
ArrayList<First> firstLogic;
ArrayList<Last> lastLogic;
ArrayList<Symbol> symbolTable;
ArrayList<Struct> bigStruct;
ArrayList<Content> globalNotationWithP;
    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        /*JScrollPane scroll = new JScrollPane(this.JTAResult);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        //Add Textarea in to middle panel
        this.add(scroll);
        this.JTAResult.setText("");*/
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
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableContent = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableAlphabet = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTableEnviroments = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        JTableTerms = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        JTableFirst = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        JTableLast = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        JTableSymbol = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTString = new javax.swing.JTextField();
        JBValidate = new javax.swing.JButton();
        JLResultFromType = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        JTableStack = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JOpenFile.setText("Open File");
        JOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOpenFileActionPerformed(evt);
            }
        });

        JTableContent.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        JTableContent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "File Content"
            }
        ));
        JTableContent.setEditingRow(0);
        JTableContent.setRowHeight(30);
        jScrollPane1.setViewportView(JTableContent);

        JTableAlphabet.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        JTableAlphabet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alphabet"
            }
        ));
        JTableAlphabet.setRowHeight(30);
        jScrollPane2.setViewportView(JTableAlphabet);

        JTableEnviroments.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        JTableEnviroments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enviroments"
            }
        ));
        JTableEnviroments.setRowHeight(30);
        jScrollPane3.setViewportView(JTableEnviroments);

        JTableTerms.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        JTableTerms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Terminals"
            }
        ));
        JTableTerms.setRowHeight(30);
        jScrollPane4.setViewportView(JTableTerms);

        JTableFirst.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        JTableFirst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Function"
            }
        ));
        JTableFirst.setRowHeight(30);
        jScrollPane5.setViewportView(JTableFirst);

        JTableLast.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        JTableLast.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Last Function"
            }
        ));
        JTableLast.setRowHeight(35);
        jScrollPane6.setViewportView(JTableLast);

        JTableSymbol.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        JTableSymbol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JTableSymbol.setRowHeight(30);
        jScrollPane7.setViewportView(JTableSymbol);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Symbol Table:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Typing:");

        JTString.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        JBValidate.setText("Validate");
        JBValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBValidateActionPerformed(evt);
            }
        });

        JLResultFromType.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        JTableStack.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        JTableStack.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane8.setViewportView(JTableStack);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(JLResultFromType))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(JTString, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBValidate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JFile))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JOpenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JLResultFromType))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBValidate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTString, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
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
        // metodo para ver el contenido original del fichero robot.getOriginalContent();
        originalContent = robot.getOriginalContent();
        JTableContentRender(this.originalContent);
        // metodo para cargar el contenido del alfabeto robot.getAlphabet()
        alphabet = robot.getAlphabet();
        JTableAlphabetRender(this.alphabet);
        // metogo para cargar el contenido limpio
        robot.getCleanContent();
        //metodo para cargar las variables  robot.getEnviroment()
        enviroments = robot.getEnviroment();
        JTableEnviromentsRender(this.enviroments);
        //metodo que cargar todas las terminales robot.getTerms()
        terms = robot.getTerms();
        JTableTermsRender(terms);
        //metodo para cargar la function primera robot.getFirstLogic()
        firstLogic = robot.getFirstLogic();
        JTableFirstRender(firstLogic);
        //metodo que retorna la funcion siguiente robot.getLastLogic()
        lastLogic = robot.getLastLogic();
        JTableLastRender(lastLogic);
        //metodo que retorna la tabla de simbolos
        symbolTable = robot.getSymbolTable();
        JTableTableSymbol(robot.drawSymbolTable(), robot.getTerms());
    //JTableTableSymbol(robot.getSymbolTable(), robot.getTerms());
         bigStruct = robot.getBigStruct();
        globalNotationWithP = robot.globalNotationWP;
    }//GEN-LAST:event_JOpenFileActionPerformed

    private void JBValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBValidateActionPerformed
        // TODO add your handling code here:
        String type = JTString.getText();
        if(type.isEmpty()){
            JLResultFromType.setForeground(Color.red);
            JLResultFromType.setText("Error - Is Empty");
        }else{
            if(!type.contains("$")){
                JLResultFromType.setForeground(Color.red);
                JLResultFromType.setText("Error - $ not defined");
            }else{
                Robot robot = new Robot();
                ArrayList<Stack> r = robot.getStackLogic(type, this.symbolTable, this.bigStruct, globalNotationWithP, this.terms);
                
                ArrayList<Stack> need = new ArrayList<>();
                for (Stack stack : r) {
                    if(stack==null){}
                    else{
                        need.add(stack);
                    }
                }
                JTableStackRender(need);
                /*String a = "";
                for (String string : r) {
                    a += string + "\n";
                }
                JTAResult.setText(a);*/
            }
            //
        }

    }//GEN-LAST:event_JBValidateActionPerformed
    
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
    private javax.swing.JButton JBValidate;
    private javax.swing.JLabel JFile;
    private javax.swing.JLabel JLResultFromType;
    private javax.swing.JButton JOpenFile;
    private javax.swing.JTextField JTString;
    private javax.swing.JTable JTableAlphabet;
    private javax.swing.JTable JTableContent;
    private javax.swing.JTable JTableEnviroments;
    private javax.swing.JTable JTableFirst;
    private javax.swing.JTable JTableLast;
    private javax.swing.JTable JTableStack;
    private javax.swing.JTable JTableSymbol;
    private javax.swing.JTable JTableTerms;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    // End of variables declaration//GEN-END:variables

    private void JTableContentRender(ArrayList<String> originalContent) {
        DefaultTableModel FileTableModel = new DefaultTableModel();
        FileTableModel.setColumnIdentifiers(new String[]{"File Content"});
        Object[] FileRow = new Object[FileTableModel.getColumnCount()];
        for (int i = 0; i < originalContent.size(); i++) {
            FileRow[0] = originalContent.get(i);
            FileTableModel.addRow(FileRow);
        }
        JTableContent.setModel(FileTableModel);
    }
    
     private void JTableAlphabetRender(String[] originalContent) {
        DefaultTableModel FileTableModel = new DefaultTableModel();
        FileTableModel.setColumnIdentifiers(new String[]{"Alphabet"});
        Object[] FileRow = new Object[FileTableModel.getColumnCount()];
        for (int i = 0; i < originalContent.length; i++) {
            FileRow[0] = originalContent[i];
            FileTableModel.addRow(FileRow);
        }
        JTableAlphabet.setModel(FileTableModel);
    }
     
    private void JTableEnviromentsRender(ArrayList<String> originalContent) {
        DefaultTableModel FileTableModel = new DefaultTableModel();
        FileTableModel.setColumnIdentifiers(new String[]{"Enviroments"});
        Object[] FileRow = new Object[FileTableModel.getColumnCount()];
        for (int i = 0; i < originalContent.size(); i++) {
            FileRow[0] = originalContent.get(i);
            FileTableModel.addRow(FileRow);
        }
        JTableEnviroments.setModel(FileTableModel);
    }
    private void JTableTermsRender(ArrayList<String> originalContent) {
        DefaultTableModel FileTableModel = new DefaultTableModel();
        FileTableModel.setColumnIdentifiers(new String[]{"Terminals"});
        Object[] FileRow = new Object[FileTableModel.getColumnCount()];
        for (int i = 0; i < originalContent.size(); i++) {
            FileRow[0] = originalContent.get(i);
            FileTableModel.addRow(FileRow);
        }
        JTableTerms.setModel(FileTableModel);
    } 
    
    private void JTableFirstRender(ArrayList<First> first) {
        DefaultTableModel FileTableModel = new DefaultTableModel();
        FileTableModel.setColumnIdentifiers(new String[]{"First Function"});
        Object[] FileRow = new Object[FileTableModel.getColumnCount()];
        
        for (First getFirst : first) {
            FileRow[0] = getFirst.toString();
            FileTableModel.addRow(FileRow);
        }
        
        JTableFirst.setModel(FileTableModel);
    } 
    
    private void JTableLastRender(ArrayList<Last> first) {
        DefaultTableModel FileTableModel = new DefaultTableModel();
        FileTableModel.setColumnIdentifiers(new String[]{"Last Function"});
        Object[] FileRow = new Object[FileTableModel.getColumnCount()];
        
        for (Last getFirst : first) {
            FileRow[0] = getFirst.toString();
            FileTableModel.addRow(FileRow);
        }
        
        JTableLast.setModel(FileTableModel);
    } 

    /*private void JTableTableSymbol(ArrayList<Symbol> symbolTable, ArrayList<String> terms) {
        ArrayList<String> columns = new ArrayList<>();
        int i = 0;
        
        columns.add("");
        for (String string : terms) {
            if(!string.equals("e")){
                columns.add(string);
                
            }
        }
        columns.add("$");
        
        
        for (String column : columns) {
            System.out.println(column);
        }
        DefaultTableModel FileTableModel = new DefaultTableModel();
        FileTableModel.setColumnIdentifiers(columns.toArray());
        Object[] FileRow = new Object[FileTableModel.getColumnCount()];
        
        for (Symbol symbol : symbolTable) {
            String tenTaiKhoan = symbol.getKey();
            String ipTaiKhoan = "";
            
            FileTableModel.addRow(new Object[] { tenTaiKhoan, ipTaiKhoan });
        }
        
        JTableSymbol.setModel(FileTableModel);
       
    }*/

    private void JTableTableSymbol(ArrayList<Object[]> drawSymbolTable, ArrayList<String> terms) {
         ArrayList<String> columns = new ArrayList<>();
        int i = 0;
        
        columns.add("");
        for (String string : terms) {
            if(!string.equals("e")){
                columns.add(string);
                
            }
        }
        columns.add("$");
        
        DefaultTableModel FileTableModel = new DefaultTableModel();
        FileTableModel.setColumnIdentifiers(columns.toArray());
        Object[] FileRow = new Object[FileTableModel.getColumnCount()];
        
        
        for (Object[] objects : drawSymbolTable) {
            FileTableModel.addRow(objects);
        }
         
        JTableSymbol.setModel(FileTableModel);
    }

    private void JTableStackRender(ArrayList<Stack> need) {
        
        DefaultTableModel FileTableModel = new DefaultTableModel();
        FileTableModel.setColumnIdentifiers(new String[]{"Pila","Entrada","Producción"});
        Object[] FileRow = new Object[FileTableModel.getColumnCount()];
        
        for (Stack stack : need) {
            if(stack.getVars().size() > 0 && stack.getInput().size() > 0){
                FileRow[0] = stack.getVars().toString();
                FileRow[1] = stack.getInput().toString();
                //FileRow[2] = stack.getProduction().toString();
                FileTableModel.addRow(FileRow);
            }
            
        }
        /*for (Last getFirst : first) {
            FileRow[0] = getFirst.toString();
            FileTableModel.addRow(FileRow);
        }*/
        
        JTableStack.setModel(FileTableModel);
        JLResultFromType.setText("String is Ok");
        JLResultFromType.setForeground(Color.GREEN);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
