public class Skirt extends Clothes implements Woman_clothes{
    @Override
    public void dress_a_woman() {
        value = 170; color = "Orange"; cloth_size = Cloth_size.XXS;
        System.out.println(cloth_size.getDescription(Cloth_size.XXS) +" - "+ cloth_size.getEuroSize()
                + ", "+ value + ", "+ color); cloth_size = Cloth_size.XS;
        System.out.println(cloth_size.getDescription(Cloth_size.XS) +" - "+ cloth_size.getEuroSize()
                + ", "+ value + ", "+ color); cloth_size = Cloth_size.S;
        System.out.println(cloth_size.getDescription(Cloth_size.S) +" - "+ cloth_size.getEuroSize()
                + ", "+ value + ", "+ color); cloth_size = Cloth_size.M;
        System.out.println(cloth_size.getDescription(Cloth_size.M) +" - "+ cloth_size.getEuroSize()
                + ", "+ value + ", "+ color); cloth_size = Cloth_size.L;
        System.out.println(cloth_size.getDescription(Cloth_size.L) +" - "+ cloth_size.getEuroSize()
                + ", "+ value + ", "+ color);
    }
}
