package A2H_CINEMA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class MOVIE_LIST extends javax.swing.JFrame {

    Timer t;
    int i = 1;
   
    public MOVIE_LIST() {
         movie.conn();

        initComponents();
        
        t = new Timer(2000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sql;
                if (i == 5) {
                    i = 1;
                } 
                else
                {
                    if (i == 1) {
                        moviep.setIcon(new ImageIcon("C:\\Users\\ACER\\Documents\\NetBeansProjects\\A2HCINEMA\\src\\A2H_CINEMA\\DKPM2A5VYAAR-uZ.jpg"));
                        movie.ic=1;
                        try
                        {
                         sql="select curdate()";
                         movie.rs=movie.st.executeQuery(sql);
                         movie.rs.next();
                         movie.sdt=movie.rs.getString(1);
                         movied.setText(movie.sdt);
                        sql="select * from  movie where date='"+movie.sdt+"' and screen='screen 1'";
                        movie.rs=movie.st.executeQuery(sql);

                        movie.rs.next();
                        movie.movienm=movie.rs.getString(1);

                        movie.sc=movie.rs.getString(2);
                        movie.rating=movie.rs.getString(3);

                       movien.setText(movie.rs.getString(1));
                       movies.setText( movie.rs.getString(2));
                 //      System.out.print(movie.sc);
                 }
                 catch(Exception a){System.out.print(a.getMessage());}
                     }

                    if (i == 2) {
                        moviep.setIcon(new ImageIcon("C:\\Users\\ACER\\Documents\\NetBeansProjects\\A2HCINEMA\\src\\A2H_CINEMA\\hym22padmavati 2.jpg"));
                        movie.ic=2;
                        try
                        {
                         sql="select curdate()";
                         movie.rs=movie.st.executeQuery(sql);
                         movie.rs.next();
                         movie.sdt=movie.rs.getString(1);
                        movied.setText(movie.sdt);
                        sql="select * from  movie where date='"+movie.sdt+"' and screen='screen 2'";
                        movie.rs=movie.st.executeQuery(sql);
                        movie.rs.next();
                        movie.movienm=movie.rs.getString(1);
                        movie.sc=movie.rs.getString(2);
                        movie.rating=movie.rs.getString(3);

                     movien.setText(movie.rs.getString(1));
                   movies.setText( movie.rs.getString(2));
                 }
                 catch(Exception a){System.out.print(a.getMessage());}
                    }
                    if (i == 3) {
                        movie.ic=3;
                        moviep.setIcon(new ImageIcon("C:\\Users\\ACER\\Documents\\NetBeansProjects\\A2HCINEMA\\src\\A2H_CINEMA\\2.0_(film).jpg"));
                        try
                        {
                         sql="select curdate()";
                         movie.rs=movie.st.executeQuery(sql);
                         movie.rs.next();
                         movie.sdt=movie.rs.getString(1);
                                                 movied.setText(movie.sdt);
                        sql="select * from  movie where date='"+movie.sdt+"' and screen='screen 3'";
                        movie.rs=movie.st.executeQuery(sql);
                         movie.rs.next();
                         movie.movienm=movie.rs.getString(1);
                        movie.sc=movie.rs.getString(2);
                        movie.rating=movie.rs.getString(3);

                   movien.setText(movie.rs.getString(1));
                   movies.setText( movie.rs.getString(2));
                 }
                 catch(Exception a){System.out.print(a.getMessage());}
                    }
                    if (i == 4) {
                        movie.ic=4;
                        moviep.setIcon(new ImageIcon("C:\\Users\\ACER\\Documents\\NetBeansProjects\\A2HCINEMA\\src\\A2H_CINEMA\\DHfGMZQVwAE6pET.jpg"));
                        try
                        {
                         sql="select curdate()";
                         movie.rs=movie.st.executeQuery(sql);
                         movie.rs.next();
                         movie.sdt=movie.rs.getString(1);
                                                  movied.setText(movie.sdt);
                        sql="select * from  movie where date='"+movie.sdt+"' and screen='screen 4'";
                        movie.rs=movie.st.executeQuery(sql);
                       movie.rs.next();
                   movie.movienm=movie.rs.getString(1);
                        movie.sc=movie.rs.getString(2);
                        movie.rating=movie.rs.getString(3);

                    movien.setText(movie.rs.getString(1));
                   movies.setText( movie.rs.getString(2));
                 }
                 catch(Exception a){System.out.print(a.getMessage());}
                    }
                    ++i;
                }
            }
        });
      t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        moviep = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        movies = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        movien = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        movied = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(153, 153, 255));
        jLayeredPane1.setOpaque(true);

        moviep.setAlignmentX(0.1F);
        moviep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        moviep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moviepMouseClicked(evt);
            }
        });
        moviep.setBounds(130, 20, 340, 220);
        jLayeredPane1.add(moviep, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton1.setText(">");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(500, 150, 60, 30);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(40, 150, 60, 30);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        backbtn.setFont(new java.awt.Font("Tahoma", 1, 11));
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        backbtn.setBounds(480, 320, 70, 23);
        jLayeredPane1.add(backbtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setText("SCREEN");
        jLabel3.setBounds(180, 260, 80, 22);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        movies.setBackground(new java.awt.Color(255, 255, 255));
        movies.setText(" ");
        movies.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        movies.setOpaque(true);
        movies.setBounds(300, 260, 120, 20);
        jLayeredPane1.add(movies, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setText("NAME");
        jLabel4.setBounds(180, 290, 80, 22);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        movien.setBackground(new java.awt.Color(255, 255, 255));
        movien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        movien.setOpaque(true);
        movien.setBounds(300, 290, 120, 20);
        jLayeredPane1.add(movien, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setText("DATE");
        jLabel5.setBounds(180, 320, 80, 22);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        movied.setBackground(new java.awt.Color(255, 255, 255));
        movied.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        movied.setOpaque(true);
        movied.setBounds(300, 320, 120, 20);
        jLayeredPane1.add(movied, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //t.start();
        --i;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // t.stop();
        ++i;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        this.dispose();
        new LOGIN_FRAME().setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void moviepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moviepMouseClicked
            t.stop();
            this.dispose();
            new movie1().setVisible(true);
    }//GEN-LAST:event_moviepMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MOVIE_LIST().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel movied;
    private javax.swing.JLabel movien;
    private javax.swing.JLabel moviep;
    private javax.swing.JLabel movies;
    // End of variables declaration//GEN-END:variables
}
