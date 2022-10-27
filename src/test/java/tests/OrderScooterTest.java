package tests;

import models.MainPage;
import models.OrderPage;
import org.junit.Test;

import static constants.Answer.TEXT_ANSWER;
import static org.junit.Assert.assertEquals;

public class OrderScooterTest extends Basic{


   @Test
   public void checkOrder() {

       // Объект класса главной страницы
       MainPage objMainPage = new MainPage(driver);

       // Объект класса главной страницы
       OrderPage objOrderPage = new OrderPage(driver);

       //клик по кнопке заказать
       objMainPage.clickButtonOrderTopPage();

       objOrderPage.setName("лена");
       objOrderPage.setSurname("фамилия");
       objOrderPage.setAddress("мира 55");

       objOrderPage.setSubway();

       objOrderPage.setPhone("89999999999");

       objOrderPage.clickButtonNext();

       objOrderPage.setDate();
       objOrderPage.setCountDates();
       objOrderPage.setColorScooter();
       objOrderPage.setComment("1");

       objOrderPage.clickButtonOrder();

       objOrderPage.clickButtonYes();

       assertEquals("Заказ не оформлен", "Заказ оформлен", objOrderPage.getTextHeaderWindow());

   }

}
