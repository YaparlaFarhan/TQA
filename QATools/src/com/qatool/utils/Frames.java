package com.qatool.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames {

	public static void frame(WebDriver driver, int frame) {

		driver.switchTo().frame(frame);

	}

	public static void frame(WebDriver driver, String frame) {

		driver.switchTo().frame(frame);
	}

	public static void frame(WebDriver driver, WebElement frame) {

		driver.switchTo().frame(frame);

	}

	public static void frame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

}