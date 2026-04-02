package Repository;
import Models.Manufacturer;
import java.util.*;

public class ManufacturerRepository
{
        private Map<Integer, Manufacturer> manufacturers = new HashMap<>();

        public void save(Manufacturer m) {
            manufacturers.put(m.getManufacturerId(), m);
        }

        public Manufacturer findById(int id) {
            return manufacturers.get(id);
        }
}

