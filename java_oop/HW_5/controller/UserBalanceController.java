package java_oop.HW_5.controller;

import java_oop.HW_5.service.UserBalanceService;
import java_oop.HW_5.service.UserBalanceServicelmpl;

public class UserBalanceController {
    private UserBalanceService userBalanceService = new UserBalanceServicelmpl();

    public int getBalance(int index) {
        return userBalanceService.getBalance(index);
    }

    public int withdrawal(int index, int amount) {
        return userBalanceService.withdrawal(index, amount);
    }

    public void payment(int index, int amount) {
        userBalanceService.payment(index, amount);
    }
}
