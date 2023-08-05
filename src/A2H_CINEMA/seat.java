package A2H_CINEMA;

import java.awt.Color;
import javax.swing.JOptionPane;


public class seat extends javax.swing.JFrame {
  int nd=0;
  int ng=0;
  int ns=0;
  int n=0;
  int nt=0;
  String sno="";
  String sc;
  void check()
    {
      
        movie.conn();

        int st;
       
        sc=movie.sc;
        if(sc.equals("screen 1"))
            sc="s1";
        else if(sc.equals("screen 2"))
           sc="s2";
        else
            sc="s3"; 
        int c=jList1.getSelectedIndex();

        if(c==0)
            st=1;
        else if(c==1)
            st=2;
        else if(c==2)
            st=3;
        else
            st=4;
       
        movie.sht=st;
        String bt ="";
                
        try
        {
           String query="select * from ticket where bdt='"+movie.sdt+
                   "' and sc='"+sc+"' and st="+movie.sht;
           movie.rs=movie.st.executeQuery(query);
           while(movie.rs.next())
           {
               bt+=movie.rs.getString(1)+' ';
           }

           String ss="";

           int l=bt.length();
           int i=0;

           while(i<bt.length())
           {
               if(bt.charAt(i)==' ')
               {
                  ss=ss.trim();
                  if(ss.equals(d1.getText().trim().toLowerCase()))
                      d1.setBackground(Color.red);
                  else if(ss.equals(d2.getText()))
                      d2.setBackground(Color.red);
                  else if(ss.equals(d3.getText()))
                      d3.setBackground(Color.red);
                  else if(ss.equals(d4.getText()))
                      d4.setBackground(Color.red);
                  else if(ss.equals(D5.getText()))
                      D5.setBackground(Color.red);
                  else if(ss.equals(D6.getText()))
                      D6.setBackground(Color.red);
                  else if(ss.equals(D7.getText()))
                      D7.setBackground(Color.red);
                  else if(ss.equals(d8.getText()))
                      d8.setBackground(Color.red);
                  else if(ss.equals(d9.getText()))
                      d9.setBackground(Color.red);
                  else if(ss.equals(D10.getText()))
                      D10.setBackground(Color.red);
                  else if(ss.equals(d11.getText()))
                      d11.setBackground(Color.red);
                  else if(ss.equals(d12.getText()))
                      d12.setBackground(Color.red);
                  else if(ss.equals(d13.getText()))
                      d13.setBackground(Color.red);
                  else if(ss.equals(d14.getText()))
                      d14.setBackground(Color.red);
                  else if(ss.equals(D15.getText()))
                      D15.setBackground(Color.red);
                  else if(ss.equals(D16.getText()))
                      D16.setBackground(Color.red);
                  else if(ss.equals(d17.getText()))
                      d17.setBackground(Color.red);
                  else if(ss.equals(D18.getText()))
                      D18.setBackground(Color.red);
                  else if(ss.equals(d19.getText()))
                      d19.setBackground(Color.red);
                  else if(ss.equals(d20.getText()))
                      d20.setBackground(Color.red);
                  else if(ss.equals(d21.getText()))
                      d21.setBackground(Color.red);
                  else if(ss.equals(d22.getText()))
                      d22.setBackground(Color.red);
                  else if(ss.equals(d23.getText()))
                      d23.setBackground(Color.red);
                  else if(ss.equals(d24.getText()))
                      d24.setBackground(Color.red);
                  else if(ss.equals(d25.getText()))
                      d25.setBackground(Color.red);
                  else if(ss.equals(d26.getText()))
                      d26.setBackground(Color.red);
                  else if(ss.equals(d27.getText()))
                      d27.setBackground(Color.red);
                  else if(ss.equals(d28.getText()))
                      d28.setBackground(Color.red);
                  else if(ss.equals(d29.getText()))
                      d29.setBackground(Color.red);
                  else if(ss.equals(d30.getText()))
                      d30.setBackground(Color.red);
                  else if(ss.equals(d31.getText()))
                      d31.setBackground(Color.red);
                  else if(ss.equals(d32.getText()))
                      d32.setBackground(Color.red);
                  else if(ss.equals(d33.getText()))
                      d33.setBackground(Color.red);
                  else if(ss.equals(d34.getText()))
                      d34.setBackground(Color.red);
                  else if(ss.equals(d35.getText()))
                      d35.setBackground(Color.red);
                  else if(ss.equals(d36.getText()))
                      d36.setBackground(Color.red);
                  else if(ss.equals(d37.getText()))
                      d37.setBackground(Color.red);
                  else if(ss.equals(d38.getText()))
                      d38.setBackground(Color.red);
                  else if(ss.equals(d39.getText()))
                      d39.setBackground(Color.red);
                  else if(ss.equals(d40.getText()))
                      d40.setBackground(Color.red);
                  else if(ss.equals(d41.getText()))
                      d41.setBackground(Color.red);
                  else if(ss.equals(d42.getText()))
                      d42.setBackground(Color.red);
                  else if(ss.equals(d43.getText()))
                      d43.setBackground(Color.red);
                  else if(ss.equals(d44.getText()))
                      d44.setBackground(Color.red);
                  else if(ss.equals(g1.getText()))
                      g1.setBackground(Color.red);
                  else if(ss.equals(g2.getText()))
                      g2.setBackground(Color.red);
                  else if(ss.equals(g3.getText()))
                      g3.setBackground(Color.red);
                  else if(ss.equals(g4.getText()))
                      g4.setBackground(Color.red);
                  else if(ss.equals(g5.getText()))
                      g5.setBackground(Color.red);
                  else if(ss.equals(g6.getText()))
                      g6.setBackground(Color.red);
                  else if(ss.equals(g7.getText()))
                      g7.setBackground(Color.red);
                  else if(ss.equals(g8.getText()))
                      g8.setBackground(Color.red);
                  else if(ss.equals(g9.getText()))
                      g9.setBackground(Color.red);
                  else if(ss.equals(g10.getText()))
                      g10.setBackground(Color.red);
                  else if(ss.equals(g11.getText()))
                      g11.setBackground(Color.red);
                  else if(ss.equals(g12.getText()))
                      g12.setBackground(Color.red);
                  else if(ss.equals(g13.getText()))
                      g13.setBackground(Color.red);
                  else if(ss.equals(g14.getText()))
                      g14.setBackground(Color.red);
                  else if(ss.equals(g15.getText()))
                      g15.setBackground(Color.red);
                  else if(ss.equals(g16.getText()))
                      g16.setBackground(Color.red);
                  else if(ss.equals(g17.getText()))
                      g17.setBackground(Color.red);
                  else if(ss.equals(g18.getText()))
                      g18.setBackground(Color.red);
                  else if(ss.equals(g19.getText()))
                      g19.setBackground(Color.red);
                  else if(ss.equals(g20.getText()))
                      g20.setBackground(Color.red);
                  else if(ss.equals(g21.getText()))
                      g21.setBackground(Color.red);
                  else if(ss.equals(g22.getText()))
                      g22.setBackground(Color.red);
                  else if(ss.equals(g23.getText()))
                      g23.setBackground(Color.red);
                  else if(ss.equals(g24.getText()))
                      g24.setBackground(Color.red);
                  else if(ss.equals(g25.getText()))
                      g25.setBackground(Color.red);
                  else if(ss.equals(g26.getText()))
                      g26.setBackground(Color.red);
                  else if(ss.equals(g27.getText()))
                      g27.setBackground(Color.red);
                  else if(ss.equals(g28.getText()))
                      g28.setBackground(Color.red);
                  else if(ss.equals(g29.getText()))
                      g29.setBackground(Color.red);
                  else if(ss.equals(g30.getText()))
                      g30.setBackground(Color.red);
                  else if(ss.equals(s1.getText()))
                      s1.setBackground(Color.red);
                  else if(ss.equals(s2.getText()))
                      s2.setBackground(Color.red);
                  else if(ss.equals(s3.getText()))
                      s3.setBackground(Color.red);
                  else if(ss.equals(s4.getText()))
                      s4.setBackground(Color.red);
                  else if(ss.equals(s5.getText()))
                      s5.setBackground(Color.red);
                  else if(ss.equals(s6.getText()))
                      s6.setBackground(Color.red);
                  else if(ss.equals(s7.getText()))
                      s7.setBackground(Color.red);
                  else if(ss.equals(s8.getText()))
                      s8.setBackground(Color.red);
                  else if(ss.equals(s9.getText()))
                      s9.setBackground(Color.red);
                  else if(ss.equals(s10.getText()))
                      s10.setBackground(Color.red);
                  else if(ss.equals(s11.getText()))
                      s11.setBackground(Color.red);
                  else if(ss.equals(s12.getText()))
                      s12.setBackground(Color.red);
                  else if(ss.equals(s13.getText()))
                      s13.setBackground(Color.red);
                  else if(ss.equals(s14.getText()))
                      s14.setBackground(Color.red);
                  else if(ss.equals(s15.getText()))
                      s15.setBackground(Color.red);
                  else if(ss.equals(s16.getText()))
                      s16.setBackground(Color.red);
                  else if(ss.equals(s17.getText()))
                      s17.setBackground(Color.red);
                  else if(ss.equals(s18.getText()))
                      s18.setBackground(Color.red);
                  else if(ss.equals(s19.getText()))
                      s19.setBackground(Color.red);
                  else if(ss.equals(s20.getText()))
                      s20.setBackground(Color.red);

                //  ++i;
                  ss="";
                 // System.out.print(ss);
               }
               ss+=bt.charAt(i);
               ++i;
           }
        }
        catch(Exception e){System.out.print(e.getMessage());}
  }
    public seat() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        D15 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        D6 = new javax.swing.JLabel();
        D5 = new javax.swing.JLabel();
        D7 = new javax.swing.JLabel();
        d8 = new javax.swing.JLabel();
        d9 = new javax.swing.JLabel();
        D10 = new javax.swing.JLabel();
        d11 = new javax.swing.JLabel();
        d12 = new javax.swing.JLabel();
        d13 = new javax.swing.JLabel();
        d14 = new javax.swing.JLabel();
        D16 = new javax.swing.JLabel();
        d17 = new javax.swing.JLabel();
        D18 = new javax.swing.JLabel();
        d19 = new javax.swing.JLabel();
        d20 = new javax.swing.JLabel();
        d21 = new javax.swing.JLabel();
        d22 = new javax.swing.JLabel();
        d23 = new javax.swing.JLabel();
        d24 = new javax.swing.JLabel();
        d25 = new javax.swing.JLabel();
        d26 = new javax.swing.JLabel();
        d27 = new javax.swing.JLabel();
        d28 = new javax.swing.JLabel();
        d29 = new javax.swing.JLabel();
        d30 = new javax.swing.JLabel();
        d31 = new javax.swing.JLabel();
        d32 = new javax.swing.JLabel();
        d33 = new javax.swing.JLabel();
        d34 = new javax.swing.JLabel();
        d35 = new javax.swing.JLabel();
        d36 = new javax.swing.JLabel();
        d37 = new javax.swing.JLabel();
        d38 = new javax.swing.JLabel();
        d39 = new javax.swing.JLabel();
        d40 = new javax.swing.JLabel();
        d41 = new javax.swing.JLabel();
        d42 = new javax.swing.JLabel();
        D43 = new javax.swing.JLabel();
        D44 = new javax.swing.JLabel();
        D45 = new javax.swing.JLabel();
        g5 = new javax.swing.JLabel();
        d43 = new javax.swing.JLabel();
        d44 = new javax.swing.JLabel();
        d45 = new javax.swing.JLabel();
        d46 = new javax.swing.JLabel();
        d47 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        d57 = new javax.swing.JLabel();
        d58 = new javax.swing.JLabel();
        d59 = new javax.swing.JLabel();
        d60 = new javax.swing.JLabel();
        d61 = new javax.swing.JLabel();
        d62 = new javax.swing.JLabel();
        d63 = new javax.swing.JLabel();
        d64 = new javax.swing.JLabel();
        d65 = new javax.swing.JLabel();
        s5 = new javax.swing.JLabel();
        g2 = new javax.swing.JLabel();
        g3 = new javax.swing.JLabel();
        g4 = new javax.swing.JLabel();
        g6 = new javax.swing.JLabel();
        g7 = new javax.swing.JLabel();
        g8 = new javax.swing.JLabel();
        g9 = new javax.swing.JLabel();
        g10 = new javax.swing.JLabel();
        g11 = new javax.swing.JLabel();
        g12 = new javax.swing.JLabel();
        g13 = new javax.swing.JLabel();
        g14 = new javax.swing.JLabel();
        g15 = new javax.swing.JLabel();
        g16 = new javax.swing.JLabel();
        g17 = new javax.swing.JLabel();
        g18 = new javax.swing.JLabel();
        g19 = new javax.swing.JLabel();
        g20 = new javax.swing.JLabel();
        g21 = new javax.swing.JLabel();
        g22 = new javax.swing.JLabel();
        g23 = new javax.swing.JLabel();
        g24 = new javax.swing.JLabel();
        g25 = new javax.swing.JLabel();
        g26 = new javax.swing.JLabel();
        g27 = new javax.swing.JLabel();
        g28 = new javax.swing.JLabel();
        g29 = new javax.swing.JLabel();
        g30 = new javax.swing.JLabel();
        g1 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        s10 = new javax.swing.JLabel();
        s9 = new javax.swing.JLabel();
        s8 = new javax.swing.JLabel();
        s7 = new javax.swing.JLabel();
        s6 = new javax.swing.JLabel();
        s15 = new javax.swing.JLabel();
        s14 = new javax.swing.JLabel();
        s13 = new javax.swing.JLabel();
        s12 = new javax.swing.JLabel();
        s11 = new javax.swing.JLabel();
        s20 = new javax.swing.JLabel();
        s19 = new javax.swing.JLabel();
        s18 = new javax.swing.JLabel();
        s17 = new javax.swing.JLabel();
        s16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ticket = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        amt = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(153, 0, 0));
        jLayeredPane1.setOpaque(true);

        D15.setBackground(new java.awt.Color(255, 255, 153));
        D15.setFont(new java.awt.Font("Tahoma", 1, 12));
        D15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D15.setText("D15");
        D15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        D15.setOpaque(true);
        D15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D15MouseClicked(evt);
            }
        });
        D15.setBounds(810, 60, 30, 30);
        jLayeredPane1.add(D15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d4.setBackground(new java.awt.Color(255, 255, 153));
        d4.setFont(new java.awt.Font("Tahoma", 1, 12));
        d4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d4.setText("D4");
        d4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d4.setOpaque(true);
        d4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d4MouseClicked(evt);
            }
        });
        d4.setBounds(140, 60, 30, 30);
        jLayeredPane1.add(d4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d3.setBackground(new java.awt.Color(255, 255, 153));
        d3.setFont(new java.awt.Font("Tahoma", 1, 12));
        d3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d3.setText("D3");
        d3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d3.setOpaque(true);
        d3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d3MouseClicked(evt);
            }
        });
        d3.setBounds(100, 60, 30, 30);
        jLayeredPane1.add(d3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d2.setBackground(new java.awt.Color(255, 255, 153));
        d2.setFont(new java.awt.Font("Tahoma", 1, 12));
        d2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d2.setText("D2");
        d2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d2.setOpaque(true);
        d2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d2MouseClicked(evt);
            }
        });
        d2.setBounds(60, 60, 30, 30);
        jLayeredPane1.add(d2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d1.setBackground(new java.awt.Color(255, 255, 153));
        d1.setFont(new java.awt.Font("Tahoma", 1, 12));
        d1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d1.setText("D1");
        d1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d1.setOpaque(true);
        d1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d1MouseClicked(evt);
            }
        });
        d1.setBounds(20, 60, 30, 30);
        jLayeredPane1.add(d1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        D6.setBackground(new java.awt.Color(255, 255, 153));
        D6.setFont(new java.awt.Font("Tahoma", 1, 12));
        D6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D6.setText("D6");
        D6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        D6.setOpaque(true);
        D6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D6MouseClicked(evt);
            }
        });
        D6.setBounds(320, 60, 30, 30);
        jLayeredPane1.add(D6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        D5.setBackground(new java.awt.Color(255, 255, 153));
        D5.setFont(new java.awt.Font("Tahoma", 1, 12));
        D5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D5.setText("D5");
        D5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        D5.setOpaque(true);
        D5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D5MouseClicked(evt);
            }
        });
        D5.setBounds(180, 60, 30, 30);
        jLayeredPane1.add(D5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        D7.setBackground(new java.awt.Color(255, 255, 153));
        D7.setFont(new java.awt.Font("Tahoma", 1, 12));
        D7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D7.setText("D7");
        D7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        D7.setOpaque(true);
        D7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D7MouseClicked(evt);
            }
        });
        D7.setBounds(360, 60, 30, 30);
        jLayeredPane1.add(D7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d8.setBackground(new java.awt.Color(255, 255, 153));
        d8.setFont(new java.awt.Font("Tahoma", 1, 12));
        d8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d8.setText("D8");
        d8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d8.setOpaque(true);
        d8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d8MouseClicked(evt);
            }
        });
        d8.setBounds(400, 60, 30, 30);
        jLayeredPane1.add(d8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d9.setBackground(new java.awt.Color(255, 255, 153));
        d9.setFont(new java.awt.Font("Tahoma", 1, 12));
        d9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d9.setText("D9");
        d9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d9.setOpaque(true);
        d9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d9MouseClicked(evt);
            }
        });
        d9.setBounds(440, 60, 30, 30);
        jLayeredPane1.add(d9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        D10.setBackground(new java.awt.Color(255, 255, 153));
        D10.setFont(new java.awt.Font("Tahoma", 1, 12));
        D10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D10.setText("D10");
        D10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        D10.setOpaque(true);
        D10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D10MouseClicked(evt);
            }
        });
        D10.setBounds(480, 60, 30, 30);
        jLayeredPane1.add(D10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d11.setBackground(new java.awt.Color(255, 255, 153));
        d11.setFont(new java.awt.Font("Tahoma", 1, 12));
        d11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d11.setText("D11");
        d11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d11.setOpaque(true);
        d11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d11MouseClicked(evt);
            }
        });
        d11.setBounds(650, 60, 30, 30);
        jLayeredPane1.add(d11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d12.setBackground(new java.awt.Color(255, 255, 153));
        d12.setFont(new java.awt.Font("Tahoma", 1, 12));
        d12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d12.setText("D12");
        d12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d12.setOpaque(true);
        d12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d12MouseClicked(evt);
            }
        });
        d12.setBounds(690, 60, 30, 30);
        jLayeredPane1.add(d12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d13.setBackground(new java.awt.Color(255, 255, 153));
        d13.setFont(new java.awt.Font("Tahoma", 1, 12));
        d13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d13.setText("D13");
        d13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d13.setOpaque(true);
        d13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d13MouseClicked(evt);
            }
        });
        d13.setBounds(730, 60, 30, 30);
        jLayeredPane1.add(d13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d14.setBackground(new java.awt.Color(255, 255, 153));
        d14.setFont(new java.awt.Font("Tahoma", 1, 12));
        d14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d14.setText("D14");
        d14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d14.setOpaque(true);
        d14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d14MouseClicked(evt);
            }
        });
        d14.setBounds(770, 60, 30, 30);
        jLayeredPane1.add(d14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        D16.setBackground(new java.awt.Color(255, 255, 153));
        D16.setFont(new java.awt.Font("Tahoma", 1, 12));
        D16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D16.setText("D16");
        D16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        D16.setOpaque(true);
        D16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D16MouseClicked(evt);
            }
        });
        D16.setBounds(20, 100, 30, 30);
        jLayeredPane1.add(D16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d17.setBackground(new java.awt.Color(255, 255, 153));
        d17.setFont(new java.awt.Font("Tahoma", 1, 12));
        d17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d17.setText("D17");
        d17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d17.setOpaque(true);
        d17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d17MouseClicked(evt);
            }
        });
        d17.setBounds(60, 100, 30, 30);
        jLayeredPane1.add(d17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        D18.setBackground(new java.awt.Color(255, 255, 153));
        D18.setFont(new java.awt.Font("Tahoma", 1, 12));
        D18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D18.setText("D18");
        D18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        D18.setOpaque(true);
        D18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D18MouseClicked(evt);
            }
        });
        D18.setBounds(100, 100, 30, 30);
        jLayeredPane1.add(D18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d19.setBackground(new java.awt.Color(255, 255, 153));
        d19.setFont(new java.awt.Font("Tahoma", 1, 12));
        d19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d19.setText("D19");
        d19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d19.setOpaque(true);
        d19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d19MouseClicked(evt);
            }
        });
        d19.setBounds(140, 100, 30, 30);
        jLayeredPane1.add(d19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d20.setBackground(new java.awt.Color(255, 255, 153));
        d20.setFont(new java.awt.Font("Tahoma", 1, 12));
        d20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d20.setText("D20");
        d20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d20.setOpaque(true);
        d20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d20MouseClicked(evt);
            }
        });
        d20.setBounds(180, 100, 30, 30);
        jLayeredPane1.add(d20, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d21.setBackground(new java.awt.Color(255, 255, 153));
        d21.setFont(new java.awt.Font("Tahoma", 1, 12));
        d21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d21.setText("D21");
        d21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d21.setOpaque(true);
        d21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d21MouseClicked(evt);
            }
        });
        d21.setBounds(320, 100, 30, 30);
        jLayeredPane1.add(d21, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d22.setBackground(new java.awt.Color(255, 255, 153));
        d22.setFont(new java.awt.Font("Tahoma", 1, 12));
        d22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d22.setText("D22");
        d22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d22.setOpaque(true);
        d22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d22MouseClicked(evt);
            }
        });
        d22.setBounds(360, 100, 30, 30);
        jLayeredPane1.add(d22, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d23.setBackground(new java.awt.Color(255, 255, 153));
        d23.setFont(new java.awt.Font("Tahoma", 1, 12));
        d23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d23.setText("D23");
        d23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d23.setOpaque(true);
        d23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d23MouseClicked(evt);
            }
        });
        d23.setBounds(400, 100, 30, 30);
        jLayeredPane1.add(d23, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d24.setBackground(new java.awt.Color(255, 255, 153));
        d24.setFont(new java.awt.Font("Tahoma", 1, 12));
        d24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d24.setText("D24");
        d24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d24.setOpaque(true);
        d24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d24MouseClicked(evt);
            }
        });
        d24.setBounds(440, 100, 30, 30);
        jLayeredPane1.add(d24, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d25.setBackground(new java.awt.Color(255, 255, 153));
        d25.setFont(new java.awt.Font("Tahoma", 1, 12));
        d25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d25.setText("D25");
        d25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d25.setOpaque(true);
        d25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d25MouseClicked(evt);
            }
        });
        d25.setBounds(480, 100, 30, 30);
        jLayeredPane1.add(d25, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d26.setBackground(new java.awt.Color(255, 255, 153));
        d26.setFont(new java.awt.Font("Tahoma", 1, 12));
        d26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d26.setText("D26");
        d26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d26.setOpaque(true);
        d26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d26MouseClicked(evt);
            }
        });
        d26.setBounds(650, 100, 30, 30);
        jLayeredPane1.add(d26, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d27.setBackground(new java.awt.Color(255, 255, 153));
        d27.setFont(new java.awt.Font("Tahoma", 1, 12));
        d27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d27.setText("D27");
        d27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d27.setOpaque(true);
        d27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d27MouseClicked(evt);
            }
        });
        d27.setBounds(690, 100, 30, 30);
        jLayeredPane1.add(d27, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d28.setBackground(new java.awt.Color(255, 255, 153));
        d28.setFont(new java.awt.Font("Tahoma", 1, 12));
        d28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d28.setText("D28");
        d28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d28.setOpaque(true);
        d28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d28MouseClicked(evt);
            }
        });
        d28.setBounds(730, 100, 30, 30);
        jLayeredPane1.add(d28, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d29.setBackground(new java.awt.Color(255, 255, 153));
        d29.setFont(new java.awt.Font("Tahoma", 1, 12));
        d29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d29.setText("D29");
        d29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d29.setOpaque(true);
        d29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d29MouseClicked(evt);
            }
        });
        d29.setBounds(770, 100, 30, 30);
        jLayeredPane1.add(d29, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d30.setBackground(new java.awt.Color(255, 255, 153));
        d30.setFont(new java.awt.Font("Tahoma", 1, 12));
        d30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d30.setText("D30");
        d30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d30.setOpaque(true);
        d30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d30MouseClicked(evt);
            }
        });
        d30.setBounds(810, 100, 30, 30);
        jLayeredPane1.add(d30, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d31.setBackground(new java.awt.Color(255, 255, 153));
        d31.setFont(new java.awt.Font("Tahoma", 1, 12));
        d31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d31.setText("D31");
        d31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d31.setOpaque(true);
        d31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d31MouseClicked(evt);
            }
        });
        d31.setBounds(20, 140, 30, 30);
        jLayeredPane1.add(d31, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d32.setBackground(new java.awt.Color(255, 255, 153));
        d32.setFont(new java.awt.Font("Tahoma", 1, 12));
        d32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d32.setText("D32");
        d32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d32.setOpaque(true);
        d32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d32MouseClicked(evt);
            }
        });
        d32.setBounds(60, 140, 30, 30);
        jLayeredPane1.add(d32, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d33.setBackground(new java.awt.Color(255, 255, 153));
        d33.setFont(new java.awt.Font("Tahoma", 1, 12));
        d33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d33.setText("D33");
        d33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d33.setOpaque(true);
        d33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d33MouseClicked(evt);
            }
        });
        d33.setBounds(100, 140, 30, 30);
        jLayeredPane1.add(d33, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d34.setBackground(new java.awt.Color(255, 255, 153));
        d34.setFont(new java.awt.Font("Tahoma", 1, 12));
        d34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d34.setText("D34");
        d34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d34.setOpaque(true);
        d34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d34MouseClicked(evt);
            }
        });
        d34.setBounds(140, 140, 30, 30);
        jLayeredPane1.add(d34, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d35.setBackground(new java.awt.Color(255, 255, 153));
        d35.setFont(new java.awt.Font("Tahoma", 1, 12));
        d35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d35.setText("D35");
        d35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d35.setOpaque(true);
        d35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d35MouseClicked(evt);
            }
        });
        d35.setBounds(180, 140, 30, 30);
        jLayeredPane1.add(d35, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d36.setBackground(new java.awt.Color(255, 255, 153));
        d36.setFont(new java.awt.Font("Tahoma", 1, 12));
        d36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d36.setText("D36");
        d36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d36.setOpaque(true);
        d36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d36MouseClicked(evt);
            }
        });
        d36.setBounds(320, 140, 30, 30);
        jLayeredPane1.add(d36, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d37.setBackground(new java.awt.Color(255, 255, 153));
        d37.setFont(new java.awt.Font("Tahoma", 1, 12));
        d37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d37.setText("D37");
        d37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d37.setOpaque(true);
        d37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d37MouseClicked(evt);
            }
        });
        d37.setBounds(360, 140, 30, 30);
        jLayeredPane1.add(d37, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d38.setBackground(new java.awt.Color(255, 255, 153));
        d38.setFont(new java.awt.Font("Tahoma", 1, 12));
        d38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d38.setText("D38");
        d38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d38.setOpaque(true);
        d38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d38MouseClicked(evt);
            }
        });
        d38.setBounds(400, 140, 30, 30);
        jLayeredPane1.add(d38, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d39.setBackground(new java.awt.Color(255, 255, 153));
        d39.setFont(new java.awt.Font("Tahoma", 1, 12));
        d39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d39.setText("D39");
        d39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d39.setOpaque(true);
        d39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d39MouseClicked(evt);
            }
        });
        d39.setBounds(440, 140, 30, 30);
        jLayeredPane1.add(d39, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d40.setBackground(new java.awt.Color(255, 255, 153));
        d40.setFont(new java.awt.Font("Tahoma", 1, 12));
        d40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d40.setText("D40");
        d40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d40.setOpaque(true);
        d40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d40MouseClicked(evt);
            }
        });
        d40.setBounds(480, 140, 30, 30);
        jLayeredPane1.add(d40, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d41.setBackground(new java.awt.Color(255, 255, 153));
        d41.setFont(new java.awt.Font("Tahoma", 1, 12));
        d41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d41.setText("D41");
        d41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d41.setOpaque(true);
        d41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d41MouseClicked(evt);
            }
        });
        d41.setBounds(650, 140, 30, 30);
        jLayeredPane1.add(d41, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d42.setBackground(new java.awt.Color(255, 255, 153));
        d42.setFont(new java.awt.Font("Tahoma", 1, 12));
        d42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d42.setText("D42");
        d42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d42.setOpaque(true);
        d42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d42MouseClicked(evt);
            }
        });
        d42.setBounds(690, 140, 30, 30);
        jLayeredPane1.add(d42, javax.swing.JLayeredPane.DEFAULT_LAYER);

        D43.setBackground(new java.awt.Color(255, 255, 153));
        D43.setFont(new java.awt.Font("Tahoma", 1, 12));
        D43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D43.setText("D43");
        D43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        D43.setOpaque(true);
        D43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D43MouseClicked(evt);
            }
        });
        D43.setBounds(730, 140, 30, 30);
        jLayeredPane1.add(D43, javax.swing.JLayeredPane.DEFAULT_LAYER);

        D44.setBackground(new java.awt.Color(255, 255, 153));
        D44.setFont(new java.awt.Font("Tahoma", 1, 12));
        D44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D44.setText("D44");
        D44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        D44.setOpaque(true);
        D44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D44MouseClicked(evt);
            }
        });
        D44.setBounds(770, 140, 30, 30);
        jLayeredPane1.add(D44, javax.swing.JLayeredPane.DEFAULT_LAYER);

        D45.setBackground(new java.awt.Color(255, 255, 153));
        D45.setFont(new java.awt.Font("Tahoma", 1, 12));
        D45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D45.setText("D45");
        D45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        D45.setOpaque(true);
        D45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D45MouseClicked(evt);
            }
        });
        D45.setBounds(810, 140, 30, 30);
        jLayeredPane1.add(D45, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g5.setBackground(new java.awt.Color(153, 255, 153));
        g5.setFont(new java.awt.Font("Tahoma", 1, 12));
        g5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g5.setText("G5");
        g5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g5.setOpaque(true);
        g5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g5MouseClicked(evt);
            }
        });
        g5.setBounds(180, 220, 30, 30);
        jLayeredPane1.add(g5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d43.setBackground(new java.awt.Color(255, 255, 153));
        d43.setFont(new java.awt.Font("Tahoma", 1, 12));
        d43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d43.setText("D1");
        d43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d43.setOpaque(true);
        d43.setBounds(20, 60, 30, 30);
        jLayeredPane1.add(d43, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d44.setBackground(new java.awt.Color(255, 255, 153));
        d44.setFont(new java.awt.Font("Tahoma", 1, 12));
        d44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d44.setText("D1");
        d44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d44.setOpaque(true);
        d44.setBounds(60, 60, 30, 30);
        jLayeredPane1.add(d44, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d45.setBackground(new java.awt.Color(255, 255, 153));
        d45.setFont(new java.awt.Font("Tahoma", 1, 12));
        d45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d45.setText("D1");
        d45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d45.setOpaque(true);
        d45.setBounds(100, 60, 30, 30);
        jLayeredPane1.add(d45, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d46.setBackground(new java.awt.Color(255, 255, 153));
        d46.setFont(new java.awt.Font("Tahoma", 1, 12));
        d46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d46.setText("D1");
        d46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d46.setOpaque(true);
        d46.setBounds(140, 60, 30, 30);
        jLayeredPane1.add(d46, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d47.setBackground(new java.awt.Color(255, 255, 153));
        d47.setFont(new java.awt.Font("Tahoma", 1, 12));
        d47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d47.setText("D1");
        d47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d47.setOpaque(true);
        d47.setBounds(180, 60, 30, 30);
        jLayeredPane1.add(d47, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setBackground(new java.awt.Color(255, 255, 153));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("D1");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.setOpaque(true);
        jLabel10.setBounds(320, 60, 30, 30);
        jLayeredPane1.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d57.setBackground(new java.awt.Color(255, 255, 153));
        d57.setFont(new java.awt.Font("Tahoma", 1, 12));
        d57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d57.setText("D1");
        d57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d57.setOpaque(true);
        d57.setBounds(360, 60, 30, 30);
        jLayeredPane1.add(d57, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d58.setBackground(new java.awt.Color(255, 255, 153));
        d58.setFont(new java.awt.Font("Tahoma", 1, 12));
        d58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d58.setText("D1");
        d58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d58.setOpaque(true);
        d58.setBounds(400, 60, 30, 30);
        jLayeredPane1.add(d58, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d59.setBackground(new java.awt.Color(255, 255, 153));
        d59.setFont(new java.awt.Font("Tahoma", 1, 12));
        d59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d59.setText("D1");
        d59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d59.setOpaque(true);
        d59.setBounds(440, 60, 30, 30);
        jLayeredPane1.add(d59, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d60.setBackground(new java.awt.Color(255, 255, 153));
        d60.setFont(new java.awt.Font("Tahoma", 1, 12));
        d60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d60.setText("D1");
        d60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d60.setOpaque(true);
        d60.setBounds(480, 60, 30, 30);
        jLayeredPane1.add(d60, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d61.setBackground(new java.awt.Color(255, 255, 153));
        d61.setFont(new java.awt.Font("Tahoma", 1, 12));
        d61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d61.setText("D1");
        d61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d61.setOpaque(true);
        d61.setBounds(650, 60, 30, 30);
        jLayeredPane1.add(d61, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d62.setBackground(new java.awt.Color(255, 255, 153));
        d62.setFont(new java.awt.Font("Tahoma", 1, 12));
        d62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d62.setText("D1");
        d62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d62.setOpaque(true);
        d62.setBounds(690, 60, 30, 30);
        jLayeredPane1.add(d62, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d63.setBackground(new java.awt.Color(255, 255, 153));
        d63.setFont(new java.awt.Font("Tahoma", 1, 12));
        d63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d63.setText("D1");
        d63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d63.setOpaque(true);
        d63.setBounds(730, 60, 30, 30);
        jLayeredPane1.add(d63, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d64.setBackground(new java.awt.Color(255, 255, 153));
        d64.setFont(new java.awt.Font("Tahoma", 1, 12));
        d64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d64.setText("D1");
        d64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d64.setOpaque(true);
        d64.setBounds(770, 60, 30, 30);
        jLayeredPane1.add(d64, javax.swing.JLayeredPane.DEFAULT_LAYER);

        d65.setBackground(new java.awt.Color(255, 255, 153));
        d65.setFont(new java.awt.Font("Tahoma", 1, 12));
        d65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d65.setText("D1");
        d65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        d65.setOpaque(true);
        d65.setBounds(810, 60, 30, 30);
        jLayeredPane1.add(d65, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s5.setBackground(new java.awt.Color(153, 153, 255));
        s5.setFont(new java.awt.Font("Tahoma", 1, 12));
        s5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s5.setText("S5");
        s5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s5.setOpaque(true);
        s5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s5MouseClicked(evt);
            }
        });
        s5.setBounds(180, 340, 30, 30);
        jLayeredPane1.add(s5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g2.setBackground(new java.awt.Color(153, 255, 153));
        g2.setFont(new java.awt.Font("Tahoma", 1, 12));
        g2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g2.setText("G2");
        g2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g2.setOpaque(true);
        g2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g2MouseClicked(evt);
            }
        });
        g2.setBounds(60, 220, 30, 30);
        jLayeredPane1.add(g2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g3.setBackground(new java.awt.Color(153, 255, 153));
        g3.setFont(new java.awt.Font("Tahoma", 1, 12));
        g3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g3.setText("G3");
        g3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g3.setOpaque(true);
        g3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g3MouseClicked(evt);
            }
        });
        g3.setBounds(100, 220, 30, 30);
        jLayeredPane1.add(g3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g4.setBackground(new java.awt.Color(153, 255, 153));
        g4.setFont(new java.awt.Font("Tahoma", 1, 12));
        g4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g4.setText("G4");
        g4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g4.setOpaque(true);
        g4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g4MouseClicked(evt);
            }
        });
        g4.setBounds(140, 220, 30, 30);
        jLayeredPane1.add(g4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g6.setBackground(new java.awt.Color(153, 255, 153));
        g6.setFont(new java.awt.Font("Tahoma", 1, 12));
        g6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g6.setText("G6");
        g6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g6.setOpaque(true);
        g6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g6MouseClicked(evt);
            }
        });
        g6.setBounds(320, 220, 30, 30);
        jLayeredPane1.add(g6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g7.setBackground(new java.awt.Color(153, 255, 153));
        g7.setFont(new java.awt.Font("Tahoma", 1, 12));
        g7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g7.setText("G7");
        g7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g7.setOpaque(true);
        g7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g7MouseClicked(evt);
            }
        });
        g7.setBounds(360, 220, 30, 30);
        jLayeredPane1.add(g7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g8.setBackground(new java.awt.Color(153, 255, 153));
        g8.setFont(new java.awt.Font("Tahoma", 1, 12));
        g8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g8.setText("G8");
        g8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g8.setOpaque(true);
        g8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g8MouseClicked(evt);
            }
        });
        g8.setBounds(400, 220, 30, 30);
        jLayeredPane1.add(g8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g9.setBackground(new java.awt.Color(153, 255, 153));
        g9.setFont(new java.awt.Font("Tahoma", 1, 12));
        g9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g9.setText("G9");
        g9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g9.setOpaque(true);
        g9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g9MouseClicked(evt);
            }
        });
        g9.setBounds(440, 220, 30, 30);
        jLayeredPane1.add(g9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g10.setBackground(new java.awt.Color(153, 255, 153));
        g10.setFont(new java.awt.Font("Tahoma", 1, 12));
        g10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g10.setText("G10");
        g10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g10.setOpaque(true);
        g10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g10MouseClicked(evt);
            }
        });
        g10.setBounds(480, 220, 30, 30);
        jLayeredPane1.add(g10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g11.setBackground(new java.awt.Color(153, 255, 153));
        g11.setFont(new java.awt.Font("Tahoma", 1, 12));
        g11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g11.setText("G11");
        g11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g11.setOpaque(true);
        g11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g11MouseClicked(evt);
            }
        });
        g11.setBounds(650, 220, 30, 30);
        jLayeredPane1.add(g11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g12.setBackground(new java.awt.Color(153, 255, 153));
        g12.setFont(new java.awt.Font("Tahoma", 1, 12));
        g12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g12.setText("G12");
        g12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g12.setOpaque(true);
        g12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g12MouseClicked(evt);
            }
        });
        g12.setBounds(690, 220, 30, 30);
        jLayeredPane1.add(g12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g13.setBackground(new java.awt.Color(153, 255, 153));
        g13.setFont(new java.awt.Font("Tahoma", 1, 12));
        g13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g13.setText("G13");
        g13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g13.setOpaque(true);
        g13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g13MouseClicked(evt);
            }
        });
        g13.setBounds(730, 220, 30, 30);
        jLayeredPane1.add(g13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g14.setBackground(new java.awt.Color(153, 255, 153));
        g14.setFont(new java.awt.Font("Tahoma", 1, 12));
        g14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g14.setText("G14");
        g14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g14.setOpaque(true);
        g14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g14MouseClicked(evt);
            }
        });
        g14.setBounds(770, 220, 30, 30);
        jLayeredPane1.add(g14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g15.setBackground(new java.awt.Color(153, 255, 153));
        g15.setFont(new java.awt.Font("Tahoma", 1, 12));
        g15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g15.setText("G15");
        g15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g15.setOpaque(true);
        g15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g15MouseClicked(evt);
            }
        });
        g15.setBounds(810, 220, 30, 30);
        jLayeredPane1.add(g15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g16.setBackground(new java.awt.Color(153, 255, 153));
        g16.setFont(new java.awt.Font("Tahoma", 1, 12));
        g16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g16.setText("G16");
        g16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g16.setOpaque(true);
        g16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g16MouseClicked(evt);
            }
        });
        g16.setBounds(20, 260, 30, 30);
        jLayeredPane1.add(g16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g17.setBackground(new java.awt.Color(153, 255, 153));
        g17.setFont(new java.awt.Font("Tahoma", 1, 12));
        g17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g17.setText("G17");
        g17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g17.setOpaque(true);
        g17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g17MouseClicked(evt);
            }
        });
        g17.setBounds(60, 260, 30, 30);
        jLayeredPane1.add(g17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g18.setBackground(new java.awt.Color(153, 255, 153));
        g18.setFont(new java.awt.Font("Tahoma", 1, 12));
        g18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g18.setText("G18");
        g18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g18.setOpaque(true);
        g18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g18MouseClicked(evt);
            }
        });
        g18.setBounds(100, 260, 30, 30);
        jLayeredPane1.add(g18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g19.setBackground(new java.awt.Color(153, 255, 153));
        g19.setFont(new java.awt.Font("Tahoma", 1, 12));
        g19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g19.setText("G19");
        g19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g19.setOpaque(true);
        g19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g19MouseClicked(evt);
            }
        });
        g19.setBounds(140, 260, 30, 30);
        jLayeredPane1.add(g19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g20.setBackground(new java.awt.Color(153, 255, 153));
        g20.setFont(new java.awt.Font("Tahoma", 1, 12));
        g20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g20.setText("G20");
        g20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g20.setOpaque(true);
        g20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g20MouseClicked(evt);
            }
        });
        g20.setBounds(180, 260, 30, 30);
        jLayeredPane1.add(g20, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g21.setBackground(new java.awt.Color(153, 255, 153));
        g21.setFont(new java.awt.Font("Tahoma", 1, 12));
        g21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g21.setText("G21");
        g21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g21.setOpaque(true);
        g21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g21MouseClicked(evt);
            }
        });
        g21.setBounds(320, 260, 30, 30);
        jLayeredPane1.add(g21, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g22.setBackground(new java.awt.Color(153, 255, 153));
        g22.setFont(new java.awt.Font("Tahoma", 1, 12));
        g22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g22.setText("G22");
        g22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g22.setOpaque(true);
        g22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g22MouseClicked(evt);
            }
        });
        g22.setBounds(360, 260, 30, 30);
        jLayeredPane1.add(g22, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g23.setBackground(new java.awt.Color(153, 255, 153));
        g23.setFont(new java.awt.Font("Tahoma", 1, 12));
        g23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g23.setText("G23");
        g23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g23.setOpaque(true);
        g23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g23MouseClicked(evt);
            }
        });
        g23.setBounds(400, 260, 30, 30);
        jLayeredPane1.add(g23, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g24.setBackground(new java.awt.Color(153, 255, 153));
        g24.setFont(new java.awt.Font("Tahoma", 1, 12));
        g24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g24.setText("G24");
        g24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g24.setOpaque(true);
        g24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g24MouseClicked(evt);
            }
        });
        g24.setBounds(440, 260, 30, 30);
        jLayeredPane1.add(g24, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g25.setBackground(new java.awt.Color(153, 255, 153));
        g25.setFont(new java.awt.Font("Tahoma", 1, 12));
        g25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g25.setText("G25");
        g25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g25.setOpaque(true);
        g25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g25MouseClicked(evt);
            }
        });
        g25.setBounds(480, 260, 30, 30);
        jLayeredPane1.add(g25, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g26.setBackground(new java.awt.Color(153, 255, 153));
        g26.setFont(new java.awt.Font("Tahoma", 1, 12));
        g26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g26.setText("G26");
        g26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g26.setOpaque(true);
        g26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g26MouseClicked(evt);
            }
        });
        g26.setBounds(650, 260, 30, 30);
        jLayeredPane1.add(g26, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g27.setBackground(new java.awt.Color(153, 255, 153));
        g27.setFont(new java.awt.Font("Tahoma", 1, 12));
        g27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g27.setText("G27");
        g27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g27.setOpaque(true);
        g27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g27MouseClicked(evt);
            }
        });
        g27.setBounds(690, 260, 30, 30);
        jLayeredPane1.add(g27, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g28.setBackground(new java.awt.Color(153, 255, 153));
        g28.setFont(new java.awt.Font("Tahoma", 1, 12));
        g28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g28.setText("G28");
        g28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g28.setOpaque(true);
        g28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g28MouseClicked(evt);
            }
        });
        g28.setBounds(730, 260, 30, 30);
        jLayeredPane1.add(g28, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g29.setBackground(new java.awt.Color(153, 255, 153));
        g29.setFont(new java.awt.Font("Tahoma", 1, 12));
        g29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g29.setText("G29");
        g29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g29.setOpaque(true);
        g29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g29MouseClicked(evt);
            }
        });
        g29.setBounds(770, 260, 30, 30);
        jLayeredPane1.add(g29, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g30.setBackground(new java.awt.Color(153, 255, 153));
        g30.setFont(new java.awt.Font("Tahoma", 1, 12));
        g30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g30.setText("G30");
        g30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g30.setOpaque(true);
        g30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g30MouseClicked(evt);
            }
        });
        g30.setBounds(810, 260, 30, 30);
        jLayeredPane1.add(g30, javax.swing.JLayeredPane.DEFAULT_LAYER);

        g1.setBackground(new java.awt.Color(153, 255, 153));
        g1.setFont(new java.awt.Font("Tahoma", 1, 12));
        g1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        g1.setText("G1");
        g1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        g1.setOpaque(true);
        g1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g1MouseClicked(evt);
            }
        });
        g1.setBounds(20, 220, 30, 30);
        jLayeredPane1.add(g1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s1.setBackground(new java.awt.Color(153, 153, 255));
        s1.setFont(new java.awt.Font("Tahoma", 1, 12));
        s1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s1.setText("S1");
        s1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s1.setOpaque(true);
        s1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s1MouseClicked(evt);
            }
        });
        s1.setBounds(20, 340, 30, 30);
        jLayeredPane1.add(s1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s2.setBackground(new java.awt.Color(153, 153, 255));
        s2.setFont(new java.awt.Font("Tahoma", 1, 12));
        s2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s2.setText("S2");
        s2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s2.setOpaque(true);
        s2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s2MouseClicked(evt);
            }
        });
        s2.setBounds(60, 340, 30, 30);
        jLayeredPane1.add(s2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s3.setBackground(new java.awt.Color(153, 153, 255));
        s3.setFont(new java.awt.Font("Tahoma", 1, 12));
        s3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s3.setText("S3");
        s3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s3.setOpaque(true);
        s3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s3MouseClicked(evt);
            }
        });
        s3.setBounds(100, 340, 30, 30);
        jLayeredPane1.add(s3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s4.setBackground(new java.awt.Color(153, 153, 255));
        s4.setFont(new java.awt.Font("Tahoma", 1, 12));
        s4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s4.setText("S4");
        s4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s4.setOpaque(true);
        s4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s4MouseClicked(evt);
            }
        });
        s4.setBounds(140, 340, 30, 30);
        jLayeredPane1.add(s4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s10.setBackground(new java.awt.Color(153, 153, 255));
        s10.setFont(new java.awt.Font("Tahoma", 1, 12));
        s10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s10.setText("S10");
        s10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s10.setOpaque(true);
        s10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s10MouseClicked(evt);
            }
        });
        s10.setBounds(810, 340, 30, 30);
        jLayeredPane1.add(s10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s9.setBackground(new java.awt.Color(153, 153, 255));
        s9.setFont(new java.awt.Font("Tahoma", 1, 12));
        s9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s9.setText("S9");
        s9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s9.setOpaque(true);
        s9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s9MouseClicked(evt);
            }
        });
        s9.setBounds(770, 340, 30, 30);
        jLayeredPane1.add(s9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s8.setBackground(new java.awt.Color(153, 153, 255));
        s8.setFont(new java.awt.Font("Tahoma", 1, 12));
        s8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s8.setText("S8");
        s8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s8.setOpaque(true);
        s8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s8MouseClicked(evt);
            }
        });
        s8.setBounds(730, 340, 30, 30);
        jLayeredPane1.add(s8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s7.setBackground(new java.awt.Color(153, 153, 255));
        s7.setFont(new java.awt.Font("Tahoma", 1, 12));
        s7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s7.setText("S7");
        s7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s7.setOpaque(true);
        s7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s7MouseClicked(evt);
            }
        });
        s7.setBounds(690, 340, 30, 30);
        jLayeredPane1.add(s7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s6.setBackground(new java.awt.Color(153, 153, 255));
        s6.setFont(new java.awt.Font("Tahoma", 1, 12));
        s6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s6.setText("S6");
        s6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s6.setOpaque(true);
        s6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s6MouseClicked(evt);
            }
        });
        s6.setBounds(650, 340, 30, 30);
        jLayeredPane1.add(s6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s15.setBackground(new java.awt.Color(153, 153, 255));
        s15.setFont(new java.awt.Font("Tahoma", 1, 12));
        s15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s15.setText("S15");
        s15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s15.setOpaque(true);
        s15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s15MouseClicked(evt);
            }
        });
        s15.setBounds(180, 380, 30, 30);
        jLayeredPane1.add(s15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s14.setBackground(new java.awt.Color(153, 153, 255));
        s14.setFont(new java.awt.Font("Tahoma", 1, 12));
        s14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s14.setText("S14");
        s14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s14.setOpaque(true);
        s14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s14MouseClicked(evt);
            }
        });
        s14.setBounds(140, 380, 30, 30);
        jLayeredPane1.add(s14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s13.setBackground(new java.awt.Color(153, 153, 255));
        s13.setFont(new java.awt.Font("Tahoma", 1, 12));
        s13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s13.setText("S13");
        s13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s13.setOpaque(true);
        s13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s13MouseClicked(evt);
            }
        });
        s13.setBounds(100, 380, 30, 30);
        jLayeredPane1.add(s13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s12.setBackground(new java.awt.Color(153, 153, 255));
        s12.setFont(new java.awt.Font("Tahoma", 1, 12));
        s12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s12.setText("S12");
        s12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s12.setOpaque(true);
        s12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s12MouseClicked(evt);
            }
        });
        s12.setBounds(60, 380, 30, 30);
        jLayeredPane1.add(s12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s11.setBackground(new java.awt.Color(153, 153, 255));
        s11.setFont(new java.awt.Font("Tahoma", 1, 12));
        s11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s11.setText("S11");
        s11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s11.setOpaque(true);
        s11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s11MouseClicked(evt);
            }
        });
        s11.setBounds(20, 380, 30, 30);
        jLayeredPane1.add(s11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s20.setBackground(new java.awt.Color(153, 153, 255));
        s20.setFont(new java.awt.Font("Tahoma", 1, 12));
        s20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s20.setText("S20");
        s20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s20.setOpaque(true);
        s20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s20MouseClicked(evt);
            }
        });
        s20.setBounds(810, 380, 30, 30);
        jLayeredPane1.add(s20, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s19.setBackground(new java.awt.Color(153, 153, 255));
        s19.setFont(new java.awt.Font("Tahoma", 1, 12));
        s19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s19.setText("S19");
        s19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s19.setOpaque(true);
        s19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s19MouseClicked(evt);
            }
        });
        s19.setBounds(770, 380, 30, 30);
        jLayeredPane1.add(s19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s18.setBackground(new java.awt.Color(153, 153, 255));
        s18.setFont(new java.awt.Font("Tahoma", 1, 12));
        s18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s18.setText("S18");
        s18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s18.setOpaque(true);
        s18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s18MouseClicked(evt);
            }
        });
        s18.setBounds(730, 380, 30, 30);
        jLayeredPane1.add(s18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s17.setBackground(new java.awt.Color(153, 153, 255));
        s17.setFont(new java.awt.Font("Tahoma", 1, 12));
        s17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s17.setText("S17");
        s17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s17.setOpaque(true);
        s17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s17MouseClicked(evt);
            }
        });
        s17.setBounds(690, 380, 30, 30);
        jLayeredPane1.add(s17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        s16.setBackground(new java.awt.Color(153, 153, 255));
        s16.setFont(new java.awt.Font("Tahoma", 1, 12));
        s16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s16.setText("S16");
        s16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s16.setOpaque(true);
        s16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s16MouseClicked(evt);
            }
        });
        s16.setBounds(650, 380, 30, 30);
        jLayeredPane1.add(s16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("No of Ticket");
        jLabel1.setOpaque(true);
        jLabel1.setBounds(270, 330, 120, 14);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ticket.setFont(new java.awt.Font("Tahoma", 1, 12));
        ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketActionPerformed(evt);
            }
        });
        ticket.setBounds(410, 330, 80, 20);
        jLayeredPane1.add(ticket, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Total Amount(Rs.)");
        jLabel2.setOpaque(true);
        jLabel2.setBounds(270, 370, 130, 14);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        amt.setFont(new java.awt.Font("Tahoma", 1, 12));
        amt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amtActionPerformed(evt);
            }
        });
        amt.setBounds(410, 370, 80, 20);
        jLayeredPane1.add(amt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        confirm.setFont(new java.awt.Font("Tahoma", 1, 11));
        confirm.setText("CONFIRM");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        confirm.setBounds(310, 420, 100, 23);
        jLayeredPane1.add(confirm, javax.swing.JLayeredPane.DEFAULT_LAYER);

        back.setFont(new java.awt.Font("Tahoma", 1, 11));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        back.setBounds(460, 420, 100, 23);
        jLayeredPane1.add(back, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel26.setForeground(new java.awt.Color(102, 255, 255));
        jLabel26.setText("Select Show Time:");
        jLabel26.setBounds(300, 20, 110, 14);
        jLayeredPane1.add(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "12-3 pm", "3-6 pm", "6-9 pm", "9-12 pm" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jScrollPane1.setBounds(420, 20, 80, 20);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void d1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d1MouseClicked
     
        if(d1.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else
        {
           ++n;
           ++nd;
            sno+=" "+d1.getText();
            d1.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
    }//GEN-LAST:event_d1MouseClicked

    private void d2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d2MouseClicked
         if(d2.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
          ++n;
           ++nd;
            sno+=" "+d2.getText();
            d2.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }

    }//GEN-LAST:event_d2MouseClicked

    private void d3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d3MouseClicked
         if(d3.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
           ++n;
           ++nd;
            sno+=" "+d3.getText();
            d3.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
    }//GEN-LAST:event_d3MouseClicked

    private void d4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d4MouseClicked
        if(d4.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d4.getText();
            d4.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d4MouseClicked

    private void D5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D5MouseClicked
         if(D5.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+D5.getText();
            D5.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_D5MouseClicked

    private void D6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D6MouseClicked
         if(D6.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+D6.getText();
            D6.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_D6MouseClicked

    private void D7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D7MouseClicked
     if(D7.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+D7.getText();
            D7.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_D7MouseClicked

    private void d8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d8MouseClicked
         if(d8.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d8.getText();
            d8.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d8MouseClicked

    private void d9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d9MouseClicked
         if(d9.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+ d9.getText();
            d9.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d9MouseClicked

    private void D10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D10MouseClicked
         if(D10.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+D10.getText();
            D10.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_D10MouseClicked

    private void d11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d11MouseClicked
         if(d11.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d11.getText();
            d11.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_d11MouseClicked

    private void d12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d12MouseClicked
         if(d12.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d12.getText();
            d12.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d12MouseClicked

    private void d13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d13MouseClicked
         if(d13.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d13.getText();
            d13.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d13MouseClicked

    private void d14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d14MouseClicked
         if(d14.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d14.getText();
            d14.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d14MouseClicked

    private void D15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D15MouseClicked
         if(D15.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+D15.getText();
            D15.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_D15MouseClicked

    private void D16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D16MouseClicked
         if(D16.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+D16.getText();
            D16.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_D16MouseClicked

    private void d17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d17MouseClicked
         if(d17.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d17.getText();
            d17.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d17MouseClicked

    private void D18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D18MouseClicked
         if(D18.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+D18.getText();
            D18.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_D18MouseClicked

    private void d19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d19MouseClicked
     if(d19.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d19.getText();
            d19.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d19MouseClicked

    private void d20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d20MouseClicked
         if(d20.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d20.getText();
            d20.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d20MouseClicked

    private void d21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d21MouseClicked
         if(d21.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d21.getText();
            d21.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d21MouseClicked

    private void d22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d22MouseClicked
         if(d22.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d22.getText();
            d22.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d22MouseClicked

    private void d23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d23MouseClicked
     if(d23.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d23.getText();
            d23.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d23MouseClicked

    private void d24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d24MouseClicked
         if(d24.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d24.getText();
            d24.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d24MouseClicked

    private void d25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d25MouseClicked
         if(d25.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d25.getText();
            d25.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d25MouseClicked

    private void d26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d26MouseClicked
         if(d26.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d26.getText();
            d26.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d26MouseClicked

    private void d27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d27MouseClicked
         if(d27.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d27.getText();
            d27.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d27MouseClicked

    private void d28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d28MouseClicked
         if(d28.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d28.getText();
            d28.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d28MouseClicked

    private void d29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d29MouseClicked
         if(d29.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d29.getText();
            d29.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d29MouseClicked

    private void d30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d30MouseClicked
         if(d30.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d30.getText();
            d30.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d30MouseClicked

    private void d31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d31MouseClicked
         if(d31.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d31.getText();
            d31.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d31MouseClicked

    private void d32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d32MouseClicked
         if(d32.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d32.getText();
            d32.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d32MouseClicked

    private void d33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d33MouseClicked
         if(d33.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d33.getText();
            d33.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d33MouseClicked

    private void d34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d34MouseClicked
         if(d34.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d34.getText();
            d34.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d34MouseClicked

    private void d35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d35MouseClicked
         if(d35.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d35.getText();
            d35.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d35MouseClicked

    private void d36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d36MouseClicked
         if(d36.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d36.getText();
            d36.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d36MouseClicked

    private void d37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d37MouseClicked
         if(d37.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d37.getText();
            d37.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d37MouseClicked

    private void d38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d38MouseClicked
         if(d38.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d38.getText();
            d38.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d38MouseClicked

    private void d39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d39MouseClicked
         if(d39.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d39.getText();
            d39.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d39MouseClicked

    private void d40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d40MouseClicked
         if(d40.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d40.getText();
            d40.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d40MouseClicked

    private void d41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d41MouseClicked
         if(d41.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d41.getText();
            d41.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d41MouseClicked

    private void d42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d42MouseClicked
         if(d42.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d42.getText();
            d42.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_d42MouseClicked

    private void D43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D43MouseClicked
         if(d43.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d43.getText();
            d43.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_D43MouseClicked

    private void D44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D44MouseClicked
         if(d44.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+d44.getText();
            d44.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_D44MouseClicked

    private void D45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D45MouseClicked
         if(D45.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++nd;
            sno+=" "+D45.getText();
            D45.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_D45MouseClicked

    private void g1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g1MouseClicked
         if(g1.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g1.getText();
            g1.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g1MouseClicked

    private void g3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g3MouseClicked
         if(g3.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g3.getText();
            g3.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g3MouseClicked

    private void g4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g4MouseClicked
         if(g4.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g4.getText();
            g4.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g4MouseClicked

    private void g5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g5MouseClicked
         if(g5.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g5.getText();
            g5.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g5MouseClicked

    private void g6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g6MouseClicked
         if(g6.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g6.getText();
            g6.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g6MouseClicked

    private void g7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g7MouseClicked
         if(g7.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g7.getText();
            g7.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g7MouseClicked

    private void g8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g8MouseClicked
         if(g8.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g8.getText();
            g8.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g8MouseClicked

    private void g9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g9MouseClicked
         if(g9.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g9.getText();
            g9.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g9MouseClicked

    private void g10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g10MouseClicked
         if(g10.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g10.getText();
            g10.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g10MouseClicked

    private void g11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g11MouseClicked
         if(g11.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g11.getText();
            g11.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g11MouseClicked

    private void g12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g12MouseClicked
         if(g12.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g12.getText();
            g12.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g12MouseClicked

    private void g13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g13MouseClicked
         if(g13.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
             sno+=" "+g13.getText();
            g13.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g13MouseClicked

    private void g14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g14MouseClicked
         if(g14.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g14.getText();
            g14.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g14MouseClicked

    private void g15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g15MouseClicked
         if(g15.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g15.getText();
            g15.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g15MouseClicked

    private void g16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g16MouseClicked
         if(g16.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g16.getText();
            g16.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g16MouseClicked

    private void g17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g17MouseClicked
         if(g17.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g17.getText();
            g17.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g17MouseClicked

    private void g18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g18MouseClicked
         if(g18.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g18.getText();
            g18.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g18MouseClicked

    private void g19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g19MouseClicked
         if(g19.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno=" "+g19.getText();
            g19.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g19MouseClicked

    private void g20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g20MouseClicked
         if(g20.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g20.getText();
            g20.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g20MouseClicked

    private void g21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g21MouseClicked
         if(g21.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g21.getText();
            g21.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g21MouseClicked

    private void g22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g22MouseClicked
         if(g22.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g22.getText();
            g22.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g22MouseClicked

    private void g23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g23MouseClicked
         if(g23.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g23.getText();
            g23.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g23MouseClicked

    private void g24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g24MouseClicked
         if(g24.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g24.getText();
            g24.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g24MouseClicked

    private void g25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g25MouseClicked
         if(g25.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g25.getText();
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
            g25.setBackground(Color.red);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g25MouseClicked

    private void g26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g26MouseClicked
         if(g26.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ng;
            sno+=" "+g26.getText();
            g26.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g26MouseClicked

    private void g27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g27MouseClicked
         if(g27.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
             ++n;
           ++ng;
            sno+=" "+g27.getText();
            g27.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g27MouseClicked

    private void g28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g28MouseClicked
         if(g28.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
             ++n;
           ++ng;
            sno+=" "+g28.getText();
            g28.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g28MouseClicked

    private void g29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g29MouseClicked
         if(g29.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
             ++n;
           ++ng;
            sno+=" "+g29.getText();
            g29.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g29MouseClicked

    private void g30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g30MouseClicked
         if(g30.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
             ++n;
           ++ng;
            sno+=" "+g30.getText();
        g30.setBackground(Color.red);
        ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_g30MouseClicked

    private void s1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s1MouseClicked
         if(s1.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
             ++n;
           ++ns;
            sno+=" "+s1.getText();
            s1.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s1MouseClicked

    private void s2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s2MouseClicked
         if(s2.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
             ++n;
           ++ns;
            sno+=" "+s2.getText();
            s2.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s2MouseClicked

    private void s3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s3MouseClicked
         if(s3.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
              ++n;
           ++ns;
            sno+=" "+s3.getText();
            s3.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s3MouseClicked

    private void s4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s4MouseClicked
         if(s4.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
              ++n;
           ++ns;
            sno+=" "+s4.getText();
            s4.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s4MouseClicked

    private void s5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s5MouseClicked
         if(s5.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
              ++n;
           ++ns;
            sno+=" "+s5.getText();
            s5.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s5MouseClicked

    private void s6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s6MouseClicked
         if(s6.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
              ++n;
           ++ns;
            sno+=" "+s6.getText();
            s6.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s6MouseClicked

    private void s7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s7MouseClicked
         if(s7.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
         ++n;
           ++ns;
            sno+=" "+s7.getText();
            s7.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s7MouseClicked

    private void s8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s8MouseClicked
         if(s8.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
           ++n;
           ++ns;
            sno+=" "+s8.getText();
            s8.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s8MouseClicked

    private void s9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s9MouseClicked
     if(s9.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
             ++n;
           ++ns;
            sno+=" "+s9.getText();
            s9.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s9MouseClicked

    private void s10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s10MouseClicked
         if(s10.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
              ++n;
           ++ns;
            sno+=" "+s10.getText();
            s10.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s10MouseClicked

    private void s11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s11MouseClicked
         if(s11.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
              ++n;
           ++ns;
            sno+=" "+s11.getText();
            s11.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s11MouseClicked

    private void s12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s12MouseClicked
         if(s12.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
              ++n;
           ++ns;
            sno+=" "+s12.getText();
            s12.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s12MouseClicked

    private void s13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s13MouseClicked
     if(s13.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
              ++n;
           ++ns;
            sno+=" "+s13.getText();
            s13.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s13MouseClicked

    private void s14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s14MouseClicked
         if(s14.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
              ++n;
           ++ns;
            sno+=" "+s14.getText();
            s14.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s14MouseClicked

    private void s15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s15MouseClicked
         if(s15.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
              ++n;
           ++ns;
            sno+=" "+s15.getText();
            s15.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s15MouseClicked

    private void s16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s16MouseClicked
         if(s16.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
              ++n;
           ++ns;
            sno+=" "+s16.getText();
            s16.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s16MouseClicked

    private void s17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s17MouseClicked
         if(s17.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
              ++n;
           ++ns;
            sno+=" "+s17.getText();
            s17.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s17MouseClicked

    private void s18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s18MouseClicked
         if(s18.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
              ++n;
           ++ns;
            sno+=" "+s18.getText();
            s18.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s18MouseClicked

    private void s19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s19MouseClicked
         if(s19.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
              ++n;
           ++ns;
            sno+=" "+s19.getText();
            s19.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_s19MouseClicked

    private void s20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s20MouseClicked
         if(s20.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
           ++ns;
            sno+=" "+s20.getText();
           s20.setBackground(Color.red);
           ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
    }//GEN-LAST:event_s20MouseClicked

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
       try
        {

           String query="insert into ticket values('"+sno+"','"+movie.sdt+"',"+movie.sht+",'"+sc+"')";
           movie.st.executeUpdate(query);
           JOptionPane.showMessageDialog(null,"Tickets confirmed !!!");
             System.exit(0);
       }
       catch(Exception e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_confirmActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
this.dispose();
new MOVIE_LIST().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
       check();
    }//GEN-LAST:event_jList1MouseClicked

    private void g2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g2MouseClicked
        if(g2.getBackground()==Color.red)
            JOptionPane.showMessageDialog(null,"Seat is already booked !!!");
        else {
            ++n;
            ++ng;
            sno+=" "+g2.getText();
            g2.setBackground(Color.red);
            ticket.setText(""+n);
            amt.setText(""+(nd*200+ng*150+ns*120));
        }
        // TODO add your handling code here:
}//GEN-LAST:event_g2MouseClicked

    private void ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ticketActionPerformed

    private void amtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amtActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel D10;
    private javax.swing.JLabel D15;
    private javax.swing.JLabel D16;
    private javax.swing.JLabel D18;
    private javax.swing.JLabel D43;
    private javax.swing.JLabel D44;
    private javax.swing.JLabel D45;
    private javax.swing.JLabel D5;
    private javax.swing.JLabel D6;
    private javax.swing.JLabel D7;
    private javax.swing.JTextField amt;
    private javax.swing.JButton back;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d11;
    private javax.swing.JLabel d12;
    private javax.swing.JLabel d13;
    private javax.swing.JLabel d14;
    private javax.swing.JLabel d17;
    private javax.swing.JLabel d19;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d20;
    private javax.swing.JLabel d21;
    private javax.swing.JLabel d22;
    private javax.swing.JLabel d23;
    private javax.swing.JLabel d24;
    private javax.swing.JLabel d25;
    private javax.swing.JLabel d26;
    private javax.swing.JLabel d27;
    private javax.swing.JLabel d28;
    private javax.swing.JLabel d29;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel d30;
    private javax.swing.JLabel d31;
    private javax.swing.JLabel d32;
    private javax.swing.JLabel d33;
    private javax.swing.JLabel d34;
    private javax.swing.JLabel d35;
    private javax.swing.JLabel d36;
    private javax.swing.JLabel d37;
    private javax.swing.JLabel d38;
    private javax.swing.JLabel d39;
    private javax.swing.JLabel d4;
    private javax.swing.JLabel d40;
    private javax.swing.JLabel d41;
    private javax.swing.JLabel d42;
    private javax.swing.JLabel d43;
    private javax.swing.JLabel d44;
    private javax.swing.JLabel d45;
    private javax.swing.JLabel d46;
    private javax.swing.JLabel d47;
    private javax.swing.JLabel d57;
    private javax.swing.JLabel d58;
    private javax.swing.JLabel d59;
    private javax.swing.JLabel d60;
    private javax.swing.JLabel d61;
    private javax.swing.JLabel d62;
    private javax.swing.JLabel d63;
    private javax.swing.JLabel d64;
    private javax.swing.JLabel d65;
    private javax.swing.JLabel d8;
    private javax.swing.JLabel d9;
    private javax.swing.JLabel g1;
    private javax.swing.JLabel g10;
    private javax.swing.JLabel g11;
    private javax.swing.JLabel g12;
    private javax.swing.JLabel g13;
    private javax.swing.JLabel g14;
    private javax.swing.JLabel g15;
    private javax.swing.JLabel g16;
    private javax.swing.JLabel g17;
    private javax.swing.JLabel g18;
    private javax.swing.JLabel g19;
    private javax.swing.JLabel g2;
    private javax.swing.JLabel g20;
    private javax.swing.JLabel g21;
    private javax.swing.JLabel g22;
    private javax.swing.JLabel g23;
    private javax.swing.JLabel g24;
    private javax.swing.JLabel g25;
    private javax.swing.JLabel g26;
    private javax.swing.JLabel g27;
    private javax.swing.JLabel g28;
    private javax.swing.JLabel g29;
    private javax.swing.JLabel g3;
    private javax.swing.JLabel g30;
    private javax.swing.JLabel g4;
    private javax.swing.JLabel g5;
    private javax.swing.JLabel g6;
    private javax.swing.JLabel g7;
    private javax.swing.JLabel g8;
    private javax.swing.JLabel g9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s10;
    private javax.swing.JLabel s11;
    private javax.swing.JLabel s12;
    private javax.swing.JLabel s13;
    private javax.swing.JLabel s14;
    private javax.swing.JLabel s15;
    private javax.swing.JLabel s16;
    private javax.swing.JLabel s17;
    private javax.swing.JLabel s18;
    private javax.swing.JLabel s19;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s20;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JLabel s5;
    private javax.swing.JLabel s6;
    private javax.swing.JLabel s7;
    private javax.swing.JLabel s8;
    private javax.swing.JLabel s9;
    private javax.swing.JTextField ticket;
    // End of variables declaration//GEN-END:variables

}
