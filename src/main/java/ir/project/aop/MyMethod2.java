package ir.project.aop;

import ir.project.aop.entity.User;
import ir.project.aop.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class MyMethod2 {

    private final UserRepository userRepository;

    public MyMethod2(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String addUser() {
        User user = new User("hesan2","123");

        userRepository.save(user);
        System.out.println("run");
        throw new RuntimeException("");
       // return "success";
    }
}
