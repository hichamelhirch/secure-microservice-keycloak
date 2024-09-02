package orgg.sid.customerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import orgg.sid.customerservice.entities.Customer;
import orgg.sid.customerservice.repository.CustomerRepository;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder()
                            .name("hicham")
                            .email("hicham@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("ali")
                    .email("ali@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("med")
                    .email("med@gmail.com")
                    .build());
        };
    }

}
