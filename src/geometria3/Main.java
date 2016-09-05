package geometria3;
import geometria3.gui.FrmTrangulo;
import geometria3.mundo.Triangulo;

public class Main {

    public static void main(String[] args) {
       Triangulo triangulo = new Triangulo();
       FrmTrangulo frm = new FrmTrangulo(triangulo);
    }

}
