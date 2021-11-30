package champollion;
import java.util.*;

public class Enseignant extends Personne {

    private final List<ServicePrevu> service = new LinkedList<ServicePrevu>();
    private final Set<Intervention> intervention = new HashSet<>();

    public Enseignant(String nom, String email) {
        super(nom, email);
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures équivalent TD" Pour le calcul : 1 heure
     * de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut 0,75h
     * "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevues() {
        int equivTD = 0;
        Iterator<ServicePrevu> it = service.iterator();
        while(it.hasNext()){
            ServicePrevu s = it.next();
            equivTD += (int)(s.getVolumeCM()*1.5 + s.getVolumeTD() + s.getVolumeTP()*0.75);
        }
        return equivTD;
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE spécifiée en "heures équivalent TD" Pour
     * le calcul : 1 heure de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure
     * de TP vaut 0,75h "équivalent TD"
     *
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevuesPourUE(UE ue) {
        int somme = 0;
        for (ServicePrevu s : service){
            if (s.getUE() == ue){
                somme += (int) (s.getVolumeCM()*1.5 + s.getVolumeTD() + s.getVolumeTP()*0.75);
            }
        }
        return somme;
    }

    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     *
     * @param ue l'UE concernée
     * @param volumeCM le volume d'heures de cours magitral
     * @param volumeTD le volume d'heures de TD
     * @param volumeTP le volume d'heures de TP
     */
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
        service.add(new ServicePrevu(volumeCM, volumeTD, volumeTP, ue, this));
        }

    //public void ajouteIntervention(Salle sa, Intervention i){
        
    //}
    
    public boolean enSousService(){
        boolean sousService = false;
        if (this.heuresPrevues()<192){
            sousService=true;
        }
        return sousService;
    }
    
    public void ajouteIntervention(Intervention inter){
        intervention.add(inter);
    }
    
    public int resteAPlanifier(UE ue, TypeIntervention type){
        int sommePlanifier = 0;
        for(Intervention inter : intervention){
            if (inter.getType().equals(type) && inter.getUe().equals(ue)){
                sommePlanifier += inter.getDuree();
            }
        }
        for(ServicePrevu s : service){
            if (s.getUE().equals(ue)){
                switch(type){
                    case TP: sommePlanifier -= s.getVolumeTP();
                    case TD: sommePlanifier -= s.getVolumeTD();
                    case CM: sommePlanifier -= s.getVolumeCM();
                    break;
                }
            }
        }
        return (int) sommePlanifier;
    }
}
