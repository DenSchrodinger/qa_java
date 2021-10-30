package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestParameterized {
    private final String checkSex;
    private final boolean expectHasMane;

    public LionTestParameterized(String checkSex, boolean expectHasMane) {
        this.checkSex = checkSex;
        this.expectHasMane = expectHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getSexHasManeData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void shouldBeLionsSomeGender() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(checkSex, feline);
        boolean actualMane = lion.doesHaveMane();
        assertEquals(expectHasMane, actualMane);
    }
}
