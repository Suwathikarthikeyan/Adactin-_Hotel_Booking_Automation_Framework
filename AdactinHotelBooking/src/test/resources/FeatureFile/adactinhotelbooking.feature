Feature: Booking Flow 
 
Scenario: End to End Booking
  Given user logs in
  When user completes booking
  Then order id is generated