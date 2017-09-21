package com.xinshen.bsdiff;

public class ConstantsLinux {

	// 路径不能包含中文
	// public static final String OLD_APK_PATH = "/root/appupdate/old.apk";
	//
	// public static final String NEW_APK_PATH = "/root/appupdate/new.apk";
	//
	// public static final String PATCH_PATH = "/root/appupdate/apk.patch";

	public static final String DIRECTORY = "D:/app/";

	public static final String old_apk = "xinshenIM_0.8.4";

	public static final String new_apk = "xinshenIM_0.8.5";

	public static final String OLD_APK_PATH = DIRECTORY + old_apk + ".apk";

	public static final String NEW_APK_PATH = DIRECTORY + new_apk + ".apk";

	public static final String PATCH_PATH = DIRECTORY + old_apk + "-" + new_apk
			+ ".patch";
}
