package mundi.com.ebank_project_backend.repositories;

import mundi.com.ebank_project_backend.entites.AccountOperation;
import mundi.com.ebank_project_backend.entites.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation, Long> {

}
