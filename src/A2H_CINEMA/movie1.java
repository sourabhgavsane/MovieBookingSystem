package A2H_CINEMA;

import javax.swing.ImageIcon;

public class movie1 extends javax.swing.JFrame {
    public movie1() {
        initComponents();
        name.setText(movie.movienm);
        rating.setText(movie.rating);
        shdate.setText(movie.sdt);
        screen.setText(movie.sc+"");
        if(movie.ic==1)
        {
            image.setIcon(new ImageIcon("C:\\Users\\ACER\\Documents\\NetBeansProjects\\A2HCINEMA\\src\\A2H_CINEMA\\DKPM2A5VYAAR-uZ.jpg"));
        }
        else if(movie.ic==2)
        {
            image.setIcon(new ImageIcon("C:\\Users\\ACER\\Documents\\NetBeansProjects\\A2HCINEMA\\src\\A2H_CINEMA\\hym22padmavati 2.jpg"));
        }
        else if(movie.ic==3)
        {
            image.setIcon(new ImageIcon("C:\\Users\\ACER\\Documents\\NetBeansProjects\\A2HCINEMA\\src\\A2H_CINEMA\\2.0_(film).jpg"));
        }
        else if(movie.ic==4)
        {
            image.setIcon(new ImageIcon("C:\\Users\\ACER\\Documents\\NetBeansProjects\\A2HCINEMA\\src\\A2H_CINEMA\\DHfGMZQVwAE6pET.jpg"));
        }


    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        shdate = new javax.swing.JLabel();
        rating = new javax.swing.JLabel();
        screen = new javax.swing.JLabel();
        proceed = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(255, 153, 255));
        jLayeredPane1.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("SELECTED MOVIE DETAILS");
        jLabel1.setBounds(100, 20, 380, 20);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setText("MOVIE NAME");
        jLabel2.setBounds(40, 70, 140, 20);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setText("Show Date");
        jLabel3.setBounds(40, 100, 130, 22);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setText("Rating");
        jLabel4.setBounds(40, 130, 100, 20);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        name.setFont(new java.awt.Font("Tahoma", 1, 14));
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        name.setBounds(210, 70, 110, 20);
        jLayeredPane1.add(name, javax.swing.JLayeredPane.DEFAULT_LAYER);

        shdate.setFont(new java.awt.Font("Tahoma", 1, 14));
        shdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        shdate.setBounds(210, 100, 110, 20);
        jLayeredPane1.add(shdate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        rating.setFont(new java.awt.Font("Tahoma", 1, 14));
        rating.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rating.setBounds(210, 130, 110, 20);
        jLayeredPane1.add(rating, javax.swing.JLayeredPane.DEFAULT_LAYER);

        screen.setFont(new java.awt.Font("Tahoma", 1, 14));
        screen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        screen.setBounds(210, 170, 110, 20);
        jLayeredPane1.add(screen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        proceed.setBackground(new java.awt.Color(255, 255, 102));
        proceed.setFont(new java.awt.Font("Tahoma", 1, 14));
        proceed.setForeground(new java.awt.Color(255, 0, 0));
        proceed.setText("PROCEED BOOKING");
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });
        proceed.setBounds(70, 250, 190, 30);
        jLayeredPane1.add(proceed, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel10.setText("SCREEN");
        jLabel10.setBounds(40, 160, 72, 22);
        jLayeredPane1.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        image.setBounds(330, 60, 200, 200);
        jLayeredPane1.add(image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        this.dispose();
        new seat().setVisible(true);
    }//GEN-LAST:event_proceedActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new movie1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel name;
    private javax.swing.JButton proceed;
    private javax.swing.JLabel rating;
    private javax.swing.JLabel screen;
    private javax.swing.JLabel shdate;
    // End of variables declaration//GEN-END:variables
}
