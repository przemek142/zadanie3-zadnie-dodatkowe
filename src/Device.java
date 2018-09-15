public class Device {
    private String code, producer, type;
    private double price;

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
               return String.format("KOD: %s, poducent: %s, typ: %s, cena: %s", code, producer, type, price);
    }

    public Device(String code, String producer, String type) {
        setCode(code);
        setProducer(producer);
        setType(type);
    }

    public Device(String code, String type, String producer, double price) {
        this(code, type, producer);
        setPrice(price);
    }
}
