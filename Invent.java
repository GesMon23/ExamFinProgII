package ExamFinal;

import java.sql.CallableStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Invent {
     int Id;
     String Fech_In;
     String Fech_fin;
     String Stock_Inc;
     String Entradas;
     String Salidas;
     String total;
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFech_In() {
        return Fech_In;
    }

    public void setFech_In(String Fech_In) {
        this.Fech_In = Fech_In;
    }

    public String getFech_fin() {
        return Fech_fin;
    }

    public void setFech_fin(String Fech_fin) {
        this.Fech_fin = Fech_fin;
    }

    public String getStock_Inc() {
        return Stock_Inc;
    }

    public void setStock_Inc(String Stock_Inc) {
        this.Stock_Inc = Stock_Inc;
    }

    public String getEntradas() {
        return Entradas;
    }

    public void setEntradas(String Entradas) {
        this.Entradas = Entradas;
    }

    public String getSalidas() {
        return Salidas;
    }

    public void setSalidas(String Salidas) {
        this.Salidas = Salidas;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void AgregInvent(JTextField txtFldId,JTextField txtFldFech_In,JTextField txtFldFech_fin,JTextField txtFldStock_Inc,
            JTextField txtFldEntrada,JTextField txtFldSalida,JTextField txtFldTotal){
        
        setId(Integer.parseInt(txtFldId.getText()));
        setFech_In(txtFldFech_In.getText());
        setFech_fin(txtFldFech_fin.getText());
        setStock_Inc(txtFldStock_Inc.getText());
        setEntradas(txtFldEntrada.getText());
        setSalidas(txtFldSalida.getText());
        setTotal(txtFldTotal.getText());
        
        ConectarBD cone= new ConectarBD();
        String FuncTbl = "insert into inventario (Id, Fecha_In, Fecha_fin, Stock_Inc, Entradas, Salidas, total) VALUES (?,\"?\",\"?\",?,?,?,?);";
        try {
            CallableStatement cs = cone.ConectarBaseDatos().prepareCall(FuncTbl);
            cs.setInt(1, getId());
            cs.setString(2, getFech_In());
            cs.setString(3, getFech_fin());
            cs.setString(4, getStock_Inc());
            cs.setString(5, getEntradas());
            cs.setString(6, getSalidas());
            cs.setString(7, getTotal());
            cs.execute();
            JOptionPane.showMessageDialog(null, "LOS DATOS SE AGREGARON CORRECTAMENTE :)");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar Datos : \n"+e);
        }
    }        
}
  
