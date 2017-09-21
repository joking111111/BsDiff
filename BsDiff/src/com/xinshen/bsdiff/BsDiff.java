package com.xinshen.bsdiff;

public class BsDiff {

	/**
	 * 差分
	 * 
	 * @param oldfile
	 * @param newfile
	 * @param patchfile
	 */
	public native static void diff(String oldfile, String newfile,
			String patchfile);

	static {
		// Win Eclipse下,无Eclipse的话也要像下面那样
		// System.loadLibrary("bsdiff");

		// Linux 无Eclipse
		// System.load("/root/appupdate/bsdiff.so");

		String os = System.getProperty("os.name");

		if (os.toLowerCase().startsWith("win")) {
			// windows操作系统
			System.loadLibrary("bsdiff");
		} else {
			// linux操作系统
			System.load("/root/appupdate/bsdiff.so");
		}
	}
}
