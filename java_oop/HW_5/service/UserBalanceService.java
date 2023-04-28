package java_oop.HW_5.service;

public interface UserBalanceService {
    void payment(int index, int amount);

    int withdrawal(int index, int amount);

    int getBalance(int index);
}
