package pvt.java.valentin.kitchen;

import pvt.java.valentin.ElectricalDevice;

public class Microwave extends ElectricalDevice {
    public Microwave(String name, int powerConsumption, boolean networkConnection, int monthlyUse, int ageOfDeviceInMonths, int priceInDollars, String placeOfUSe) {
        super(name, powerConsumption, networkConnection, monthlyUse, ageOfDeviceInMonths, priceInDollars, placeOfUSe);
    }
}
