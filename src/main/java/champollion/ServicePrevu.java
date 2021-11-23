package champollion;

public class ServicePrevu {
	// TODO : implémenter cette classe
        
    //ATTRIBUTS
    public int volumeCM;
    public int volumeTP;
    public int volumeTD;
    
    //CONSTRUCTEUR
    public ServicePrevu(int volumeCM, int volumeTP, int volumeTD){
        this.volumeCM = volumeCM;
        this.volumeTD = volumeTD;
        this.volumeTP = volumeTP;
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
}
