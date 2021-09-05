package dbmodel.util;

import dbmodel.models.Animal;
import dbmodel.models.User;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CodeGeneratorTest {
    private static final String ANIMAL_ID = String.valueOf(4_623_764_932L);
    private static final String HELPER_EMAIL = "amadeus4@myon.net";
    private static final String CODE = "NDYyMzc2NDkzMl9hbWFkZXVzNEBteW9uLm5ldA==";
    private static final String BAD_CODE = "BADCODE";

    @Test
    void shouldEncode() {
        //given
        Animal animal = new Animal();
        animal.setId(ANIMAL_ID);
        User user = new User();
        user.setEmail(HELPER_EMAIL);
        //when/then
        assertThat(CodeGenerator.getCode(animal, user)).isEqualTo(CODE);
    }

    @Test
    void shouldDecodeAnimalId() {
        //given/when/then
        assertThat(CodeGenerator.getAnimalId(CODE)).isEqualTo(ANIMAL_ID);
    }

    @Test
    void shouldDecodeHelperEmail() {
        //given/when/then
        assertThat(CodeGenerator.getHelperEmail(CODE)).isEqualTo(HELPER_EMAIL);
    }

    @Test
    void shouldReturnNullDecodeHelperEmailWithBadCode() {
        //given/when/then
        assertThat(CodeGenerator.getHelperEmail(BAD_CODE)).isNull();
    }
}