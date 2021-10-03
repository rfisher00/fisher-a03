package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void passwordValidator() {
        Assertions.assertEquals(1, Solution25.passwordValidator("12345"));
        Assertions.assertEquals(2, Solution25.passwordValidator("abcde"));
        Assertions.assertEquals(0, Solution25.passwordValidator("123de"));
        Assertions.assertEquals(3, Solution25.passwordValidator("123defghijk"));
        Assertions.assertEquals(4, Solution25.passwordValidator("123def@test!"));
    }
}