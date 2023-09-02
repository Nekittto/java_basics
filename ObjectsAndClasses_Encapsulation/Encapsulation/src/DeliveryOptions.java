public class DeliveryOptions {
    private final Dimensions dimensions;
    private final double weight;
    private final String address;
    private final boolean isFlippable;
    private final String regNumber;
    private final boolean isFragile;
    private final double length;
    private final double width;
    private final double height;

    public DeliveryOptions(double weight, String address,
                           Dimensions dimensions, String regNumber,
                           boolean isFlippable, boolean isFragile, double length,
                           double width, double height)
    {
        this.weight = weight;
        this.address = address;
        this.regNumber = regNumber;
        this.length = length;
        this.width = width;
        this.height = height;
        this.dimensions = dimensions;
        this.isFlippable = isFlippable;
        this.isFragile = isFragile;
    }

    public double getWeight() {
        return weight;
    }
    public String getAddress() {
        return address;
    }
    public Dimensions getDimensions() {
        return dimensions;
    }
    public String getRegNumber() {
        return regNumber;
    }
    public boolean canisFragile() {
        return isFragile;
    }
    public boolean сanIsFlippable() {
        return isFlippable;
    }

    public DeliveryOptions setWeight(double weight) {
        return new DeliveryOptions(weight, address, dimensions,
                regNumber, isFlippable, isFragile, length, width, height);
    }

    public DeliveryOptions setAddress(String address) {
        return new DeliveryOptions(weight, address, dimensions,
                regNumber, isFlippable, isFragile, length, width, height);
    }

    public DeliveryOptions setDimensions(Dimensions dimensions) {
        return new DeliveryOptions(weight, address, dimensions,
                regNumber, isFlippable, isFragile, length, width, height);
    }

    public DeliveryOptions setRegistrationNumber(String registrationNumber) {
        return new DeliveryOptions(weight, address, dimensions,
                regNumber, isFlippable, isFragile, length, width, height);
    }

    public DeliveryOptions setTurnOver(boolean isFlippable) {
        return new DeliveryOptions(weight, address, dimensions,
                regNumber, isFlippable, isFragile, length, width, height);
    }

    public DeliveryOptions setFragile(boolean isFragile) {
        return new DeliveryOptions(weight, address, dimensions,
                regNumber, isFlippable, isFragile, length, width, height);
    }

    public DeliveryOptions setLength(double length){
        return new DeliveryOptions(weight, address, dimensions,
                regNumber, isFlippable, isFragile, length, width, height);}

    public DeliveryOptions setWidth(double width){
        return new DeliveryOptions(weight, address, dimensions,
                regNumber, isFlippable, isFragile, length, width, height);}

    public DeliveryOptions setHeight(double height){
        return new DeliveryOptions(weight, address, dimensions,
                regNumber, isFlippable, isFragile, length, width, height);}

    public String toString(){return "Вес: " + weight + "\n" + "Адрес: " + address + "\n" + dimensions +
            "\n" +  "Регистрационный номер: " + regNumber;}

}
