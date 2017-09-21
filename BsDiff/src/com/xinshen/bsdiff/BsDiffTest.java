package com.xinshen.bsdiff;

public class BsDiffTest {

	public static void main(String[] args) {
		System.out.println("开始差分");
		
		String os = System.getProperty("os.name");
		
		if (os.toLowerCase().startsWith("win")) {
			// windows操作系统
			BsDiff.diff(ConstantsWin.OLD_APK_PATH, 
					ConstantsWin.NEW_APK_PATH,
					ConstantsWin.PATCH_PATH);
		} else {
			// linux操作系统
			BsDiff.diff(ConstantsLinux.OLD_APK_PATH,
					ConstantsLinux.NEW_APK_PATH, 
					ConstantsLinux.PATCH_PATH);
		}
		
		System.out.println("完成差分");
	}
}
