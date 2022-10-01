package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage<T> {
  protected WebDriver driver;

  protected BasePage(WebDriver driver) {
    this.driver = driver;
  }

  public T open() {
    driver.get(getBaseUrl());
    return (T) this;
  }

  protected String getBaseUrl() {
    return "http://reestr-gis.adc.vpn/";
  }

  public WebDriver getDriver() {
    return driver;
  }


  protected void waitAndClick(By element) {
    waitForLoadVisibility(element);
    driver.findElement(element).click();
  }

  protected void waitForLoadVisibility (By element) {
    new WebDriverWait(driver, Duration.ofSeconds(2))
        .until(ExpectedConditions.visibilityOfElementLocated(element));
  }
}
