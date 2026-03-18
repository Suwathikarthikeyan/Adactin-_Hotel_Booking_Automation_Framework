package pages;

import org.openqa.selenium.By;
import base.BaseTest;

public class BookHotelPage extends BaseTest {

    By fname = By.id("first_name");
    By lname = By.id("last_name");
    By address = By.id("address");
    By cc = By.id("cc_num");
    By cardtype =By.id("cc_type");
    By expirymonth = By.id("cc_exp_month");
    By expiryyear = By.id("cc_exp_year");
    By cvv = By.id("cc_cvv");
    By book = By.id("book_now");

    public void bookHotel() {
        type(fname, "Suwathi");
        type(lname, "Karthikeyan");
        type(address, "Chennai");
        type(cc, "4111111111111111");
        selectByValue(cardtype, "VISA");
        selectByValue(expirymonth, "11");
        selectByValue(expiryyear, "2030");      
        type(cvv, "123");
        click(book);
    }
}