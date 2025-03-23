package ro.ase.cts.clase;

public class SupaLegume extends Supa {
    private double gramajCrutoane;

    public SupaLegume(double gramaj, double pretPerSutaDeGrame, String ingrediente,double gramajCrutoane) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.gramajCrutoane=gramajCrutoane;
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret()+gramajCrutoane/100*getPretPerSutaDeGrame();
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de legume este gata cu "+gramajCrutoane+" nr de crutoane si un pret de: "+ calculeazaPret());
    }
}
