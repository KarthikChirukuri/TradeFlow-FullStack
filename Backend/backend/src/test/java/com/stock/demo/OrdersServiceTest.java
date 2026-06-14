package com.stock.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.stock.demo.dto.OrderDTO;
import com.stock.demo.entity.Orders;
import com.stock.demo.exceptionhandling.InvalidOrderException;
import com.stock.demo.repository.OrdersRepository;
import com.stock.demo.service.OrdersService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OrdersServiceTest {

    @Mock
    private OrdersRepository ordersRepository;

    @InjectMocks
    private OrdersService ordersService;

    private OrderDTO dto;

    @BeforeEach
    void setUp() {

        dto = new OrderDTO();

        dto.setName("TCS");
        dto.setPrice(3500);
        dto.setQty(10);
        dto.setMode("BUY");
    }

    @Test
    void testStoreOrderSuccess() {

        String result = ordersService.storeOrder(dto);

        assertEquals("Order Stored!", result);

        verify(ordersRepository).save(org.mockito.ArgumentMatchers.any(Orders.class));
    }

    @Test
    void testInvalidQuantity() {

        dto.setQty(0);

        assertThrows(
                InvalidOrderException.class,
                () -> ordersService.storeOrder(dto)
        );
    }

    @Test
    void testInvalidPrice() {

        dto.setPrice(0);

        assertThrows(
                InvalidOrderException.class,
                () -> ordersService.storeOrder(dto)
        );
    }
}