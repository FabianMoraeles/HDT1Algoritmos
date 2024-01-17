public class Radio implements IRadio{

    protected boolean Am, On;
    protected double station, AmStation, FmStation;
    private double[] AmButton;
    private double[] FmButton;

    
    public Radio(boolean Am, boolean On, double station, double AmStation, double FmStation, double[] AmButton, double[] FmButton){
        this.Am = true;
        this.On = false;
        this.station = 530;
        this.AmStation = 530;
        this.FmStation = 87.9;
        this.AmButton = new double[12];
        this.FmButton = new double[12];
    }

    public boolean isAm() {
        return this.Am;
    }

    public boolean getAm() {
        return this.Am;
    }

    public void setAm(boolean Am) {
        this.Am = Am;
    }

    public boolean isOn() {
        return this.On;
    }

    public boolean getOn() {
        return this.On;
    }

    public void setOn(boolean On) {
        this.On = On;
    }

   
    public double getStation() {
        return this.station;
    }

    public void setStation(double station) {
        this.station = station;
    }

    @Override
    // Método para cambiar entre Encendido y Apagado, donde si la variable "On" es verdadera se encuentra encendida y si es falsa se encuentra apagada.
    public void SwitchOnOff() {
        if (On){
            On = false;
        } else {
            On = true;
        }
    }




    
}