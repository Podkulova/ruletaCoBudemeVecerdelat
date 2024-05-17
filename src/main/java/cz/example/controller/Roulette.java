package cz.example.controller;

import java.util.Random;

public class Roulette {
    private String name;
    private int bankAccount;
    private int currentBets;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getCurrentBets() {
        return currentBets;
    }

    public void setCurrentBets(int currentBets) {
        this.currentBets = currentBets;
    }
}
