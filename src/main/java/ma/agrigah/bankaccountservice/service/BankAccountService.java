package ma.agrigah.bankaccountservice.service;

import ma.agrigah.bankaccountservice.dtos.BankAccountRequestDto;
import ma.agrigah.bankaccountservice.dtos.BankAccountResponseDTO;

public interface BankAccountService {
     BankAccountResponseDTO addAccount(BankAccountRequestDto bankAccountRequestDto);


     BankAccountResponseDTO updateAccount(String id, BankAccountRequestDto bankAccountRequestDto);
}

