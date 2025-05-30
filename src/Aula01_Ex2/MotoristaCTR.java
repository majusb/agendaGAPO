package Aula01_Ex2;

public class MotoristaCTR {
    
    MotoristaDAO motdao = new MotoristaDAO();
            
    public String verificaI (MotoristaDTO motdto){
        return motdao.verificaI(motdto);
    }
}
