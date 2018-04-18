/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.boletin25;

import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author jdominguezmartinan
 */
public class Xogo extends javax.swing.JFrame implements TableCellRenderer
{

    /**
     * Creates new form Xogo
     */
    public Xogo()
    {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tNumeros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tNumeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"10", "11", "12"},
                {"13", "14", "15"},
                {"16", "17", "18"},
                {"19", "20", "21"},
                {"22", "23", "24"},
                {"25", "26", "27"},
                {"28", "29", "30"},
                {"31", "32", "33"},
                {"34", "35", "36"},
                {"37", "38", "39"},
                {"40", "41", "42"},
                {"43", "44", "45"},
                {"46", "47", "48"},
                {"49", "/", "/"}
            },
            new String []
            {
                "", "", ""
            }
        ));
        tNumeros.setCellSelectionEnabled(true);
        tNumeros.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tNumerosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tNumeros);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tNumerosMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tNumerosMouseClicked
    {//GEN-HEADEREND:event_tNumerosMouseClicked
        // TODO add your handling code here:
        Point pr=this.tNumeros.getMousePosition();
        int row=this.tNumeros.rowAtPoint(pr);
        int colum=this.tNumeros.columnAtPoint(pr);
        tNumeros.changeSelection(row,colum,false,false);
        tNumeros.setSelectionForeground(Color.red);
        //getTableCellRendererComponent(tNumeros,null,true,true,row,colum);
        

    }//GEN-LAST:event_tNumerosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch(ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Xogo.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        } catch(InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Xogo.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        } catch(IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Xogo.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        } catch(javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Xogo.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Xogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tNumeros;
    // End of variables declaration//GEN-END:variables

    @Override
    public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column){
    Component c = table.getDefaultRenderer(table.getColumnClass(column))
       .getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

    if(hasFocus)
       ((JComponent)c).setBackground(Color.blue);//Pones el color que quieras

    return c;
    }
    
}
