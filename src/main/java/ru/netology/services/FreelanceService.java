package ru.netology.services;

public class FreelanceService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int vocation = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                vocation++;
                money = money - expenses;
                money = money / 3;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return vocation;
    }
}
