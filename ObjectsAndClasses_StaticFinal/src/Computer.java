public class Computer {
    private final String vendor;
    private final String name;
    private Processor processor;
    private RAM ram;
    private Disk disk;
    private Display display;
    private Keyboard keyboard;
    double totalWeight = 0;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public double getTotalWeight(){
        totalWeight = (processor.getWeight()
                + ram.getWeight()
                + disk.getWeight()
                + disk.getWeight()
                + keyboard.getWeight());
        return (float) totalWeight;
    }
    // getters (а типо непонятно :D)
    public Processor getProcessor() {
        return processor;
    }

    public RAM getRam() {
        return ram;
    }

    public Disk getDisk() {
        return disk;
    }

    public Display getDisplay() {
        return display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }
    // setters
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String toString() {
        String result = "Vendor: " + vendor + "\n";
        result += "Name: " + name + "\n";
        result += "Processor: " + processor.toString() + "\n";
        result += "RAM: " + ram.toString() + "\n";
        result += "Disk: " + disk.toString() + "\n";
        result += "Display: " + display.toString() + "\n";
        result += "Keyboard: " + keyboard.toString() + "\n";
        result += "Total weight: " + (float)getTotalWeight() + " kg\n";
        return result;
    }

}
