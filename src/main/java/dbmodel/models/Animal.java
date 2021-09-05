package dbmodel.models;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Animal {
    private String id;
    private String name;
    private LocalDate birthDate;
    private LocalDate admissionDate;
    private LocalDate dischargeDate;
    private String sex;
    private String lastState;
    private List<String> helperCodes;
    private String photoLink;

    public Animal() {
    }

    public dbmodel.models.firestore.Animal toFirestore() {
        dbmodel.models.firestore.Animal animal = new dbmodel.models.firestore.Animal();
        animal.setId(this.getId());
        animal.setName(this.getName());
        animal.setBirthDate(convertToDate(this.getBirthDate()));
        animal.setAdmissionDate(convertToDate(this.getAdmissionDate()));
        animal.setDischargeDate(convertToDate(this.getDischargeDate()));
        animal.setSex(this.getSex());
        animal.setLastState(this.getLastState());
        animal.setHelperCodes(this.getHelperCodes());
        animal.setPhotoLink(this.getPhotoLink());
        return animal;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public LocalDate getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(LocalDate dischargeDate) {
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

    private Date convertToDate(LocalDate dateToConvert) {
        if(dateToConvert == null) {
            return null;
        }
        return java.sql.Date.valueOf(dateToConvert);
    }
}