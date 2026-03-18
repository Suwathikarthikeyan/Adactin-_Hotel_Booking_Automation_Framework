package pages;

import org.openqa.selenium.By;
import base.BaseTest;

public class BookingConfirmPage extends BaseTest {

    By orderNo = By.id("order_no");

    public void printOrderId() {
        String order = getAttribute(orderNo, "value");
        System.out.println(" Adactin Booking Confirmation");
        System.out.println(" Your Booking ID: " + order);

    }
}