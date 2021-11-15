package co.edu.unab.apirest.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.apirest.models.ClienteModel;
import co.edu.unab.apirest.services.ClienteService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    ClienteService clienteService;

    @GetMapping()
    public ArrayList<ClienteModel> obtenerClientes(){
        return clienteService.obtenerClientes();
    }

    @PostMapping()
    public ClienteModel guardarCliente(@RequestBody ClienteModel cliente){
        return clienteService.guardarCliente(cliente);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarClientePorId(@PathVariable("id") String id){
        if(this.clienteService.eliminarCliente(id))
            return "Se elimino el cliente con id: "+id;
        else
            return "No existe un cliente con id: "+id;
    }

    @GetMapping(path = "/{id}")
    public Optional <ClienteModel> obtenerClientePorId(@PathVariable("id") String id){
        return this.clienteService.obtenerClientePorId(id);
    }

    
   @GetMapping("/nombre/query")
   public ArrayList<ClienteModel> clientePorNombre(@RequestParam("nombre") String nombre){
    return this.clienteService.obtenerClientePorNombre(nombre);
   }

   @GetMapping("/apellido/query")
   public ArrayList<ClienteModel> clientePorApellido(@RequestParam("apellido") String apellido){
    return this.clienteService.obtenerPorApellido(apellido);
   }

    }
