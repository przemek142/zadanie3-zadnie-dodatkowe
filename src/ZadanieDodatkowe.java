public class ZadanieDodatkowe {
    public static void main(String[] args) {
        Procesor tempProc1 = new Procesor("PP1", "PM1", 1.1);
        Memory tempMem1 = new Memory("MM1", 1.2, 1);
        Procesor tempProc2 = new Procesor("PP2", "PM2", 2.1);
        Memory tempMem2 = new Memory("MM2", 2.2, 2);

        Computer computerA = new Computer("PC1", tempMem1, tempProc1);
        Computer computerB = new Computer("PC2", tempMem2, tempProc2);

        System.out.println(computerA.info());
        System.out.println(computerB.info());

        Overclock overclock = new Overclock();

        overclock.decreaseCpuClock(computerA, 1.1);
        overclock.increaseCpuClock(computerB, 2.0);

//        System.out.println(computerA.info());
//        System.out.println(computerB.info());

        ComputerAssembly computerAssembly = new ComputerAssembly();

        Computer computerC = new Computer();
        computerC = computerAssembly.assembly("PC3", "PP3", "PM3", 3.1, "MP3", "MM3", 3.2,3);
        System.out.println(computerC.info());
        overclock.increaseCpuClock(computerC, 2.0);
        System.out.println(computerC.info());

    }

}
