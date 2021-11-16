package _08_mocking.models;

import _07_intro_to_mocking.models.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class DeliveryDriverTest {
	@Mock
    DeliveryDriver deliveryDriver;

    @BeforeEach
    void setUp() {
    	MockitoAnnotations.openMocks(this);
    	
    	deliveryDriver = new DeliveryDriver("Bob", new Car(new _07_intro_to_mocking.models.Engine(69.420, 69, 69420, 420, 69), new _07_intro_to_mocking.models.GasTank()), new CellPhone());
    }

    @Test
    void itShouldWasteTime() {
        //given
    	boolean ExpectedTimeWasted = true;
        //when
    	boolean ActualTimeWasted = deliveryDriver.wasteTime();
        //then
    	assertEquals(ExpectedTimeWasted, ActualTimeWasted);
    }

    @Test
    void itShouldRefuel() {
        //given
    	boolean ExpectedRefueled = true;
        //when
    	boolean ActualRefueled = deliveryDriver.refuel(69420);
        //then
    	assertEquals(ExpectedRefueled, ActualRefueled);
    }

    @Test
    void itShouldContactCustomer() {
        //given
    	boolean ExpectedContacted = true;
        //when
    	boolean ActualContacted = deliveryDriver.contactCustomer("(800)-800-8000");
        //the
    	assertEquals(ExpectedContacted, ActualContacted);
    }

}