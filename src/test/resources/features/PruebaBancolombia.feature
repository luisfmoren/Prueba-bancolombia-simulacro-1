#autor: Luis Moreno

  @stories
  Feature: Test bancolombia
    as a user, I want create a new register in the page the utest.com

  @scenario1
  Scenario: create new resgister
    Given than luis wants create a new register
    When he enter your personal information
    |strFirstName|strLastName|strEmail       |strMonth|strDay|strYear|strCity |strZip|strPassword |
    |luis        |moreno     |luism@gmail.com|August  |7     |1997   |Medellín|050018|LuisMoreno77|
    Then he will have a new register in the page
    |strText                                             |
    |Welcome to the world's largest community of testers.|