public class Notebook {
    protected String name;
    protected double display;
    protected String cpu;
    protected String gpu;
    protected double ram;
    protected String storageType;
    protected double storageSize;
    protected String material;
    protected String color;
    protected double price;

    public Notebook(String name, double display, String cpu, String gpu, double ram, String storageType,
                    double storageSize, String material, String color, double price) {
        this.name = name;
        this.display = display;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.storageType = storageType;
        this.storageSize = storageSize;
        this.material = material;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getDisplay() {
        return this.display;
    }

    public String getCpu() {
        return this.cpu;
    }

    public String getGpu() {
        return this.gpu;
    }

    public double getRam() {
        return this.ram;
    }

    public String getStorageType() {
        return this.storageType;
    }

    public double getStorageSize() {
        return this.storageSize;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getColor() {
        return this.color;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorageType(String storage) {
        this.storageType = storageType;
    }

    public void setStorageSize(String storage) {
        this.storageSize = storageSize;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name = '" + name + '\'' +
                ", display = " + display + "\" " +
                ", cpu = '" + cpu + '\'' +
                ", gpu = '" + gpu + '\'' +
                ", ram = " + ram + "GB " +
                ", storageType = '" + storageType + '\'' +
                ", storageSize = " + storageSize + "GB " +
                ", material = '" + material + '\'' +
                ", color = '" + color + '\'' +
                ", price = " + price + " Rub" +
                '}';
    }
}
