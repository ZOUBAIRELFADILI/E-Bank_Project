package mundi.com.ebank_project_backend.services;

import jakarta.transaction.Transactional;
import mundi.com.ebank_project_backend.entites.BankAccount;
import mundi.com.ebank_project_backend.entites.CurrentAccount;
import mundi.com.ebank_project_backend.entites.SavingAccount;
import mundi.com.ebank_project_backend.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BankService {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    public void consulter(){
        BankAccount bankAccount= bankAccountRepository.findById("69acdf3e-be28-4ffc-9c18-b80aa0945710").orElse(null);
        if (bankAccount!=null) {
            System.out.println("******************************");
            System.out.println(bankAccount.getId());
            System.out.println(bankAccount.getBalance());
            System.out.println(bankAccount.getStatus());
            System.out.println(bankAccount.getCreatedAt());
            System.out.println(bankAccount.getCustomer().getName());
            System.out.println(bankAccount.getClass().getSimpleName());
            if (bankAccount instanceof CurrentAccount) {
                System.out.println("Over Draft=>" + ((CurrentAccount) bankAccount).getOverDraft());
            } else if (bankAccount instanceof SavingAccount) {
                System.out.println("Rate=>" + ((SavingAccount) bankAccount).getInterestRate());
            }

            //voir les infos sur operation
            bankAccount.getAccountOperations().forEach(op -> {
                System.out.println("-------------------------------");
                System.out.println(op.getType() + "\t" + op.getOperationDate() + "\t" + op.getAmount());
            });
        }
    }
}
