package Repository;
import Models.Recall;
import java.util.*;
public class RecallRepository {

    private List<Recall> recalls = new ArrayList<>();

    public void save(Recall r)
    {
        recalls.add(r);
    }

    public List<Recall> findByVehicleId(int vehicleId)
    {
        List<Recall> list = new ArrayList<>();
        for (Recall r : recalls) {
            if (r.getVehicleId() == vehicleId) {
                list.add(r);
            }
        }
        return list;
    }
}