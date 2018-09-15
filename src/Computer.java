public class Computer {
    public String nazwa;
    public Memory memory;
    public Procesor procesor;


    public String info(){
        return String.format("Nazwa komp. : %s\n   Prod. proc: %s\n   Model proc: %s\n   Takt.proc: %.2f\n   Model pam: %s\n   Takt. pam: %.2f\n   Ilość pam: %d",
                nazwa, procesor.procucer, procesor.model, procesor.clock, memory.model, memory.clock, memory.quantity);
    }


    Computer(String nazwa, Memory memory, Procesor procesor){
        this.nazwa = nazwa;
        this.memory = memory;
        this.procesor = procesor;
    }

    Computer(){
        Memory memory2 = new Memory();
        Procesor procesor2 = new Procesor();
        String nazwa2 = "";
        nazwa = nazwa2;
        procesor = procesor2;
        memory = memory2;
    }
}
