package md.testapp.demo.controller;

import md.testapp.demo.domain.dto.UserDto;
import md.testapp.demo.domain.model.User;
import md.testapp.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/register")
@RequiredArgsConstructor
@Slf4j
public class RegistrationController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @GetMapping
    public String registerForm() {

        return "registration";
    }

    @PostMapping
    public String processRegistration(@Valid UserDto form, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "registration";
        }

        Optional<User> user1= userRepository.findByUsername(form.getUsername());

        if(user1.isEmpty()){
            User save = userRepository.save(form.toUser(passwordEncoder));
            log.info("{}", save);
            return "redirect:/login";
        }

        model.addAttribute("accExist", "Account with this username already exists!");

        return "registration";
    }
}