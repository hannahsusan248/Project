package com.canteen.canteenmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canteen.canteenmanagementsystem.domain.Login;
import com.canteen.canteenmanagementsystem.repository.LoginRepo;

@Service
public class LoginService {


   @Autowired
   private LoginRepo rep;


   public Login log(String username, String password) {
       Login user = rep.findByUsernameAndPassword(username, password);
       return user;
   }
}
