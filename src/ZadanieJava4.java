public class ZadanieJava4 {
    public static void main(String[] args) {

        Televisor telewizor = new Televisor(false);

        telewizor.showStatus();

        telewizor.setTelevisorStatus(true);

        telewizor.showStatus();

        telewizor.setTelevisorStatus(false);

        telewizor.showStatus();


    }
}
