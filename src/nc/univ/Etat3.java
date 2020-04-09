package nc.univ;

public class Etat3 implements IEtat{
    @Override
    public void demarrer(Automate a) {

    }

    @Override
    public void arreter(Automate a) {
        Chrono chrono = a.getControle();
        chrono.stopperChrono();
        a.changementEtat(new Etat1());
    }

    @Override
    public void suspendre(Automate a) {
    }

    @Override
    public void reprendre(Automate a) {
        Chrono chrono = a.getControle();
        chrono.reprendreChrono();
        a.changementEtat(new Etat2());
    }
}
