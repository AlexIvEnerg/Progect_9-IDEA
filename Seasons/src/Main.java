public class Main {
    public static void main(String[] args) {
        Seasons[] seasons = Seasons.values();
        for (Seasons s : seasons) {
            favoriteSeason(s);
            System.out.println(s.getMean_temp());
            s.getDescription(s);
        }
    }

    public static void favoriteSeason(Seasons seas) {
        switch (seas) {
            case WINTER:
                System.out.println("I like Winter");
                break;
            case SPRING:
                System.out.println("I like Spring");
                break;
            case SUMMER:
                System.out.println("I like Summer");
                break;
            case AUTUMN:
                System.out.println("I like Autumn");
                break;
            default:
                System.out.println("Season wasn't selected");
        }
    }
}