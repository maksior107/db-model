package dbmodel.util;

import dbmodel.models.Animal;
import dbmodel.models.Helper;

import java.util.Base64;

public class CodeGenerator {
    public static String getCode(Animal animal, Helper helper) {
        return Base64.getEncoder().encodeToString((animal.getId() + "_" + helper.getEmail()).getBytes());
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
