package Models;

public class Recall
{
    private  final int recallId;
    private final int vehicleId;
    private final String component;
    private final String description;
    private final String risk;
    private final String remedy;

    public Recall(int recallId, int vehicleId, String component, String description, String risk, String remedy)
    {
        this.recallId = recallId;
        this.vehicleId = vehicleId;
        this.component = component;
        this.description = description;
        this.risk = risk;
        this.remedy = remedy;
    }
    public int getRecallId()
    {
        return recallId;
    }
    public int getVehicleId()
    {
        return vehicleId;
    }

    @Override
    public String toString() {
        return component + " | " + description + " | Risk: " + risk + " | Remedy: " + remedy;
    }
}
