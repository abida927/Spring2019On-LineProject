package replClass;

public class TV {

	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	String brand = "undefined";

	public TV() {
		System.out.println("Creating TV object using no Args- constructor");
	}

	public TV(String brand) {
		System.out.println("Creating TV object using 1 arg - constructor");
	}

	public void setVolumeLevel(int volumeLevel) {
		if (volumeLevel >= 1 && volumeLevel <= 7) {
			this.volumeLevel = volumeLevel;
		}
		this.volumeLevel = volumeLevel;
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setChannel(int channel) {
		if (channel <= 0 && channel > 120) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
		this.channel = channel;

	}

	public int getChannel() {
		return channel;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public int channelUp(int increaseChannelBy) {

		for (int i = 0; i <= increaseChannelBy; i++) {
			channel += i;
		}

		return channel;
	}

	public int channelDown(int decreaseChannelBy) {

		for (int i = 0; i <= decreaseChannelBy; i++) {
			channel -= i;
		}
		return channel;
	}

	public int volumeUp(int increaseVolumelBy) {

		if (!on) {
			for (int i = 0; i <= increaseVolumelBy; i++) {
				volumeLevel += i;
			}
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
		return volumeLevel;
	}

	public int volumeDown(int decreaseVolumelBy) {

		for (int i = 0; i <= decreaseVolumelBy; i++) {
			volumeLevel -= i;
		}
		return volumeLevel;

	}

	public void isOn() {

	}

	public void turnOn() {
		if (!on) {
			System.out.println("TV is already ON");
		}
	}

	public void turnOff() {
		if (on) {
			System.out.println("TV is already OFF");
		}
	}

}