public class Overclock {

    public void increaseCpuClock(Computer computer, double offset){
        computer.procesor.clock += offset;
    }

    public void decreaseCpuClock(Computer computer, double offset){
        computer.procesor.clock -= offset;
    }


}
