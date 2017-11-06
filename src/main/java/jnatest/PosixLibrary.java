package jnatest;

import com.sun.jna.Library;

public interface PosixLibrary extends Library {
	public int chmod(String filename, int mode);

	public int chown(String filename, int user, int group);

	public int rename(String oldpath, String newpath);

	public int kill(int pid, int signal);

	public int link(String oldpath, String newpath);

	public int mkdir(String path, int mode);

	public int rmdir(String path);

	public int getpid();

	public int getppid();

}
