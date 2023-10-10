package Controller;

import Model.Beverage;
import Model.HotBeverage;
import Model.VendingMachineHotDrinks;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    Scanner in = new Scanner(System.in);
    public HotBeverage createBeverage() {
        HotBeverage beverage = new HotBeverage();
        System.out.println("Введите название горячего напитка: ");
        beverage.setName(in.next());

        System.out.println("Введите объем горячего напитка: ");
        beverage.setVolume(in.next());

        System.out.println("Введите температуру горячего напитка: ");
        beverage.setTemperature(Integer.parseInt(in.next()));

        System.out.println(beverage);
        return beverage;
    }

    public void addBeverageToVending(HotBeverage beverage, VendingMachineHotDrinks vending) {
        vending.getVendingMachine().add(beverage);
    }

    public void getBeverage(String name, String volume, int temperature, VendingMachineHotDrinks vending) {
        for (HotBeverage l: vending.getVendingMachine()) {
            if (l.getName().equals(name) && l.getVolume().equals(volume) && (l.getTemperature() == temperature)) {
                System.out.println(l.getName() + " " + l.getVolume() + " " + l.getTemperature());
                return;
            }
        }
        System.out.println("Такой напиток не найден!");
    }
}
