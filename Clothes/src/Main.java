public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new T_shirt(); clothes[1] = new Trousers();
        clothes[2] = new Skirt(); clothes[3] = new Tie();

        Atelier.dress_a_woman(clothes);
        Atelier.dress_a_man(clothes);
    }
}