package mishka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isEmptyTests {

    //Проверка, что isEmpty работает в пустом списке
    @Test
    public void testIsEmptyInEmptyList(){
        NewLinkedList<Integer> list = new NewLinkedList<>();

        assertTrue(list.isEmpty());
    }

    //Проверка, что isEmpty работает в непустом списке из одного элемента
    @Test
    public void testIsEmptyInLonelyList(){
        NewLinkedList<Integer> list = new NewLinkedList<>(1);

        assertFalse(list.isEmpty());
    }

    //Проверка, что isEmpty работает в непустом списке из нескольких элементов
    @Test
    public void testIsEmptyInNotLonelyList(){
        Integer[] i = {1,2,3,4,5};
        NewLinkedList<Integer> list = new NewLinkedList<>(i);

        assertFalse(list.isEmpty());
    }

    //Проверка, что isEmpty работает после удаления всех элементов
    @Test
    public void testIsEmptyAfterRemovingAllElements() {
        Integer[] i = {1,2,3,4,5};
        NewLinkedList<Integer> list = new NewLinkedList<>(i);

        list.clear();

        assertTrue(list.isEmpty());
    }

}