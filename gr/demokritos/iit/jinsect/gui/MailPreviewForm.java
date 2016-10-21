/*
 * MailPreviewForm.java
 *
 * Created on 24 Ιανουάριος 2006, 10:36 μμ
 */

package gr.demokritos.iit.jinsect.gui;

/**
 *
 * @author  PCKid
 */
public class MailPreviewForm extends javax.swing.JFrame {
    
    /** Creates new form MailPreviewForm */
    public MailPreviewForm() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        HTMLEd = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        TextEd = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel1.add(HTMLEd, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("HTML View", jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel2.add(TextEd, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Plain Text View", jPanel2);

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jToolBar1.setPreferredSize(new java.awt.Dimension(10, 50));
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToolBar1.add(jButton1);

        add(jToolBar1, java.awt.BorderLayout.SOUTH);

    }
    // </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
            this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane HTMLEd;
    private javax.swing.JTextArea TextEd;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    public void setDocument(String sTextData) {
        HTMLEd.setContentType("text/html");
        HTMLEd.setText(sTextData);
        
        TextEd.setText(sTextData);
    }
}
