package dbmodel.models;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Description {
    private String id;
    private String animalId;
    private String text;
    private LocalDate sendDate;
    private List<String> photosLinks;
    private List<String> alreadySentTo;

    public Description() {
    }

    public dbmodel.models.firestore.Description toFirestore() {
        dbmodel.models.firestore.Description description = new dbmodel.models.firestore.Description();
        description.setId(this.getId());
        description.setAnimalId(this.getAnimalId());
        description.setText(this.getText());
        description.setSendDate(convertToDate(this.getSendDate()));
        description.setPhotosLinks(this.getPhotosLinks());
        description.setAlreadySentTo(this.getAlreadySentTo());
        return description;
    }

    public String getAnimalId() {
        return animalId;
    }

    public void setAnimalId(String animalId) {
        this.animalId = animalId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    public List<String> getPhotosLinks() {
        return photosLinks;
    }

    public void setPhotosLinks(List<String> photosLinks) {
        this.photosLinks = photosLinks;
    }

    public List<String> getAlreadySentTo() {
        return alreadySentTo;
    }

    public void setAlreadySentTo(List<String> alreadySentTo) {
        this.alreadySentTo = alreadySentTo;
    }

    private Date convertToDate(LocalDate dateToConvert) {
        if(dateToConvert == null) {
            return null;
        }
        return java.sql.Date.valueOf(dateToConvert);
    }
}
