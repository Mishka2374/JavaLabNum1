package mishka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class searchTests {

    //Проверка, что метод search выводит null в пустом списке.
    @Test
    public void testSearchInEmptyList(){
        NewLinkedList<Integer> list = new NewLinkedList<>();

        assertEquals(null,list.search(0));
    }

    //Проверка, что метод search выводит null в очищенном списке.
    @Test
    public void testCheckInClearList(){
        Integer[] i = {1,2,3,4};
        NewLinkedList<Integer> list = new NewLinkedList<>(i);
        list.clear();

        assertEquals(null,list.search(1));
    }

    //Проверка, что метод search находит необходимый элемент в списке из одного элемента.
    @Test
    public void testCheckInLonelyList(){
        NewLinkedList<Integer> list = new NewLinkedList<>(1);

        assertEquals(1,list.search(0));
        assertFalse(list.isEmpty());
    }

    //Проверка, что метод search находит необходимый элемент в списке из нескольких элементов.
    @Test
    public void testCheckInNotLonelyList() {
        Integer[] i = {1,2,3,4,5};
        NewLinkedList<Integer> list = new NewLinkedList<>(i);

        assertEquals(4,list.search(3));
    }

    //Проверка на ошибку о нарушении границ списка при поиске данных в списке
    @Test
    void testSearchOutOfBoundsException() {
        Integer[] i = {1,2,3,4,5};
        NewLinkedList<Integer> list = new NewLinkedList<>(i);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.search(5);
        });
    }

}