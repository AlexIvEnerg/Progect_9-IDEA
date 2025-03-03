public class Main {
    public static void main(String[] args) {
        Printable[] printable = new Printable[10];
        for (int n=0; n<10; n++) {
            if (n<5) printable[n] = new Book();
            else printable[n] = new Magazine();
        }
        for (Printable p : printable) {
            p.print();
        }
        Magazine.printMagazines(printable);
        Book.printBooks(printable);
    }
}