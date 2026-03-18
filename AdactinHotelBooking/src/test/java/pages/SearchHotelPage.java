package pages;

import org.openqa.selenium.By;
import base.BaseTest;

public class SearchHotelPage extends BaseTest {

    By location = By.id("location");
    By hotel = By.id("hotels");
    By roomType =By.id("room_type");
    By numberofRooms = By.id("room_nos"); 
    By adultsperRoom  = By.id("adult_room");
    
    By submit = By.id("Submit");

    public void searchHotel() {
        selectByText(location, "Sydney");
        selectByValue(hotel, "Hotel Creek");
        selectByValue(roomType, "Deluxe");
        selectByValue(numberofRooms, "1");
        selectByValue(adultsperRoom, "2");
        click(submit);
    }
}