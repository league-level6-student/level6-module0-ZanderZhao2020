package _10_white_box_testing;

import _09_intro_to_white_box_testing.models.DeliveryService;

import _09_intro_to_white_box_testing.models.Order;
import _10_white_box_testing.models.BakeryService;
import _10_white_box_testing.models.PaymentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import _07_intro_to_mocking.models.*;
import _08_mocking.models.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

class MyDonutShopTest {
	@Mock
    MyDonutShop myDonutShop;
	
	@Mock
	DeliveryService deliveryService;
	
	@Mock
	BakeryService bakeryService;

    @BeforeEach
    void setUp() {
    	MockitoAnnotations.openMocks(this);
    	

    	myDonutShop = new MyDonutShop(null, deliveryService, bakeryService);
    	myDonutShop.setDeliveryService(deliveryService);

    }

    @Test
    void itShouldTakeDeliveryOrder() throws Exception {
        //given
    	myDonutShop.openForTheDay();
    	Order order = new Order(null, null, 0, 0, null, false);
        //when
    	myDonutShop.takeOrder(order);
        //then
    	verify(deliveryService, times(0)).scheduleDelivery(order);
    }

    @Test
    void givenInsufficientDonutsRemaining_whenTakeOrder_thenThrowIllegalArgumentException() {
        //given
    	myDonutShop.openForTheDay();
    	Order order = new Order(null, null, 100, 0, null, false);
        //when

        //then
    }

    @Test
    void givenNotOpenForBusiness_whenTakeOrder_thenThrowIllegalStateException(){
        //given

        //when

        //then
    }

}