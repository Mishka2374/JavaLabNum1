package mishka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class removeTests {

    //Проверка, что remove удаляет необходимое значение
    @Test
    public void testRemoveTrueValue(){
        Integer[] i = {1,2,3,4,5};
        NewLinkedList<Integer> list = new NewLinkedList<>(i);
        int size = list.size();

        list.remove(3); //удалили значение 4

        assertFalse(list.check(4));
        assertEquals(size - 1, list.size());
    }

    //Проверка, что remove корректно удаляет первый элемент.
    @Test
    public void testRemoveFirstValue(){
        Integer[] i = {1,2,3,4,5};
        NewLinkedList<Integer> list = new NewLinkedList<>(i);
        int size = list.size();

        list.remove(0);

        assertEquals(size - 1, list.size());
        assertFalse(list.check(1));
    }

    //Проверка, что remove корректно удаляет последний элемент.
    @Test
    public void testRemoveLastValue(){
        Integer[] i = {1,2,3,4,5};
        NewLinkedList<Integer> list = new NewLinkedList<>(i);
        int size = list.size();

        list.remove(size-1);

        assertEquals(size - 1, list.size());
        assertFalse(list.check(5));
    }

    //Проверка на ошибку о нарушении границ списка при удалении данных из списка
    @Test
    void testRemoveOutOfBoundsException() {
        Integer[] i = {1,2,3,4,5};
        NewLinkedList<Integer> list = new NewLinkedList<>(i);

        list.remove(4);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(4);
        });
    }
}