package md.testapp.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import md.testapp.demo.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/home")
@RequiredArgsConstructor
@Slf4j
public class HomeController {

    private final UserRepository userRepository;

    @GetMapping
    public String showUsers(Model model) {
            model.addAttribute("users", userRepository.findAll());
        return "home";
    }

/*    @PostMapping
    public String saveChanges (@Valid , Errors errors){

        if (errors.hasErrors()) {
            return "home";
        }

        return "home";
    }*/

}
