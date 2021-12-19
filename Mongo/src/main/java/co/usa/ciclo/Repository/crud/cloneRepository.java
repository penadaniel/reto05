/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo.Repository.crud;

import co.usa.ciclo.Modelo.Clone;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 
 */
@Repository

public class cloneRepository {
    
    @Autowired
    private cloneCrudRepository cloneCrud;
    
   public List<Clone> getAll() {
        return (List<Clone>) cloneCrud.findAll();
    }
    
    public Optional<Clone>  getCloneById(int id){
        return cloneCrud.findById(id);
    
    }

    public Clone save(Clone clone) {       
        return cloneCrud.save(clone);
    }
    
    public void delete(Integer id){   
        cloneCrud.deleteById(id);
    
    }
    //reto 5
    public List<Clone> getByPrice(double price){
        return cloneCrud.findByPrice(price);
    }
    
    public List<Clone> getByDescriptionContains(String description){
        return cloneCrud.findByDescriptionContainingIgnoreCase(description);
    }

}