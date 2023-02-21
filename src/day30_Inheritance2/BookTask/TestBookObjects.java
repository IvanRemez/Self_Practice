package day30_Inheritance2.BookTask;

public class TestBookObjects {

    public static void main(String[] args) {

        EBook ebook = new EBook("Mastery","Non-fiction","Robert Greene",
                30, "800 MB",353);

        ebook.setPages(300);
        System.out.println(ebook);
        ebook.readBook();

        AudioBook audiobook = new AudioBook("Mastery","Non-fiction","Robert Greene",
                3,16,"Fred Sanders");

        audiobook.setLength(10);
        System.out.println(audiobook);

    }
}
