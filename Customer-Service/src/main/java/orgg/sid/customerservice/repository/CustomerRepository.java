package orgg.sid.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import orgg.sid.customerservice.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
