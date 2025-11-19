package com.hei.wallet;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class to demonstrate the Wallet usage.
 */
@SpringBootApplication
public class WalletApplication {
    /**
     * Main method to demonstrate the Wallet class.
     */
    public static void main(String[] args) {

        Wallet myWallet = new Wallet(
                "Black",
                "Gucci",
                200,
                new ArrayList<>(Arrays.asList("Visa")),
                100.0
        );

        System.out.println(myWallet);

        myWallet.addCard("ID Card");
        myWallet.addMoney(50.0);
        System.out.println(myWallet);
    }

}
