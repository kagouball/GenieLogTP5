package nc.univ;

public class Etat1 implements IEtat{

    @Override
    public void evenement1(Automate a) {
        X x = a.getControle();
        x.action1();
        a.changementEtat(new Etat2());
    }

    @Override
    public void evenement2(Automate a) {
        //Etat2 e2 = (Etat2) a.getEtatCourant();
        //e2.evenement1(a);
    }
}
