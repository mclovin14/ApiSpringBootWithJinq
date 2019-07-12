package springjinq.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication (exclude = {ErrorMvcAutoConfiguration.class},scanBasePackages = "springjinq" )
@EnableJpaRepositories (basePackages="springjinq")
@EntityScan (basePackages= "springjinq")
@ComponentScan (basePackages={"springjinq"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
