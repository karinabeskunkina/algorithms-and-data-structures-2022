package ru.mirea.practice.task7;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = {
            new Book("Джордж Оруэлл", "1984", 2018),
            new Book("Стивен Кинг", "Зеленая миля", 2014),
            new Book("Граф Монте-Кристо", 2017),
            new Book("Крёстный отец", 2002),
            new Book("Десять негритят", 2021),
            new Book("Унесенные ветром", 2020),
            new Book("Двенадцать стульев", 2018),
            new Book("Мартин Иден", 2021),
            new Book("Ходячий Замок", 2015),
            new Book("Дары Волхов", 2005),
        };

        Bookshelf bookshelf = new Bookshelf(books);

        System.out.println("Старейшая книга: " + bookshelf.max());
        System.out.println("Новейшая книга: " + bookshelf.min());

        bookshelf.toSort();
        System.out.println(bookshelf);
    }
}
