package champollion;

public class UE {
    private final String myIntitule;
    private int heuresCM;
    private int heuresTD;
    private int heuresTP;
    private Enseignant enseignant;
    private Intervention intervention;

    public UE(String intitule) {
        myIntitule = intitule;
    }

    public String getIntitule() {
        return myIntitule;
    }

    public int getHeuresCM() {
        return heuresCM;
    }
    
    public int getHeuresTD() {
        return heuresTD;
    }
    
    public int getHeuresTP() {
        return heuresTP;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public Intervention getIntervention() {
        return intervention;
    }
    
    public void setHeuresCM(int heuresCM) {
        this.heuresCM = heuresCM;
    }

    public void setHeuresTD(int heuresTD) {
        this.heuresTD = heuresTD;
    }

    public void setHeuresTP(int heuresTP) {
        this.heuresTP = heuresTP;
    }
}
