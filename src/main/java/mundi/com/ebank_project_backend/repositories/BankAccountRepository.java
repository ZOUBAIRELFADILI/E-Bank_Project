package mundi.com.ebank_project_backend.repositories;

import mundi.com.ebank_project_backend.entites.BankAccount;
import mundi.com.ebank_project_backend.entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {

}
