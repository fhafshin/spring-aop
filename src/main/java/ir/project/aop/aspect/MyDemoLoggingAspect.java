package ir.project.aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    @Pointcut("execution(* ir.project.aop.*.addUser(..))")
    private void beforeAddUserFunc() {
    }

    @Before("beforeAddUserFunc()")
    public void beforeAddUser(JoinPoint J) {

        System.out.println("Before add user");
    }

    @After("beforeAddUserFunc()")
    public void afterAddUser(JoinPoint J) {

        System.out.println("after add user");
    }

    @AfterReturning(pointcut = "beforeAddUserFunc()",returning = "str")
    public void afterReturnAddUser(JoinPoint J,String str) {

        System.out.println("after return  add user "+str);

    }

    @AfterThrowing("beforeAddUserFunc()")
    public void afterThrowing(JoinPoint J) {

        System.out.println("after throwing add user");
    }

    @Around("beforeAddUserFunc()")
    public String aroundAddUser(ProceedingJoinPoint J) throws Throwable {

        System.out.println("around start");
        Object result=null;

        try {
            result=J.proceed();
        }catch (Exception ex){
        result=ex.getMessage();

        }

        System.out.println("around end");

        return result.toString()+" modified";
    }
}
