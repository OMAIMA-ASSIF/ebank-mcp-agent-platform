package net.omaima.ebankservice.controllers;

import net.omaima.ebankservice.entities.BankAccount;
import net.omaima.ebankservice.services.EBankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EBankRestController {
    private EBankService eBankService;

    public EBankRestController(EBankService eBankService){
        this.eBankService = eBankService;
    }

    @GetMapping("/accounts")
    public List<BankAccount> getAllBankAccounts(){
        return eBankService.getAllBankAccounts();
    }

    @GetMapping("/accounts/{id}")
    public BankAccount getBankAccountById(@PathVariable String id){
        return eBankService.getBankAccountById(id);
    }

    @PostMapping("/accounts")
    public BankAccount save(@RequestBody BankAccount bankAccount){
        return eBankService.save(bankAccount);
    }

}
