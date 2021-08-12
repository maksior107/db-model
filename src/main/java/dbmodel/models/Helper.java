package dbmodel.models;

import java.util.List;
import java.util.Objects;

public class Helper {
    public String id;
    public String name;
    public String email;
    public List<String> currentCodes;

    public Helper() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getCurrentCodes() {
        return currentCodes;
    }

    public void setCurrentCodes(List<String> currentCodes) {
        this.currentCodes = currentCodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Helper helper = (Helper) o;
        return Objects.equals(getName(), helper.getName()) && Objects
                .equals(getEmail(), helper.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmail());
    }
}
