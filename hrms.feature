Feature: ornagehrms



Background:

Given Open the Chrome Browser

And Load the application url 'https://cskvw-trials73.orangehrmlive.com/'


Scenario Outline: Testing with positive credentials

Given Enter username as <username>
And Enter password as <password>
When Click on login button
Then Homepage should be displayed


Examples:

|username|password|
|'Admin'|'cOD5@7dZbM'|
|'Demo'|'Cskvw'|