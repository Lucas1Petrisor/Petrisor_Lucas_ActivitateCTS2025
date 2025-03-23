package ro.ase.cts.clase;

public class SupaCiuperci extends Supa {
    private double cantitateCiuperci;

    public SupaCiuperci(double gramaj, double pretPerSutaDeGrame, String ingrediente,double cantitateCiuperci) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.cantitateCiuperci=cantitateCiuperci;
    }

    @Override
    public double calculeazaPret() {

        return super.calculeazaPret()+cantitateCiuperci/100*getPretPerSutaDeGrame();
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de ciuperci este gata cu o cantitate de ciuperci de: "+cantitateCiuperci);
    }
}
