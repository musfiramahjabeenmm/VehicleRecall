package Services;

import Models.*;
import Repository.*;
import Exception.DataNotFoundException;

import java.util.List;

public class RecallService {

    private ManufacturerRepository mRepo = new ManufacturerRepository();
    private VehiclesRepository vRepo = new VehiclesRepository();
    private RecallRepository rRepo = new RecallRepository();

    public void addManufacturer(int id, String name, String location, String contact) {
        mRepo.save(new Manufacturer(id, name, location, contact));
    }


    public void addVehicle(int id, String model, int year, int manufacturerId) {
        if (mRepo.findById(manufacturerId) == null) {
            throw new DataNotFoundException("Manufacturer not found");
        }
        vRepo.save(new Vehicles(id, model, year, manufacturerId));
    }


    public void addRecall(int id, int vehicleId, String component,
                          String description, String risk, String remedy) {

        if (vRepo.findById(vehicleId) == null) {
            throw new DataNotFoundException("Vehicle not found");
        }
        rRepo.save(new Recall(id, vehicleId, component, description, risk, remedy));
    }
    public void getRecallsByManufacturer(int manufacturerId) {

        List<Vehicles> vehicles = vRepo.findByManufacturerId(manufacturerId);

        if (vehicles.isEmpty()) {
            throw new DataNotFoundException("No vehicles found for this manufacturer");
        }

        for (Vehicles v : vehicles) {
            List<Recall> recalls = rRepo.findByVehicleId(v.getVehicleId());

            for (Recall r : recalls) {
                System.out.println(v.getModel() + " -> " + r);
            }
        }
    }
}