package com.example;
import org.junit.Test;
import java.util.List;
import org.mockito.Mock;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundShouldBeMyauWithMock() {
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();
        assertEquals ("Мяу", actualSound);
    }

    @Test
    public void getFoodShouldEatMeat() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> actualFood = cat.getFood();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, actualFood);
    }
}