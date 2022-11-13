package ExamFinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Interfaz extends javax.swing.JFrame {
    LinkedList<Invent> invent = new LinkedList<>();   
    public Interfaz() {
        initComponents();
    }
    
    public void MostrarProduct (String tbl){
        String sql = "select * from "+ tbl;
        Statement st;
        ConectarBD conection = new ConectarBD();
        Connection conexionBD = conection.ConectarBaseDatos();
        System.out.println(sql);
        DefaultTableModel model = new DefaultTableModel();
        tblTabla2.setModel(model);
        
        String [] date = new String[2];
        
        try {
            st = conexionBD.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                date[0]=rs.getString(1);
                date[1]=rs.getString(2);
                model.addRow(date);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en Fechas: "+e.toString());
        }
    }

    public void mostrar (String tbl){
        String sql = "select * from "+ tbl;
        Statement st;
        ConectarBD conection = new ConectarBD();
        Connection conexionBD = conection.ConectarBaseDatos();
        System.out.println(sql);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Fecha_Inc");
        model.addColumn("Fecha_Fin");
        model.addColumn("Stock_Inc");
        model.addColumn("Entradas");
        model.addColumn("Salidas");
        model.addColumn("Total");
        tblTabla.setModel(model);
        
        String [] dato = new String [8];
        
        try {
            
            st = conexionBD.createStatement();
            ResultSet rs  = st.executeQuery(sql);
            while(rs.next()){
                dato[0]=rs.getString(1);
                dato[1]=rs.getString(2);
                dato[2]=rs.getString(3);
                dato[3]=rs.getString(4);
                dato[4]=rs.getString(5);
                dato[5]=rs.getString(6);
                dato[6]=rs.getString(7);
                model.addRow(dato);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error agregar datos: "+e.toString());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cajaIDInventario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnProducto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTabla2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnMostrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGuardarBD = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtStock_Inc = new javax.swing.JTextField();
        txtEntradas = new javax.swing.JTextField();
        txtSalidas = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();
        dtFech_In = new javax.swing.JTextField();
        dtFech_fin = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        cajaIDInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIDInventarioActionPerformed(evt);
            }
        });

        jLabel2.setText("ID inventario:");

        btnProducto.setText("Crear Datos de Producto");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        tblTabla2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblTabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Descripcion"
            }
        ));
        tblTabla2.setSelectionForeground(new java.awt.Color(0, 0, 255));
        jScrollPane3.setViewportView(tblTabla2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tblTabla.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Fecha Inicio", "Fecha Fin", "Stock Inicial", "Entradas", "Salidas", "Total"
            }
        ));
        tblTabla.setSelectionForeground(new java.awt.Color(0, 0, 255));
        jScrollPane1.setViewportView(tblTabla);

        btnMostrar.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        btnMostrar.setText("Agregar Datos a Tabla");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Inventario");

        btnGuardarBD.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        btnGuardarBD.setText("Guardar Base de Datos");
        btnGuardarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarBDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel3.setText("Fecha inicio:");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel4.setText("Fecha fin:");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel5.setText("Stock inicial:");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel6.setText("Entradas:");

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel7.setText("Salidas:");

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel8.setText("Total:");

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jLabel9.setText("Id:");

        txtStock_Inc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStock_IncActionPerformed(evt);
            }
        });

        txtEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradasActionPerformed(evt);
            }
        });

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        btnCargar.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        btnCargar.setText("Elegir Archivo");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        dtFech_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtFech_InActionPerformed(evt);
            }
        });

        dtFech_fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtFech_finActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dtFech_In)
                            .addComponent(txtStock_Inc, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(txtEntradas, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(dtFech_fin, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(177, 177, 177)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardarBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(btnCargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardarBD)
                        .addGap(18, 18, 18))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(dtFech_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(dtFech_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtStock_Inc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        Invent invnt = new Invent();
        
        invnt.setId(invent.size());
        invnt.setFech_In(dtFech_In.getText());
        invnt.setFech_fin(dtFech_fin.getText());
        invnt.setStock_Inc(txtStock_Inc.getText());
        invnt.setEntradas(txtEntradas.getText());
        invnt.setSalidas(txtSalidas.getText());
        invnt.setTotal(txtTotal.getText());
        invent.add(invnt);
        dtFech_In.setText("");
        dtFech_fin.setText("");
        txtStock_Inc.setText("");
        txtEntradas.setText("");
        txtSalidas.setText("");
        txtTotal.setText("");
        txtID.setText("");
        
        agregarA_Tabla();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        //mostrarP("producto");
    }//GEN-LAST:event_btnProductoActionPerformed

    private void cajaIDInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIDInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaIDInventarioActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        JFileChooser SelectArchivo = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo (*.txt)", "txt");
        SelectArchivo.setFileFilter(filter);
        
        int seleccionar = SelectArchivo.showOpenDialog(this);
        if(seleccionar == JFileChooser.APPROVE_OPTION){
            File archivo = SelectArchivo.getSelectedFile();
            GuardarArchivo(archivo);
        } 
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        JFileChooser SelectArchivo = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo (*.txt)", "txt");
        SelectArchivo.setFileFilter(filter);
        int seleccionar = SelectArchivo.showOpenDialog(this); 
        if(seleccionar == JFileChooser.APPROVE_OPTION){
            File archivo = SelectArchivo.getSelectedFile();
            CargarArchivo(archivo);
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnGuardarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarBDActionPerformed
        Invent Guardar_Prod = new Invent();
        Guardar_Prod.AgregInvent(dtFech_In, dtFech_fin, txtStock_Inc, txtEntradas, txtSalidas, txtTotal, txtID);
    }//GEN-LAST:event_btnGuardarBDActionPerformed

    private void txtEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntradasActionPerformed

    private void txtStock_IncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStock_IncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStock_IncActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void dtFech_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtFech_InActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dtFech_InActionPerformed

    private void dtFech_finActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtFech_finActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dtFech_finActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarBD;
    public javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnProducto;
    private javax.swing.JTextField cajaIDInventario;
    private javax.swing.JTextField dtFech_In;
    private javax.swing.JTextField dtFech_fin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable tblTabla;
    public javax.swing.JTable tblTabla2;
    private javax.swing.JTextField txtEntradas;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSalidas;
    private javax.swing.JTextField txtStock_Inc;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JButton getBtnMostrar() {
        return btnMostrar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JTable getTblTabla() {
        return tblTabla;
    }

    private void agregarA_Tabla() {
        DefaultTableModel md = new DefaultTableModel(new String[]{"Id",
            "Fecha_Inc","Fecha_fin","Stock_Inc","Entradas","Salidas","Total"},invent.size());
        tblTabla.setModel(md);
        TableModel tm = tblTabla.getModel();
        for(int i = 0; i<invent.size(); i++){
            Invent inv = invent.get(i);
            tm.setValueAt(inv.getId(), i, 0);
            tm.setValueAt(inv.getFech_In(), i, 1);
            tm.setValueAt(inv.getFech_fin(), i, 2);
            tm.setValueAt(inv.getStock_Inc(), i, 3);
            tm.setValueAt(inv.getEntradas(), i, 4);
            tm.setValueAt(inv.getSalidas(), i, 5);
            tm.setValueAt(inv.getTotal(), i, 6);
        }
    }

    private void CargarArchivo(File archivo) {
        FileReader fr = null;
        BufferedReader br = null; 
        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine())!=null) {                
                
                String arreglo [] = linea.split(",");
                if(arreglo.length == 9){
                    Invent inv = new Invent();
                    inv.setId(Integer.parseInt(arreglo[0]));
                    inv.setFech_In(arreglo[1]);
                    inv.setFech_fin(arreglo[2]);
                    inv.setStock_Inc(arreglo[3]);
                    inv.setEntradas(arreglo[4]);
                    inv.setSalidas(arreglo[5]);
                    inv.setTotal(arreglo[6]);
                    invent.add(inv);
                }
            }
           agregarA_Tabla();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(fr != null){
                    fr.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }      
    }
     public void GuardarArchivo(File archivo) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(archivo);
            pw = new PrintWriter(fichero);
            for(Invent inv: invent){
                String linea = inv.getId()+","+inv.getFech_In()+","
                        +inv.getFech_fin()+","+inv.getStock_Inc()+","+inv.getEntradas()+","+inv.getSalidas()
                        +","+inv.getTotal();
                pw.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       finally{
            try {
                if(fichero!=null){
                    fichero.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



    
}
