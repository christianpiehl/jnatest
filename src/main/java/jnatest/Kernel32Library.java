package jnatest;

import com.sun.jna.Library;

public interface Kernel32Library extends Library {

	// FREQUENCY is expressed in hertz and ranges from 37 to 32767
	// DURATION is expressed in milliseconds
	public boolean Beep(int FREQUENCY, int DURATION);

	public void Sleep(int DURATION);

}
