package Model;

import java.util.List;

public class VendingMachineHotDrinks implements VendingMachine{

    private final List<HotBeverage> vending;

    public VendingMachineHotDrinks(List<HotBeverage> vending) {
        this.vending = vending;
    }

    @Override
    public List<HotBeverage> getVendingMachine() {
        return vending;
    }

    @Override
    public String toString() {
        return "Товары в автомате горячих напитков: " + vending;
    }
}
