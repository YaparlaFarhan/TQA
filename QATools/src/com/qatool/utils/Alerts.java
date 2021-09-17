package com.qatool.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	private static WebDriverWait wait;

	public static void accept(WebDriver driver) {
		wait = new WebDriverWait(driver, 2000);
		Alerts.wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}

	public static void dismiss(WebDriver driver) {
		wait = new WebDriverWait(driver, 2000);
		Alerts.wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();
	}

	public static void accept(WebDriver driver, int time) {
		wait = new WebDriverWait(driver, time);
		Alerts.wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}

	public static String alertText(WebDriver driver) {
		wait = new WebDriverWait(driver, 2000);
		Alerts.wait.until(ExpectedConditions.alertIsPresent());
		String alertTitle = driver.switchTo().alert().getText();
		return alertTitle;
	}

	public static void enterAlertText(WebDriver driver, String data) {
		wait = new WebDriverWait(driver, 2000);
		Alerts.wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().sendKeys(data);

	}

}