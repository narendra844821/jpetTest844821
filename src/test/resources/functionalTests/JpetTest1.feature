@JpetStore
Feature:JpetStore
@TS_01
Scenario:Login in the JpetStore
Given the user should launch the application
When the user open the 	Home Page
Then enter username and password
Then click signout
@TS_02
Scenario: Invalid Login 
Given the user sholud launch the application 2nd time
When the user gets Home Page
Then user enter invalid username and password
Then check if the error messge is displayed
@TS_03
Scenario: Valid Login
Given the user should launch the applicatiob 3rd time
When the user enter valid username and password
Then check the first name
  
@TS_04
Scenario Outline:Search box testing
Given the user should launch browser
When the user Search for the <Requirement>
Then check if the golden retriever is displayed

Examples:
|Requirement|
|Golden|
|Goldfish|

@TS_05
Scenario: Add to cart
Given the user launch the application
When the user login with valid details
Then the user should click dogs
And the user should click Golden Retriever
Then the user should click addtocart

@TS_06
Scenario: Registration
Given the user one launch the application
When the user click login icon
And the user should click registernow
And fill the details
Then click the Submit button

@TS_07
Scenario: logo link check
Given the user2 launch the application
When the user2 click login icon
Then the user2 should click logo
@TS_08
Scenario: No of types in dogs link
Given the userr launch the appliation
When the userr click Dogs
Then the userr should get no of  types of dogs
@TS_09
Scenario: No of types in Cats link
Given the userr launch the appliationn
When the userr click on cats
Then the userr should get no of  types of cats
@TS_10
Scenario: No of types in Fish link 
Given the userrr launch the appliationn
When the userrr click on Fish
Then the userrr should get no of  types of Fish
@TS_11
Scenario: check the link of birdspic
Given the user have to launch browser
Then the user should click the birdspic
@TS_12
Scenario: Add to cart fish
Given the user llaunch the application
When the user llogin with valid details
Then the user should click Fish
And the user should click angelfish
Then the user should click adddtocart
 @TS_13
Scenario: No of types in Reptails link 
Given the userrr should launch the appliationn
When the userrr click on Reptails
Then the userrr should get no of  types of Reptails
@TS_14
Scenario Outline: Invalid Search box testing
Given the user should launch browsser
When the user should Search for the <Requirement1>
Then check the items sholud not display 

Examples:
|Requirement1|
|vccbcvcbc|
|cbhbchcbcj|

 @TS_15
Scenario: No of types in Birds link 
Given the user should launch the browserr
When the user click on Birds
Then the user should get no of  types of Birds
@TS_16
Scenario: Helplink test
Given the user should launch the application jpet
When the user click on help
Then  the user should able to get the link page
@TS_17
Scenario: Add to cart
Given the user launch the application jpet
When the user login with valid details in jpet
Then the user should click dogs in jpet homepage
And the user should click Golden Retriever in dogs page
Then the user should click addtocart to check out
Then the user should click proceed to checkout
Then the user should click continue
Then the user should click confirm 
@TS_18
Scenario: check My Orders
Given the user launch the application jpetstore
When the user login with valid details in jpetstore
Then the user sholud click my account
Then the user should click my order
Then the user sholud check no of orders
@TS_19
Scenario: Remove from cart
Given user should launch the jpetstore
When  user login with valid details in jpet
Then  user should click dogs in jpet homepage
And  user should click Golden Retriever in dogs page
Then  user should click addtocart to check out
Then the user clicks remove from cart in jpet
Then the application should display the empty cart


