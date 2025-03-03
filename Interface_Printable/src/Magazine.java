public class Magazine implements Printable {
    @Override
    public void print() { System.out.println("Типография журналов");}
    public static void printMagazines(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Magazine) System.out.println("Журнал");
        }
    }
}
