public class Main {
    public static void main(String[] args) {
        Apple[] apples = new Apple[5];
        Apricot[] apricots = new Apricot[6];
        Pear[] pears = new Pear[4];
        for (int n=0; n<apples.length; n++) { apples[n] = new Apple(); }
        for (int n=0; n<apricots.length; n++) { apricots[n] = new Apricot(); }
        for (int n=0; n<pears.length; n++) { pears[n] = new Pear(); }
        double sum_of_price; double apples_cost; double apricots_cost;  double pears_cost;
        apples_cost = apples[0].costFruit(0.05) + apples[1].costFruit(0.06)+
        apples[2].costFruit(0.045)+apples[3].costFruit(0.04)+apples[4].costFruit(0.055);
        apricots_cost = apricots[0].costFruit(0.025)+apricots[1].costFruit(0.02)+
        apricots[2].costFruit(0.03) + apricots[3].costFruit(0.02)+apricots[4].costFruit(0.35)+
        apricots[5].costFruit(0.015);
        pears_cost = pears[0].costFruit(0.06) +pears[1].costFruit(0.075)+
        pears[2].costFruit(0.07)+pears[3].costFruit(0.065);
        sum_of_price = pears_cost + apples_cost + apricots_cost;

        System.out.println("Общая стоимость проданных фруктов: "+sum_of_price); System.out.println();
        System.out.println("Стоимость проданных Яблок: "+apples_cost);
        System.out.println("Стоимость проданных Абрикосов: "+apricots_cost);
        System.out.println("Стоимость проданных Груш: "+pears_cost); System.out.println();
        apples[0].printManufacturerInfo();
    }
}