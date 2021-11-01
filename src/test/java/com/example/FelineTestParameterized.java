package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTestParameterized {

    Feline feline = new Feline();
    private final int kittensCount;
    private final int checkKittensCount;

    public FelineTestParameterized(int kittensCount, int checkKittensCount) {
        this.kittensCount = kittensCount;
        this.checkKittensCount = checkKittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getCheckKittensCountData() {
        return new Object[][]{
                {2, 2},
                {1, 1},
        };
    }

    @Test
    public void getKittensShouldWorkWithParameters(){
        int actualKittensCount = feline.getKittens(kittensCount);
        assertEquals(checkKittensCount,actualKittensCount);
    }
}
