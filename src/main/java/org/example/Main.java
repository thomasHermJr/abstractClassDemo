package org.example;

import org.example.dmvinfo.Passenger.Ford.FordModel;

public class Main {
    public static void main(String[] args) {
        FordModel fordModel = new FordModel("1FTFW1E50JFB12345", 2018, org.example.dmvinfo.Passenger.Ford.EModels.F150);
        System.out.println(fordModel);
        }
    }