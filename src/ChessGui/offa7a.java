
package ChessGui;
import ChessCoreOurs.ChessEnums;
import ChessCoreOurs.ChessGame;
import ChessCoreOurs.Square;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class offa7a extends javax.swing.JFrame {
JLabel clickedLabel;
    ChessGame ff=new ChessGame();
    
    private Icon icon;
    private JLabel selectedLabel = null;
    private Color originalColor = null;
    private JPanel[] jPanelArray;
    private JPanel jpanel;
    private Color[] originalColors;
    Component component;
    private JLabel[] jlableArray;
     private ArrayList<LabelName> jlableArray2;
      ArrayList<JLabel> labelList;
      private int counter=0;
      private boolean flag=false;
      JLabel label;
    
    public offa7a() {
        initComponents();
        jPanelArray = new JPanel[] {a1, a2, a3, a4, a5, a6, a7, a8, b1, b2, b3, b4, b5, b6, b7, b8,
                                    c1, c2, c3, c4, c5, c6, c7, c8, d1, d2, d3, d4, d5, d6, d7, d8,
                                    e1, e2, e3, e4, e5, e6, e7, e8, f1, f2, f3, f4, f5, f6, f7, f8,
                                    g1, g2, g3, g4, g5, g6, g7, g8, h1, h2, h3, h4, h5, h6, h7, h8};
        
        jlableArray=new  JLabel[]{whitepawn1,whitepawn2,whitepawn3,whitepawn4,whitepawn5,whitepawn6,
                                 whitepawn7,whitepawn8,whiteRook1,whiteRook2,whiteknight1,whiteknight2,
                                 whitebishop,whitebishope2,whiteking,whitequeen,blackpawn1,blackpawn2,
                                 blackpawn3,blackpawn4,blackpawn5,blackpawn6,blackpawn7,blackpawn8,
                                 blackRook1,blackrook2,blackknight1,blackknight2,blackbisop1,blackbisop2,
                                 blackking,blackqueen};
        labelList = new ArrayList<>(Arrays.asList(jlableArray));
      
     
      jlableArray2=new ArrayList<>();
        
        originalColors = new Color[jPanelArray.length];
        storeOriginalColors();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        a8 = new javax.swing.JPanel();
        blackRook1 = new LabelName("blackRook1");
 ;
        d8 = new javax.swing.JPanel();
        blackqueen = new LabelName("blackqueen");
        ;
        c8 = new javax.swing.JPanel();
        blackbisop1 = new LabelName("blackbisop1");
        ;
        f8 = new javax.swing.JPanel();
        blackbisop2 = new LabelName("blackbisop2");
        ;
        b2 = new javax.swing.JPanel();
        whitepawn2 = new LabelName("whitepawn2");
        ;
        e8 = new javax.swing.JPanel();
        blackking = new LabelName("blackKing");
 ;
        a2 = new javax.swing.JPanel();
        whitepawn1 = new LabelName("whitepawn1")
        ;
        d2 = new javax.swing.JPanel();
        whitepawn4 = new LabelName("whitepawn4");
        ;
        a7 = new javax.swing.JPanel();
        blackpawn1 = new LabelName("blackpawn1");
        ;
        c2 = new javax.swing.JPanel();
        whitepawn3 = new LabelName("whitepawn3");
        ;
        b7 = new javax.swing.JPanel();
        blackpawn2 = new LabelName("blackpawn2");
        ;
        f2 = new javax.swing.JPanel();
        whitepawn6 = new LabelName("whitepawn6");
        ;
        c7 = new javax.swing.JPanel();
        blackpawn3 = new LabelName("blackpawn3");
        ;
        e2 = new javax.swing.JPanel();
        whitepawn5 = new LabelName("whitepawn5");
        ;
        d7 = new javax.swing.JPanel();
        blackpawn4 = new LabelName("blackpawn4");
        ;
        h2 = new javax.swing.JPanel();
        whitepawn8 = new LabelName("whitepawn8");
        ;
        h3 = new javax.swing.JPanel();
        a4 = new javax.swing.JPanel();
        d4 = new javax.swing.JPanel();
        c4 = new javax.swing.JPanel();
        f4 = new javax.swing.JPanel();
        e4 = new javax.swing.JPanel();
        h4 = new javax.swing.JPanel();
        a3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        b3 = new javax.swing.JPanel();
        c3 = new javax.swing.JPanel();
        d3 = new javax.swing.JPanel();
        e7 = new javax.swing.JPanel();
        blackpawn5 = new LabelName("blackpawn5");
        ;
        e3 = new javax.swing.JPanel();
        f7 = new javax.swing.JPanel();
        blackpawn6 = new LabelName("blackpawn6");
        ;
        f3 = new javax.swing.JPanel();
        g8 = new javax.swing.JPanel();
        new LabelName("blackknight2");
        blackknight2 = new javax.swing.JLabel();
        g7 = new javax.swing.JPanel();
        blackpawn7 = new LabelName("blackpawn7");
        ;
        b8 = new javax.swing.JPanel();
        blackknight1 = new LabelName("blackknight1");
        ;
        g4 = new javax.swing.JPanel();
        g3 = new javax.swing.JPanel();
        b4 = new javax.swing.JPanel();
        g5 = new javax.swing.JPanel();
        h5 = new javax.swing.JPanel();
        a5 = new javax.swing.JPanel();
        b5 = new javax.swing.JPanel();
        c5 = new javax.swing.JPanel();
        d5 = new javax.swing.JPanel();
        e5 = new javax.swing.JPanel();
        f5 = new javax.swing.JPanel();
        g6 = new javax.swing.JPanel();
        b6 = new javax.swing.JPanel();
        a6 = new javax.swing.JPanel();
        d6 = new javax.swing.JPanel();
        a1 = new javax.swing.JPanel();
        whiteRook1 = new LabelName("whiteRook1");
        c6 = new javax.swing.JPanel();
        b1 = new javax.swing.JPanel();
        whiteknight1 = new LabelName("whiteknight1");
 ;
        f6 = new javax.swing.JPanel();
        c1 = new javax.swing.JPanel();
        whitebishop = new LabelName("whitebishop");
        ;
        e6 = new javax.swing.JPanel();
        d1 = new javax.swing.JPanel();
        whitequeen = new LabelName("whitequeen");
        ;
        h6 = new javax.swing.JPanel();
        e1 = new javax.swing.JPanel();
        whiteking = new LabelName("whiteKing");
 ;
        h7 = new javax.swing.JPanel();
        blackpawn8 = new LabelName("blackpawn8");
        ;
        f1 = new javax.swing.JPanel();
        whitebishope2 = new LabelName("whitebishope2");
        ;
        g1 = new javax.swing.JPanel();
        whiteknight2 = new LabelName("whiteknight2");
        ;
        h1 = new javax.swing.JPanel();
        whiteRook2 = new LabelName("whiteRook2");
 ;
        g2 = new javax.swing.JPanel();
        whitepawn7 = new LabelName("whitepawn7");
        ;
        h8 = new javax.swing.JPanel();
        blackrook2 = new LabelName("blackRook2");
 ;
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        undobutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        a8.setBackground(new java.awt.Color(255, 255, 255));
        a8.setName("a8"); // NOI18N
        a8.setPreferredSize(new java.awt.Dimension(80, 80));
        a8.setRequestFocusEnabled(false);
        a8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                a8MousePressed(evt);
            }
        });

        blackRook1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blackRook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/BlackRook.png"))); // NOI18N
        blackRook1.setText("blackRook1");
        blackRook1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackRook1.setName("blackRook1"); // NOI18N
        blackRook1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackRook1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackRook1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout a8Layout = new javax.swing.GroupLayout(a8);
        a8.setLayout(a8Layout);
        a8Layout.setHorizontalGroup(
            a8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackRook1)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        a8Layout.setVerticalGroup(
            a8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, a8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(blackRook1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        d8.setBackground(new java.awt.Color(0, 0, 0));
        d8.setName("d8"); // NOI18N
        d8.setPreferredSize(new java.awt.Dimension(80, 80));
        d8.setRequestFocusEnabled(false);
        d8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                d8MousePressed(evt);
            }
        });

        blackqueen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blackqueen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/BlackQueen.png"))); // NOI18N
        blackqueen.setText("blackqueen");
        blackqueen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackqueen.setName("blackqueen"); // NOI18N
        blackqueen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackqueen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                blackqueenMousePressed(evt);
            }
        });

        javax.swing.GroupLayout d8Layout = new javax.swing.GroupLayout(d8);
        d8.setLayout(d8Layout);
        d8Layout.setHorizontalGroup(
            d8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackqueen)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        d8Layout.setVerticalGroup(
            d8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, d8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(blackqueen, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        c8.setBackground(new java.awt.Color(255, 255, 255));
        c8.setName("c8"); // NOI18N
        c8.setPreferredSize(new java.awt.Dimension(80, 80));
        c8.setRequestFocusEnabled(false);
        c8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c8MousePressed(evt);
            }
        });

        blackbisop1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blackbisop1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/BlackBishop.png"))); // NOI18N
        blackbisop1.setText("blackbishop1");
        blackbisop1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackbisop1.setName("blackbisop1"); // NOI18N
        blackbisop1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackbisop1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackbisop1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout c8Layout = new javax.swing.GroupLayout(c8);
        c8.setLayout(c8Layout);
        c8Layout.setHorizontalGroup(
            c8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackbisop1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c8Layout.setVerticalGroup(
            c8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(blackbisop1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        f8.setBackground(new java.awt.Color(0, 0, 0));
        f8.setName("f8"); // NOI18N
        f8.setPreferredSize(new java.awt.Dimension(80, 80));
        f8.setRequestFocusEnabled(false);
        f8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f8MousePressed(evt);
            }
        });

        blackbisop2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blackbisop2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/BlackBishop.png"))); // NOI18N
        blackbisop2.setText("blackbishop2");
        blackbisop2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackbisop2.setName("blackbisop2"); // NOI18N
        blackbisop2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackbisop2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackbisop2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout f8Layout = new javax.swing.GroupLayout(f8);
        f8.setLayout(f8Layout);
        f8Layout.setHorizontalGroup(
            f8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(f8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackbisop2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        f8Layout.setVerticalGroup(
            f8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, f8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(blackbisop2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        b2.setBackground(new java.awt.Color(0, 0, 0));
        b2.setName("b2"); // NOI18N
        b2.setPreferredSize(new java.awt.Dimension(80, 80));
        b2.setRequestFocusEnabled(false);
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b2MousePressed(evt);
            }
        });

        whitepawn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whitepawn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/WhitePawn.png"))); // NOI18N
        whitepawn2.setText("whitepawn2");
        whitepawn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whitepawn2.setName("whitepawn2"); // NOI18N
        whitepawn2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        whitepawn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whitepawn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout b2Layout = new javax.swing.GroupLayout(b2);
        b2.setLayout(b2Layout);
        b2Layout.setHorizontalGroup(
            b2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(b2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitepawn2)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        b2Layout.setVerticalGroup(
            b2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, b2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(whitepawn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        e8.setBackground(new java.awt.Color(255, 255, 255));
        e8.setName("e8"); // NOI18N
        e8.setPreferredSize(new java.awt.Dimension(80, 80));
        e8.setRequestFocusEnabled(false);
        e8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                e8MousePressed(evt);
            }
        });

        blackking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blackking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/BlackKing.png"))); // NOI18N
        blackking.setText("blackking");
        blackking.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackking.setName("blackking"); // NOI18N
        blackking.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackkingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout e8Layout = new javax.swing.GroupLayout(e8);
        e8.setLayout(e8Layout);
        e8Layout.setHorizontalGroup(
            e8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(e8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackking)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        e8Layout.setVerticalGroup(
            e8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, e8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(blackking, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        a2.setBackground(new java.awt.Color(255, 255, 255));
        a2.setName("a2"); // NOI18N
        a2.setPreferredSize(new java.awt.Dimension(80, 80));
        a2.setRequestFocusEnabled(false);
        a2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                a2MousePressed(evt);
            }
        });

        whitepawn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/WhitePawn.png"))); // NOI18N
        whitepawn1.setText("whitepawn1");
        whitepawn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whitepawn1.setName("whitepawn1"); // NOI18N
        whitepawn1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        whitepawn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whitepawn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout a2Layout = new javax.swing.GroupLayout(a2);
        a2.setLayout(a2Layout);
        a2Layout.setHorizontalGroup(
            a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitepawn1)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        a2Layout.setVerticalGroup(
            a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, a2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(whitepawn1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        d2.setBackground(new java.awt.Color(0, 0, 0));
        d2.setName("d2"); // NOI18N
        d2.setPreferredSize(new java.awt.Dimension(80, 80));
        d2.setRequestFocusEnabled(false);
        d2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                d2MousePressed(evt);
            }
        });

        whitepawn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whitepawn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/WhitePawn.png"))); // NOI18N
        whitepawn4.setText("whitepawn4");
        whitepawn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whitepawn4.setName("whitepawn4"); // NOI18N
        whitepawn4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        whitepawn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whitepawn4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout d2Layout = new javax.swing.GroupLayout(d2);
        d2.setLayout(d2Layout);
        d2Layout.setHorizontalGroup(
            d2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitepawn4)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        d2Layout.setVerticalGroup(
            d2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitepawn4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        a7.setBackground(new java.awt.Color(0, 0, 0));
        a7.setName("a7"); // NOI18N
        a7.setPreferredSize(new java.awt.Dimension(80, 80));
        a7.setRequestFocusEnabled(false);
        a7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                a7MousePressed(evt);
            }
        });

        blackpawn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/BlackPawn.png"))); // NOI18N
        blackpawn1.setText("blackpawn1");
        blackpawn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackpawn1.setName("blackpawn1"); // NOI18N
        blackpawn1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackpawn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackpawn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout a7Layout = new javax.swing.GroupLayout(a7);
        a7.setLayout(a7Layout);
        a7Layout.setHorizontalGroup(
            a7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackpawn1)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        a7Layout.setVerticalGroup(
            a7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, a7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(blackpawn1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        c2.setBackground(new java.awt.Color(255, 255, 255));
        c2.setName("c2"); // NOI18N
        c2.setPreferredSize(new java.awt.Dimension(80, 80));
        c2.setRequestFocusEnabled(false);
        c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c2MousePressed(evt);
            }
        });

        whitepawn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whitepawn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/WhitePawn.png"))); // NOI18N
        whitepawn3.setText("whitepawn3");
        whitepawn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whitepawn3.setName("whitepawn3"); // NOI18N
        whitepawn3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        whitepawn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whitepawn3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout c2Layout = new javax.swing.GroupLayout(c2);
        c2.setLayout(c2Layout);
        c2Layout.setHorizontalGroup(
            c2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitepawn3)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        c2Layout.setVerticalGroup(
            c2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitepawn3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.setName("b7"); // NOI18N
        b7.setPreferredSize(new java.awt.Dimension(80, 80));
        b7.setRequestFocusEnabled(false);
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b7MousePressed(evt);
            }
        });

        blackpawn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/BlackPawn.png"))); // NOI18N
        blackpawn2.setText("blackpawn2");
        blackpawn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackpawn2.setName("blackpawn2"); // NOI18N
        blackpawn2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackpawn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackpawn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout b7Layout = new javax.swing.GroupLayout(b7);
        b7.setLayout(b7Layout);
        b7Layout.setHorizontalGroup(
            b7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(b7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackpawn2)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        b7Layout.setVerticalGroup(
            b7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, b7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(blackpawn2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        f2.setBackground(new java.awt.Color(0, 0, 0));
        f2.setName("f2"); // NOI18N
        f2.setPreferredSize(new java.awt.Dimension(80, 80));
        f2.setRequestFocusEnabled(false);
        f2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f2MousePressed(evt);
            }
        });

        whitepawn6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whitepawn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/WhitePawn.png"))); // NOI18N
        whitepawn6.setText("whitepawn6");
        whitepawn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whitepawn6.setName("whitepawn6"); // NOI18N
        whitepawn6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        whitepawn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whitepawn6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout f2Layout = new javax.swing.GroupLayout(f2);
        f2.setLayout(f2Layout);
        f2Layout.setHorizontalGroup(
            f2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(f2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitepawn6)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        f2Layout.setVerticalGroup(
            f2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(f2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitepawn6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        c7.setBackground(new java.awt.Color(0, 0, 0));
        c7.setName("c7"); // NOI18N
        c7.setPreferredSize(new java.awt.Dimension(80, 80));
        c7.setRequestFocusEnabled(false);
        c7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c7MousePressed(evt);
            }
        });

        blackpawn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/BlackPawn.png"))); // NOI18N
        blackpawn3.setText("blackpawn3");
        blackpawn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackpawn3.setName("blackpawn3"); // NOI18N
        blackpawn3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackpawn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackpawn3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout c7Layout = new javax.swing.GroupLayout(c7);
        c7.setLayout(c7Layout);
        c7Layout.setHorizontalGroup(
            c7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackpawn3)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        c7Layout.setVerticalGroup(
            c7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(blackpawn3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        e2.setBackground(new java.awt.Color(255, 255, 255));
        e2.setName("e2"); // NOI18N
        e2.setPreferredSize(new java.awt.Dimension(80, 80));
        e2.setRequestFocusEnabled(false);
        e2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                e2MousePressed(evt);
            }
        });

        whitepawn5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whitepawn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/WhitePawn.png"))); // NOI18N
        whitepawn5.setText("whitepawn5");
        whitepawn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whitepawn5.setName("whitepawn5"); // NOI18N
        whitepawn5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        whitepawn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whitepawn5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout e2Layout = new javax.swing.GroupLayout(e2);
        e2.setLayout(e2Layout);
        e2Layout.setHorizontalGroup(
            e2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(e2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitepawn5)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        e2Layout.setVerticalGroup(
            e2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(e2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitepawn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        d7.setBackground(new java.awt.Color(255, 255, 255));
        d7.setName("d7"); // NOI18N
        d7.setPreferredSize(new java.awt.Dimension(80, 80));
        d7.setRequestFocusEnabled(false);
        d7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                d7MousePressed(evt);
            }
        });

        blackpawn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blackpawn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/BlackPawn.png"))); // NOI18N
        blackpawn4.setText("blackpawn4");
        blackpawn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackpawn4.setName("blackpawn4"); // NOI18N
        blackpawn4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackpawn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackpawn4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout d7Layout = new javax.swing.GroupLayout(d7);
        d7.setLayout(d7Layout);
        d7Layout.setHorizontalGroup(
            d7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackpawn4)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        d7Layout.setVerticalGroup(
            d7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackpawn4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        h2.setBackground(new java.awt.Color(0, 0, 0));
        h2.setName("h2"); // NOI18N
        h2.setPreferredSize(new java.awt.Dimension(80, 80));
        h2.setRequestFocusEnabled(false);
        h2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                h2MousePressed(evt);
            }
        });

        whitepawn8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whitepawn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/WhitePawn.png"))); // NOI18N
        whitepawn8.setText("whitepawn8");
        whitepawn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whitepawn8.setName("whitepawn8"); // NOI18N
        whitepawn8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        whitepawn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whitepawn8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout h2Layout = new javax.swing.GroupLayout(h2);
        h2.setLayout(h2Layout);
        h2Layout.setHorizontalGroup(
            h2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitepawn8)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        h2Layout.setVerticalGroup(
            h2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitepawn8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        h3.setBackground(new java.awt.Color(255, 255, 255));
        h3.setName("h3"); // NOI18N
        h3.setPreferredSize(new java.awt.Dimension(80, 80));
        h3.setRequestFocusEnabled(false);
        h3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                h3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout h3Layout = new javax.swing.GroupLayout(h3);
        h3.setLayout(h3Layout);
        h3Layout.setHorizontalGroup(
            h3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        h3Layout.setVerticalGroup(
            h3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        a4.setBackground(new java.awt.Color(255, 255, 255));
        a4.setName("a4"); // NOI18N
        a4.setPreferredSize(new java.awt.Dimension(80, 80));
        a4.setRequestFocusEnabled(false);
        a4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                a4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout a4Layout = new javax.swing.GroupLayout(a4);
        a4.setLayout(a4Layout);
        a4Layout.setHorizontalGroup(
            a4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        a4Layout.setVerticalGroup(
            a4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        d4.setBackground(new java.awt.Color(0, 0, 0));
        d4.setName("d4"); // NOI18N
        d4.setPreferredSize(new java.awt.Dimension(80, 80));
        d4.setRequestFocusEnabled(false);
        d4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                d4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout d4Layout = new javax.swing.GroupLayout(d4);
        d4.setLayout(d4Layout);
        d4Layout.setHorizontalGroup(
            d4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        d4Layout.setVerticalGroup(
            d4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        c4.setBackground(new java.awt.Color(255, 255, 255));
        c4.setName("c4"); // NOI18N
        c4.setPreferredSize(new java.awt.Dimension(80, 80));
        c4.setRequestFocusEnabled(false);
        c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout c4Layout = new javax.swing.GroupLayout(c4);
        c4.setLayout(c4Layout);
        c4Layout.setHorizontalGroup(
            c4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        c4Layout.setVerticalGroup(
            c4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        f4.setBackground(new java.awt.Color(0, 0, 0));
        f4.setName("f4"); // NOI18N
        f4.setPreferredSize(new java.awt.Dimension(80, 80));
        f4.setRequestFocusEnabled(false);
        f4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout f4Layout = new javax.swing.GroupLayout(f4);
        f4.setLayout(f4Layout);
        f4Layout.setHorizontalGroup(
            f4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        f4Layout.setVerticalGroup(
            f4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        e4.setBackground(new java.awt.Color(255, 255, 255));
        e4.setName("e4"); // NOI18N
        e4.setPreferredSize(new java.awt.Dimension(80, 80));
        e4.setRequestFocusEnabled(false);
        e4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                e4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout e4Layout = new javax.swing.GroupLayout(e4);
        e4.setLayout(e4Layout);
        e4Layout.setHorizontalGroup(
            e4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        e4Layout.setVerticalGroup(
            e4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        h4.setBackground(new java.awt.Color(0, 0, 0));
        h4.setName("h4"); // NOI18N
        h4.setPreferredSize(new java.awt.Dimension(80, 80));
        h4.setRequestFocusEnabled(false);
        h4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                h4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout h4Layout = new javax.swing.GroupLayout(h4);
        h4.setLayout(h4Layout);
        h4Layout.setHorizontalGroup(
            h4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        h4Layout.setVerticalGroup(
            h4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        a3.setBackground(new java.awt.Color(0, 0, 0));
        a3.setName("a3"); // NOI18N
        a3.setPreferredSize(new java.awt.Dimension(80, 80));
        a3.setRequestFocusEnabled(false);
        a3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                a3MousePressed(evt);
            }
        });

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout a3Layout = new javax.swing.GroupLayout(a3);
        a3.setLayout(a3Layout);
        a3Layout.setHorizontalGroup(
            a3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, a3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(77, 77, 77))
        );
        a3Layout.setVerticalGroup(
            a3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setName("b3"); // NOI18N
        b3.setPreferredSize(new java.awt.Dimension(80, 80));
        b3.setRequestFocusEnabled(false);
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout b3Layout = new javax.swing.GroupLayout(b3);
        b3.setLayout(b3Layout);
        b3Layout.setHorizontalGroup(
            b3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        b3Layout.setVerticalGroup(
            b3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        c3.setBackground(new java.awt.Color(0, 0, 0));
        c3.setName("c3"); // NOI18N
        c3.setPreferredSize(new java.awt.Dimension(80, 80));
        c3.setRequestFocusEnabled(false);
        c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout c3Layout = new javax.swing.GroupLayout(c3);
        c3.setLayout(c3Layout);
        c3Layout.setHorizontalGroup(
            c3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        c3Layout.setVerticalGroup(
            c3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        d3.setBackground(new java.awt.Color(255, 255, 255));
        d3.setName("d3"); // NOI18N
        d3.setPreferredSize(new java.awt.Dimension(80, 80));
        d3.setRequestFocusEnabled(false);
        d3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                d3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout d3Layout = new javax.swing.GroupLayout(d3);
        d3.setLayout(d3Layout);
        d3Layout.setHorizontalGroup(
            d3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        d3Layout.setVerticalGroup(
            d3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        e7.setBackground(new java.awt.Color(0, 0, 0));
        e7.setName("e7"); // NOI18N
        e7.setPreferredSize(new java.awt.Dimension(80, 80));
        e7.setRequestFocusEnabled(false);
        e7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                e7MousePressed(evt);
            }
        });

        blackpawn5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blackpawn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/BlackPawn.png"))); // NOI18N
        blackpawn5.setText("blackpawn5");
        blackpawn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackpawn5.setName("blackpawn5"); // NOI18N
        blackpawn5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackpawn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackpawn5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout e7Layout = new javax.swing.GroupLayout(e7);
        e7.setLayout(e7Layout);
        e7Layout.setHorizontalGroup(
            e7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(e7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackpawn5)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        e7Layout.setVerticalGroup(
            e7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(e7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackpawn5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        e3.setBackground(new java.awt.Color(0, 0, 0));
        e3.setName("e3"); // NOI18N
        e3.setPreferredSize(new java.awt.Dimension(80, 80));
        e3.setRequestFocusEnabled(false);
        e3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                e3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout e3Layout = new javax.swing.GroupLayout(e3);
        e3.setLayout(e3Layout);
        e3Layout.setHorizontalGroup(
            e3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        e3Layout.setVerticalGroup(
            e3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        f7.setBackground(new java.awt.Color(255, 255, 255));
        f7.setName("f7"); // NOI18N
        f7.setPreferredSize(new java.awt.Dimension(80, 80));
        f7.setRequestFocusEnabled(false);
        f7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f7MousePressed(evt);
            }
        });

        blackpawn6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blackpawn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/BlackPawn.png"))); // NOI18N
        blackpawn6.setText("blackpawn6");
        blackpawn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackpawn6.setName("blackpawn6"); // NOI18N
        blackpawn6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackpawn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackpawn6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout f7Layout = new javax.swing.GroupLayout(f7);
        f7.setLayout(f7Layout);
        f7Layout.setHorizontalGroup(
            f7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(f7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackpawn6)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        f7Layout.setVerticalGroup(
            f7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(f7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackpawn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        f3.setBackground(new java.awt.Color(255, 255, 255));
        f3.setName("f3"); // NOI18N
        f3.setPreferredSize(new java.awt.Dimension(80, 80));
        f3.setRequestFocusEnabled(false);
        f3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout f3Layout = new javax.swing.GroupLayout(f3);
        f3.setLayout(f3Layout);
        f3Layout.setHorizontalGroup(
            f3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        f3Layout.setVerticalGroup(
            f3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        g8.setBackground(new java.awt.Color(255, 255, 255));
        g8.setName("g8"); // NOI18N
        g8.setPreferredSize(new java.awt.Dimension(80, 80));
        g8.setRequestFocusEnabled(false);
        g8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                g8MousePressed(evt);
            }
        });

        blackknight2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blackknight2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/BlackKnight.png"))); // NOI18N
        blackknight2.setText("blackknight2");
        blackknight2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackknight2.setName("blackknight2"); // NOI18N
        blackknight2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackknight2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackknight2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout g8Layout = new javax.swing.GroupLayout(g8);
        g8.setLayout(g8Layout);
        g8Layout.setHorizontalGroup(
            g8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(g8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackknight2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        g8Layout.setVerticalGroup(
            g8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, g8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(blackknight2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        g7.setBackground(new java.awt.Color(0, 0, 0));
        g7.setName("g7"); // NOI18N
        g7.setPreferredSize(new java.awt.Dimension(80, 80));
        g7.setRequestFocusEnabled(false);
        g7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                g7MousePressed(evt);
            }
        });

        blackpawn7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blackpawn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/BlackPawn.png"))); // NOI18N
        blackpawn7.setText("blackpawn7");
        blackpawn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackpawn7.setName("blackpawn7"); // NOI18N
        blackpawn7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackpawn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackpawn7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout g7Layout = new javax.swing.GroupLayout(g7);
        g7.setLayout(g7Layout);
        g7Layout.setHorizontalGroup(
            g7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(g7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackpawn7)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        g7Layout.setVerticalGroup(
            g7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(g7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackpawn7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        b8.setBackground(new java.awt.Color(0, 0, 0));
        b8.setName("b8"); // NOI18N
        b8.setPreferredSize(new java.awt.Dimension(80, 80));
        b8.setRequestFocusEnabled(false);
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b8MousePressed(evt);
            }
        });

        blackknight1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blackknight1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/BlackKnight.png"))); // NOI18N
        blackknight1.setText("blackknight1");
        blackknight1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackknight1.setName("blackknight1"); // NOI18N
        blackknight1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackknight1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackknight1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout b8Layout = new javax.swing.GroupLayout(b8);
        b8.setLayout(b8Layout);
        b8Layout.setHorizontalGroup(
            b8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(b8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackknight1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        b8Layout.setVerticalGroup(
            b8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, b8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(blackknight1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        g4.setBackground(new java.awt.Color(255, 255, 255));
        g4.setName("g4"); // NOI18N
        g4.setPreferredSize(new java.awt.Dimension(80, 80));
        g4.setRequestFocusEnabled(false);
        g4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                g4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout g4Layout = new javax.swing.GroupLayout(g4);
        g4.setLayout(g4Layout);
        g4Layout.setHorizontalGroup(
            g4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        g4Layout.setVerticalGroup(
            g4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        g3.setBackground(new java.awt.Color(0, 0, 0));
        g3.setName("g3"); // NOI18N
        g3.setPreferredSize(new java.awt.Dimension(80, 80));
        g3.setRequestFocusEnabled(false);
        g3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                g3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout g3Layout = new javax.swing.GroupLayout(g3);
        g3.setLayout(g3Layout);
        g3Layout.setHorizontalGroup(
            g3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        g3Layout.setVerticalGroup(
            g3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        b4.setBackground(new java.awt.Color(0, 0, 0));
        b4.setName("b4"); // NOI18N
        b4.setPreferredSize(new java.awt.Dimension(80, 80));
        b4.setRequestFocusEnabled(false);
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout b4Layout = new javax.swing.GroupLayout(b4);
        b4.setLayout(b4Layout);
        b4Layout.setHorizontalGroup(
            b4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        b4Layout.setVerticalGroup(
            b4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        g5.setBackground(new java.awt.Color(0, 0, 0));
        g5.setName("g5"); // NOI18N
        g5.setPreferredSize(new java.awt.Dimension(80, 80));
        g5.setRequestFocusEnabled(false);
        g5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                g5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout g5Layout = new javax.swing.GroupLayout(g5);
        g5.setLayout(g5Layout);
        g5Layout.setHorizontalGroup(
            g5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        g5Layout.setVerticalGroup(
            g5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        h5.setBackground(new java.awt.Color(255, 255, 255));
        h5.setName("h5"); // NOI18N
        h5.setPreferredSize(new java.awt.Dimension(80, 80));
        h5.setRequestFocusEnabled(false);
        h5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                h5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout h5Layout = new javax.swing.GroupLayout(h5);
        h5.setLayout(h5Layout);
        h5Layout.setHorizontalGroup(
            h5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        h5Layout.setVerticalGroup(
            h5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        a5.setBackground(new java.awt.Color(0, 0, 0));
        a5.setName("a5"); // NOI18N
        a5.setPreferredSize(new java.awt.Dimension(80, 80));
        a5.setRequestFocusEnabled(false);
        a5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                a5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout a5Layout = new javax.swing.GroupLayout(a5);
        a5.setLayout(a5Layout);
        a5Layout.setHorizontalGroup(
            a5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        a5Layout.setVerticalGroup(
            a5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        b5.setBackground(new java.awt.Color(255, 255, 255));
        b5.setName("b5"); // NOI18N
        b5.setPreferredSize(new java.awt.Dimension(80, 80));
        b5.setRequestFocusEnabled(false);
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout b5Layout = new javax.swing.GroupLayout(b5);
        b5.setLayout(b5Layout);
        b5Layout.setHorizontalGroup(
            b5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        b5Layout.setVerticalGroup(
            b5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        c5.setBackground(new java.awt.Color(0, 0, 0));
        c5.setName("c5"); // NOI18N
        c5.setPreferredSize(new java.awt.Dimension(80, 80));
        c5.setRequestFocusEnabled(false);
        c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout c5Layout = new javax.swing.GroupLayout(c5);
        c5.setLayout(c5Layout);
        c5Layout.setHorizontalGroup(
            c5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        c5Layout.setVerticalGroup(
            c5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        d5.setBackground(new java.awt.Color(255, 255, 255));
        d5.setName("d5"); // NOI18N
        d5.setPreferredSize(new java.awt.Dimension(80, 80));
        d5.setRequestFocusEnabled(false);
        d5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                d5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout d5Layout = new javax.swing.GroupLayout(d5);
        d5.setLayout(d5Layout);
        d5Layout.setHorizontalGroup(
            d5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        d5Layout.setVerticalGroup(
            d5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        e5.setBackground(new java.awt.Color(0, 0, 0));
        e5.setName("e5"); // NOI18N
        e5.setPreferredSize(new java.awt.Dimension(80, 80));
        e5.setRequestFocusEnabled(false);
        e5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                e5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout e5Layout = new javax.swing.GroupLayout(e5);
        e5.setLayout(e5Layout);
        e5Layout.setHorizontalGroup(
            e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        e5Layout.setVerticalGroup(
            e5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        f5.setBackground(new java.awt.Color(255, 255, 255));
        f5.setName("f5"); // NOI18N
        f5.setPreferredSize(new java.awt.Dimension(80, 80));
        f5.setRequestFocusEnabled(false);
        f5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout f5Layout = new javax.swing.GroupLayout(f5);
        f5.setLayout(f5Layout);
        f5Layout.setHorizontalGroup(
            f5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        f5Layout.setVerticalGroup(
            f5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        g6.setBackground(new java.awt.Color(255, 255, 255));
        g6.setName("g6"); // NOI18N
        g6.setPreferredSize(new java.awt.Dimension(80, 80));
        g6.setRequestFocusEnabled(false);
        g6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                g6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout g6Layout = new javax.swing.GroupLayout(g6);
        g6.setLayout(g6Layout);
        g6Layout.setHorizontalGroup(
            g6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        g6Layout.setVerticalGroup(
            g6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        b6.setBackground(new java.awt.Color(0, 0, 0));
        b6.setName("b6"); // NOI18N
        b6.setPreferredSize(new java.awt.Dimension(80, 80));
        b6.setRequestFocusEnabled(false);
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout b6Layout = new javax.swing.GroupLayout(b6);
        b6.setLayout(b6Layout);
        b6Layout.setHorizontalGroup(
            b6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        b6Layout.setVerticalGroup(
            b6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        a6.setBackground(new java.awt.Color(255, 255, 255));
        a6.setName("a6"); // NOI18N
        a6.setPreferredSize(new java.awt.Dimension(80, 80));
        a6.setRequestFocusEnabled(false);
        a6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                a6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout a6Layout = new javax.swing.GroupLayout(a6);
        a6.setLayout(a6Layout);
        a6Layout.setHorizontalGroup(
            a6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        a6Layout.setVerticalGroup(
            a6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        d6.setBackground(new java.awt.Color(0, 0, 0));
        d6.setName("d6"); // NOI18N
        d6.setPreferredSize(new java.awt.Dimension(80, 80));
        d6.setRequestFocusEnabled(false);
        d6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                d6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout d6Layout = new javax.swing.GroupLayout(d6);
        d6.setLayout(d6Layout);
        d6Layout.setHorizontalGroup(
            d6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        d6Layout.setVerticalGroup(
            d6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        a1.setBackground(new java.awt.Color(0, 0, 0));
        a1.setName("a1"); // NOI18N
        a1.setPreferredSize(new java.awt.Dimension(80, 80));
        a1.setRequestFocusEnabled(false);
        a1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                a1MousePressed(evt);
            }
        });

        whiteRook1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whiteRook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/WhiteRook.png"))); // NOI18N
        whiteRook1.setText("whiteRook1");
        whiteRook1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whiteRook1.setName(""); // NOI18N
        whiteRook1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        whiteRook1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whiteRook1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout a1Layout = new javax.swing.GroupLayout(a1);
        a1.setLayout(a1Layout);
        a1Layout.setHorizontalGroup(
            a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whiteRook1)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        a1Layout.setVerticalGroup(
            a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whiteRook1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        whiteRook1.getAccessibleContext().setAccessibleName("whiterook");

        c6.setBackground(new java.awt.Color(255, 255, 255));
        c6.setName("c6"); // NOI18N
        c6.setPreferredSize(new java.awt.Dimension(80, 80));
        c6.setRequestFocusEnabled(false);
        c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout c6Layout = new javax.swing.GroupLayout(c6);
        c6.setLayout(c6Layout);
        c6Layout.setHorizontalGroup(
            c6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        c6Layout.setVerticalGroup(
            c6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setName("b1"); // NOI18N
        b1.setPreferredSize(new java.awt.Dimension(80, 80));
        b1.setRequestFocusEnabled(false);
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b1MousePressed(evt);
            }
        });

        whiteknight1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/WhiteKnight.png"))); // NOI18N
        whiteknight1.setText("whiteknight1");
        whiteknight1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whiteknight1.setName("whiteknight1"); // NOI18N
        whiteknight1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        whiteknight1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whiteknight1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout b1Layout = new javax.swing.GroupLayout(b1);
        b1.setLayout(b1Layout);
        b1Layout.setHorizontalGroup(
            b1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(b1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whiteknight1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        b1Layout.setVerticalGroup(
            b1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, b1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(whiteknight1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        f6.setBackground(new java.awt.Color(0, 0, 0));
        f6.setName("f6"); // NOI18N
        f6.setPreferredSize(new java.awt.Dimension(80, 80));
        f6.setRequestFocusEnabled(false);
        f6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout f6Layout = new javax.swing.GroupLayout(f6);
        f6.setLayout(f6Layout);
        f6Layout.setHorizontalGroup(
            f6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        f6Layout.setVerticalGroup(
            f6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        c1.setBackground(new java.awt.Color(0, 0, 0));
        c1.setName("c1"); // NOI18N
        c1.setPreferredSize(new java.awt.Dimension(80, 80));
        c1.setRequestFocusEnabled(false);
        c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c1MousePressed(evt);
            }
        });

        whitebishop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/WhiteBishop.png"))); // NOI18N
        whitebishop.setText("whitebishop1");
        whitebishop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whitebishop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        whitebishop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whitebishopMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout c1Layout = new javax.swing.GroupLayout(c1);
        c1.setLayout(c1Layout);
        c1Layout.setHorizontalGroup(
            c1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(c1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitebishop)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        c1Layout.setVerticalGroup(
            c1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, c1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(whitebishop, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        whitebishop.getAccessibleContext().setAccessibleName("whitebishop");

        e6.setBackground(new java.awt.Color(255, 255, 255));
        e6.setName("e6"); // NOI18N
        e6.setPreferredSize(new java.awt.Dimension(80, 80));
        e6.setRequestFocusEnabled(false);
        e6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                e6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout e6Layout = new javax.swing.GroupLayout(e6);
        e6.setLayout(e6Layout);
        e6Layout.setHorizontalGroup(
            e6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        e6Layout.setVerticalGroup(
            e6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        d1.setBackground(new java.awt.Color(255, 255, 255));
        d1.setName("d1"); // NOI18N
        d1.setPreferredSize(new java.awt.Dimension(80, 80));
        d1.setRequestFocusEnabled(false);
        d1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                d1MousePressed(evt);
            }
        });

        whitequeen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whitequeen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/WhiteQueen.png"))); // NOI18N
        whitequeen.setText("whitequeen");
        whitequeen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whitequeen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        whitequeen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whitequeenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout d1Layout = new javax.swing.GroupLayout(d1);
        d1.setLayout(d1Layout);
        d1Layout.setHorizontalGroup(
            d1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitequeen)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        d1Layout.setVerticalGroup(
            d1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, d1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(whitequeen, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        h6.setBackground(new java.awt.Color(0, 0, 0));
        h6.setName("h6"); // NOI18N
        h6.setPreferredSize(new java.awt.Dimension(80, 80));
        h6.setRequestFocusEnabled(false);
        h6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                h6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout h6Layout = new javax.swing.GroupLayout(h6);
        h6.setLayout(h6Layout);
        h6Layout.setHorizontalGroup(
            h6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        h6Layout.setVerticalGroup(
            h6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        e1.setBackground(new java.awt.Color(0, 0, 0));
        e1.setName("e1"); // NOI18N
        e1.setPreferredSize(new java.awt.Dimension(80, 80));
        e1.setRequestFocusEnabled(false);
        e1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                e1MousePressed(evt);
            }
        });

        whiteking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whiteking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/WhiteKing.png"))); // NOI18N
        whiteking.setText("whiteking");
        whiteking.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whiteking.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        whiteking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whitekingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout e1Layout = new javax.swing.GroupLayout(e1);
        e1.setLayout(e1Layout);
        e1Layout.setHorizontalGroup(
            e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(e1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whiteking)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        e1Layout.setVerticalGroup(
            e1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(e1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whiteking, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        h7.setBackground(new java.awt.Color(255, 255, 255));
        h7.setName("h7"); // NOI18N
        h7.setPreferredSize(new java.awt.Dimension(80, 80));
        h7.setRequestFocusEnabled(false);
        h7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                h7MousePressed(evt);
            }
        });

        blackpawn8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blackpawn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/BlackPawn.png"))); // NOI18N
        blackpawn8.setText("blackpawn8");
        blackpawn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackpawn8.setName("blackpawn8"); // NOI18N
        blackpawn8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackpawn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackpawn8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout h7Layout = new javax.swing.GroupLayout(h7);
        h7.setLayout(h7Layout);
        h7Layout.setHorizontalGroup(
            h7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackpawn8)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        h7Layout.setVerticalGroup(
            h7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackpawn8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        f1.setBackground(new java.awt.Color(255, 255, 255));
        f1.setName("f1"); // NOI18N
        f1.setPreferredSize(new java.awt.Dimension(80, 80));
        f1.setRequestFocusEnabled(false);
        f1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f1MousePressed(evt);
            }
        });

        whitebishope2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/WhiteBishop.png"))); // NOI18N
        whitebishope2.setText("whitebishop2");
        whitebishope2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whitebishope2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        whitebishope2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whitebishope2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout f1Layout = new javax.swing.GroupLayout(f1);
        f1.setLayout(f1Layout);
        f1Layout.setHorizontalGroup(
            f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(f1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitebishope2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        f1Layout.setVerticalGroup(
            f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(f1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitebishope2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        whitebishope2.getAccessibleContext().setAccessibleName("whitebishope2");

        g1.setBackground(new java.awt.Color(0, 0, 0));
        g1.setName("g1"); // NOI18N
        g1.setPreferredSize(new java.awt.Dimension(80, 80));
        g1.setRequestFocusEnabled(false);
        g1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                g1MousePressed(evt);
            }
        });

        whiteknight2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whiteknight2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/WhiteKnight.png"))); // NOI18N
        whiteknight2.setText("whiteknight2");
        whiteknight2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whiteknight2.setName("whiteknight2"); // NOI18N
        whiteknight2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        whiteknight2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whiteknight2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout g1Layout = new javax.swing.GroupLayout(g1);
        g1.setLayout(g1Layout);
        g1Layout.setHorizontalGroup(
            g1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(g1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whiteknight2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        g1Layout.setVerticalGroup(
            g1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(g1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whiteknight2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        h1.setBackground(new java.awt.Color(255, 255, 255));
        h1.setName("h1"); // NOI18N
        h1.setPreferredSize(new java.awt.Dimension(80, 80));
        h1.setRequestFocusEnabled(false);
        h1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                h1MousePressed(evt);
            }
        });

        whiteRook2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/WhiteRook.png"))); // NOI18N
        whiteRook2.setText("whiteRook2");
        whiteRook2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whiteRook2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        whiteRook2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whiteRook2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout h1Layout = new javax.swing.GroupLayout(h1);
        h1.setLayout(h1Layout);
        h1Layout.setHorizontalGroup(
            h1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whiteRook2)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        h1Layout.setVerticalGroup(
            h1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whiteRook2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        whiteRook2.getAccessibleContext().setAccessibleName("whiterook2");

        g2.setBackground(new java.awt.Color(255, 255, 255));
        g2.setName("g2"); // NOI18N
        g2.setPreferredSize(new java.awt.Dimension(80, 80));
        g2.setRequestFocusEnabled(false);
        g2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                g2MousePressed(evt);
            }
        });

        whitepawn7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whitepawn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/WhitePawn.png"))); // NOI18N
        whitepawn7.setText("whitepawn7");
        whitepawn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whitepawn7.setName("whitepawn7"); // NOI18N
        whitepawn7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        whitepawn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whitepawn7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout g2Layout = new javax.swing.GroupLayout(g2);
        g2.setLayout(g2Layout);
        g2Layout.setHorizontalGroup(
            g2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(g2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitepawn7)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        g2Layout.setVerticalGroup(
            g2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(g2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitepawn7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        h8.setBackground(new java.awt.Color(0, 0, 0));
        h8.setName("h8"); // NOI18N
        h8.setPreferredSize(new java.awt.Dimension(80, 80));
        h8.setRequestFocusEnabled(false);
        h8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                h8MousePressed(evt);
            }
        });

        blackrook2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blackrook2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChessGui/BlackRook.png"))); // NOI18N
        blackrook2.setText("blackRook2");
        blackrook2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackrook2.setName("blackrook2"); // NOI18N
        blackrook2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackrook2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackrook2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout h8Layout = new javax.swing.GroupLayout(h8);
        h8.setLayout(h8Layout);
        h8Layout.setHorizontalGroup(
            h8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blackrook2)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        h8Layout.setVerticalGroup(
            h8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(blackrook2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("a");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("b");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("c");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("d");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("e");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("f");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("h");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("g");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("1");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("2");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("3");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("4");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("5");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("6");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("7");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("8");

        undobutton.setBackground(new java.awt.Color(51, 51, 51));
        undobutton.setText("undo");
        undobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undobuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(h2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(h3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(h4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(e5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(g5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(h5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(d6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(e6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(g6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(h6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(g7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(h7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(g8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(h8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16))
                        .addGap(28, 28, 28))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(jLabel3)
                .addGap(73, 73, 73)
                .addComponent(jLabel4)
                .addGap(75, 75, 75)
                .addComponent(jLabel5)
                .addGap(72, 72, 72)
                .addComponent(jLabel6)
                .addGap(70, 70, 70)
                .addComponent(jLabel7)
                .addGap(79, 79, 79)
                .addComponent(jLabel9)
                .addGap(72, 72, 72)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(undobutton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(g8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(h8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(h7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(g6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(h6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel16)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(h5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(h3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel13)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(h2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(undobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        a1.getAccessibleContext().setAccessibleName("");
        a1.getAccessibleContext().setAccessibleParent(a1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
//    private void pieceLabelMouseClicked(java.awt.event.MouseEvent evt) {                                         
//    JLabel clickedLabel = (JLabel) evt.getSource();
//    JPanel squarePanel = (JPanel) clickedLabel.getParent();
//
//    if (squarePanel != null) {
//        String squareName = squarePanel.getName();
//        resetPreviousSelection();
//        // Now you have the name of the panel that the label is standing on
//        System.out.println("Clicked on square: " + squareName);
//
//        List<String> array = ff.getAllValidMovesFromSquare(squareName);
//        highlightAvailableMoves(array);
//        selectedLabel = clickedLabel;
//        // Store the original color
//        originalColor = squarePanel.getBackground();
//        for (String i : array) {
//            System.out.println(i);
//        }
//    }
//}
    
    private void pieceLabelMouseClicked(java.awt.event.MouseEvent evt) {                                         
    //JLabel clickedLabel = (JLabel) evt.getSource();
    JPanel squarePanel = (JPanel) clickedLabel.getParent();
    
    if (squarePanel != null) {
        //System.out.println("ahahaha");
        String squareName = squarePanel.getName();
        resetPreviousSelection();
        // Now you have the name of the panel that the label is standing on
        System.out.println("Clicked on square: " + squareName);

        List<String> array = ff.getAllValidMovesFromSquare(squareName);
        highlightAvailableMoves(array);
        selectedLabel = clickedLabel;
        // Store the original color
        originalColor = squarePanel.getBackground();
//        for (String i : array) {
//            System.out.println(i);
//        }
//        
}
    }


private void updatemove(Square[][] square)
{
    
    for(int i=0;i<8;i++)
    {
        for(int j=0;j<8;j++)
        {
         JLabel label=  getlabel(square[i][j]);
         setboard(square[i][j],label);
        }
    }
    
}
 private void setboard(Square square,JLabel label)
 { 
     
   String string=ff.squareNotation(square);
    if(string!=null)  //able el for loop el gwa el setboard
 
   for(JPanel jpanel:jPanelArray)
   { 
       if(string.equals(jpanel.getName()))
       { 
           if(label!=null)
           { //System.out.println("hena el77777777777");
               jpanel.removeAll();
                jpanel.repaint();
              
                  jpanel.add(label);
               
               
           
                    
                
           }
           else
           {
               jpanel.removeAll();
                jpanel.repaint();
               
           }
           
           
            
       }
   }
     
 }
 private JLabel getlabel(Square square)
 {  //if(square.getPiece()!=null)
     if (square != null && square.getPiece() != null)
 {for(int i=0;i<32;i++)
 {  
      String string=square.getPiece().getName();
      
         if(labelList.get(i)!=null&&labelList.get(i).getText().equals(string))
   {  //System.out.println("ahhahahahaha");
       //labelList.set(i, null);
        label=jlableArray[i];
       return jlableArray[i];
   }
     
     
//     String string1=square.getPiece().getName()+1;
//      System.out.println(string1);
//      //LabelName labelname=(LabelName) jlabel;
//     
//     if(labelList.get(i)!=null&&labelList.get(i).getText().equals(string1))
//   {  labelList.set(i, null);
//       return jlableArray[i];
//   }
//       String string2=square.getPiece().getName()+2;
//      System.out.println(string1);
//      //LabelName labelname=(LabelName) jlabel;
//     
//     if(labelList.get(i)!=null&&labelList.get(i).getText().equals(string2))
//   { labelList.set(i, null);
//       return jlableArray[i];
//   }
//         String string3=square.getPiece().getName()+3;
//      System.out.println(string1);
//      //LabelName labelname=(LabelName) jlabel;
//     
//     if(labelList.get(i)!=null&&labelList.get(i).getText().equals(string3))
//   { labelList.set(i, null);
//       return jlableArray[i];
//   }
//         String string4=square.getPiece().getName()+4;
//      System.out.println(string1);
//      //LabelName labelname=(LabelName) jlabel;
//     
//     if(labelList.get(i)!=null&&labelList.get(i).getText().equals(string4))
//   { labelList.set(i, null);
//       return jlableArray[i];
//   }
//         String string5=square.getPiece().getName()+5;
//      System.out.println(string1);
//      //LabelName labelname=(LabelName) jlabel;
//     
//     if(labelList.get(i)!=null&&labelList.get(i).getText().equals(string5))
//   { labelList.set(i, null);
//       return jlableArray[i];
//   }
//     
//         String string6=square.getPiece().getName()+6;
//      System.out.println(string1);
//      //LabelName labelname=(LabelName) jlabel;
//     
//     if(labelList.get(i)!=null&&labelList.get(i).getText().equals(string6))
//   { labelList.set(i, null);
//       return jlableArray[i];
//   }
//         String string7=square.getPiece().getName()+7;
//      System.out.println(string1);
//      //LabelName labelname=(LabelName) jlabel;
//     
//     if(labelList.get(i)!=null&&labelList.get(i).getText().equals(string7))
//   { labelList.set(i, null);
//       return jlableArray[i];
//   }
//         String string8=square.getPiece().getName()+8;
//      System.out.println(string1);
//      //LabelName labelname=(LabelName) jlabel;
//     
//     if(labelList.get(i)!=null&&labelList.get(i).getText().equals(string8))
//   { labelList.set(i, null);
//       return jlableArray[i];
   }
//     
// }
 } 
 return null;
 }
 
    
    
private void move(MouseEvent evt)
   {
       if(clickedLabel!=null)
        {System.out.println("lalalala");
              JPanel start=(JPanel)clickedLabel.getParent();
              String startstring=start.getName();
            JPanel end=(JPanel) evt.getSource();
            
            String endstring=end.getName();
                    
                    
                 if(ff.move(startstring, endstring)){
                     Square startSquare = ff.stringChange(startstring);
                  Square endSquare = ff.stringChange(endstring);
                  
                  
                  if (ff.isPawnPromotion(endstring)) {
                 System.out.println("Pawn promotion!");
                Object[] options = {"Knight", "Rook", "Bishop", "Queen"};
                int option = JOptionPane.showOptionDialog(this, "Choose promotion piece", "Pawn Promotion",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                String userChoice = null;
                switch (option) {
                    case 0:
                        userChoice = "K";
                        break;
                    case 1:
                        userChoice = "R";
                        break;
                    case 2:
                        userChoice = "B";
                        break;
                    case 3:
                        userChoice = "Q";
                        break;
                }
                    if(userChoice!=null&&ff.getCurrentPlayer()==ChessEnums.Color.Black){
                    System.out.println("we are inside the if");
                    switch(userChoice)
                    {
                        case "K":
                            ff.promotePawn(startstring, endstring, "K");
                            JLabel currentLabel1 = (JLabel) start.getComponent(0);
                            currentLabel1.setIcon(whiteknight1.getIcon());
                            //icon=whitepawn1.getIcon();
                            LabelName labelname=(LabelName) currentLabel1;
                            jlableArray2.add(labelname);
                            icon=whitepawn1.getIcon();
                            
                            break;
                        case "R":
                             ff.promotePawn(startstring, endstring, "R");
                             JLabel currentLabel2 = (JLabel) start.getComponent(0);
                             
                             currentLabel2.setIcon(whiteRook1.getIcon());
                             icon=whitepawn1.getIcon();
                           
                            LabelName labelname2=(LabelName) currentLabel2;
                            jlableArray2.add(labelname2);
                             break;
                        case "B":
                            ff.promotePawn(startstring, endstring, "B");
                            JLabel currentLabel3 = (JLabel) start.getComponent(0);
                            currentLabel3.setIcon(whitebishop.getIcon());
                            // icon=whitepawn1.getIcon();
                             icon=whitepawn1.getIcon();
                            LabelName labelname3=(LabelName) currentLabel3;
                            jlableArray2.add(labelname3);
                            break;
                        case "Q":    
                            ff.promotePawn(startstring, endstring, "Q");
                            JLabel currentLabel4 = (JLabel) start.getComponent(0);
                            currentLabel4.setIcon(whitequeen.getIcon());
                            // icon=whitepawn1.getIcon();
                             icon=whitepawn1.getIcon();
                            LabelName labelname4=(LabelName) currentLabel4;
                            jlableArray2.add(labelname4);
                            break;
                        default:
                            ff.promotePawn(startstring, endstring, "Q");
                            JLabel currentLabel5 = (JLabel) start.getComponent(0);
                            currentLabel5.setIcon(whitequeen.getIcon());
                            
                            
                            
                            
                            break;
                    }
                    }
                    if(userChoice!=null&&ff.getCurrentPlayer()==ChessEnums.Color.White){
                    System.out.println("we are inside the if");
                    switch(userChoice)
                    {
                        case "K":
                            ff.promotePawn(startstring, endstring, "K");
                            JLabel currentLabel1 = (JLabel) start.getComponent(0);
                            currentLabel1.setIcon(blackknight1.getIcon());
                             LabelName labelname=(LabelName) currentLabel1;
                            jlableArray2.add(labelname);
                            icon=blackpawn1.getIcon();
                            
                            break;
                        case "R":
                             ff.promotePawn(startstring, endstring, "R");
                             JLabel currentLabel2 = (JLabel) start.getComponent(0);
                             currentLabel2.setIcon(blackRook1.getIcon());
                              LabelName labelname2=(LabelName) currentLabel2;
                            jlableArray2.add(labelname2);
                            icon=blackpawn1.getIcon();
                            
                             break;
                        case "B":
                            ff.promotePawn(startstring, endstring, "B");
                            JLabel currentLabel3 = (JLabel) start.getComponent(0);
                            currentLabel3.setIcon(blackbisop1.getIcon());
                             LabelName labelname3=(LabelName) currentLabel3;
                            jlableArray2.add(labelname3);
                            icon=blackpawn1.getIcon();
                            
                            break;
                        case "Q":    
                            ff.promotePawn(startstring, endstring, "Q");
                            JLabel currentLabel4 = (JLabel) start.getComponent(0);
                            currentLabel4.setIcon(blackqueen.getIcon());
                             LabelName labelname4=(LabelName) currentLabel4;
                            jlableArray2.add(labelname4);
                            icon=blackpawn1.getIcon();
                            
                            break;
                        default:
                            ff.promotePawn(startstring, endstring, "Q");
                            JLabel currentLabel5 = (JLabel) start.getComponent(0);
                            currentLabel5.setIcon(blackqueen.getIcon());
                            break;
                    }
                    }
            }
                  
                  
                     System.out.println("we are here el7");
                end.removeAll();
                end.repaint();
                 end.add(clickedLabel);
                start.removeAll();
                start.repaint();
                
                 if(ff.getMovments().isFinallydone()==true)
                 {
                     
                     JPanel capturedpanel= getPanelByName(ff.captured);
                
                     
                     capturedpanel.repaint();
                     capturedpanel.removeAll();
                 }
                 if(ff.getMovments().isCastling()==true)
                 {
                       JPanel rookcastlestartpanel= getPanelByName(ff.rookcastlestart); 
                         JPanel rookcastleendpanel= getPanelByName(ff.rookcastleend); 
                         System.out.println(ff.rookcastlestart);
                         rookcastleendpanel.removeAll();
                         rookcastleendpanel.repaint();
                         
                         
                             if(rookcastlestartpanel.getComponent(0)!=null)
                             {JLabel label=(JLabel)rookcastlestartpanel.getComponent(0);
                            rookcastleendpanel.add(label);
                             }
                         rookcastlestartpanel.removeAll();
                         rookcastlestartpanel.repaint();
                 }
                 rotateBoard();
                 if(ff.getMovments().isCheckhappened())
                 {     resetboardcolor();
                     highlightKing(ff.squareNotation(ff.findKing(ff.getCurrentPlayer())));
                 }
                 else{
                     resetboardcolor();
                 }
                 
                 
                 if(ff.getMovments().isGameend())
                 {
                     JOptionPane.showMessageDialog(null, "GAME ENDED: "+ ff.getMovments().getWinningcolor()+" Won");
                 }
               
             
            if(ff.getMovments().isStallmate())
            {
                JOptionPane.showMessageDialog(null, "GAME ENDED: "+ "draw");
            }
           if(!jlableArray2.isEmpty())
           {
               for(int i=0;i<jlableArray2.size();i++)
               {
                   jlableArray2.get(i).setCounter(jlableArray2.get(i).getCounter()+1);
               }
                   
                   
           }
                     
                
        }
                  //start.repaint();

    }
   }
//  private void rotateboard()
//  {     jpanel=a1;
////      jpanel.setName(a1.getName());
////         jpanel.add(a1.getComponent(0));
//      System.out.println("the name"+jpanel.getName());
//     
//      a1.removeAll();
//         a1.repaint();
//        a1.add(a2.getComponent(0));
//        a1.setName(a2.getName());
//        
//        a2.removeAll();
//     a2.repaint();
//     a2.add(jpanel.getComponent(0));
//     a2.setName(jpanel.getName());
//      
//  }

private void rotateBoard() {
    // Get the components from panels a1 and a2
    for (int x=0;x<32;x++)
    { JPanel newjpanel= changepanels( jPanelArray[x].getName());
       if(newjpanel!=null)
           
       { if(jPanelArray[x].getComponents().length==0&&newjpanel.getComponents().length==0)
      { String s4=newjpanel.getName();
          newjpanel.setName(jPanelArray[x].getName());
         jPanelArray[x].setName(s4);
      }
      else if(newjpanel.getComponents().length==0)
      {   String s4=newjpanel.getName();
          newjpanel.add(jPanelArray[x].getComponent(0));
          newjpanel.setName(jPanelArray[x].getName());
          jPanelArray[x].setName(s4);
      }
      else if(jPanelArray[x].getComponents().length==0)
      {   String s4=newjpanel.getName();
          newjpanel.setName(jPanelArray[x].getName());
         jPanelArray[x].add(newjpanel.getComponent(0));
         jPanelArray[x].setName(s4);
      }
   else
      {
     Component componenttemp1 = jPanelArray[x].getComponent(0); // Assuming only one component is present
     Component componenttemp2 = newjpanel.getComponent(0); // Assuming only one component is present
    String stringtemp1=jPanelArray[x].getName();
    String stringtemp2=newjpanel.getName();
    // Remove the components from the panels
    jPanelArray[x].removeAll();
    newjpanel.removeAll();

    // Add the components to the opposite panels
    jPanelArray[x].add(componenttemp2);
    jPanelArray[x].setName(stringtemp2);
    newjpanel.add(componenttemp1);
    newjpanel.setName(stringtemp1);

    // Update the UI
    revalidate();
    repaint();       
    }
    }
    }
}
private JPanel changepanels(String s)
{
    char file = s.charAt(0);
    char rank = s.charAt(1);

    // Convert file to its corresponding index (0-7)
    int fileIndex = file - 'a';

    // Convert rank to its corresponding index (0-7) and reverse it
    int rankIndex = '8' - rank;

    // Convert back to the chess coordinate format
    char convertedFile = (char) ('a' + (7 - fileIndex));
    char convertedRank = (char) ('1' + rankIndex);
   String s2=String.valueOf(convertedFile)+convertedRank;
    
   for (JPanel japanel : jPanelArray)
   {
       if(japanel.getName().equals(s2))
       {  
           return japanel;
          
       }
   }
    return null;
}
    
  private void highlightKing(String s)
  {
       for (JPanel japanel : jPanelArray) {
            JPanel squarePanel = japanel;
            String squareName = squarePanel.getName();
            if (s.equals(squareName)) {
               
                squarePanel.setBackground(new Color(255, 127, 127)); // RGB for red
            }
//            else {
//                squarePanel.setBackground(getOriginalColor(squarePanel));
//            }
       }
  }
    
    

    private void resetboardcolor()
    {
        for (JPanel japanel : jPanelArray)
        {
            JPanel squarePanel = japanel;
             squarePanel.setBackground(getOriginalColor(squarePanel));
        }
    }
        
    
    
    
    private void whiteRook1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whiteRook1MouseClicked
          clickedLabel=(JLabel)evt.getSource();
          
          pieceLabelMouseClicked(evt);
          
    }//GEN-LAST:event_whiteRook1MouseClicked

    private void resetPreviousSelection() {
    if (selectedLabel != null && originalColor != null) {
        JPanel squarePanel = (JPanel) selectedLabel.getParent();
        if (squarePanel != null) {
            // Reset the background color of the previously selected label
            squarePanel.setBackground(originalColor);
        }
        // Reset the tracking variables
        selectedLabel = null;
        originalColor = null;
    }
}
    
    
    private void highlightAvailableMoves(List<String> moves) {
    for (JPanel japanel : jPanelArray) {
            JPanel squarePanel = japanel;
            String squareName = squarePanel.getName();
            if (moves.contains(squareName)) {
               
                squarePanel.setBackground(new Color(173, 216, 230)); // RGB for baby blue
            } 
            else {
                squarePanel.setBackground(getOriginalColor(squarePanel));
              
            }
            
    }
    if(ff.getMovments().isCheckhappened())
            {
                  highlightKing(ff.squareNotation(ff.findKing(ff.getCurrentPlayer())));
                 
            }
}

    private void storeOriginalColors() {
        // Store the original colors of all panels in the originalColors array
        for (int i = 0; i < jPanelArray.length; i++) {
                JPanel squarePanel = (JPanel) jPanelArray[i];
                originalColors[i] = squarePanel.getBackground();
        }
    }

    private Color getOriginalColor(JPanel squarePanel) {
        // Get the original color of a squarePanel
        for (int i = 0; i < jPanelArray.length; i++) {
            if (jPanelArray[i] == squarePanel) {
                return originalColors[i];
            }
        }
        return null;
    }
   
    
    private JPanel getPanelByName(String panelName) {
    // Find and return the panel with the given name
    for (JPanel panel : jPanelArray) {
        if (panelName.equals(panel.getName())) {
            return panel;
        }
    }
    return null;
}
   
    
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

    }//GEN-LAST:event_jLabel2MouseClicked

    private void whiteknight1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whiteknight1MouseClicked
          clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_whiteknight1MouseClicked

    private void whitebishopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whitebishopMouseClicked
        clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_whitebishopMouseClicked

    private void whitequeenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whitequeenMouseClicked
       clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_whitequeenMouseClicked

    private void whitekingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whitekingMouseClicked
        clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
           
                 
    }//GEN-LAST:event_whitekingMouseClicked

    private void whitebishope2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whitebishope2MouseClicked
        clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
           
    }//GEN-LAST:event_whitebishope2MouseClicked

    private void whiteRook2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whiteRook2MouseClicked
        clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
          
    }//GEN-LAST:event_whiteRook2MouseClicked

    private void whiteknight2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whiteknight2MouseClicked
      clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_whiteknight2MouseClicked

    private void whitepawn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whitepawn1MouseClicked
       clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_whitepawn1MouseClicked

    private void blackpawn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackpawn4MouseClicked
        clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_blackpawn4MouseClicked

    private void blackpawn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackpawn1MouseClicked
      clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_blackpawn1MouseClicked

    private void whitepawn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whitepawn2MouseClicked
       clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_whitepawn2MouseClicked

    private void whitepawn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whitepawn3MouseClicked
        clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_whitepawn3MouseClicked

    private void whitepawn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whitepawn4MouseClicked
          clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_whitepawn4MouseClicked

    private void whitepawn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whitepawn5MouseClicked
       clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_whitepawn5MouseClicked

    private void whitepawn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whitepawn6MouseClicked
        clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_whitepawn6MouseClicked

    private void whitepawn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whitepawn7MouseClicked
        clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_whitepawn7MouseClicked

    private void whitepawn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whitepawn8MouseClicked
      clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_whitepawn8MouseClicked

    private void blackpawn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackpawn2MouseClicked
      clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_blackpawn2MouseClicked

    private void blackpawn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackpawn3MouseClicked
       clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_blackpawn3MouseClicked

    private void blackpawn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackpawn5MouseClicked
      clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_blackpawn5MouseClicked

    private void blackpawn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackpawn6MouseClicked
       clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_blackpawn6MouseClicked

    private void blackpawn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackpawn7MouseClicked
       clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_blackpawn7MouseClicked

    private void blackpawn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackpawn8MouseClicked
        clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_blackpawn8MouseClicked

    private void blackRook1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackRook1MouseClicked
      clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_blackRook1MouseClicked

    private void blackknight1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackknight1MouseClicked
       clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_blackknight1MouseClicked

    private void blackbisop1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackbisop1MouseClicked
      clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_blackbisop1MouseClicked

    private void blackbisop2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackbisop2MouseClicked
        clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_blackbisop2MouseClicked

    private void blackknight2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackknight2MouseClicked
       clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_blackknight2MouseClicked

    private void blackrook2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackrook2MouseClicked
        clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_blackrook2MouseClicked

    private void blackkingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackkingMouseClicked
       clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_blackkingMouseClicked

    private void a1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MousePressed
      move(evt);
    }//GEN-LAST:event_a1MousePressed

    private void a2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a2MousePressed
       move(evt);
    }//GEN-LAST:event_a2MousePressed

    private void a3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a3MousePressed
       move(evt);
    }//GEN-LAST:event_a3MousePressed

    private void a4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a4MousePressed
        move(evt);
    }//GEN-LAST:event_a4MousePressed

    private void a5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a5MousePressed
        move(evt);
    }//GEN-LAST:event_a5MousePressed

    private void a6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a6MousePressed
       move(evt);
    }//GEN-LAST:event_a6MousePressed

    private void a7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a7MousePressed
        move(evt);
    }//GEN-LAST:event_a7MousePressed

    private void a8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a8MousePressed
        move(evt);
    }//GEN-LAST:event_a8MousePressed

    private void b1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MousePressed
        move(evt);
    }//GEN-LAST:event_b1MousePressed

    private void b2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MousePressed
         move(evt);
    }//GEN-LAST:event_b2MousePressed

    private void b3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MousePressed
         move(evt);
    }//GEN-LAST:event_b3MousePressed

    private void b4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MousePressed
         move(evt);
    }//GEN-LAST:event_b4MousePressed

    private void b5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MousePressed
       move(evt);
    }//GEN-LAST:event_b5MousePressed

    private void b6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MousePressed
         move(evt);
    }//GEN-LAST:event_b6MousePressed

    private void b7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MousePressed
         move(evt);
    }//GEN-LAST:event_b7MousePressed

    private void b8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MousePressed
         move(evt);
    }//GEN-LAST:event_b8MousePressed

    private void c1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MousePressed
        move(evt);
    }//GEN-LAST:event_c1MousePressed

    private void c2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MousePressed
         move(evt);
    }//GEN-LAST:event_c2MousePressed

    private void c3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c3MousePressed
        move(evt);
    }//GEN-LAST:event_c3MousePressed

    private void c4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c4MousePressed
        move(evt);
    }//GEN-LAST:event_c4MousePressed

    private void c5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c5MousePressed
        move(evt);
    }//GEN-LAST:event_c5MousePressed

    private void c6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c6MousePressed
       move(evt);
    }//GEN-LAST:event_c6MousePressed

    private void c7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c7MousePressed
        move(evt);
    }//GEN-LAST:event_c7MousePressed

    private void c8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c8MousePressed
       move(evt);
    }//GEN-LAST:event_c8MousePressed

    private void d1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d1MousePressed
        move(evt);
    }//GEN-LAST:event_d1MousePressed

    private void d2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d2MousePressed
        move(evt);
    }//GEN-LAST:event_d2MousePressed

    private void d3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d3MousePressed
         move(evt);
    }//GEN-LAST:event_d3MousePressed

    private void d4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d4MousePressed
         move(evt);
    }//GEN-LAST:event_d4MousePressed

    private void d5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d5MousePressed
        move(evt);
    }//GEN-LAST:event_d5MousePressed

    private void d6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d6MousePressed
       move(evt);
    }//GEN-LAST:event_d6MousePressed

    private void d7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d7MousePressed
        move(evt);
    }//GEN-LAST:event_d7MousePressed

    private void d8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d8MousePressed
       move(evt);
    }//GEN-LAST:event_d8MousePressed

    private void e1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e1MousePressed
         move(evt);
    }//GEN-LAST:event_e1MousePressed

    private void e2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e2MousePressed
        move(evt);
    }//GEN-LAST:event_e2MousePressed

    private void e3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e3MousePressed
         move(evt);
    }//GEN-LAST:event_e3MousePressed

    private void e4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e4MousePressed
       move(evt);
    }//GEN-LAST:event_e4MousePressed

    private void e5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e5MousePressed
         move(evt);
    }//GEN-LAST:event_e5MousePressed

    private void e6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e6MousePressed
        move(evt);
    }//GEN-LAST:event_e6MousePressed

    private void e7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e7MousePressed
         move(evt);
    }//GEN-LAST:event_e7MousePressed

    private void e8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e8MousePressed
         move(evt);
    }//GEN-LAST:event_e8MousePressed

    private void f8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f8MousePressed
         move(evt);
    }//GEN-LAST:event_f8MousePressed

    private void f7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f7MousePressed
        move(evt);
    }//GEN-LAST:event_f7MousePressed

    private void f6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f6MousePressed
        move(evt);
    }//GEN-LAST:event_f6MousePressed

    private void f5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f5MousePressed
        move(evt);
    }//GEN-LAST:event_f5MousePressed

    private void f4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f4MousePressed
        move(evt);
    }//GEN-LAST:event_f4MousePressed

    private void f3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f3MousePressed
         move(evt);
    }//GEN-LAST:event_f3MousePressed

    private void f2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f2MousePressed
         move(evt);
    }//GEN-LAST:event_f2MousePressed

    private void f1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f1MousePressed
         move(evt);
    }//GEN-LAST:event_f1MousePressed

    private void g1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g1MousePressed
        move(evt);
    }//GEN-LAST:event_g1MousePressed

    private void g2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g2MousePressed
         move(evt);
    }//GEN-LAST:event_g2MousePressed

    private void g3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g3MousePressed
        move(evt);
    }//GEN-LAST:event_g3MousePressed

    private void g4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g4MousePressed
        move(evt);
    }//GEN-LAST:event_g4MousePressed

    private void g5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g5MousePressed
         move(evt);
    }//GEN-LAST:event_g5MousePressed

    private void g6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g6MousePressed
       move(evt);
    }//GEN-LAST:event_g6MousePressed

    private void g7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g7MousePressed
         move(evt);
    }//GEN-LAST:event_g7MousePressed

    private void g8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g8MousePressed
       move(evt);
    }//GEN-LAST:event_g8MousePressed

    private void h8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h8MousePressed
        move(evt);
    }//GEN-LAST:event_h8MousePressed

    private void h7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h7MousePressed
        move(evt);
    }//GEN-LAST:event_h7MousePressed

    private void h6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h6MousePressed
         move(evt);
    }//GEN-LAST:event_h6MousePressed

    private void h5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h5MousePressed
        move(evt);
    }//GEN-LAST:event_h5MousePressed

    private void h4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h4MousePressed
         move(evt);
    }//GEN-LAST:event_h4MousePressed

    private void h3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h3MousePressed
        move(evt);
    }//GEN-LAST:event_h3MousePressed

    private void h2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h2MousePressed
         move(evt);
    }//GEN-LAST:event_h2MousePressed

    private void h1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h1MousePressed
         move(evt);
    }//GEN-LAST:event_h1MousePressed

    private void blackqueenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackqueenMousePressed
        clickedLabel=(JLabel)evt.getSource();
          pieceLabelMouseClicked(evt);
    }//GEN-LAST:event_blackqueenMousePressed

    private void undobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undobuttonActionPerformed
      if(ff.getCaretaker().getBoardStack().empty())
      {   System.out.println("stack is empty!");
          return;
      }
        updatemove(ff.undoLastMove());
           resetboardcolor();
        
        rotateBoard();
      // labelList = new ArrayList<>(Arrays.asList(jlableArray));
          if(!jlableArray2.isEmpty())
           {
               for(int i=0;i<jlableArray2.size();i++)
               {   //System.out.println(jlableArray2.get(i).getName());
                   if(jlableArray2.get(i).getCounter()==0)
                   { 
                       jlableArray2.get(i).setCounter(-1);
                   jlableArray2.get(i).setIcon(icon);
                      
                   }
                   else
                   {
                         jlableArray2.get(i).setCounter( jlableArray2.get(i).getCounter()-1);
                       
                   }
                 
                  
                          
               }
                   
                   
           }
//           for(int i=0;i<jlableArray2.size();i++)
//               {
//                   if(jlableArray2.get(i).getCounter()==0)
//                   {
//                       label.setIcon(icon);
//                   }
//                       
//               }
                   
        
    }//GEN-LAST:event_undobuttonActionPerformed

    
    
    
    
   
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
            java.util.logging.Logger.getLogger(offa7a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(offa7a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(offa7a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(offa7a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new offa7a().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel a1;
    private javax.swing.JPanel a2;
    private javax.swing.JPanel a3;
    private javax.swing.JPanel a4;
    private javax.swing.JPanel a5;
    private javax.swing.JPanel a6;
    private javax.swing.JPanel a7;
    private javax.swing.JPanel a8;
    private javax.swing.JPanel b1;
    private javax.swing.JPanel b2;
    private javax.swing.JPanel b3;
    private javax.swing.JPanel b4;
    private javax.swing.JPanel b5;
    private javax.swing.JPanel b6;
    private javax.swing.JPanel b7;
    private javax.swing.JPanel b8;
    private javax.swing.JLabel blackRook1;
    private javax.swing.JLabel blackbisop1;
    private javax.swing.JLabel blackbisop2;
    private javax.swing.JLabel blackking;
    private javax.swing.JLabel blackknight1;
    private javax.swing.JLabel blackknight2;
    private javax.swing.JLabel blackpawn1;
    private javax.swing.JLabel blackpawn2;
    private javax.swing.JLabel blackpawn3;
    private javax.swing.JLabel blackpawn4;
    private javax.swing.JLabel blackpawn5;
    private javax.swing.JLabel blackpawn6;
    private javax.swing.JLabel blackpawn7;
    private javax.swing.JLabel blackpawn8;
    private javax.swing.JLabel blackqueen;
    private javax.swing.JLabel blackrook2;
    private javax.swing.JPanel c1;
    private javax.swing.JPanel c2;
    private javax.swing.JPanel c3;
    private javax.swing.JPanel c4;
    private javax.swing.JPanel c5;
    private javax.swing.JPanel c6;
    private javax.swing.JPanel c7;
    private javax.swing.JPanel c8;
    private javax.swing.JPanel d1;
    private javax.swing.JPanel d2;
    private javax.swing.JPanel d3;
    private javax.swing.JPanel d4;
    private javax.swing.JPanel d5;
    private javax.swing.JPanel d6;
    private javax.swing.JPanel d7;
    private javax.swing.JPanel d8;
    private javax.swing.JPanel e1;
    private javax.swing.JPanel e2;
    private javax.swing.JPanel e3;
    private javax.swing.JPanel e4;
    private javax.swing.JPanel e5;
    private javax.swing.JPanel e6;
    private javax.swing.JPanel e7;
    private javax.swing.JPanel e8;
    private javax.swing.JPanel f1;
    private javax.swing.JPanel f2;
    private javax.swing.JPanel f3;
    private javax.swing.JPanel f4;
    private javax.swing.JPanel f5;
    private javax.swing.JPanel f6;
    private javax.swing.JPanel f7;
    private javax.swing.JPanel f8;
    private javax.swing.JPanel g1;
    private javax.swing.JPanel g2;
    private javax.swing.JPanel g3;
    private javax.swing.JPanel g4;
    private javax.swing.JPanel g5;
    private javax.swing.JPanel g6;
    private javax.swing.JPanel g7;
    private javax.swing.JPanel g8;
    private javax.swing.JPanel h1;
    private javax.swing.JPanel h2;
    private javax.swing.JPanel h3;
    private javax.swing.JPanel h4;
    private javax.swing.JPanel h5;
    private javax.swing.JPanel h6;
    private javax.swing.JPanel h7;
    private javax.swing.JPanel h8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton undobutton;
    private javax.swing.JLabel whiteRook1;
    private javax.swing.JLabel whiteRook2;
    private javax.swing.JLabel whitebishop;
    private javax.swing.JLabel whitebishope2;
    private javax.swing.JLabel whiteking;
    private javax.swing.JLabel whiteknight1;
    private javax.swing.JLabel whiteknight2;
    private javax.swing.JLabel whitepawn1;
    private javax.swing.JLabel whitepawn2;
    private javax.swing.JLabel whitepawn3;
    private javax.swing.JLabel whitepawn4;
    private javax.swing.JLabel whitepawn5;
    private javax.swing.JLabel whitepawn6;
    private javax.swing.JLabel whitepawn7;
    private javax.swing.JLabel whitepawn8;
    private javax.swing.JLabel whitequeen;
    // End of variables declaration//GEN-END:variables
}
