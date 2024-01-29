interface TVremote {
    void turnOn();
    void turnOff();
    void changeChannel(int channel);
}

interface SmartTVremote extends TVremote {
    void connectToInternet();
    void useSmartFeatures();
}

class TV implements TVremote {
    private boolean isOn;
    private int currentChannel;

    public TV() {
        this.isOn = false;
        this.currentChannel = 0;
    }

    public void turnOn() {
        if (!isOn) {
            System.out.println("Turning the TV on");
            isOn = true;
        } else {
            System.out.println("TV is already on");
        }
    }

    public void turnOff() {
        if (isOn) {
            System.out.println("Turning the TV off");
            isOn = false;
        } else {
            System.out.println("TV is already off");
        }
    }
    public void changeChannel(int channel) {
        if (isOn) {
            System.out.println("Changing channel to " + channel);
            currentChannel = channel;
        } else {
            System.out.println("Cannot change channel, TV is off");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        TV myTV = new TV();

        myTV.turnOn();
        myTV.changeChannel(5);
        myTV.turnOff();
    }
}
