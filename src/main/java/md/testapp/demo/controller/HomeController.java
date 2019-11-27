package md.testapp.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import md.testapp.demo.repository.UserRepository;
import md.testapp.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class HomeController {

    private final UserRepository userRepository;

    @GetMapping("/home")
    public String showAll(Model model) {
        model.addAttribute("books", userRepository.findAll());
        return "home";
    }

   /* @GetMapping("/home")
    public String showCheck(Model model) {
            model.addAttribute("", UserService.findAll());
        return "home";
    }*/

}
