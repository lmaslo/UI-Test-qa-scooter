package tests;

import models.MainPage;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static constants.Answer.TEXT_ANSWER;
import static org.junit.Assert.assertEquals;

public class ListQuestionsAboutImportantTest extends Basic {

    int questionNumber;

    @Test
    public void checkAnswerText1() {
        // Объект класса главной страницы
        MainPage objMainPage = new MainPage(driver);
        //Ожидание элементов
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Номер вопроса
        questionNumber = 1;
        //Проверка текста ответа
        assertEquals("Проверьте текст " + questionNumber + " ответа", TEXT_ANSWER[questionNumber - 1], objMainPage.getTextAnswer(questionNumber - 1));
    }

    @Test
    public void checkAnswerText2() {
        // Объект класса главной страницы
        MainPage objMainPage = new MainPage(driver);
        //Ожидание элементов
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Номер вопроса
        questionNumber = 2;
        //Проверка текста ответа
        assertEquals("Проверьте текст " + questionNumber + " ответа", TEXT_ANSWER[questionNumber - 1], objMainPage.getTextAnswer(questionNumber - 1));
    }

    @Test
    public void checkAnswerText3() {
        // Объект класса главной страницы
        MainPage objMainPage = new MainPage(driver);
        //Ожидание элементов
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Номер вопроса
        questionNumber = 3;
        //Проверка текста ответа
        assertEquals("Проверьте текст " + questionNumber + " ответа", TEXT_ANSWER[questionNumber - 1], objMainPage.getTextAnswer(questionNumber - 1));
    }

    @Test
    public void checkAnswerText4() {
        // Объект класса главной страницы
        MainPage objMainPage = new MainPage(driver);
        //Ожидание элементов
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Номер вопроса
        questionNumber = 4;
        //Проверка текста ответа
        assertEquals("Проверьте текст " + questionNumber + " ответа", TEXT_ANSWER[questionNumber - 1], objMainPage.getTextAnswer(questionNumber - 1));
    }

    @Test
    public void checkAnswerText5() {
        // Объект класса главной страницы
        MainPage objMainPage = new MainPage(driver);
        //Ожидание элементов
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Номер вопроса
        questionNumber = 5;
        //Проверка текста ответа
        assertEquals("Проверьте текст " + questionNumber + " ответа", TEXT_ANSWER[questionNumber - 1], objMainPage.getTextAnswer(questionNumber - 1));
    }

    @Test
    public void checkAnswerText6() {
        // Объект класса главной страницы
        MainPage objMainPage = new MainPage(driver);
        //Ожидание элементов
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Номер вопроса
        questionNumber = 6;
        //Проверка текста ответа
        assertEquals("Проверьте текст " + questionNumber + " ответа", TEXT_ANSWER[questionNumber - 1], objMainPage.getTextAnswer(questionNumber - 1));
    }

    @Test
    public void checkAnswerText7() {
        // Объект класса главной страницы
        MainPage objMainPage = new MainPage(driver);
        //Ожидание элементов
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Номер вопроса
        questionNumber = 7;
        //Проверка текста ответа
        assertEquals("Проверьте текст " + questionNumber + " ответа", TEXT_ANSWER[questionNumber - 1], objMainPage.getTextAnswer(questionNumber - 1));
    }

    @Test
    public void checkAnswerText8() {
        // Объект класса главной страницы
        MainPage objMainPage = new MainPage(driver);
        //Ожидание элементов
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Номер вопроса
        questionNumber = 8;
        //Проверка текста ответа
        assertEquals("Проверьте текст " + questionNumber + " ответа", TEXT_ANSWER[questionNumber - 1], objMainPage.getTextAnswer(questionNumber - 1));
    }
}
