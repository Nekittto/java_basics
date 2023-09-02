public class RAM {
    private final RAMType type;
    private final int volume;
    private final double weight;

    public RAM(RAMType type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public RAMType getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "Type: " + type + ", Volume: " + volume + " Gb, Weight:" + weight + " kg";
    }

}
