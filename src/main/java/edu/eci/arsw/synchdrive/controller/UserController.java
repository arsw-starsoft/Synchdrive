package edu.eci.arsw.synchdrive.controller;

import edu.eci.arsw.synchdrive.model.User;
import edu.eci.arsw.synchdrive.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserServices userServices;

    //Método de prueba para verificar autowired y repo
    @GetMapping(value = "/usertest")
    public ResponseEntity<?> testMethod(){
        User user = new User();
        user.setName("test name");
        user.setEmail("test1@mail.com");
        user.setPassword("123");
        userServices.saveUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

}
