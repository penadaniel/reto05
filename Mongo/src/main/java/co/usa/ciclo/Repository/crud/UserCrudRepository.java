/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo.Repository.crud;

import co.usa.ciclo.Modelo.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author 
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {
    
    public Optional<User> findByName(String name);
    
    public Optional<User> findByEmail(String email);
    
    public List<User> findByNameOrEmail(String name, String email);

    public Optional<User> findByEmailAndPassword(String email, String password);
    
    public List<User> findByIdentificationAndCellPhoneAndEmailAndPasswordAndName(String Identification,String cellPhone, String email, String password, String Name);
    
    //reto5
    List<User> findMontBirthtDay(String month);
}
