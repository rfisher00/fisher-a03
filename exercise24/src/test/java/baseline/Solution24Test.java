package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void main() {
        assertTrue(Solution24.isAnagram("note","tone"));
        assertFalse(Solution24.isAnagram("note","done"));
    }
}