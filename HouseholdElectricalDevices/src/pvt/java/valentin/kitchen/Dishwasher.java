package pvt.java.valentin.kitchen;

import pvt.java.valentin.ElectricalDevice;

public class Dishwasher extends ElectricalDevice {
    public Dishwasher(String name, int powerConsumption, boolean networkConnection, int monthlyUse, int ageOfDeviceInMonths, int priceInDollars, String placeOfUSe) {
        super(name, powerConsumption, networkConnection, monthlyUse, ageOfDeviceInMonths, priceInDollars, placeOfUSe);
    }
}
