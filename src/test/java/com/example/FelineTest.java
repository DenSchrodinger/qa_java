package com.example;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void getKittensShouldBeOne() {
        int actualCountOfKittens = feline.getKittens();
        assertEquals(1, actualCountOfKittens);
    }

    @Test
    public void eatMeatShouldBePredator() throws Exception {
        List<String> actualMeat = feline.eatMeat();
        assertEquals(feline.getFood("Хищник"), actualMeat);
    }

    @Test
    public void getFamilyTestShouldBeFeline() {
        String actualFamily = feline.getFamily();
        assertEquals("Кошачьи", actualFamily);
    }
}