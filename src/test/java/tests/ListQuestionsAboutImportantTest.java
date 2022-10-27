package tests;

import models.MainPage;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static constants.Answer.TEXT_ANSWER;
import static org.junit.Assert.assertEquals;

public class ListQuestionsAboutImportantTest extends Basic {

    @Test
    public void checkAnswerOnQuestionsAboutImportant() {

        // Объект класса главной страницы
        MainPage objMainPage = new MainPage(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Цикл по массиву с ожидаемыми ответами
        for (int i = 0; i < TEXT_ANSWER.length; i++) {
            //сравнение ответов на вопросы о важном
            assertEquals("Проверьте текст " + (i + 1) + " ответа", TEXT_ANSWER[i], objMainPage.getTextAnswer(i));
        }
    }
}
