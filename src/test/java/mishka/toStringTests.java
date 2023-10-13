package mishka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class toStringTests {

    //Проверка, что метод toString работает с пустым списком
    @Test
    void testToStringInEmptyList() {
        NewLinkedList<Integer> list = new NewLinkedList<>();

        assertEquals("Список:\t", list.toString());
    }

    //Проверка, что метод toString работает с непустым списком
    @Test
    void testToStringInNotEmptyList() {
        Integer[] i = {1,2,3,4,5};
        NewLinkedList<Integer> list = new NewLinkedList<>(i);

        assertEquals("Список:\t1 --> 2 --> 3 --> 4 --> 5", list.toString());
    }

}