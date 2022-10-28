package models;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderPage {

    private WebDriver driver;

    //локаторы
    private By inputName = By.xpath(".//input[@placeholder='* Имя']");
    private By inputSurname = By.xpath(".//input[@placeholder='* Фамилия']");
    private By inputAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private By inputSubway = By.xpath(".//input[@placeholder='* Станция метро']");
    private By inputPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    private By buttonNext = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button");

    private By inputDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private By inputCountDays = By.className("Dropdown-placeholder");
    private By inputListCountDays = By.xpath(".//div[@class='Dropdown-menu']/div[text()='сутки']");
    private By inputColorScooter = By.id("black");
    private By inputComment = By.xpath(".//input[@placeholder='Комментарий для курьера']");

    private By buttonOrder = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    private By buttonYes = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Да']");

    private By headerWindow = By.className("Order_ModalHeader__3FDaJ");

    //Конструктор класса
    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    //методы
    public void setName(String name) {
        driver.findElement(inputName).sendKeys(name);
    }

    public void setSurname(String surname) {
        driver.findElement(inputSurname).sendKeys(surname);
    }

    public void setAddress(String address) {
        driver.findElement(inputAddress).sendKeys(address);
    }

    public void setSubway() {
        driver.findElement(inputSubway).sendKeys("ком",Keys.ARROW_DOWN, Keys.ENTER);
  }

    public void setPhone(String phone) {
        driver.findElement(inputPhone).sendKeys(phone);
    }

    public void setOrderFormPart1(String name, String surname,String address, String phone) {
        setName(name);
        setSurname(surname);
        setAddress(address);
        setSubway();
        setPhone(phone);
    }



    //клик по кнопке далее
    public void clickButtonNext() {
        driver.findElement(buttonNext).click();
    }

    public void setDate() {
        driver.findElement(inputDate).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    public void setCountDates() {
        driver.findElement(inputCountDays).click();
        driver.findElement(inputListCountDays).click();
    }
    public void setColorScooter() {
        driver.findElement(inputColorScooter).click();
    }

    public void setComment(String comment) {
        driver.findElement(inputComment).sendKeys(comment);
    }

    public void setOrderFormPart2(String comment){
        setDate();
        setCountDates();
        setColorScooter();
        setComment(comment);
    }

    public void clickButtonOrder() {
        driver.findElement(buttonOrder).click();
    }

    public void clickButtonYes() {
        driver.findElement(buttonYes).click();
    }


    //добработать заголовок
    public String getTextHeaderWindow() {
        return driver.findElement(headerWindow).getText();
    }
}
