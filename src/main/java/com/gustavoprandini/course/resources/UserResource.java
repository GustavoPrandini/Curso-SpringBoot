package com.gustavoprandini.course.resources;

import com.gustavoprandini.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {


    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Gustavo", "gustavo@gmail.com", "8319239", "12345");
        return ResponseEntity.ok().body(u);
    }


}
