public class Disk {
    private final DiskType type;
    private final int volume;
    private final double weight;

    public Disk(DiskType type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }


    public DiskType getType() {
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
        return "Type: " + type + ", Volume: " + volume + " Gb, Weight: " + weight + " kg";
    }

}
