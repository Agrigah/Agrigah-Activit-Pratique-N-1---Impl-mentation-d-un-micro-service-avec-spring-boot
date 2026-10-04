package ma.agrigah.bankaccountservice.service;

import ma.agrigah.bankaccountservice.dtos.BankAccountRequestDto;
import ma.agrigah.bankaccountservice.dtos.BankAccountResponseDTO;
import ma.agrigah.bankaccountservice.entities.BankAccount;
import ma.agrigah.bankaccountservice.mappers.AccountMapper;
import ma.agrigah.bankaccountservice.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional
public class BankAccountServiceImpl implements BankAccountService {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public BankAccountResponseDTO addAccount(BankAccountRequestDto bankAccountRequestDto) {
        BankAccount bankAccount = BankAccount.builder()
                .id(UUID.randomUUID().toString())
                .balance(bankAccountRequestDto.getBalance())
                .currency(bankAccountRequestDto.getCurrency())
                .accountType(bankAccountRequestDto.getAccountType())
                .createdAt(new Date())
                .build();
        BankAccount savedBankAccount = bankAccountRepository.save(bankAccount);
        return accountMapper.fromBankAccount(savedBankAccount);
    }

    @Override
    public BankAccountResponseDTO updateAccount(String id, BankAccountRequestDto bankAccountRequestDto) {
        BankAccount bankAccount = bankAccountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        if (bankAccountRequestDto.getBalance() != null) {
            bankAccount.setBalance(bankAccountRequestDto.getBalance());
        }
        if (bankAccountRequestDto.getCurrency() != null) {
            bankAccount.setCurrency(bankAccountRequestDto.getCurrency());
        }
        if (bankAccountRequestDto.getAccountType() != null) {
            bankAccount.setAccountType(bankAccountRequestDto.getAccountType());
        }

        BankAccount savedBankAccount = bankAccountRepository.save(bankAccount);
        return accountMapper.fromBankAccount(savedBankAccount);
    }
}

