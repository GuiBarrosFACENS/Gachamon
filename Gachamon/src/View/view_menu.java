/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Random;

/**
 *
 * @author luize
 */
public class view_menu extends javax.swing.JFrame {
    public int saldo=10;
    public String saldostr;
    public String nome;
    public int aleatorio;
    Random gerador = new Random();
    private int bulbasaur;
    private int caterpie;
    private int charizard;
    private int squirtle;
    private int blastoise;
    private int charmander;
    private int zubat;
    private int ekans;
    private int meowth;
    private int eevee;
    private int psyduck;
    private int pikachu;
    private int mewtwo;
    private int lucario;
            
    
            
    /**
     * Creates new form view_menu
     */
    public view_menu() {
        nome = "Luiz";
        initComponents();
        caterpie=0;
        squirtle=0;
        charizard=0;
        bulbasaur=0;
        blastoise=0;
        charmander=0;
        ekans=0;
        zubat=0;
        eevee=0;
        psyduck=0;
        meowth=0;
        pikachu=0;
        lucario=0;
        mewtwo=0;
        saldostr = Integer.toString(saldo);
        saldotxt.setText("Saldo: "+ saldostr);
        nometxt.setText("Treinador: "+ nome);
        addsaldo.setVisible(false);
        enviarbut.setVisible(false);
        txtpoke.setVisible(false);
        endbut.setVisible(false);
        panelfundo.setVisible(false);
        blastoiseimg.setVisible(false);
        bulbasaurimg.setVisible(false);
        eveeimg.setVisible(false);
        psyduckimg.setVisible(false);
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        playbut = new javax.swing.JButton();
        endbut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        saldotxt = new javax.swing.JLabel();
        nometxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        addsaldo = new javax.swing.JTextField();
        enviarbut = new javax.swing.JButton();
        panelfundo = new javax.swing.JPanel();
        zubatimg = new javax.swing.JLabel();
        squirtleimg = new javax.swing.JLabel();
        psyduckimg = new javax.swing.JLabel();
        pikachuimg = new javax.swing.JLabel();
        mewtwoimg = new javax.swing.JLabel();
        meowthimg = new javax.swing.JLabel();
        lucarioimg = new javax.swing.JLabel();
        ekansimg = new javax.swing.JLabel();
        eveeimg = new javax.swing.JLabel();
        charmanderimg = new javax.swing.JLabel();
        charizardimg = new javax.swing.JLabel();
        caterpieimg = new javax.swing.JLabel();
        blastoiseimg = new javax.swing.JLabel();
        bulbasaurimg = new javax.swing.JLabel();
        nomepoketxt = new javax.swing.JLabel();
        txtpoke = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jDialog1.setAlwaysOnTop(true);

        jLabel1.setText("SEM SALDO PARA INICIAR");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playbut.setText("Play");
        playbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playbutActionPerformed(evt);
            }
        });
        getContentPane().add(playbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        endbut.setText("End");
        endbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endbutActionPerformed(evt);
            }
        });
        getContentPane().add(endbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img1 (1).png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 300, 340));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/picasion.com_d0c9adeb67c3d4c5acdbb86827550da6.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 300, 340));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ash editar (1).png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 0, 66);

        saldotxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(saldotxt);
        saldotxt.setBounds(76, 48, 76, 22);

        nometxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(nometxt);
        nometxt.setBounds(76, 20, 150, 22);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 120, 120, 110);

        jButton3.setText("Add Saldo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(190, 10, 90, 25);

        addsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsaldoActionPerformed(evt);
            }
        });
        jPanel1.add(addsaldo);
        addsaldo.setBounds(310, 20, 59, 30);

        enviarbut.setText("Enviar");
        enviarbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarbutActionPerformed(evt);
            }
        });
        jPanel1.add(enviarbut);
        enviarbut.setBounds(370, 20, 70, 30);

        panelfundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        zubatimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/zubat certo.png"))); // NOI18N
        panelfundo.add(zubatimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 340, 320));

        squirtleimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Squirtle.png"))); // NOI18N
        panelfundo.add(squirtleimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 310, 360));

        psyduckimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/psyduck certoo.png"))); // NOI18N
        panelfundo.add(psyduckimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 410, 420));

        pikachuimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pikachu certo.png"))); // NOI18N
        panelfundo.add(pikachuimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 340, 310));

        mewtwoimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Mewtwo certo.png"))); // NOI18N
        panelfundo.add(mewtwoimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 100, 320, 320));

        meowthimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/meowth certo.png"))); // NOI18N
        panelfundo.add(meowthimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 350, 320));

        lucarioimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/lucario certoo.png"))); // NOI18N
        panelfundo.add(lucarioimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 290, 370));

        ekansimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ekans certo.png"))); // NOI18N
        panelfundo.add(ekansimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 290, 300));

        eveeimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/evee certo.png"))); // NOI18N
        panelfundo.add(eveeimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 90, 350, 350));

        charmanderimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/charmander certo.png"))); // NOI18N
        panelfundo.add(charmanderimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 250, 310));

        charizardimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/charizard certo.png"))); // NOI18N
        panelfundo.add(charizardimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 90, 450, 300));

        caterpieimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/caterpie cert.png"))); // NOI18N
        panelfundo.add(caterpieimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 340, 300));

        blastoiseimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/blastoise oficial.png"))); // NOI18N
        panelfundo.add(blastoiseimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 100, 450, 290));

        bulbasaurimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bulbasaur oficial.png"))); // NOI18N
        panelfundo.add(bulbasaurimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 490, 410));

        nomepoketxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nomepoketxt.setForeground(new java.awt.Color(255, 255, 255));
        panelfundo.add(nomepoketxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 30));

        txtpoke.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtpoke.setForeground(new java.awt.Color(255, 255, 255));
        txtpoke.setText("Você ganhou o Pokémon:");
        panelfundo.add(txtpoke, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 40));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fundo preto e branco.jpg"))); // NOI18N
        panelfundo.add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 510, 460));

        jPanel1.add(panelfundo);
        panelfundo.setBounds(350, 120, 340, 460);

        jButton1.setText("Pokedex");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(600, 10, 110, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 800, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playbutActionPerformed
        if(saldo>=1){
        jLabel2.setVisible(true);
        saldo-=1;
        jLabel3.setVisible(false);
        saldostr = Integer.toString(saldo);
        saldotxt.setText("Saldo: "+ saldostr);
        txtpoke.setVisible(true);
        playbut.setVisible(false);
        endbut.setVisible(true);
        panelfundo.setVisible(false);
        blastoiseimg.setVisible(false);
        bulbasaurimg.setVisible(false);
        caterpieimg.setVisible(false);
        charizardimg.setVisible(false);
        charmanderimg.setVisible(false);
        ekansimg.setVisible(false);
        eveeimg.setVisible(false);
        lucarioimg.setVisible(false);
        meowthimg.setVisible(false);
        mewtwoimg.setVisible(false);
        pikachuimg.setVisible(false);
        psyduckimg.setVisible(false);
        squirtleimg.setVisible(false);
        zubatimg.setVisible(false);
        }
        else{
            jDialog1.setSize(500, 500);
             jDialog1.setVisible(true);
             
            }
    }//GEN-LAST:event_playbutActionPerformed

    private void endbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endbutActionPerformed
        jLabel2.setVisible(false);
        jLabel3.setVisible(true);
        playbut.setVisible(true);
        endbut.setVisible(false);
        pokedex pok = new pokedex();
        
        aleatorio = gerador.nextInt(14);
        switch(aleatorio){
            
            case 0:
                nomepoketxt.setText("BLASTOISE");
                panelfundo.setVisible(true);
                blastoiseimg.setVisible(true);
                nomepoketxt.setVisible(true);
                pok.setBlast(10);
                setBlastoise(10);
                break;
            case 1:
                nomepoketxt.setText("BULBASAUR");
                panelfundo.setVisible(true);
                bulbasaurimg.setVisible(true);
                nomepoketxt.setVisible(true);
                pok.setBulba(10);
                setBulbasaur(10);
                break;
            case 2:
                nomepoketxt.setText("CATERPIE");
                panelfundo.setVisible(true);
                caterpieimg.setVisible(true);
                nomepoketxt.setVisible(true);
                pok.setCaterp(10);
                setCaterpie(10);
                break;
            case 3:
                nomepoketxt.setText("CHARIZARD");
                panelfundo.setVisible(true);
                charizardimg.setVisible(true);
                nomepoketxt.setVisible(true);
                pok.setChariz(10);
                setCharizard(10);
                break;    
            case 4:
                nomepoketxt.setText("CHARMANDER");
                panelfundo.setVisible(true);
                charmanderimg.setVisible(true);
                nomepoketxt.setVisible(true);
                pok.setCharm(10);
                setCharmander(10);
                break;    
            case 5:
                nomepoketxt.setText("EEVEE");
                panelfundo.setVisible(true);
                eveeimg.setVisible(true);
                nomepoketxt.setVisible(true);
                pok.setEevee(10);
                setEevee(10);
                break;  
            case 6:
                nomepoketxt.setText("EKANS");
                panelfundo.setVisible(true);
                ekansimg.setVisible(true);
                nomepoketxt.setVisible(true);
                pok.setEkans(10);
                setEkans(10);
                break;      
            case 7:
                nomepoketxt.setText("LUCARIO");
                panelfundo.setVisible(true);
                lucarioimg.setVisible(true);
                nomepoketxt.setVisible(true);
                pok.setLuca(10);
                setLucario(10);
                break;      
            case 8:
                nomepoketxt.setText("MEOWTH");
                panelfundo.setVisible(true);
                meowthimg.setVisible(true);
                nomepoketxt.setVisible(true);
                pok.setMeowth(10);
                setMeowth(10);
                break;  
            case 9:
                nomepoketxt.setText("MEWTWO");
                panelfundo.setVisible(true);
                mewtwoimg.setVisible(true);
                nomepoketxt.setVisible(true);
                pok.setMew2(10);
                setMewtwo(10);
                break;    
            case 10:
                nomepoketxt.setText("PIKACHU");
                panelfundo.setVisible(true);
                pikachuimg.setVisible(true);
                nomepoketxt.setVisible(true);
                pok.setPik(10);
                setPikachu(10);
                break;      
            case 11:
                nomepoketxt.setText("PSYDUCK");
                panelfundo.setVisible(true);
                psyduckimg.setVisible(true);
                nomepoketxt.setVisible(true);
                pok.setPsy(10);
                setPsyduck(10);
                break;    
            case 12:
                nomepoketxt.setText("SQUIRTLE");
                panelfundo.setVisible(true);
                squirtleimg.setVisible(true);
                nomepoketxt.setVisible(true);
                pok.setSquirt(10);
                setSquirtle(10);
                break;    
            case 13:
                nomepoketxt.setText("ZUBAT");
                panelfundo.setVisible(true);
                zubatimg.setVisible(true);
                nomepoketxt.setVisible(true);
                pok.setZub(10);
                setZubat(10);
                break;         
            default: 
                break;
        }
    }//GEN-LAST:event_endbutActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        addsaldo.setVisible(true);
        enviarbut.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addsaldoActionPerformed

    private void enviarbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarbutActionPerformed
        saldo += Integer.parseInt (addsaldo.getText());
        saldostr = Integer.toString(saldo);
        saldotxt.setText("Saldo: "+ saldostr);
        addsaldo.setVisible(false);
        enviarbut.setVisible(false);
    }//GEN-LAST:event_enviarbutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       pokedex dex = new pokedex();
       if(getBulbasaur()==10){
           
           dex.setBulba(10);
           
       }else{}
       if(getSquirtle()==10){
           
           dex.setSquirt(10);
           
       }else{}
       if(getCharizard()==10){
           
           dex.setChariz(10);
           
       }else{}
       if(getCaterpie()==10){
           
           dex.setCaterp(10);
           
       }else{}
       if(getBlastoise()==10){
           
           dex.setBlast(10);
           
       }else{}
       if(getCharmander()==10){
           
           dex.setCharm(10);
           
       }else{}
       if(getZubat()==10){
           
           dex.setZub(10);
           
       }else{}
       if(getEkans()==10){
           
           dex.setEkans(10);
           
       }else{}
       if(getEevee()==10){
           
           dex.setEevee(10);
           
       }else{}
       if(getMeowth()==10){
           
           dex.setMeowth(10);
           
       }else{}
       if(getPsyduck()==10){
           
           dex.setPsy(10);
           
       }else{}
       if(getPikachu()==10){
           
           dex.setPik(10);
           
       }else{}
       if(getLucario()==10){
           
           dex.setLuca(10);
           
       }else{}
       if(getMewtwo()==10){
           
           dex.setMew2(10);
           
       }else{}
       dex.setVisible(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(view_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addsaldo;
    private javax.swing.JLabel blastoiseimg;
    private javax.swing.JLabel bulbasaurimg;
    private javax.swing.JLabel caterpieimg;
    private javax.swing.JLabel charizardimg;
    private javax.swing.JLabel charmanderimg;
    private javax.swing.JLabel ekansimg;
    private javax.swing.JButton endbut;
    private javax.swing.JButton enviarbut;
    private javax.swing.JLabel eveeimg;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lucarioimg;
    private javax.swing.JLabel meowthimg;
    private javax.swing.JLabel mewtwoimg;
    private javax.swing.JLabel nomepoketxt;
    private javax.swing.JLabel nometxt;
    private javax.swing.JPanel panelfundo;
    private javax.swing.JLabel pikachuimg;
    private javax.swing.JButton playbut;
    private javax.swing.JLabel psyduckimg;
    private javax.swing.JLabel saldotxt;
    private javax.swing.JLabel squirtleimg;
    private javax.swing.JLabel txtpoke;
    private javax.swing.JLabel zubatimg;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the bulbasaur
     */
    public int getBulbasaur() {
        return bulbasaur;
    }

    /**
     * @param bulbasaur the bulbasaur to set
     */
    public void setBulbasaur(int bulbasaur) {
        this.bulbasaur = bulbasaur;
    }

    /**
     * @return the squirtle
     */
    public int getSquirtle() {
        return squirtle;
    }

    /**
     * @param squirtle the squirtle to set
     */
    public void setSquirtle(int squirtle) {
        this.squirtle = squirtle;
    }

    /**
     * @return the charizard
     */
    public int getCharizard() {
        return charizard;
    }

    /**
     * @param charizard the charizard to set
     */
    public void setCharizard(int charizard) {
        this.charizard = charizard;
    }

    /**
     * @return the caterpie
     */
    public int getCaterpie() {
        return caterpie;
    }

    /**
     * @param caterpie the caterpie to set
     */
    public void setCaterpie(int caterpie) {
        this.caterpie = caterpie;
    }

    /**
     * @return the blastoise
     */
    public int getBlastoise() {
        return blastoise;
    }

    /**
     * @param blastoise the blastoise to set
     */
    public void setBlastoise(int blastoise) {
        this.blastoise = blastoise;
    }

    /**
     * @return the charmander
     */
    public int getCharmander() {
        return charmander;
    }

    /**
     * @param charmander the charmander to set
     */
    public void setCharmander(int charmander) {
        this.charmander = charmander;
    }

    /**
     * @return the zubat
     */
    public int getZubat() {
        return zubat;
    }

    /**
     * @param zubat the zubat to set
     */
    public void setZubat(int zubat) {
        this.zubat = zubat;
    }

    /**
     * @return the ekans
     */
    public int getEkans() {
        return ekans;
    }

    /**
     * @param ekans the ekans to set
     */
    public void setEkans(int ekans) {
        this.ekans = ekans;
    }

    /**
     * @return the meowth
     */
    public int getMeowth() {
        return meowth;
    }

    /**
     * @param meowth the meowth to set
     */
    public void setMeowth(int meowth) {
        this.meowth = meowth;
    }

    /**
     * @return the eevee
     */
    public int getEevee() {
        return eevee;
    }

    /**
     * @param eevee the eevee to set
     */
    public void setEevee(int eevee) {
        this.eevee = eevee;
    }

    /**
     * @return the psyduck
     */
    public int getPsyduck() {
        return psyduck;
    }

    /**
     * @param psyduck the psyduck to set
     */
    public void setPsyduck(int psyduck) {
        this.psyduck = psyduck;
    }

    /**
     * @return the pikachu
     */
    public int getPikachu() {
        return pikachu;
    }

    /**
     * @param pikachu the pikachu to set
     */
    public void setPikachu(int pikachu) {
        this.pikachu = pikachu;
    }

    /**
     * @return the mewtwo
     */
    public int getMewtwo() {
        return mewtwo;
    }

    /**
     * @param mewtwo the mewtwo to set
     */
    public void setMewtwo(int mewtwo) {
        this.mewtwo = mewtwo;
    }

    /**
     * @return the lucario
     */
    public int getLucario() {
        return lucario;
    }

    /**
     * @param lucario the lucario to set
     */
    public void setLucario(int lucario) {
        this.lucario = lucario;
    }
}
