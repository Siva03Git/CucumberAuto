Feature: FB Login page validation
Scenario: FB login with one user
Given User redirected to fb login page with url "https://www.facebook.com/"
When User enters username "hsadhv" and password "sd55fsfsf"
And Click on login button
Then verify login error "The Email address or mobile number you entered isn't connected to an account. Find your account and log in."
And Close the browser session