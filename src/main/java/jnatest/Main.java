package jnatest;

import com.sun.jna.Native;

public class Main {

	public static void main(String[] args) {
		testPosixLibrary();
		// testKernel32Library();
	}

	private static void testPosixLibrary() {
		PosixLibrary posix = (PosixLibrary) Native.loadLibrary("c", PosixLibrary.class);
		System.out.println(posix.getpid());
		System.out.println(posix.getppid());
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// posix.mkdir("newdir", 0777);
		// posix.rename("newdir", "renamedir");
	}

	@SuppressWarnings("unused")
	private static void testKernel32Library() {
		Kernel32Library lib = (Kernel32Library) Native.loadLibrary("kernel32", Kernel32Library.class);
		lib.Beep(698, 500);
		lib.Sleep(500);
		for (int i = 100; i < 1000; i = i + 40) {
			System.out.println(i);
			lib.Beep(i, 500);
		}
	}

}
