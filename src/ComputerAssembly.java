public class ComputerAssembly {

    private String porcProducer, procModel, memProducer, memModel, compName;
    private int memQuantity;
    private double memClock, procClock;


    public Computer assembly(String compName,
                    String procProducer,
                    String procModel,
                    double procClock,
                    String memProducer,
                    String memModel,
                    double memClock,
                    int memQuantity){


        Memory   mTemp = new Memory(memModel, memClock, memQuantity);
        Procesor pTemp = new Procesor(procProducer, procModel, procClock);

        Computer cTemp = new Computer(compName, mTemp, pTemp);

        return cTemp;

    }
}
