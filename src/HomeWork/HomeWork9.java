package HomeWork;

public class HomeWork9 {

    public static void main(String[] args) {
        Author zelazny = new Author("Роджер","Желязны");
        Book amber = new Book("Хроники Амбера", zelazny, 2014);

        Author pratchett = new Author("Терри", "Пратчетт");
        Book smallGods = new Book("Мелкие боги", pratchett, 2020);

        smallGods.setPublishingYear(1990);
    }
}
