package ro.ase.cts.clase;

public abstract class Supa {
    private double gramaj;
    private double pretPerSutaDeGrame;
    private String ingrediente;

    public Supa(double gramaj, double pretPerSutaDeGrame, String ingrediente) {
        this.gramaj = gramaj;
        this.pretPerSutaDeGrame = pretPerSutaDeGrame;
        this.ingrediente = ingrediente;
    }

    public abstract void preparareSupa();

    public  double calculeazaPret(){
        return gramaj/100*pretPerSutaDeGrame;
    }

    /*public float getGramaj() {
        return gramaj;
    }*/

    public double getPretPerSutaDeGrame() {
        return pretPerSutaDeGrame;
    }
}
