package com.hei.wallet;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents a wallet containing money and cards.
 **/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Wallet {
    private String color;
    private String brand;
    private double weight;
    private List<String> cardHolder = new ArrayList<String>();
    private double money = 0.0;

    public void addMoney(double amount) {
        if (amount > 0) {
            this.money += amount;
        }
    }

    public boolean checkMoney(double amount) {
        return this.money >= amount;
    }

    public void addCard(String cardName) {
        if (cardName != null && !cardName.isEmpty()) {
            this.cardHolder.add(cardName);
        }
    }

    public void lost() {
        this.money = 0;
        this.cardHolder.clear();
    }
}
