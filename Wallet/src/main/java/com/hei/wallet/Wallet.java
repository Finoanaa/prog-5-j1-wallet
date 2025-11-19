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

    /**
     * Adds the specified amount of money to the wallet if it is positive.
     */
    public void addMoney(double amount) {
        if (amount > 0) {
            this.money += amount;
        }
    }

    /**
     * Checks if the wallet has at least the specified amount of money.
     */
    public boolean checkMoney(double amount) {
        return this.money >= amount;
    }

    /**
     * Adds a new card to the wallet if the card name is not null or empty.
     */
    public void addCard(String cardName) {
        if (cardName != null && !cardName.isEmpty()) {
            this.cardHolder.add(cardName);
        }
    }

    /**
     * Empties the wallet by removing all money and cards.
     */
    public void lost() {
        this.money = 0;
        this.cardHolder.clear();
    }
}
