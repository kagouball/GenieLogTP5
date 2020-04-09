package nc.univ;

public class Etat2 implements IEtat {


    @Override
    public void demarrer(Automate a) {
        Chrono chrono = a.getControle();
        chrono.lancerChrono();
    }

    @Override
    public void arreter(Automate a) {
        Chrono chrono = a.getControle();
        chrono.stopperChrono();
        a.changementEtat(new Etat1());
    }

    @Override
    public void suspendre(Automate a) {
        Chrono chrono = a.getControle();
        chrono.suspendreChrono();
        a.changementEtat(new Etat3());
    }

    @Override
    public void reprendre(Automate a) {

    }
}
