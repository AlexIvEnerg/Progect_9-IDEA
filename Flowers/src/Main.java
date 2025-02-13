public class Main {
    public static void main(String[] args) {
        Flowers[] bouquet1 = new Flowers[7];
        Flowers[] bouquet2 = new Flowers[9];
        Flowers[] bouquet3 = new Flowers[11];
        for (int n=0; n<bouquet1.length; n++) {
            if (n<4) bouquet1[n] = new Roses();
            else bouquet1[n]=new Tulips();
        }
        int price_bouquet1 = (Roses.count * bouquet1[0].value)+(Tulips.count * bouquet1[6].value);
        int vol_bouquet1 = Roses.count + Tulips.count;
        Roses.count = Tulips.count=0;
        System.out.println("Стоимость 1-го букета: "+ price_bouquet1+ ", в букете "+vol_bouquet1+" цветов");
        System.out.println();
        for (int n=0; n<bouquet2.length; n++) {
            if (n<3)  bouquet2[n]= new Carnations();
            else if (n<6)  bouquet2[n]= new Chrysanthemum();
            else bouquet2[n]= new Roses();
        }
        int price_bouquet2 = (Carnations.count * bouquet2[0].value)+(Chrysanthemum.count*bouquet2[3].value) +
                (Roses.count * bouquet2[6].value);
        int vol_bouquet2 = Carnations.count + Chrysanthemum.count + Roses.count;
        Carnations.count = Chrysanthemum.count = Roses.count = 0;
        System.out.println("Стоимость 2-го букета: "+price_bouquet2+", в букете "+vol_bouquet2+" цветов");
        System.out.println();
        for (int n=0; n< bouquet3.length; n++) {
            if (n<5) bouquet3[n]= new Carnations();
            else if (n<8) bouquet3[n]= new Roses();
            else bouquet3[n]= new Tulips();
        }
        int price_bouquet3 = (Carnations.count * bouquet3[0].value)+(Roses.count*bouquet3[6].value) +
                (Tulips.count*bouquet3[10].value) ;
        int vol_bouquet3 = Carnations.count + Roses.count + Tulips.count;
        System.out.println("Стоимость 3-го букета: "+price_bouquet3+", в букете " +vol_bouquet3+" цветов");

    }
}
