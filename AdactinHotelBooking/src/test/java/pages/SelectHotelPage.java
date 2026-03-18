package pages;

import org.openqa.selenium.By;
import base.BaseTest;

public class SelectHotelPage extends BaseTest {

    By radio = By.id("radiobutton_0");
    By cont = By.id("continue");

    public void selectHotel() {
    	click(radio);
    	click(cont);
    }
}