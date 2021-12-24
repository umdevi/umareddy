Feature: Flyaway

@check
Scenario: Registering a user
Given the user click on the login button
And he clicks on the not a member
And he entered the valid details
And he clicks on the submit button
Then the user registered succesfully




@check
Scenario: booking

Given  the user clicks on the login page
And he enters the details
And he clicks on the login button
And he clicks on the home button
And the user select the source location
And he selects destination
And he clicks on the submit button
And he clicks on the book Flight
And he clicks on the confirm bookings
And he see his bookings
Then the user login searching and booking verified succesfully


