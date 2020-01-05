package pvt.java.valentin;

import pvt.java.valentin.homeaccount.Adder;
import pvt.java.valentin.homeaccount.Printer;
import pvt.java.valentin.homeaccount.Sorter;

import java.util.LinkedList;

public class Launch {
    public static void main(String[] args) {
        LinkedList<ElectricalDevice> listOfDevicesInHome = Adder.addDeviceInHome();
        Printer.printAllDevicesInHome(listOfDevicesInHome);
        Sorter.sortBySwitchOn(listOfDevicesInHome);
        Sorter.sortByPowerConsumption(listOfDevicesInHome);
        Sorter.sortBySeveralSpecifications(listOfDevicesInHome);
    }
}
