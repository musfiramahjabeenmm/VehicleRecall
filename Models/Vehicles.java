package Models;

public class Vehicles
{
    private final int vehicleId;
    private final String model;
    private final int year;
    private final int manufacturerId;

    public Vehicles(int vehicleId, String model, int year, int manufacturerId)
    {
        this.vehicleId = vehicleId;
        this.model = model;
        this.year = year;
        this.manufacturerId = manufacturerId;
    }

    public int getVehicleId()
    {
        return vehicleId;
    }
    public String getModel()
    {
        return model;
    }
    public int getYear()
    {
        return year;
    }
    public int getManufacturerId()
    {
        return manufacturerId;
    }
}

