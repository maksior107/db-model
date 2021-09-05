package dbmodel.comms;

import dbmodel.models.UserType;

public class UserPromotion {
    private String email;
    private UserType userType;

    public UserPromotion() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
