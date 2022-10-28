package tests;

import models.MainPage;
import models.OrderPage;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.*;

@RunWith(Parameterized.class)
public class OrderScooterTest extends Basic{

    private String name;
    private String surname;
    private String address;
    private String phone;
    private String comment;

    public OrderScooterTest(String name, String surname, String address, String phone, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.comment = comment;
    }

        @Parameterized.Parameters(name="name={0}, surname={1}, address={2},phone={3}, comment={4}")
        public static Object[] dataGen(){
            return new Object[][]{
                    {"Вася","Иванов","ул Мира 1","89999999999","не звонить"},
                    {"Петя", "Петров","ул Ленина 2А","89111111111", "позвоните за 15 минут"},
            };
        }

   @Test
   public void checkOrderTopButton() {


       // Объект класса главной страницы
       MainPage objMainPage = new MainPage(driver);


       // Объект класса страницы заказа
       OrderPage objOrderPage = new OrderPage(driver);
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


       //клик по кнопке заказать
       objMainPage.clickButtonOrderTopPage();

       //Заполнить первую часть формы данными
       objOrderPage.setOrderFormPart1(name,surname,address,phone);

       //Клик по кнопке далее
       objOrderPage.clickButtonNext();

       //Заполнить вторую часть формы данными
       objOrderPage.setOrderFormPart2(comment);

       //Клик по кнопке заказать
       objOrderPage.clickButtonOrder();

       //Клик по кнопке Да
       objOrderPage.clickButtonYes();

       MatcherAssert.assertThat(objOrderPage.getTextHeaderWindow(), allOf(startsWith("Заказ оформлен"),containsString("Номер заказа")));
   }

    @Test
    public void checkOrderMiddleButton() {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Объект класса главной страницы
        MainPage objMainPage = new MainPage(driver);

        // Объект класса страницы заказа
        OrderPage objOrderPage = new OrderPage(driver);


        //клик по кнопке заказать
        objMainPage.clickButtonOrderMiddlePage();

        //Заполнить первую часть формы данными
        objOrderPage.setOrderFormPart1(name,surname,address,phone);

        //Клик по кнопке далее
        objOrderPage.clickButtonNext();

        //Заполнить вторую часть формы данными
        objOrderPage.setOrderFormPart2(comment);

        //Клик по кнопке заказать
        objOrderPage.clickButtonOrder();

        //Клик по кнопке Да
        objOrderPage.clickButtonYes();

        MatcherAssert.assertThat(objOrderPage.getTextHeaderWindow(), allOf(startsWith("Заказ оформлен"),containsString("Номер заказа")));
    }
}

