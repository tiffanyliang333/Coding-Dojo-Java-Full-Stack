package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin{
//... imports class definition...
    private String role;
    private ArrayList<String>securityIncidents;
	
    public AdminUser(Integer id, String role) {
		super(id);
		this.setRole(role);
		this.securityIncidents = new ArrayList<String>();
		// TODO Auto-generated constructor stub
	}

	// Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    // TO DO: Implement HIPAACompliantUser!
    
    public void newIncident(String notes) {
    	String report = String.format("Date and time submitted: %s \n, ID of reported: %s \n Notes: %s \n", new Date(), this.id, notes);
    	securityIncidents.add(report);
    }
    
    public void authIncident() {
    	String report = String.format("Date and time submitted: %s \n, ID: %s \n Notes: %s \n", new Date(), this.id, "AUTHORIZATION FAILED");
    	securityIncidents.add(report);
    }
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }


	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		if (pin <10000) {
			return false;
		}
		if (pin > 999999) {
			return false;
		}
		return true;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if (confirmedAuthID != this.id) {
			this.authIncident();
			return false;
		}
		return true;
	}
	
	@Override
	public ArrayList<String> reportSecurityIncidents(){
		return this.securityIncidents;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
    // TO DO: Setters & Getters

}
