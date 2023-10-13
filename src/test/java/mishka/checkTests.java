package mishka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class checkTests {

    //Проверка, что метод check не работает в пустом списке.
    @Test
    public void testCheckInEmptyList(){
        NewLinkedList<Integer> list = new NewLinkedList<>();

        assertFalse(list.check(1));
    }

    //Проверка, что метод check не работает в очищенном списке.
    @Test
    public void testCheckInClearList(){
        Integer[] i = {1,2,3,4};
        NewLinkedList<Integer> list = new NewLinkedList<>(i);
        list.clear();

        assertFalse(list.check(1));
    }

    //Проверка, что метод check находит необходимый элемент в списке из одного элемента.
    @Test
    public void testCheckInLonelyList(){
        NewLinkedList<Integer> list = new NewLinkedList<>(1);

        assertTrue(list.check(1));
    }

    //Проверка, что метод check находит необходимый элемент в списке из нескольких элементов.
    @Test
    public void testCheckInNotLonelyList() {
        Integer[] i = {1,2,3,4};
        NewLinkedList<Integer> list = new NewLinkedList<>(i);

        assertTrue(list.check(3));
    }

}