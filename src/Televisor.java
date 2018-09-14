public class Televisor {

    private boolean televisorStatus;
    private String message;

    public boolean getTelevisorStatus(){
        return this.televisorStatus;
    }
    public void setTelevisorStatus(boolean televisorStatus){
        this.televisorStatus = televisorStatus;
    }

    public void turnOn() {
        setTelevisorStatus(true);
    }// włącza telewizor

    public void turnOff(){
        setTelevisorStatus(false);
    } // wyłącza telewizor

    public void showStatus(){
        if (televisorStatus)  {
            message="ON";
        } else {
            message="OFF";
        }

        System.out.printf("TV is %s\n", message);
    } //wyświetla informację, czy telewizor jest włączony, czy wyłączony

    public Televisor(boolean televisorStatus){
        this.televisorStatus=televisorStatus;
    }

}
