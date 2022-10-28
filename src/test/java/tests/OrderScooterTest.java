package tests;

import models.MainPage;
import models.OrderPage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderScooterTest extends Basic{


   @Test
   public void checkOrderTopButton() {

       // Объект класса главной страницы
       MainPage objMainPage = new MainPage(driver);

       // Объект класса страницы заказа
       OrderPage objOrderPage = new OrderPage(driver);

       //клик по кнопке заказать
       objMainPage.clickButtonOrderTopPage();

       //Заполнить первую часть формы данными
       objOrderPage.setOrderFormPart1("лена","масло", "мира 55","89999999999");

       //Клик по кнопке далее
       objOrderPage.clickButtonNext();

       //Заполнить вторую часть формы данными
       objOrderPage.setOrderFormPart2("1");

       //Клик по кнопке заказать
       objOrderPage.clickButtonOrder();

       //Клик по кнопке Да
       objOrderPage.clickButtonYes();

       assertEquals("Заказ не оформлен", "Заказ оформлен", objOrderPage.getTextHeaderWindow());

   }

}
//доделать проверку зоголовка
//вынести текст в переменные
//нужны ли параметризованые тесты?!
//добавить проверку для второй кнопки заказать
//добавить ожидание
//дорабоать ввод денных, чтобы он стал рандомным для всех полей