package dbmodel.models.firestore;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

public class Description {
    private String id;
    private String animalId;
    private String text;
    private Date sendDate;
    private List<String> photosLinks;
    private List<String> alreadySentTo;

    public Description() {
    }

    public dbmodel.models.Description fromFirestore() {
        dbmodel.models.Description description = new dbmodel.models.Description();
        description.setId(this.getId());
        description.setAnimalId(this.getAnimalId());
        description.setText(this.getText());
        description.setSendDate(convertToLocalDate(this.getSendDate()));
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

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public List<String> getPhotosLinks() {
        return photosLinks;
    }

    public void setPhotosLinks(List<String> photosLinks) {
        this.photosLinks = photosLinks;
    }

    private static LocalDate convertToLocalDate(Date dateToConvert) {
        if(dateToConvert == null) {
            return null;
        }
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public List<String> getAlreadySentTo() {
        return alreadySentTo;
    }

    public void setAlreadySentTo(List<String> alreadySentTo) {
        this.alreadySentTo = alreadySentTo;
    }
}
