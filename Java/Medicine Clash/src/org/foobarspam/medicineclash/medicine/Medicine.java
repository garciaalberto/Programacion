package org.foobarspam.medicineclash.medicine;


import java.util.ArrayList;
import java.util.Collection;
import org.foobarspam.medicineclash.prescription.*;

public class Medicine {
    
    private Collection<Prescription> prescriptions = new ArrayList<Prescription>();
    
    private final String name;

    public Medicine(String name) {
        this.name = name;
    }
    
    public void addPrescription(Prescription prescription) {
        this.prescriptions.add(prescription);
    }
}