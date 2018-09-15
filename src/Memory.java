public class Memory {
    public String model;
    public double clock;
    public int quantity;

    Memory(String model, double clock, int quantity){
        this.model = model;
        this.clock = clock;
        this.quantity = quantity;
    }
    Memory(){
        model="";
        clock=0.0;
        quantity=0;
    }
}
