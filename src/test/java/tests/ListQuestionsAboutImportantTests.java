package tests;

import models.MainPage;
import org.junit.Test;

import static constants.Answer.TEXT_ANSWER;
import static org.junit.Assert.assertEquals;

public class ListQuestionsAboutImportantTests extends Basic {

    @Test
    public void checkAnswerOnQuestionsAboutImportant() {

        // Объект класса главной страницы
        MainPage objMainPage = new MainPage(driver);

        //Цикл по массиву с ожидаемыми ответами
        for (int i = 0; i < TEXT_ANSWER.length; i++) {
            //сравнение ответов на вопросы о важном
            assertEquals("Проверьте текст " + (i + 1) + " ответа", TEXT_ANSWER[i], objMainPage.getTextAnswer(i));
        }
    }
}
