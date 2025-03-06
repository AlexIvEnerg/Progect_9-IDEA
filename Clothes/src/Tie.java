public class Tie extends Clothes implements Man_clothes{
    @Override
    public void dress_a_man() {
        value = 120; color ="Silvery";
        System.out.println("Varieties of tie sizes: 1, 2, 3 " +", "+ value+ ", "+ color);
    }
}
