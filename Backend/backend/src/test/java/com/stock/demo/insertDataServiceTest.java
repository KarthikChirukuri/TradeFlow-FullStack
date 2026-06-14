package com.stock.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.stock.demo.repository.HoldingsRepository;
import com.stock.demo.repository.OrdersRepository;
import com.stock.demo.repository.PositionsRepository;
import com.stock.demo.service.InsertData;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class insertDataServiceTest {

    @Mock
    private HoldingsRepository holdingsRepository;

    @Mock
    private PositionsRepository positionsRepository;

    @Mock
    private OrdersRepository ordersRepository;

    @InjectMocks
    private InsertData insertData;

    @Test
    void testInsertHoldings() {

        String result = insertData.insertHoldings();

        assertEquals("Insertion Done!", result);

        verify(holdingsRepository, times(3)).save(org.mockito.ArgumentMatchers.any());
    }

    @Test
    void testInsertPositions() {

        String result = insertData.insertPositions();

        assertEquals("Positions Inserted!", result);

        verify(positionsRepository, times(2)).save(org.mockito.ArgumentMatchers.any());
    }

    @Test
    void testInsertOrders() {

        String result = insertData.insertOrders();

        assertEquals("Orders Inserted!", result);

        verify(ordersRepository, times(2)).save(org.mockito.ArgumentMatchers.any());
    }
}