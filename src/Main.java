public class Main {

    public static void main(String[] args) {

        System.out.println("Объекты и классы. Минимальный уровень");

        Author firstAndLastNameInf = new Author("Валерий", " Герасимов");
        Book infAboutTheBook1 = new Book("Делаю домашку до 5 утра", firstAndLastNameInf, 2021);
        infAboutTheBook1.setYearPublication(2022);
        System.out.println("Автор: " + firstAndLastNameInf.getName() + firstAndLastNameInf.getSurname());
        System.out.println("Название: " + infAboutTheBook1.getBookName());
        System.out.println(infAboutTheBook1.getYearPublication() + " год");
        System.out.println();

        Author firstAndLastNameInf2 = new Author("Дмитрий", " Глебов");
        Book infAboutTheBook2 = new Book("Создаю вторую книгу", firstAndLastNameInf2, 2023);
        System.out.println("Автор: " + firstAndLastNameInf2.getName() + firstAndLastNameInf2.getSurname());
        System.out.println("Название: " + infAboutTheBook2.getBookName());
        System.out.println(infAboutTheBook2.getYearPublication() + " год");
    }
}