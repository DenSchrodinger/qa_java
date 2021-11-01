package com.example;
import org.junit.Test;
import org.mockito.Mock;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class LionTest {

    @Test
    public void getKittensLionWithoutArgsWorks() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        int actualLionsKittens = lion.getKittens();
        assertEquals (1, actualLionsKittens);
    }

    @Test
    public void getFoodWorks() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        List<String> actualLionsFood = lion.getFood();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, actualLionsFood);
    }

    @Mock
    Feline felineMock;

    @Test(expected = Exception.class)
    public void lionConstructorThrowsExceptionWithMessage() throws Exception {
        Lion exceptionLion = new Lion("Isn't lions sex", felineMock);
    }
}