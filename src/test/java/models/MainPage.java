package models;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class MainPage {

    private WebDriver driver;

    private By question1 = By.id("accordion__heading-0");
    private By question2 = By.id("accordion__heading-1");
    private By question3 = By.id("accordion__heading-2");
    private By question4 = By.id("accordion__heading-3");
    private By question5 = By.id("accordion__heading-4");
    private By question6 = By.id("accordion__heading-5");
    private By question7 = By.id("accordion__heading-6");
    private By question8 = By.id("accordion__heading-7");

    private By answer1 = By.id("accordion__panel-0");
    private By answer2 = By.id("accordion__panel-1");
    private By answer3 = By.id("accordion__panel-2");
    private By answer4 = By.id("accordion__panel-3");
    private By answer5 = By.id("accordion__panel-4");
    private By answer6 = By.id("accordion__panel-5");
    private By answer7 = By.id("accordion__panel-6");
    private By answer8 = By.id("accordion__panel-7");

    private By buttonOrderTopPage = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    private By buttonOrderMiddlePage = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[@class='Button_Button__ra12g']");


    By[] questionList = {question1, question2, question3, question4, question5, question6, question7, question8};
    By[] answerList = {answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8};


    //Конструктор класса
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    //методы

    //вернуть локатор из списка вопросов
    public WebElement getQuestion(int index) {
        return driver.findElement(questionList[index]);
    }

    //Получить текст ответа
    public String getTextAnswer(int index) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", getQuestion(index));
        driver.findElement(questionList[index]).click();
        //добавить ожидание элемента

        return driver.findElement(answerList[index]).getText();
    }

    //клик по кнопке Заказать
    public void clickButtonOrderTopPage() {
        driver.findElement(buttonOrderTopPage).click();
    }


}
