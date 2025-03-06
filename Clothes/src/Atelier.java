public class Atelier {
    public static void dress_a_woman(Clothes[] clothes) {
        System.out.println("Woman_clothes: ");
        T_shirt t_shirt = (T_shirt)clothes[0];
        System.out.println("Футболки");
        t_shirt.dress_a_woman();
        Trousers trousers = (Trousers)clothes[1];
        System.out.println("Брюки");
        trousers.dress_a_woman();
        Skirt skirt = (Skirt)clothes[2];
        System.out.println("Юбки");
        skirt.dress_a_woman();
    }

    public static void dress_a_man(Clothes[] clothes) {
        System.out.println("Man_clothes: ");
        T_shirt t_shirt = (T_shirt)clothes[0];
        System.out.println("Футболки");
        t_shirt.dress_a_man();
        Trousers trousers = (Trousers)clothes[1];
        System.out.println("Брюки");
        trousers.dress_a_man();
        Tie ties = (Tie)clothes[3];
        System.out.println("Галстуки");
        ties.dress_a_man();
    }
}
