package ro.ase.cts.Factory;
import ro.ase.cts.clase.Supa;
import ro.ase.cts.clase.SupaCiuperci;
import ro.ase.cts.clase.SupaLegume;
import ro.ase.cts.clase.SupaVita;

public class Factory {

    private int gramaj;
    private double pretPerSutaDeGrame;

    public Factory(int gramaj, double pretPerSutaDeGrame) {
        this.gramaj = gramaj;
        this.pretPerSutaDeGrame = pretPerSutaDeGrame;
    }

    public Supa getSupa(TipuriSupe supe, String ingrediente, double x){
        switch (supe){
            case LEGUME:
                SupaLegume supaLegume = new SupaLegume(gramaj,pretPerSutaDeGrame,ingrediente,x);
                return supaLegume;
            case VITA:
                SupaVita supaVita = new SupaVita(gramaj,pretPerSutaDeGrame,ingrediente,x);
                return supaVita;
            case CIUPERCI:
                SupaCiuperci supaCiuperci = new SupaCiuperci(gramaj,pretPerSutaDeGrame,ingrediente,x);
                return supaCiuperci;
            default:
                return null;
        }
    }
}
