Feature: Verifying adactin details

  Scenario Outline: Verifying login details with invalid credentials
    Given User is on thehut page
    When User enters in "<search>"
    And User should click the search
    And User should select the  "<location>","<hotels>","<roomType>","<numberOfRooms>"
    
    And User should enter the check in   "<checkInDate>","<checkOutDate>"
    And User should select the room  "<adultsPerRoom>", "<childrenPerRoom>"
    And User should click the search
       And User should select the hotel name
       And User should click continue
    And User should enter the name  "<firstName>","<lastName>","<billingAddress>","<creditCardNo>"
      And User should select the cc "<creditCardType>","<expiryMonth>","<expiryYear>"
        And User should enter the ccv "<cvvNumber>"
        And User should click the book buton
        Then User should generate the order id