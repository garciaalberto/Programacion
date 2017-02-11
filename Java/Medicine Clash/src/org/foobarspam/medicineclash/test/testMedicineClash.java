package org.foobarspam.medicineclash.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.foobarspam.medicineclash.medicine.*;
import org.foobarspam.medicineclash.patient.*;
import org.foobarspam.medicineclash.prescription.*;
import java.util.Date;
public class testMedicineClash {

	@Test
	public void testConstructorPrescription() {
		Date dia = new Date(11-02-2017);
		Prescription prescription = new Prescription(dia, 3);
		assertEquals(3, prescription.getDaysSupply());
		assertEquals(dia, prescription.getDispenseDate());
	}

}
