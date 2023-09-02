public class Keyboard {
    private final KeyboardType type;
    private final KeyboardIllumination illumination;
    private final double weight;

    public Keyboard(KeyboardType type, KeyboardIllumination illumination, double weight) {
        this.type = type;
        this.illumination = illumination;
        this.weight = weight;
    }

    public KeyboardType getType() {
        return type;
    }

    public KeyboardIllumination isIllumination() {
        return illumination;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Type: " + type + '\'' + ", Illumination: " + illumination + ", Weight:" + weight + " kg";
    }

}
