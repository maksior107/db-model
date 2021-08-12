package dbmodel.comms;

public class GetDescriptionsRequest {
    private String animalId;

    public GetDescriptionsRequest(String animalId) {
        this.animalId = animalId;
    }

    public String getAnimalId() {
        return animalId;
    }

    public void setAnimalId(String animalId) {
        this.animalId = animalId;
    }
}
