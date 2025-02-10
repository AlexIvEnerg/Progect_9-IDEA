public class Flowers {
    String prod_count ;
    int shelf_life ;  // in days
    int value; // цены
    String color ;
    // static int price ;
    public Flowers(String reg, int days, int cost) {
        this.prod_count = reg;
        this.shelf_life = days;
        this.value = cost;
    }
}


