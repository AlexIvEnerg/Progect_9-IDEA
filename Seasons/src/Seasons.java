public enum Seasons {
    WINTER(-5), SPRING(10), SUMMER(25), AUTUMN(10);
    private final int mean_temp;
    Seasons(int mean_temp) {
        this.mean_temp=mean_temp;
    }
    public int getMean_temp() { return mean_temp; }
    public void getDescription(Seasons seasons) {
        if (seasons == SUMMER) System.out.println("Теплое время года");
        else System.out.println("Холодное время года");
    }
}
