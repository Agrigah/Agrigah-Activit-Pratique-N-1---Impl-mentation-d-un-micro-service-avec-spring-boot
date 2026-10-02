package ma.agrigah.bankaccountservice.mappers;

import ma.agrigah.bankaccountservice.dtos.BankAccountResponseDTO;
import ma.agrigah.bankaccountservice.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount) {
        BankAccountResponseDTO bankAccountResponseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount, bankAccountResponseDTO);
        if (bankAccount.getAccountType() != null) {
            bankAccountResponseDTO.setAccountType(bankAccount.getAccountType().name());
        }
        return bankAccountResponseDTO;
    }
}

