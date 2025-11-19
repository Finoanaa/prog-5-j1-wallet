package com.hei.wallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class WalletApplication {

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
