package com.pb.ivanov.hw5;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();

        book1.setName("Красное и черное");
        book1.setAuthor("Стендаль");
        book1.setDate(1830);

        book2.setName("Старик и море");
        book2.setAuthor("Эрнест Хемингуэй");
        book2.setDate(1952);

        book3.setName("Три товарища");
        book3.setAuthor("Эрих Мария Ремарк");
        book3.setDate(1936);

        reader1.setName("Иванов И.И.");
        reader1.setPassNum(222);
        reader1.setFaculty("Юридический");
        reader1.setBithDate("01.01.1901");
        reader1.setPhone("0971234567");

        reader2.setName("Петров П.П.");
        reader2.setPassNum(333);
        reader2.setFaculty("Филологический");
        reader2.setBithDate("02.02.1902");
        reader2.setPhone("0631234567");

        reader3.setName("Сидоров С.С.");
        reader3.setPassNum(444);
        reader3.setFaculty("Физико-Математический");
        reader3.setBithDate("03.03.1903");
        reader3.setPhone("0501234567");

        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());

        System.out.println(reader1.getInfo());
        System.out.println(reader2.getInfo());
        System.out.println(reader3.getInfo());

//        - takeBook, который будет принимать количество взятых книг.
//        Выводит на консоль сообщение
//        "Петров В. В. взял 3 книги".
        reader1.takeBook(2);

//- takeBook, который будет принимать переменное количество названий книг.
//Выводит на консоль сообщение
//"Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
        reader2.takeBook(book1.getName(), book2.getName());
//
//- takeBook, который будет принимать переменное количество объектов класса Book.
//Выводит на консоль сообщение
//"Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.),
// Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
        reader2.takeBook(book1, book2, book3);

//Должно быть 3 метода returnBook() которые выводит на консоль сообщения:
//- "Петров В. В. вернул 3 книги"
        reader1.returnBook(2);
//- "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
        reader2.returnBook(book1.getName(), book2.getName());
//- "Петров В. В. вернул книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".



    }
}
