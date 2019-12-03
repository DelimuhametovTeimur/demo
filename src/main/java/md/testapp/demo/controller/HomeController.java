package md.testapp.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import md.testapp.demo.domain.model.User;
import md.testapp.demo.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

import java.util.Optional;

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


    @PostMapping
    public String saveChanges(@RequestParam(name = "username") String username, @RequestParam(name = "youtubeAccess") String ya,
                              @RequestParam(name = "instagramAccess") String ia, @RequestParam(name = "vkAccess") String va,
                              @RequestParam(name = "facebookAccess") String fa, Model model, Model model1) {

        Optional<User> newUser = userRepository.findByUsername(username);


        model.addAttribute("users", userRepository.findAll());

        return "home";
    }

}
