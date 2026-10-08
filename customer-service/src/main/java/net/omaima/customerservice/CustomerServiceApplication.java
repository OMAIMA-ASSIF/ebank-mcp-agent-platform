package net.omaima.customerservice;

import net.omaima.customerservice.entities.Customer;
import net.omaima.customerservice.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner run(CustomerService customerService){
        return args -> {
            List<String> names = List.of("Omaima", "Soumia", "Fatima");
            names.forEach(name-> {
                customerService.saveCustomer(Customer.builder()
                                .name(name).email(name+"@gmail.com")
                        .build());
            });
        };
    }
}
