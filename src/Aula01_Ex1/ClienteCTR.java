package Aula01_Ex1;

public class ClienteCTR {
    
    ClienteDAO clienteDao = new ClienteDAO();
    
    public String mostrarNomeRg (ClienteDTO clienteDto){
        return clienteDao.mostrarNomeRG(clienteDto);
    }
    
    public String mostrarNomeId (ClienteDTO clienteDto){
        return clienteDao.mostrarNomeId(clienteDto);
    }    
    
}
