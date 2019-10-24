@trivago-automatizacion
Feature: Reservation hotel
  I want to reserver an hotel in the page of trivago.com


  Scenario: Enter the information on the page and validate the type of reservation what de user whant
    Given I Open the browser and go to the page
    When I enter all the information and navegate for the page
   Then I validate the information of the hotel

 
 