public interface IRadio {

    void saveStation(int buttonId, double station);

    boolean isAm();

    boolean isOn();

    double SelectStation(int buttonId);

    void SwitchOnOff();

    void SwitchAmFm();

    double nextStation();

} 