package mundi.com.ebank_project_backend.repositories;

import mundi.com.ebank_project_backend.entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
