package dbmodel.models;

import java.util.List;

public class User {
    private String email;
    private String hash;
    private UserType type;
    private List<String> currentCodes;

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public List<String> getCurrentCodes() {
        return currentCodes;
    }

    public void setCurrentCodes(List<String> currentCodes) {
        this.currentCodes = currentCodes;
    }
}
