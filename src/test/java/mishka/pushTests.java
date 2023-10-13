package mishka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class pushTests {

    //Проверка, что метод pushBack корректно добавляет элемент в пустой список.
    @Test
    public void testPushBackInEmptyList(){
        NewLinkedList<Integer> list = new NewLinkedList<>();

        list.pushBack(1);

        assertEquals(1,list.size());
        assertTrue(list.check(1));
        assertFalse(list.isEmpty());
    }

    //Проверка, что метод pushBack корректно добавляет элемент в непустой список.
    @Test
    public void testPushBackInNotEmptyList(){
        Integer [] a = {1,2,3,4,5,6,7};
        NewLinkedList<Integer> list = new NewLinkedList<>(a);

        int size = list.size();

        list.pushBack(8);

        assertEquals(size + 1, list.size());
        assertTrue(list.check(8));
        assertFalse(list.isEmpty());
        assertEquals(3, list.search(2));
    }

    //Проверка, что метод push корректно добавляет элемент в список существующих элементов после заданного индекса
    @Test
    public void testPushBackWithIndexInNotEmptyList(){
        Integer [] a = {1,2,3,4,5,6,7};
        NewLinkedList<Integer> list = new NewLinkedList<>(a);

        int size = list.size();

        list.push(8,3);

        assertEquals(size + 1, list.size());
        assertTrue(list.check(8));
        assertFalse(list.isEmpty());
    }

}