package pvt.java.valentin.bathroom;

import pvt.java.valentin.ElectricalDevice;

public class WashingMachine extends ElectricalDevice {
    public WashingMachine(String name, int powerConsumption, boolean networkConnection, int monthlyUse, int ageOfDeviceInMonths, int priceInDollars, String placeOfUSe) {
        super(name, powerConsumption, networkConnection, monthlyUse, ageOfDeviceInMonths, priceInDollars, placeOfUSe);
    }
}
