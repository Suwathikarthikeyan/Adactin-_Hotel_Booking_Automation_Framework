package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BookHotelPage;
import pages.BookingConfirmPage;
import pages.LoginPage;
import pages.SearchHotelPage;
import pages.SelectHotelPage;

public class HotelSteps {
	
	LoginPage page;
	SearchHotelPage search;
    SelectHotelPage select;
    BookHotelPage book;
    BookingConfirmPage confirm;
    
	@Given("user logs in")
	public void user_logs_in() {
		 page = new LoginPage();   
	     page.login();	    
	}

	@When("user completes booking")
	public void user_completes_booking() {
		 search = new SearchHotelPage();
	        select = new SelectHotelPage();
	        book = new BookHotelPage();

	        search.searchHotel();
	        select.selectHotel();
	        book.bookHotel();
		}

	@Then("order id is generated")
	public void order_id_is_generated() {
		 confirm = new BookingConfirmPage();
	     confirm.printOrderId();
	}
}
