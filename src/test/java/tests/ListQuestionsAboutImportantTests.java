package tests;

import models.MainPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class ListQuestionsAboutImportantTests extends Basic  {

    @Test
    public void checkAnswerOnQuestionsAboutImportant(){

        // Объект класса главной страницы
        MainPage objMainPage = new MainPage(driver);

        //скролл до списка вопросов
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", objMainPage.getListQuestions());


        //objMainPage.clickQuestion(0);
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", objMainPage.getTextAnswer(0));

      //  objMainPage.clickQuestion(1);
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", objMainPage.getTextAnswer(1));


      /*  //клик по вопросу
        objMainPage.clickQuestion1();
        // проверка текста ответа
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", objMainPage.getTextAnswer1());


        //клик по вопросу
        objMainPage.clickQuestion2();
        // проверка текста ответа
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", objMainPage.getTextAnswer2());*/


       // assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", objMainPage.getTextAnswer());

    }
}
