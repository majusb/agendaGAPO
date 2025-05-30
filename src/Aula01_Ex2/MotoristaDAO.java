package Aula01_Ex2;

public class MotoristaDAO {

    private String mens;
    
    public String verificaI (MotoristaDTO motdto){
        if (motdto.getIdade() >= 18){
            this.mens = "Você possui idade para ter uma CNH";
        } else {
            this.mens = "Você não possui idade para obter uma CNH";
        }
        
        return this.mens;
    }
}
