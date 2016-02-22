package me.karthy.spring.controller;

/**
 * Created by karthy on 1/21/16.
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @RequestMapping(
             value="/api/greetings",
             method=RequestMethod.GET,
             produce=MediaType)
    public ResponseEntity<String> getUser() {

        return "karthy";
    }

}
