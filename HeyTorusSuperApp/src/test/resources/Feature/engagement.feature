Feature: Engagement functionalities

Scenario: To check Engagement Functionalities

Given User is on Hey Torus Landing page
When User clicks on Profile
Then Profile name should be visible
And User Clicks on Notification
Then User should redirect to Notifications page
When User clicks on Today 
Then App should display Notification list of PresentDay
When User clicks on Last week 
Then App should display Notification list of Lastweek
When User clicks on Last month
Then App should display Notification list of Lastmonth
And User clicks on back arrow
When User clicks on TIA
Then User should redirect to Search page
