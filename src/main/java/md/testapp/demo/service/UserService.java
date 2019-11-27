package md.testapp.demo.service;

import md.testapp.demo.domain.model.User;
import lombok.RequiredArgsConstructor;
import md.testapp.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    /*public boolean checkAcces(){

        List<User> users =  userRepository.findAll();

        for (User user : users) {
            if(user.getYoutube().equals("Permited"))
            {

            }
        }

    }*/

}
