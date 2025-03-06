package ir.project.aop;

import ir.project.aop.entity.User;
import ir.project.aop.repository.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MyMethod {

    private final UserRepository userRepository;

    public MyMethod(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String addUser() {
        User user = new User("hesan","123");

        userRepository.save(user);
        System.out.println("run");
        return "success";
    }
}
