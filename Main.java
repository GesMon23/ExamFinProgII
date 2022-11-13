package ExamFinal;

public class Main {

    public static void main(String args[]) {
       ConectarBD Conection = new ConectarBD();
       Conection.ConectarBaseDatos();
       Interfaz interfaz = new Interfaz();
       interfaz.setVisible(true);
    }
    
}
