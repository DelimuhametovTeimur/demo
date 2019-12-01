package md.testapp.demo.service;

import lombok.RequiredArgsConstructor;
import md.testapp.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


}
