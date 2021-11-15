package co.edu.unab.apirest.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unab.apirest.models.ClienteModel;
import co.edu.unab.apirest.repositories.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public ArrayList<ClienteModel> obtenerClientes(){
        return (ArrayList<ClienteModel>) clienteRepository.findAll();
    }

    public ClienteModel guardarCliente(ClienteModel cliente){
        return clienteRepository.save(cliente);

    }

    public boolean eliminarCliente(String id){
        if(clienteRepository.existsById(id)){
            clienteRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public Optional<ClienteModel> obtenerClientePorId(String id){
        return clienteRepository.findById(id);
    }

    public ArrayList <ClienteModel> obtenerClientePorNombre(String nombre){
        return clienteRepository.findByNombre(nombre);
    }

     public ArrayList <ClienteModel> obtenerPorApellido(String apellido){
        return clienteRepository.findByApellido(apellido);
    } 
    
}
