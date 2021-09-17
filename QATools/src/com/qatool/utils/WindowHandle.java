package com.qatool.utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandle {

	public static void windowHandle(WebDriver driver, String title) {
		String mainwindowHandle = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> windowIterator = allWindow.iterator();
		System.out.println(mainwindowHandle);
		System.out.println(allWindow.size());
		System.out.println(allWindow);
		while (windowIterator.hasNext()) {
			String childWindow = windowIterator.next();
			if (!mainwindowHandle.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				if (driver.getTitle().equals(title))
					break;
			}
		}
	}

}
