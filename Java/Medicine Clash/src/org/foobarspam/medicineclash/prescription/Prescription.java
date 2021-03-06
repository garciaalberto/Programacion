package org.foobarspam.medicineclash.prescription;


import java.util.Date;

public class Prescription {
    // Propiedades
	private int daysSupply = 30;
	
    private Date dispenseDate = new Date();
    
    // Constructores
    public Prescription(){
    	
    }
    
    public Prescription(Date dispenseDate, int daysSupply) {
        this.dispenseDate = dispenseDate;
        this.daysSupply = daysSupply;
    }
    
    // Setters y getters
    public Date getDispenseDate() {
		return dispenseDate;
	}

	public int getDaysSupply() {
		return daysSupply;
	}

}