public enum Cloth_size {
    XXS(32), XS(34), S(36), M(38), L(40);
    private final int euroSize;
    Cloth_size(int euroSize) {
        this.euroSize = euroSize;
    }
    public String getDescription(Cloth_size size) {
        if(size == XXS) return "Детский размер";
        else return "Взрослый размер";
    }
    public int getEuroSize() {
        return euroSize;
    }
}
