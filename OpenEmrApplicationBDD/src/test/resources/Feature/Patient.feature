@patient
Feature: Patient
  In order to maintain the patient record
  As a admin
  I want to create, update, delete patient records
  
Scenario: Add Patient
		Given I have browser with OpenEMR page
		When I enter username as "admin"
    And I enter password as "pass"
    And I select language as "English (Indian)"
    And I click on login
    And I mouseover on patient-client
    And I click on patients
    And I click on add new patient

    
    
