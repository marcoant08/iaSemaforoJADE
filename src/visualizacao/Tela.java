/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualizacao;

import iasemaforojade.Plano;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MarcoAntônio, Italo, Well
 */
public class Tela extends javax.swing.JFrame {

    public ImageIcon mapa, sem1r, sem1g, sem2r, sem2g;
    /**
     * Creates new form Tela
     */
    public Tela(Plano p) {
        initComponents();
        setSize(770, 515);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sem1r = new ImageIcon("src\\imagens\\s_vermelho.jpg");
        sem1g = new ImageIcon("src\\imagens\\s_verde.jpg");
        sem2r = new ImageIcon("src\\imagens\\s_vermelho2.jpg");
        sem2g = new ImageIcon("src\\imagens\\s_verde2.jpg");
        //iniciarLabels();
    }
    
    public void iniciarLabels(){
        sem1i.setIcon(sem1r);
        sem1ii.setIcon(sem1r);
        sem2i.setIcon(sem2g);
        sem2ii.setIcon(sem2g);
        
    }
    
    public void attLabels1(String cor){
        if(cor.equals("red")){
            sem1i.setIcon(sem1r);
            sem1ii.setIcon(sem1r);
            sem2i.setIcon(sem2g);
            sem2ii.setIcon(sem2g);
        }else{
            sem1i.setIcon(sem1g);
            sem1ii.setIcon(sem1g);
            sem2i.setIcon(sem2r);
            sem2ii.setIcon(sem2r);
        }
    }
    
    public void attLabels2(String f1, String f2, Integer t1, Integer t2){
        fluxo1.setText(f1+" Carros/Minuto");
        fluxo2.setText(f2+" Carros/Minuto");
        tv1.setText("Tempo que a via 1 ficará aberta: "+t1);
        tv2.setText("Tempo que a via 2 ficará aberta: "+t2);
        iniciando.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sem1i = new javax.swing.JLabel();
        sem1ii = new javax.swing.JLabel();
        sem2i = new javax.swing.JLabel();
        sem2ii = new javax.swing.JLabel();
        fluxo1 = new javax.swing.JLabel();
        fluxo2 = new javax.swing.JLabel();
        tv1 = new javax.swing.JLabel();
        tv2 = new javax.swing.JLabel();
        via2 = new javax.swing.JLabel();
        via3 = new javax.swing.JLabel();
        sobre = new javax.swing.JButton();
        iniciando = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        sem1i.setBackground(new java.awt.Color(0, 255, 255));
        sem1i.setForeground(new java.awt.Color(204, 204, 0));
        sem1i.setOpaque(true);
        getContentPane().add(sem1i);
        sem1i.setBounds(430, 80, 26, 56);

        sem1ii.setBackground(new java.awt.Color(0, 255, 255));
        sem1ii.setForeground(new java.awt.Color(204, 204, 0));
        sem1ii.setOpaque(true);
        getContentPane().add(sem1ii);
        sem1ii.setBounds(290, 80, 26, 56);

        sem2i.setOpaque(true);
        getContentPane().add(sem2i);
        sem2i.setBounds(470, 150, 56, 26);

        sem2ii.setOpaque(true);
        getContentPane().add(sem2ii);
        sem2ii.setBounds(470, 290, 56, 26);

        fluxo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        fluxo1.setText("0 Carros/Minuto");
        getContentPane().add(fluxo1);
        fluxo1.setBounds(320, 120, 100, 14);

        fluxo2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        fluxo2.setText("0 Carros/Minuto");
        getContentPane().add(fluxo2);
        fluxo2.setBounds(480, 200, 100, 14);

        tv1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tv1.setForeground(new java.awt.Color(0, 0, 204));
        tv1.setText("Tempo que a via 1 ficará aberta: 0");
        getContentPane().add(tv1);
        tv1.setBounds(10, 20, 240, 15);

        tv2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tv2.setForeground(new java.awt.Color(0, 0, 204));
        tv2.setText("Tempo que a via 2 ficará aberta: 0");
        getContentPane().add(tv2);
        tv2.setBounds(10, 40, 240, 15);

        via2.setText("Via 1");
        getContentPane().add(via2);
        via2.setBounds(330, 0, 40, 20);

        via3.setText("Via 2");
        getContentPane().add(via3);
        via3.setBounds(710, 260, 40, 20);

        sobre.setText("Sobre");
        sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreActionPerformed(evt);
            }
        });
        getContentPane().add(sobre);
        sobre.setBounds(10, 440, 90, 23);

        iniciando.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        iniciando.setText("Iniciando...");
        getContentPane().add(iniciando);
        iniciando.setBounds(320, 220, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MarcoAntônio\\Documents\\NetBeansProjects\\iaSemaforoJADE\\src\\imagens\\mapa.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 754, 476);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Semáforo com multiagentes - JADE FRAMEWORK\n"+
                "Inteligência Computacional - Professor Pedro Brandão\n\n"+
                "Desenvolvido por:\n"+
                "Marco Antônio A. Gonçalves\n"+
                "Wellison Santos\n"+
                "Ítalo Lopes\n\n"+
                "© 2018");
    }//GEN-LAST:event_sobreActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fluxo1;
    private javax.swing.JLabel fluxo2;
    private javax.swing.JLabel iniciando;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel sem1i;
    private javax.swing.JLabel sem1ii;
    private javax.swing.JLabel sem2i;
    private javax.swing.JLabel sem2ii;
    private javax.swing.JButton sobre;
    private javax.swing.JLabel tv1;
    private javax.swing.JLabel tv2;
    private javax.swing.JLabel via2;
    private javax.swing.JLabel via3;
    // End of variables declaration//GEN-END:variables
}
