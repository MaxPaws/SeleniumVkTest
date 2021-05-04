package ru.vk;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest extends WebDriverSetup {

    // Идентификация полученной страницы по заголовку
    @Test
    public void firstConnect() {
       Assert.assertEquals("Добро пожаловать | ВКонтакте",driver.getTitle());
    }

    // Проверка работы кнопки смены языка на английский на главной странице
    @Test
    public void secondLangSwitch() {
        WebElement langSwitch = driver.findElementById("top_switch_lang");
        Assert.assertTrue(langSwitch .isEnabled());
        Assert.assertTrue(langSwitch .isDisplayed());
        langSwitch .click();

        new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOf(langSwitch));

        Assert.assertEquals("Welcome! | VK",driver.getTitle());
        //Assert.assertFalse(langSwitch.isDisplayed());
    }
}
