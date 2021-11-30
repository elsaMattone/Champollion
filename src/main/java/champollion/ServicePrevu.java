package champollion;

public class ServicePrevu {
	// TODO : implémenter cette classe
        
    //ATTRIBUTS
    public int volumeCM;
    public int volumeTP;
    public int volumeTD;
    private UE ue;
    private Enseignant enseignant;
    
    //CONSTRUCTEUR
    public ServicePrevu(int volumeCM, int volumeTD, int volumeTP, UE ue, Enseignant enseignant){
        this.ue = ue;
        this.volumeCM = volumeCM;
        this.volumeTD = volumeTD;
        this.volumeTP = volumeTP;
        this.ue = ue;
        this.enseignant = enseignant;
    }
    
    //ACCESSEURS
    public int getVolumeCM(){
        return volumeCM;
    }
    
    public int getVolumeTP(){
        return volumeTP;
    }
    
    public int getVolumeTD(){
        return volumeTD;
    }
    
    public UE getUE(){
        return ue;
    }
    
    public Enseignant getEnseignant(){
        return enseignant;
    }
}
