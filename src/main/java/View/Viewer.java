package View;

import Controller.Controller;
import Model.HotBeverage;
import Model.VendingMachineHotDrinks;

import java.util.ArrayList;

public class Viewer {
    public Viewer() {}
    public void mainApp() {
        HotBeverage hot1 = new HotBeverage("coffee", "0.3", 85);
        HotBeverage hot2 = new HotBeverage("tea", "0.25", 95);
        Controller methods = new Controller();
        HotBeverage hot3 = methods.createBeverage();
        HotBeverage hot4 = methods.createBeverage();

        VendingMachineHotDrinks machine1 = new VendingMachineHotDrinks(new ArrayList<>());
        VendingMachineHotDrinks machine2 = new VendingMachineHotDrinks(new ArrayList<>());

        methods.addBeverageToVending(hot1, machine1);
        methods.addBeverageToVending(hot2, machine1);
        System.out.println(machine1);

        methods.addBeverageToVending(hot3, machine2);
        methods.addBeverageToVending(hot4, machine2);
        System.out.println(machine2);

        methods.getBeverage("coffee", "0.3", 85, machine1);
        methods.getBeverage("coffee", "0.3", 85, machine2);




    }
}
