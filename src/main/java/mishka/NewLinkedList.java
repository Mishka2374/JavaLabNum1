package mishka;

/**
 * Класс NewLinkedList представляет собой реализацию односвязного списка
 *
 * @param <T> тип данных элементов списка, который пользователь хочет использовать в классе
 *
 * @author Mishka2374
 */
public class NewLinkedList <T> {

    /**
     * Node - класс узлов, из которых состоит список
     */
    private static class Node <T> {
        private final T data;
        private Node<T> next;

        /**
         * Конструктор с параметром
         *
         * @param data данные, которые будут храниться в узле
         */
        private Node(T data) {
            this.data = data;
            next = null;
        }

        /**
         * Перегруженный метод toString  из класса Object
         *
         * @return Возвращает строку с информацией об элементе узла
         */
        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Node<T> head;
    private int size;

    /**
     * Конструктор по умолчанию
     *
     * @example <pre>{@code
     *           NewLinkedList<Integer> list = new NewLinkedList<>();
     *      }</pre>
     * */
    public NewLinkedList() {
        head = null;
        size = 0;
    }
    /**
     * Конструктор, принимающий один параметр на вход
     *
     * @param x принимает любой тип данных
     *
     * @example <pre>{@code
     *           NewLinkedList<Integer> list = new NewLinkedList<>(5);
     *      }</pre>
     * */
    public NewLinkedList(T x){
        if (x!=null) {
            head = new Node<>(x);
            size = 1;
        } else {
            System.err.println("Неверные данные, элемент не может быть null");
            head = null;
            size = 0;
        }
    }

    /**
     * Конструктор, который позволяет преобразовывать массив в список
     *
     * @param a  массив элементов
     *
     * @example <pre>{@code
     *                  Integer []a=new Integer[]{1,2,3,4,5};
     *                  NewLinkedList<Integer> list=new NewLinkedList<>(a);
     *            }</pre>
     * */
    public NewLinkedList(T[] a){
        try{
            for(T i: a){
                pushBack(i);
            }
        }catch(NullPointerException e){
            head = null;
            size = 0;
        }

    }

    /**
     * Метод добавления элемента в конец списка (аналог add)
     *
     * @param data элемент, которые будет добавлен в узел списка
     */
    public void pushBack(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> N = head;

            while (N.next != null) {
                N = N.next;
            }
            N.next = new Node<>(data);
        }

        ++size;
    }

    /** Метод добавляет значение x на позицию index
     *
     * @param x элемент, который хотим добавить
     *
     * @param index позиция добавления
     * */
    public void push(T x, int index) {
        if (index > size - 1 || index < 0) {
            System.err.println("Неверные данные, индекс не соответствует существующим!");
        }
        else if(x == null){
            System.err.println("Неверные данные, элемент не может быть null");
        }

        Node<T> N = head;
        for (int i = 0; i < index - 1; i++) {
            N = N.next;
        }
        Node<T> next = N.next;
        Node<T> val = new Node<>(x);
        N.next = val;
        val.next = next;

        ++size;
    }

    /**
     * Метод проверяет, содержит ли список необходимый элемент
     *
     * @param x - искомый элемент
     *
     * @return true - этот элемент содержится в списке / false - элемента нет в списке
     **/
    public boolean check(T x){
        if (head != null) {
            Node<T> N = head;
            do {
                if (N.data == x) {
                    return true;
                }
                N = N.next;
            } while (N != null);
        } else return false;
        return false;
    }

    /**
     * Метод получения хранящегося в списке значения по индексу
     *
     * @param index индекс, по которому находится значение
     *
     * @return Значение найденного элемента
     *
     * @throws IndexOutOfBoundsException  выход за границы списка
     */
    public T search(int index) {
        if(head!=null) {
            if (index < 0 || index > size - 1) {
                throw new IndexOutOfBoundsException();
            }

            Node<T> N = head;
            int i = 0;
            while (i != index) {
                N = N.next;
                ++i;
            }

            return N.data;
        } return null;
    }

    /**
     * Метод удаления хранящегося в списке значения по индексу
     *
     * @param index индекс, по которому находится значение
     *
     * @throws IndexOutOfBoundsException при выходе за границы списка
     *
     */
    public void remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> currN = head;
        Node<T> prevN = null;
        int i = 0;

        while (i != index) {
            prevN = currN;
            currN = currN.next;
            ++i;
        }

        if (prevN == null) {
            head = currN.next;
        } else {
            prevN.next = currN.next;
            currN.next = null;
        }

        --size;
    }

    /**
     * Метод проверки списка на пустоту
     *
     * @return true - список пустой / false - список непустой
     */
    public boolean isEmpty() {
        return (head == null);
    }

    /**
     * Метод получения размерности списка
     * @return размер списка
     */
    public int size() {
        return size;
    }

    /**
     * Метод очистки списка
     */
    public void clear() {
        head = null;
        size = 0;
    }

    /**
     * Перегруженный метод toString класса Object
     *
     * @return возвращает строку с информацией об элементах списка
     */
    @Override
    public String toString() {
        String str = "Список:\t";
        Node<T> N = head;

        while (N != null) {
            str += N.toString();
            if (N.next != null) {
                str += " --> ";
            }
            N = N.next;
        }

        return str;
    }
}


