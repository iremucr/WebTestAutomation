#Feature: Links Page Functionality

  #Scenario: User clicks Created link
    #* "common@elementsHeader" tiklanir

Feature:DEMOQA Testi

  #@TextBox
  #Scenario: Text Box formunu doldurma ve doğrulama
    #Given "common@textBoxButton" tiklanir
    #And "common@textBoxFullName" alanına "irem ucar" yazılır
    #And "common@textBoxEmail" alanına "irem@test.com" yazılır
    #And "common@textBoxCurrentAddress" alanına "İstanbul" yazılır
    #And "common@textBoxPermanentAddress" alanına "Türkiye" yazılır
    #And "common@scrollDown" alani icin ekrani asagi kaydir
    #And "common@textBoxSubmitButton" tiklanir

  #@RadioButton
  #Scenario: Radio Button sayfasına git ve kontrol et
    #Given "common@elementsHeader" tiklanir
    #And "common@radioButtonMenu" tiklanir


  #@RadioButton
  #Scenario: Radio Button Yes seçimi testi
    #Given "common@radioButtonMenu" tiklanir
    #And "common@yesRadioInput" JS ile tiklanir
    #Then "common@radioResultText" yazısı "Yes" içermelidir


  #@WebTables
  #Scenario: Web Tables sayfasında Cierra kaydını sil ve silindiğini doğrula
    #Given "common@webTablesMenu" tiklanir
    #And "common@deleteCierraButton" scroll edilip JS ile tiklanir
    #When "common@deleteCierraButton" tiklanir
    #Then "common@cierraRow" elementi artık görünmemelidir





  #@Buttons
  #Scenario: Buttons sayfasına git ve kontrol et
    #Given "common@elementsHeader" tiklanir
    #And "common@buttonsMenu" tiklanir


  @Buttons
  Scenario: Click Me butonuna tıkla ve sonucu kontrol et
    #Given "common@elementsHeader" tiklanir
    And "common@buttonsMenu" tiklanir
    And "common@clickMeButton" alani icin ekrani asagi kaydir
    And "common@clickMeButton" tiklanir
    Then "common@clickMessage" yazısı "You have done a dynamic click" içermelidir




























