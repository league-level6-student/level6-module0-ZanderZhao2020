package _06_payroll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayrollTest {

    Payroll payroll = new Payroll();

    @Test
    void itShouldCalculatePaycheck() {
        //given
    	double hourlyWage = 200.25;
    	int numHours = 10;
    	double Expected = 2002.5;
        //when
    	double Actual = payroll.calculatePaycheck(hourlyWage, numHours);
        //then
    	assertEquals(Expected, Actual);
    }

    @Test
    void itShouldCalculateMileageReimbursement() {
        //given
    	int milesTravelled = 69;
    	double Expected = 39.675;
        //when
    	double Actual = payroll.calculateMileageReimbursement(milesTravelled);
        //then
    	assertEquals(Expected, Actual);
    }

    @Test
    void itShouldCreateOfferLetter() {
        //given
    	String employeeName = "Bob";
    	double hourlyWage = 200.25;
    	String Expected = "Hello Bob, We are pleased to offer you an hourly wage of 200.25";
        //when
    	String Actual = payroll.createOfferLetter(employeeName, hourlyWage);
        //then
    	assertEquals(Expected, Actual);
    }

}