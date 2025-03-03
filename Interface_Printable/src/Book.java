public class Book implements Printable {
    @Override
    public void print() { System.out.println("Книжная типография");}
    public static void printBooks(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Book) System.out.println("Книга");
        }
    }

}
