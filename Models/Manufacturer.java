package Models;

public class Manufacturer
{
    private final int manufacturerId;
    private final String name;
    private  final String location;
    private final String contact;

    public Manufacturer(int manufacturerId, String name, String location, String contact)
    {
        this.manufacturerId = manufacturerId;
        this.name = name;
        this.location = location;
        this.contact = contact;
    }

    public int getManufacturerId()
    {
        return manufacturerId;
    }
    public String getName()
    {
        return name;
    }

    public String getLocation()
    {
        return location;
    }

    public String getContact()
    {
        return contact;
    }
}
