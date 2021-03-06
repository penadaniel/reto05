/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo.Web;

import co.usa.ciclo.Modelo.Order;
import co.usa.ciclo.Service.OrderService;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 
 */

@RestController
@RequestMapping("/api/order")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class OrderController {
     @Autowired
    private OrderService service;

    @GetMapping("/all")
    public List<Order> getOrder() {

        return service.getAll();

    }
    
    @GetMapping("/{id}")
    public Order getById(@PathVariable("id") Integer id){
        
        return service.getById(id);
    
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Order save(@RequestBody Order order){
        System.out.println(order);
    return service.save(order);
    
    }
    
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Integer delete(@PathVariable Integer id){
    
       return  service.deleteOrder(id);
    
    }
    
    @GetMapping("/{status}")
    public List<Order> getByStatus(@PathVariable String status){
    
        return service.getStatus(status);
    
    }
    
    @GetMapping("/zona/{zone}")
    public List<Order> getByZone(@PathVariable String zone){
    
        return service.getZone(zone);
    
    }
    
    @PutMapping("/update")
    public Order update(@RequestBody Order order){
    
        return service.update(order);
    
    }
    
    
    @GetMapping("/salesman/{id}")
    public List<Order> getBySalesManId(@PathVariable Integer id){
    
    return service.findBySalesManId(id);
    
    }
    
    
    @GetMapping("/date/{fecha}/{id}")
    public List<Order> getDate (@PathVariable String fecha,@PathVariable Integer id) throws ParseException{
        
    return service.getRegisterDay(fecha,id);
    
    }
    
    
    @GetMapping("/state/{state}/{id}")
    public List<Order> getStatusById (@PathVariable("state") String state,@PathVariable("id") Integer id){
    
        return service.getStatusById(state, id);
    
    }
}
