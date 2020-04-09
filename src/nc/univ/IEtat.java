package nc.univ;

public interface IEtat {
    public void demarrer(Automate a);
    public void arreter(Automate a);
    public void suspendre(Automate a);
    public void reprendre(Automate a);
}
