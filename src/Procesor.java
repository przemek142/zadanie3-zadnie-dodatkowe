public class Procesor {
    public String procucer, model;
    public double clock;

    Procesor(String procucer, String model, double clock){
        this.procucer = procucer;
        this.model = model;
        this.clock = clock;
    }

    Procesor(){
        procucer="";
        model="";
        clock=0.0;
     }
}
