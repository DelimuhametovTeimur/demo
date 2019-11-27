package md.testapp.demo.controller;

import md.testapp.demo.domain.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(value = "/user")
    public UserDto user() {
        return new UserDto();
    }
}
