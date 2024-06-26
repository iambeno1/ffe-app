/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userrole.seller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import auth.SignIn;
import auth.SignUp;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author benon
 */
public class Products extends javax.swing.JFrame {

    private static void setModel(TableModel resultSetToTableModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    
    public void selectProduct(){
        try{
            con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/tubespbodb", "root", "");
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM products");
            prodTbl.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void getCategory() {
        String query, myCat;
        query = "SELECT * FROM categories";
        try {
            con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/tubespbodb", "root", "");
            st = con.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                myCat = rs.getString("catName");
                prodCat.addItem(myCat);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public Products() {
        initComponents();
        selectProduct();
        getCategory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        prodCat = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        prodID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        prodName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        prodQty = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        prodPrice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodTbl = new javax.swing.JTable();
        close = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        dashboardBtnFrame = new javax.swing.JButton();
        kategoriBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        kategoriBtnFrame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Kategori");

        prodCat.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        prodCat.setForeground(new java.awt.Color(51, 51, 51));
        prodCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodCatActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Kelola Produk");

        prodID.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prodID.setForeground(new java.awt.Color(51, 51, 51));
        prodID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodIDActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Produk ID");

        prodName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prodName.setForeground(new java.awt.Color(51, 51, 51));
        prodName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodNameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Nama");

        prodQty.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prodQty.setForeground(new java.awt.Color(51, 51, 51));
        prodQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodQtyActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Kuantitas");

        prodPrice.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        prodPrice.setForeground(new java.awt.Color(51, 51, 51));
        prodPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodPriceActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Harga");

        addBtn.setBackground(new java.awt.Color(0, 153, 255));
        addBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Tambah");
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(0, 153, 255));
        editBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("Edit");
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnMouseClicked(evt);
            }
        });
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        delBtn.setBackground(new java.awt.Color(0, 153, 255));
        delBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        delBtn.setForeground(new java.awt.Color(255, 255, 255));
        delBtn.setText("Hapus");
        delBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delBtnMouseClicked(evt);
            }
        });
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(0, 153, 255));
        clearBtn.setText("Bersihkan");
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtnMouseClicked(evt);
            }
        });
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        prodTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Kuantitas", "Harga", "Kategori"
            }
        ));
        prodTbl.setShowGrid(true);
        prodTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(prodTbl);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clearBtn)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(prodID)
                                    .addComponent(prodName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(38, 38, 38)
                                    .addComponent(prodPrice))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(prodQty, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(25, 25, 25)
                            .addComponent(prodCat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addGap(18, 18, 18)
                        .addComponent(editBtn)
                        .addGap(18, 18, 18)
                        .addComponent(delBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(prodID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(prodName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(prodQty, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(prodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel5))
                            .addComponent(prodCat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(clearBtn)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn)
                            .addComponent(editBtn)
                            .addComponent(delBtn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        close.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("×");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pilih Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        dashboardBtnFrame.setBackground(new java.awt.Color(0, 153, 255));
        dashboardBtnFrame.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        dashboardBtnFrame.setForeground(new java.awt.Color(255, 255, 255));
        dashboardBtnFrame.setText("Dashboard");
        dashboardBtnFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardBtnFrameMouseClicked(evt);
            }
        });
        dashboardBtnFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnFrameActionPerformed(evt);
            }
        });

        kategoriBtn.setBackground(new java.awt.Color(204, 204, 204));
        kategoriBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        kategoriBtn.setForeground(new java.awt.Color(102, 102, 102));
        kategoriBtn.setText("Produk");
        kategoriBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kategoriBtnMouseClicked(evt);
            }
        });
        kategoriBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(255, 51, 51));
        logoutBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Keluar");
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        kategoriBtnFrame.setBackground(new java.awt.Color(0, 153, 255));
        kategoriBtnFrame.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        kategoriBtnFrame.setForeground(new java.awt.Color(255, 255, 255));
        kategoriBtnFrame.setText("Kategori");
        kategoriBtnFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kategoriBtnFrameMouseClicked(evt);
            }
        });
        kategoriBtnFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategoriBtnFrameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardBtnFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kategoriBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kategoriBtnFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(dashboardBtnFrame)
                .addGap(18, 18, 18)
                .addComponent(kategoriBtn)
                .addGap(18, 18, 18)
                .addComponent(kategoriBtnFrame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void prodCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodCatActionPerformed

    private void prodIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodIDActionPerformed

    private void prodNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodNameActionPerformed

    private void prodQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodQtyActionPerformed

    private void prodPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodPriceActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtnActionPerformed

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/tubespbodb";
        SUser = "root";
        SPass = "";
    
        if(prodID.getText().isEmpty() || prodName.getText().isEmpty() || prodQty.getText().isEmpty() || prodPrice.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Informasi harus lengkap");
        }else{
            try{
                con = DriverManager.getConnection(SUrl, SUser, SPass);
                PreparedStatement add = con.prepareStatement("INSERT INTO products VALUES(?, ?, ?, ?, ?)");
                add.setInt(1, Integer.valueOf(prodID.getText()));
                add.setString(2, prodName.getText());
                add.setInt(3, Integer.valueOf(prodQty.getText()));
                add.setInt(4, Integer.valueOf(prodPrice.getText()));
                add.setString(5, prodCat.getSelectedItem().toString());
                
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Produk berhasil ditambahkan");
                con.close();
                selectProduct();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_addBtnMouseClicked

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        prodID.setText("");
        prodName.setText("");
        prodQty.setText("");
        prodPrice.setText("");
    }//GEN-LAST:event_clearBtnMouseClicked

    private void delBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delBtnMouseClicked
        if(prodID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Masukkan ID produk yang ingin dihapus!");
        }else{
            try{
                con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/tubespbodb", "root", "");
                String ctId = prodID.getText();
                String query = "DELETE FROM products  WHERE prodID="+ctId;
                Statement add = con.createStatement();
                add.executeUpdate(query);
                selectProduct();
                JOptionPane.showMessageDialog(this, "Berhasil dihapus");
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_delBtnMouseClicked

    private void prodTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodTblMouseClicked
        DefaultTableModel model = (DefaultTableModel) prodTbl.getModel();
        int myIndex = prodTbl.getSelectedRow();
        prodID.setText(model.getValueAt(myIndex, 0).toString());
        prodName.setText(model.getValueAt(myIndex, 1).toString());
        prodQty.setText(model.getValueAt(myIndex, 2).toString());
        prodPrice.setText(model.getValueAt(myIndex, 3).toString());
    }//GEN-LAST:event_prodTblMouseClicked

    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseClicked
        if(prodID.getText().isEmpty() || prodName.getText().isEmpty() || prodQty.getText().isEmpty() || prodPrice.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "informasi harus diisi");
        }else{
            try{
                con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/tubespbodb", "root", "");
                String query = "UPDATE products SET prodName='" + prodName.getText() + "', prodQtty=" + prodQty.getText() + ", prodPrice=" + prodPrice.getText() + ", prodCategory='" + prodCat.getSelectedItem() + "' WHERE prodID=" + prodID.getText();
                Statement add = con.createStatement();
                add.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Berhasil diupdate");
                selectProduct();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_editBtnMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void dashboardBtnFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardBtnFrameMouseClicked
        // TODO add your handling code here:
        Dashboard dashboardFrame = new Dashboard();
        dashboardFrame.setVisible(true);
        dashboardFrame.pack();
        dashboardFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_dashboardBtnFrameMouseClicked

    private void dashboardBtnFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnFrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboardBtnFrameActionPerformed

    private void kategoriBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kategoriBtnMouseClicked
        Categories catgFrame = new Categories();
        catgFrame.setVisible(true);
        catgFrame.pack();
        catgFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_kategoriBtnMouseClicked

    private void kategoriBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kategoriBtnActionPerformed

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        SignIn signInFrame = new SignIn();
        signInFrame.setVisible(true);
        signInFrame.pack();
        signInFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void kategoriBtnFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kategoriBtnFrameMouseClicked
        // TODO add your handling code here:
        Categories categeryFrame = new Categories();
        categeryFrame.setVisible(true);
        categeryFrame.pack();
        categeryFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_kategoriBtnFrameMouseClicked

    private void kategoriBtnFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategoriBtnFrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kategoriBtnFrameActionPerformed

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel close;
    private javax.swing.JButton dashboardBtnFrame;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kategoriBtn;
    private javax.swing.JButton kategoriBtnFrame;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JComboBox<String> prodCat;
    private javax.swing.JTextField prodID;
    private javax.swing.JTextField prodName;
    private javax.swing.JTextField prodPrice;
    private javax.swing.JTextField prodQty;
    private javax.swing.JTable prodTbl;
    // End of variables declaration//GEN-END:variables
}
