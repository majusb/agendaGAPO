package Aula01_Ex1;

public class ClienteDAO {
    
    public String mostrarNomeRG (ClienteDTO clienteDto){
        return "O nome informado foi: " + clienteDto.getNome() +
                "\nO RG informado foi: " + clienteDto.getRg();
    }
    
    public String mostrarNomeId (ClienteDTO clienteDto){
        return "O nome informado foi: " + clienteDto.getNome() +
                "\nA idade informado foi: " + clienteDto.getIdade();
    }
}
