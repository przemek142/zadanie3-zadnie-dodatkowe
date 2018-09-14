public class Device {
    private String code;
    private String producer;
    private String type;
    private double price;
    private String info;

    public void setCode(String code) {
        this.code = code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getInfo() {
        info = "KOD: " + code + ", producent: " + producer + ", typ: " + type + ", cena: " + price;

        return info;
    }


    public Device(String code, String producer, String type) {
        this.code = code;
        this.type = type;
        this.producer = producer;

    }

    public Device(String code, String type, String producer, double price) {
        this(code, type, producer);
        this.price = price;
    }

}
