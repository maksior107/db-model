package dbmodel.models.firestore;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Animal {
    private String id;
    private String name;
    private Date birthDate;
    private Date admissionDate;
    private Date dischargeDate;
    private String sex;
    private String lastState;
    private String photoLink;
    private List<String> helperCodes;

    public Animal() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLastState() {
        return lastState;
    }

    public void setLastState(String lastState) {
        this.lastState = lastState;
    }

    public List<String> getHelperCodes() {
        return helperCodes;
    }

    public void setHelperCodes(List<String> helperCodes) {
        this.helperCodes = helperCodes;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Animal animal = (Animal) o;
        return getId().equals(animal.getId()) && Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }


    public dbmodel.models.Animal fromFirestore() {
        dbmodel.models.Animal animal = new dbmodel.models.Animal();
        animal.setId(this.getId());
        animal.setName(this.getName());
        animal.setBirthDate(convertToLocalDate(this.getBirthDate()));
        animal.setAdmissionDate(convertToLocalDate(this.getAdmissionDate()));
        animal.setDischargeDate(convertToLocalDate(this.getDischargeDate()));
        animal.setSex(this.getSex());
        animal.setLastState(this.getLastState());
        animal.setHelperCodes(this.getHelperCodes());
        animal.setPhotoLink(this.getPhotoLink());
        return animal;
    }

    private static LocalDate convertToLocalDate(Date dateToConvert) {
        if(dateToConvert == null) {
            return null;
        }
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
}