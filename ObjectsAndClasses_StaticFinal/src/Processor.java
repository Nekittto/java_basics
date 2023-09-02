public class Processor {
    private final double frequency;
    private final int cores;
    private final CPUVendor brand;
    private final double weight;


    public Processor(double frequency, int cores, CPUVendor brand, double weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.brand = brand;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public CPUVendor getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }
    public String toString() {
        return "Brand: " + brand + ", Frequency: " + frequency + " GHz, Cores: " + cores + ", Weight: " + weight + " kg";
    }

}
