package ir.project.aop;

import ir.project.aop.entity.User;
import ir.project.aop.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class AopApplication implements   CommandLineRunner {


    public AopApplication(MyMethod myMethod, MyMethod2 myMethod2) {
        this.myMethod = myMethod;
        this.myMethod2 = myMethod2;
    }

    public static void main(String... args) {
        SpringApplication.run(AopApplication.class, args);
    }


private final MyMethod myMethod;
    private final MyMethod2 myMethod2;

    @Override
    public void run(String... args) throws Exception {
      myMethod2.addUser();
       myMethod.addUser();
    }
}
