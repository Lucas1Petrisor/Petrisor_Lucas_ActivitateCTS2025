package ro.ase.cts.clase;

public class SupaVita extends Supa {
    private double pretSmantana;

    public SupaVita(double gramaj, double pretPerSutaDeGrame, String ingrediente, double pretSmantana) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.pretSmantana = pretSmantana;
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret()+pretSmantana;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de vita este gata cu un pret de: "+calculeazaPret());
    }
}
