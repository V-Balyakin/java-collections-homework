package pvt.java.valentin.livingroom;

import pvt.java.valentin.ElectricalDevice;

public class Computer extends ElectricalDevice {
    public Computer(String name, int powerConsumption, boolean networkConnection, int monthlyUse, int ageOfDeviceInMonths, int priceInDollars, String placeOfUSe) {
        super(name, powerConsumption, networkConnection, monthlyUse, ageOfDeviceInMonths, priceInDollars, placeOfUSe);
    }
}
