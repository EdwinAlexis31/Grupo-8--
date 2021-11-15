package co.edu.unab.apirest.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import co.edu.unab.apirest.models.ClienteModel;

public interface ClienteRepository extends MongoRepository<ClienteModel ,String> {
    
    public abstract ArrayList <ClienteModel> findByNombre(String nombre);

    @Query("{apellido:'?0'}")
    ArrayList<ClienteModel> findByApellido(String apellido);
    
}
