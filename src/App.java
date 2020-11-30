import Estilo.Estilo;
import Partes.ParteCuerpo;
import VISTA.VentanaInicio;
import VISTA.VentanaListaAvatares;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        ParteCuerpo polera = new ParteCuerpo("Polera", 0);
        ParteCuerpo ojos = new ParteCuerpo("Ojos", 1);
        ParteCuerpo Cabello = new ParteCuerpo("Cabello", 2);
        ParteCuerpo Boca = new ParteCuerpo("Boca", 3);
        ParteCuerpo Orejas = new ParteCuerpo("Orejas", 4);
        polera.setEstilo(new Estilo("default", 47, 313, 245, 134, ""));
        polera.setEstilo(new Estilo("poleraNegra", 47, 313, 245, 134, "./img/poleranegra.png"));
        polera.setEstilo(new Estilo("poleraAgua", 47, 313, 245, 134, "./img/poleraagua.png"));
        polera.setEstilo(new Estilo("poleraCafe", 47, 313, 245, 134, "./img/poleracafe.png"));
        polera.setEstilo(new Estilo("polerafuxia", 47, 313, 245, 134, "./img/polerafuxia.png"));
        polera.setEstilo(new Estilo("poleraroja", 47, 313, 245, 134, "./img/poleraroja.png"));
        polera.setEstilo(new Estilo("poleraverde", 47, 313, 245, 134, "./img/poleraverde.png"));
        polera.setEstilo(new Estilo("poleralila", 47, 313, 245, 134, "./img/poleralila.png"));
        ojos.setEstilo(new Estilo("default", 70, 165, 200, 40, ""));
        ojos.setEstilo(new Estilo("Ojo1", 70, 165, 200, 40, "./img/avatarojos1.png"));
        ojos.setEstilo(new Estilo("Ojo2", 70, 165, 200, 41, "./img/avatarojos2.png"));
        ojos.setEstilo(new Estilo("Ojo3", 70, 141, 200, 65, "./img/avatarojos3.png"));
        ojos.setEstilo(new Estilo("Ojo4", 70, 141, 200, 66, "./img/avatarojos4.png"));
        Cabello.setEstilo(new Estilo("default", 25, 0, 310, 310, ""));
        Cabello.setEstilo(new Estilo("Cabello1", 25, 0, 310, 310, "./img/cabello1.png"));
        Cabello.setEstilo(new Estilo("Cabello2", 25, 0, 310, 310, "./img/cabello2.png"));
        Cabello.setEstilo(new Estilo("Cabello3", 10, 36, 330, 330, "./img/cabello3.png"));
        Cabello.setEstilo(new Estilo("Cabello4", 18, 42, 338, 318, "./img/cabello4.png"));
        Cabello.setEstilo(new Estilo("Cabello6", -47, -110, 445, 476, "./img/cabello6.png"));
        Cabello.setEstilo(new Estilo("Cabello7", -20, -80, 620, 458, "./img/cabello7.png"));
        Cabello.setEstilo(new Estilo("Cabello8", -247, -160, 920, 920, "./img/cabello8.png"));
        Boca.setEstilo(new Estilo("default", 88, 42, 338, 318, ""));
        Boca.setEstilo(new Estilo("Boca1", 113, 268, 134, 60, "./img/boca1.png"));
        Boca.setEstilo(new Estilo("Boca2", 95, 268, 145, 53, "./img/boca2.png"));
        Boca.setEstilo(new Estilo("Boca3", 95, 276, 150, 44, "./img/boca3.png"));
        // polera.setEstilo(new Estilo("polera 1", 150, 180, 160, 40,
        // "./img/avatarojos1.png"));

        VentanaInicio ventanaInicio=new VentanaInicio();
        // new VentanaListaAvatares(ventanaInicio);
    }
}
