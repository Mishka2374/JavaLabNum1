# Создание класса контейнера

---

## Задание
 
Создать класс контейнер, позволяющий хранить произвольное количество объектов.
!!!Использование встроенных коллекций запрещено!!!
Задание можно реализовать с помощью массива или связанного списка.
Контейнер должен позволять добавлять, извлекать, удалять элементы.

---
## Односвязный список: NewLinkedList

Список включает в себя несколько конструкторов и методы для работы с этим списком.

---
## Реализованные методы

- `pushBack(value)`: Добавляет элемент в конец списка.
- `push(value, index)`: Добавляет элемент по указанному индексу.
- `check(value)`: Проверяет содержание на наличие указанного элемента в списке.
- `search(index)`: Возвращает элемент по указанному индексу.
- `remove(index)`: Удаляет элемент по указанному индексу.
- `isEmpty()`: Проверяет список на пустоту.
- `size()`: Возвращает размерность списка.
- `clear()`: Очищает список (удаляет все элементы).
- `toString()`: Перегруженный метод toString класса Object.