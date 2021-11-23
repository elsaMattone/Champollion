package champollion;
import java.util.*;

public class Intervention {
    public Date debut;
    public int duree;
    public boolean annulee;
    private final int heureDebut;
    
    public Intervention(Date debut, int duree, boolean annulee, int heureDebut){
        this.debut = debut;
        this.duree = duree;
        this.annulee = false;
        this.heureDebut = heureDebut;
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
}


