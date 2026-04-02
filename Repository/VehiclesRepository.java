package Repository;

import Models.Vehicles;
import java.util.*;

public class VehiclesRepository
{
        private Map<Integer, Vehicles> vehicles = new HashMap<>();

        public void save(Vehicles v)
        {
            vehicles.put(v.getVehicleId(), v);
        }

        public List<Vehicles> findByManufacturerId(int manufacturerId) {
            List<Vehicles> list = new ArrayList<>();
            for (Vehicles v : vehicles.values()) {
                if (v.getManufacturerId() == manufacturerId) {
                    list.add(v);
                }
            }
            return list;
        }

        public Vehicles findById(int id) {
            return vehicles.get(id);
        }
}


