package dbmodel.util;

import dbmodel.models.Animal;
import dbmodel.models.User;

import java.util.Base64;

public class CodeGenerator {
    public static String getCode(Animal animal, User user) {
        return getCode(animal,user.getEmail());
    }

    public static String getCode(Animal animal, String email) {
        return Base64.getEncoder().encodeToString((animal.getId() + "_" + email).getBytes());
    }

    public static String getAnimalId(String code) {
        return new String(Base64.getDecoder().decode(code)).split("_")[0];
    }

    public static String getHelperEmail(String code) {
        try {
            return new String(Base64.getDecoder().decode(code)).split("_")[1];
        } catch (ArrayIndexOutOfBoundsException ignored) {

        }
        return null;
    }
}
