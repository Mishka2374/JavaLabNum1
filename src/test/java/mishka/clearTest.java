package mishka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class clearTest {

    //Проверка, что метод clear работает корректно с пустым списком
    @Test
    void testClearInEmptyList() {
        NewLinkedList<Integer> list = new NewLinkedList<>();
        int size = list.size();

        list.clear();

        assertEquals(size, list.size());
    }

    //Проверка, что метод clear работает корректно с непустым списком
    @Test
    void testClearInNotEmptyList() {
        Integer[] i = {1,2,3,4,5};
        NewLinkedList<Integer> list = new NewLinkedList<>(i);

        int size = list.size();

        list.clear();

        assertEquals(size - 5, list.size());
        assertEquals(0,list.size());
    }

}