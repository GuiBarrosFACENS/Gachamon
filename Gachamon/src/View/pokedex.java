/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import gachamon.ConnectionJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public final class pokedex extends javax.swing.JFrame {
    view_menu view = new view_menu();
    public String name;
    private int bulba;
    private int squirt;
    private int chariz;
    private int caterp;
    private int blast;
    private int charm;
    private int zub;
    private int ekans;
    private int meowth;
    private int psy;
    private int eevee;
    private int pik;
    private int luca;
    private int mew2;
    
    int j=0;
    
    /**
     * Creates new form pokedex
     */
    public pokedex() {
        initComponents();
        bulbapeqcol.setVisible(false);
        bulbapeqpret.setVisible(false);
        squirtlepeqcol.setVisible(false);
        squirtlepeqpreto.setVisible(false);
        charpeqcol.setVisible(false);
        charpeqpreto.setVisible(false);
        caterpiepeqcol.setVisible(false);
        caterpiepeqpreto.setVisible(false);
        blastpeqpreto.setVisible(false);
        blastpeqcol.setVisible(false);
        charmpeqpreto.setVisible(false);
        charmpeqcol.setVisible(false);
        zubatpeqpreto.setVisible(false);
        zubatpeqcol.setVisible(false);
        ekanspeqpreto.setVisible(false);
        ekanspeqcol.setVisible(false);
        meowthpeqpreto.setVisible(false);
        meowthpeqcol.setVisible(false);
        psypeqpreto.setVisible(false);
        psypeqcol.setVisible(false);
        eeveepeqpreto.setVisible(false);
        eeveepeqcol.setVisible(false);
        pikpeqpreto.setVisible(false);
        pikpeqcol.setVisible(false);
        lucapeqpreto.setVisible(false);
        lucapeqcol.setVisible(false);
        mew2peqpreto.setVisible(false);
        mew2peqcol.setVisible(false);
        jLabel3.setVisible(false);
        txtsquirt.setVisible(false);
        txtcaterp.setVisible(false);
        txtchariz.setVisible(false);
        txtblastoise.setVisible(false);
        txtcharmander.setVisible(false);
        txtzubat.setVisible(false);
        txtekans.setVisible(false);
        txtmeowth.setVisible(false);
        txtpsyduck.setVisible(false);
        txteevee.setVisible(false);
        txtpikachu.setVisible(false);
        txtlucario.setVisible(false);
        txtmewtwo.setVisible(false);
        Connection con = ConnectionJDBC.getConnection();
         PreparedStatement find = null;
         List<Integer> pokemons = new ArrayList<>();
            try {
                find = con.prepareStatement("select * from cliente_pokemon where cliente_id = ? order by pokemon_id");
                find.setInt(1, ConnectionJDBC.usuarioLogado().getInt("id"));
            } catch (SQLException ex) {
                Logger.getLogger(view_menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            ResultSet rs = null;
            try {
            rs = find.executeQuery();
            while(rs.next()){
                if(pokemons.contains(rs.getInt("pokemon_id"))){
                    continue;
                }
                pokemons.add(rs.getInt("pokemon_id"));
            }
            }
            catch (SQLException ex) {
            Logger.getLogger(view_menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(pokemons.contains(2)){
            jLabel3.setVisible(true);
            jLabel3.setText("Bulbasaur");
            bulbapeqcol.setVisible(true);
            bulbapeqpret.setVisible(false);
        } else {
            jLabel3.setVisible(true);
            jLabel3.setText("??????");
            bulbapeqcol.setVisible(false);
            bulbapeqpret.setVisible(true);
            
        }
        if(pokemons.contains(3)){
            txtcaterp.setVisible(true);
            txtcaterp.setText("Caterpie");
            caterpiepeqcol.setVisible(true);
            caterpiepeqpreto.setVisible(false);
        } else {
            txtcaterp.setVisible(true);
            txtcaterp.setText("??????");
            caterpiepeqcol.setVisible(false);
            caterpiepeqpreto.setVisible(true);
            
        }
        if(pokemons.contains(4)){
            txtchariz.setVisible(true);
            txtchariz.setText("Charizard");
            charpeqcol.setVisible(true);
            charpeqpreto.setVisible(false);
        } else {
            txtchariz.setVisible(true);
            txtchariz.setText("??????");
            charpeqcol.setVisible(false);
            charpeqpreto.setVisible(true);
            
        }
        if(pokemons.contains(13)){
            txtsquirt.setVisible(true);
            txtsquirt.setText("Squirtle");
            squirtlepeqcol.setVisible(true);
            squirtlepeqpreto.setVisible(false);
        } else {
            txtsquirt.setVisible(true);
            txtsquirt.setText("??????");
            squirtlepeqcol.setVisible(false);
            squirtlepeqpreto.setVisible(true);
        }
        if(pokemons.contains(1)){
            txtblastoise.setVisible(true);
            txtblastoise.setText("Blastoise");
            blastpeqcol.setVisible(true);
            blastpeqpreto.setVisible(false);
        } else {
            txtblastoise.setVisible(true);
            txtblastoise.setText("??????");
            blastpeqcol.setVisible(false);
            blastpeqpreto.setVisible(true);
        }
        if(pokemons.contains(5)){
            txtcharmander.setVisible(true);
            txtcharmander.setText("Charmander");
            charmpeqcol.setVisible(true);
            charmpeqpreto.setVisible(false);
        } else {
            txtcharmander.setVisible(true);
            txtcharmander.setText("??????");
            charmpeqcol.setVisible(false);
            charmpeqpreto.setVisible(true);
        }
        if(pokemons.contains(14)){
            txtzubat.setVisible(true);
            txtzubat.setText("Zubat");
            zubatpeqcol.setVisible(true);
            zubatpeqpreto.setVisible(false);
        } else {
            txtzubat.setVisible(true);
            txtzubat.setText("??????");
            zubatpeqcol.setVisible(false);
            zubatpeqpreto.setVisible(true);
        }
        if(pokemons.contains(7)){
            txtekans.setVisible(true);
            txtekans.setText("Ekans");
            ekanspeqcol.setVisible(true);
            ekanspeqpreto.setVisible(false);
        } else {
            txtekans.setVisible(true);
            txtekans.setText("??????");
            ekanspeqcol.setVisible(false);
            ekanspeqpreto.setVisible(true);
        }
        if(pokemons.contains(9)){
            txtmeowth.setVisible(true);
            txtmeowth.setText("Meowth");
            meowthpeqcol.setVisible(true);
            meowthpeqpreto.setVisible(false);
        } else {
            txtmeowth.setVisible(true);
            txtmeowth.setText("??????");
            meowthpeqcol.setVisible(false);
            meowthpeqpreto.setVisible(true);
        }
        if(pokemons.contains(12)){
            txtpsyduck.setVisible(true);
            txtpsyduck.setText("Psyduck");
            psypeqcol.setVisible(true);
            psypeqpreto.setVisible(false);
        } else {
            txtpsyduck.setVisible(true);
            txtpsyduck.setText("??????");
            psypeqcol.setVisible(false);
            psypeqpreto.setVisible(true);
        }
        if(pokemons.contains(6)){
            txteevee.setVisible(true);
            txteevee.setText("Eevee");
            eeveepeqcol.setVisible(true);
            eeveepeqpreto.setVisible(false);
        } else {
            txteevee.setVisible(true);
            txteevee.setText("??????");
            eeveepeqcol.setVisible(false);
            eeveepeqpreto.setVisible(true);
        }
        if(pokemons.contains(11)){
            txtpikachu.setVisible(true);
            txtpikachu.setText("Pikachu");
            pikpeqcol.setVisible(true);
            pikpeqpreto.setVisible(false);
        } else {
            txtpikachu.setVisible(true);
            txtpikachu.setText("??????");
            pikpeqcol.setVisible(false);
            pikpeqpreto.setVisible(true);
        }
        if(pokemons.contains(8)){
            txtlucario.setVisible(true);
            txtlucario.setText("Lucario");
            lucapeqcol.setVisible(true);
            lucapeqpreto.setVisible(false);
        } else {
            txtlucario.setVisible(true);
            txtlucario.setText("??????");
            lucapeqcol.setVisible(false);
            lucapeqpreto.setVisible(true);
        }
        if(pokemons.contains(10)){
            txtmewtwo.setVisible(true);
            txtmewtwo.setText("Mewtwo");
            mew2peqcol.setVisible(true);
            mew2peqpreto.setVisible(false);
        } else {
            txtmewtwo.setVisible(true);
            txtmewtwo.setText("??????");
            mew2peqcol.setVisible(false);
            mew2peqpreto.setVisible(true);
        }
        
    
        
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<String>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtpsyduck = new javax.swing.JLabel();
        psypeqcol = new javax.swing.JLabel();
        psypeqpreto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bulbapeqcol = new javax.swing.JLabel();
        bulbapeqpret = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtblastoise = new javax.swing.JLabel();
        blastpeqcol = new javax.swing.JLabel();
        blastpeqpreto = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtcharmander = new javax.swing.JLabel();
        charmpeqcol = new javax.swing.JLabel();
        charmpeqpreto = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtsquirt = new javax.swing.JLabel();
        squirtlepeqcol = new javax.swing.JLabel();
        squirtlepeqpreto = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtzubat = new javax.swing.JLabel();
        zubatpeqcol = new javax.swing.JLabel();
        zubatpeqpreto = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtekans = new javax.swing.JLabel();
        ekanspeqcol = new javax.swing.JLabel();
        ekanspeqpreto = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        txtcaterp = new javax.swing.JLabel();
        caterpiepeqcol = new javax.swing.JLabel();
        caterpiepeqpreto = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        txtmeowth = new javax.swing.JLabel();
        meowthpeqcol = new javax.swing.JLabel();
        meowthpeqpreto = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        txtlucario = new javax.swing.JLabel();
        lucapeqcol = new javax.swing.JLabel();
        lucapeqpreto = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        txtpikachu = new javax.swing.JLabel();
        pikpeqcol = new javax.swing.JLabel();
        pikpeqpreto = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        txteevee = new javax.swing.JLabel();
        eeveepeqcol = new javax.swing.JLabel();
        eeveepeqpreto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        txtmewtwo = new javax.swing.JLabel();
        mew2peqcol = new javax.swing.JLabel();
        mew2peqpreto = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        txtchariz = new javax.swing.JLabel();
        charpeqcol = new javax.swing.JLabel();
        charpeqpreto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        teste = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 648));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/img.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 90, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpsyduck.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtpsyduck.setText("Psyduck");
        jPanel1.add(txtpsyduck, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 54, -1));

        psypeqcol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs pequenas/psyduck certoo.png"))); // NOI18N
        jPanel1.add(psypeqcol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, 130));

        psypeqpreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombras pokes/Psyduck.png"))); // NOI18N
        jPanel1.add(psypeqpreto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, 130));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 150, 160));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Bulbasaur");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, 20));

        bulbapeqcol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs pequenas/bulbasaur oficial.png"))); // NOI18N
        jPanel3.add(bulbapeqcol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 90));

        bulbapeqpret.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombras pokes/bulbasaur.png"))); // NOI18N
        jPanel3.add(bulbapeqpret, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 90));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, 160));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtblastoise.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtblastoise.setText("Blastoise");
        jPanel4.add(txtblastoise, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 54, -1));

        blastpeqcol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs pequenas/blastoise oficial (1).png"))); // NOI18N
        jPanel4.add(blastpeqcol, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 30, 160, 110));

        blastpeqpreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombras pokes/sombra blastoise (1).png"))); // NOI18N
        jPanel4.add(blastpeqpreto, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 30, 160, 110));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 150, 160));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcharmander.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtcharmander.setText("Charmander");
        jPanel5.add(txtcharmander, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 78, -1));

        charmpeqcol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs pequenas/charmander certo (1).png"))); // NOI18N
        jPanel5.add(charmpeqcol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 90));

        charmpeqpreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombras pokes/charmander (1).png"))); // NOI18N
        jPanel5.add(charmpeqpreto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 90));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 150, 160));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtsquirt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtsquirt.setText("Squirtle");
        jPanel6.add(txtsquirt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 54, -1));

        squirtlepeqcol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs pequenas/Squirtle.png"))); // NOI18N
        jPanel6.add(squirtlepeqcol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 110, 100));

        squirtlepeqpreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombras pokes/Squirtle.png"))); // NOI18N
        jPanel6.add(squirtlepeqpreto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 100));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 150, 160));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtzubat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtzubat.setText("Zubat");
        jPanel7.add(txtzubat, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 54, -1));

        zubatpeqcol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs pequenas/zubat certo.png"))); // NOI18N
        jPanel7.add(zubatpeqcol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 110));

        zubatpeqpreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombras pokes/Zubat (1).png"))); // NOI18N
        jPanel7.add(zubatpeqpreto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 110));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 150, 160));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtekans.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtekans.setText("Ekans");
        jPanel8.add(txtekans, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 54, -1));

        ekanspeqcol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs pequenas/ekans certo.png"))); // NOI18N
        jPanel8.add(ekanspeqcol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 100));

        ekanspeqpreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombras pokes/ekans (2).png"))); // NOI18N
        jPanel8.add(ekanspeqpreto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 100));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 150, 160));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcaterp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtcaterp.setText("Caterpie");
        jPanel9.add(txtcaterp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 54, -1));

        caterpiepeqcol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs pequenas/caterpie cert.png"))); // NOI18N
        jPanel9.add(caterpiepeqcol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 90));

        caterpiepeqpreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombras pokes/caterpie.png"))); // NOI18N
        jPanel9.add(caterpiepeqpreto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 90));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 150, 160));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtmeowth.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtmeowth.setText("Meowth");
        jPanel10.add(txtmeowth, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 54, -1));

        meowthpeqcol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs pequenas/meowth certo.png"))); // NOI18N
        jPanel10.add(meowthpeqcol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 120));

        meowthpeqpreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombras pokes/Meowth.png"))); // NOI18N
        jPanel10.add(meowthpeqpreto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 120));

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 150, 160));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtlucario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtlucario.setText("Lucario");
        jPanel11.add(txtlucario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 54, -1));

        lucapeqcol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs pequenas/lucario certoo.png"))); // NOI18N
        jPanel11.add(lucapeqcol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 120));

        lucapeqpreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombras pokes/lucario (1).png"))); // NOI18N
        jPanel11.add(lucapeqpreto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 120));

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 150, 160));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpikachu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtpikachu.setText("Pikachu");
        jPanel12.add(txtpikachu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 54, -1));

        pikpeqcol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs pequenas/pikachu certo.png"))); // NOI18N
        jPanel12.add(pikpeqcol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, -1));

        pikpeqpreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombras pokes/Pikachu (2).png"))); // NOI18N
        jPanel12.add(pikpeqpreto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, -1));

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 150, 160));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txteevee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txteevee.setText("Eevee");
        jPanel13.add(txteevee, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 54, -1));

        eeveepeqcol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs pequenas/evee certo.png"))); // NOI18N
        jPanel13.add(eeveepeqcol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 100));

        eeveepeqpreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombras pokes/eevee (1).png"))); // NOI18N
        jPanel13.add(eeveepeqpreto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 100));

        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 150, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pokedex-3d-logo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 270, 50));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtmewtwo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtmewtwo.setText("Mewtwo");
        jPanel14.add(txtmewtwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 54, -1));

        mew2peqcol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs pequenas/Mewtwo certo.png"))); // NOI18N
        jPanel14.add(mew2peqcol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 100));

        mew2peqpreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombras pokes/Mewtwo (1).png"))); // NOI18N
        jPanel14.add(mew2peqpreto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 100));

        jPanel2.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 150, 160));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtchariz.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtchariz.setText("Charizard");
        jPanel15.add(txtchariz, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 54, -1));

        charpeqcol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs pequenas/charizard certo.png"))); // NOI18N
        jPanel15.add(charpeqcol, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, 90));

        charpeqpreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sombras pokes/charizard.png"))); // NOI18N
        jPanel15.add(charpeqpreto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, 90));

        jPanel2.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 150, 160));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 60, 40));

        teste.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(teste, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        j=10;
        dispose();
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
            java.util.logging.Logger.getLogger(pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pokedex().setVisible(true);
            }
        
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blastpeqcol;
    private javax.swing.JLabel blastpeqpreto;
    private javax.swing.JLabel bulbapeqcol;
    private javax.swing.JLabel bulbapeqpret;
    private javax.swing.JLabel caterpiepeqcol;
    private javax.swing.JLabel caterpiepeqpreto;
    private javax.swing.JLabel charmpeqcol;
    private javax.swing.JLabel charmpeqpreto;
    private javax.swing.JLabel charpeqcol;
    private javax.swing.JLabel charpeqpreto;
    private javax.swing.JLabel eeveepeqcol;
    private javax.swing.JLabel eeveepeqpreto;
    private javax.swing.JLabel ekanspeqcol;
    private javax.swing.JLabel ekanspeqpreto;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lucapeqcol;
    private javax.swing.JLabel lucapeqpreto;
    private javax.swing.JLabel meowthpeqcol;
    private javax.swing.JLabel meowthpeqpreto;
    private javax.swing.JLabel mew2peqcol;
    private javax.swing.JLabel mew2peqpreto;
    private javax.swing.JLabel pikpeqcol;
    private javax.swing.JLabel pikpeqpreto;
    private javax.swing.JLabel psypeqcol;
    private javax.swing.JLabel psypeqpreto;
    private javax.swing.JLabel squirtlepeqcol;
    private javax.swing.JLabel squirtlepeqpreto;
    private javax.swing.JLabel teste;
    private javax.swing.JLabel txtblastoise;
    private javax.swing.JLabel txtcaterp;
    private javax.swing.JLabel txtchariz;
    private javax.swing.JLabel txtcharmander;
    private javax.swing.JLabel txteevee;
    private javax.swing.JLabel txtekans;
    private javax.swing.JLabel txtlucario;
    private javax.swing.JLabel txtmeowth;
    private javax.swing.JLabel txtmewtwo;
    private javax.swing.JLabel txtpikachu;
    private javax.swing.JLabel txtpsyduck;
    private javax.swing.JLabel txtsquirt;
    private javax.swing.JLabel txtzubat;
    private javax.swing.JLabel zubatpeqcol;
    private javax.swing.JLabel zubatpeqpreto;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the bulba
     */
    public int getBulba() {
        return bulba;
    }

    /**
     * @param bulba the bulba to set
     */
    public void setBulba(int bulba) {
        this.bulba = bulba;
    }

    /**
     * @return the squirt
     */
    public int getSquirt() {
        return squirt;
    }

    /**
     * @param squirt the squirt to set
     */
    public void setSquirt(int squirt) {
        this.squirt = squirt;
    }

    /**
     * @return the chariz
     */
    public int getChariz() {
        return chariz;
    }

    /**
     * @param chariz the chariz to set
     */
    public void setChariz(int chariz) {
        this.chariz = chariz;
    }

    /**
     * @return the caterp
     */
    public int getCaterp() {
        return caterp;
    }

    /**
     * @param caterp the caterp to set
     */
    public void setCaterp(int caterp) {
        this.caterp = caterp;
    }

    /**
     * @return the blast
     */
    public int getBlast() {
        return blast;
    }

    /**
     * @param blast the blast to set
     */
    public void setBlast(int blast) {
        this.blast = blast;
    }

    /**
     * @return the charm
     */
    public int getCharm() {
        return charm;
    }

    /**
     * @param charm the charm to set
     */
    public void setCharm(int charm) {
        this.charm = charm;
    }

    /**
     * @return the zub
     */
    public int getZub() {
        return zub;
    }

    /**
     * @param zub the zub to set
     */
    public void setZub(int zub) {
        this.zub = zub;
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
     * @return the psy
     */
    public int getPsy() {
        return psy;
    }

    /**
     * @param psy the psy to set
     */
    public void setPsy(int psy) {
        this.psy = psy;
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
     * @return the pik
     */
    public int getPik() {
        return pik;
    }

    /**
     * @param pik the pik to set
     */
    public void setPik(int pik) {
        this.pik = pik;
    }

    /**
     * @return the luca
     */
    public int getLuca() {
        return luca;
    }

    /**
     * @param luca the luca to set
     */
    public void setLuca(int luca) {
        this.luca = luca;
    }

    /**
     * @return the mew2
     */
    public int getMew2() {
        return mew2;
    }

    /**
     * @param mew2 the mew2 to set
     */
    public void setMew2(int mew2) {
        this.mew2 = mew2;
    }
}
