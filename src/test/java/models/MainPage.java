package models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MainPage {

    private WebDriver driver;

    private By listQuestions = By.className("Home_FAQ__3uVm4");

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


    By[] questionList = {question1, question2, question3, question4, question5, question6, question7, question8};
    By[] answerList = {answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8};


    //Конструктор класса
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    //методы
    //вернуть веб элемент  со списком вопросов
    public WebElement getListQuestions() {
        return driver.findElement(listQuestions);
    }

    //Получить текст ответа
    public String getTextAnswer(int index) {
        driver.findElement(questionList[index]).click();
        return driver.findElement(answerList[index]).getText();
    }



}
