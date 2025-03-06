package ir.project.aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

        @Before("execution(* ir.project.aop.*.addUser(..))")
        public void beforeAddUser() {

                System.out.println("Before add user");
        }
}
