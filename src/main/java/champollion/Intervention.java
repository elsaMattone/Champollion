package champollion;
import java.util.*;

public class Intervention {
    public Date debut;
    public int duree;
    public boolean annulee;
    private final int heureDebut;
    private TypeIntervention type;
    private UE ue;
    private Salle salle;
    
    public Intervention(Date debut, int duree, boolean annulee, int heureDebut, Salle salle){
        this.debut = debut;
        this.duree = duree;
        this.annulee = false;
        this.heureDebut = heureDebut;
        this.salle = salle;
    }
    
    public Intervention(TypeIntervention type, UE ue, int duree){
        this.debut = new Date("01/01/2001");
        this.duree = duree;
        this.type = type;
        this.heureDebut = 10;
        this.salle = new Salle("101", 36);
        this.ue = ue;
    }
    
    public Date getDebut(){
        return debut;
    }
    
    public int getDuree(){
        return duree;
    }
    
    public boolean getAnnulee(){
        return annulee;
    }
    
    public int getHeureDebut(){
        return heureDebut;
    }

    public TypeIntervention getType() {
        return type;
    }

    public UE getUe() {
        return ue;
    }
}


