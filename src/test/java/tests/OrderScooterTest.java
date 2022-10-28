package tests;

import models.MainPage;
import models.OrderPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class OrderScooterTest extends Basic{

    private String name;
    private String surname;
    private String address;
    private String subway;
    private String phone;
    private String comment;

    public OrderScooterTest(String name, String surname, String address, String subway, String phone, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.subway = subway;
        this.phone = phone;
        this.comment = phone;
    }

        @Parameterized.Parameters(name="name={0}, surname={1}, address={2},subway={3},phone={4}, comment={5}")
        public static Object[] dataGen(){
            return new Object[][]{
                    {"Вася","Иванов","ул Мира 1","Сокольники","89999999999","не звонить"},
                    {"Петя", "Петров","ул Ленина 2А","Лубянка","89111111111", "позвоните за 15 минут"},
            };
        }

   @Test
   public void checkOrderTopButton() {

       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       // Объект класса главной страницы
       MainPage objMainPage = new MainPage(driver);

       // Объект класса страницы заказа
       OrderPage objOrderPage = new OrderPage(driver);


       //клик по кнопке заказать
       objMainPage.clickButtonOrderTopPage();

       //Заполнить первую часть формы данными
       objOrderPage.setOrderFormPart1(name,surname,subway,address,phone);

       //Клик по кнопке далее
       objOrderPage.clickButtonNext();

       //Заполнить вторую часть формы данными
       objOrderPage.setOrderFormPart2(comment);

       //Клик по кнопке заказать
       objOrderPage.clickButtonOrder();

       //Клик по кнопке Да
       objOrderPage.clickButtonYes();

       assertEquals("Заказ не оформлен", "Заказ оформлен", objOrderPage.getTextHeaderWindow());

   }

}
//доделать проверку зоголовка
//добавить проверку для второй кнопки заказать
