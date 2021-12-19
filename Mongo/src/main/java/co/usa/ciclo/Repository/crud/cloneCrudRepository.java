/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo.Repository.crud;

import co.usa.ciclo.Modelo.Clone;
import co.usa.ciclo.Modelo.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author 
 */

public interface cloneCrudRepository extends MongoRepository<Clone, Integer> {
   //reto 5
    public List<Clone> findByPrice(double price);
    public List<Clone> findByDescriptionContainingIgnoreCase(String description);
   
}

