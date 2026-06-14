package com.stock.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.stock.demo.entity.Holdings;
import com.stock.demo.entity.Orders;
import com.stock.demo.entity.Positions;
import com.stock.demo.repository.HoldingsRepository;
import com.stock.demo.repository.OrdersRepository;
import com.stock.demo.repository.PositionsRepository;
import com.stock.demo.service.fetchDataService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class fetchDataServiceTest {

    @Mock
    private HoldingsRepository holdingsRepository;

    @Mock
    private PositionsRepository positionsRepository;

    @Mock
    private OrdersRepository ordersRepository;

    @InjectMocks
    private fetchDataService service;

    @Test
    void testFetchHoldings() {

        List<Holdings> holdingsList = new ArrayList<>();

        Holdings h = new Holdings();
        h.setQty(10);

        holdingsList.add(h);

        when(holdingsRepository.findAll())
                .thenReturn(holdingsList);

        List<Holdings> result =
                service.fetchHoldings();

        assertEquals(1, result.size());

        verify(holdingsRepository).findAll();
    }

    @Test
    void testFetchPositions() {

        List<Positions> positionsList = new ArrayList<>();

        Positions p = new Positions();
        p.setQty(5);

        positionsList.add(p);

        when(positionsRepository.findAll())
                .thenReturn(positionsList);

        List<Positions> result =
                service.fetchPositions();

        assertEquals(1, result.size());

        verify(positionsRepository).findAll();
    }

    @Test
    void testFetchOrders() {

        List<Orders> ordersList = new ArrayList<>();

        Orders o = new Orders();
        o.setQty(20);

        ordersList.add(o);

        when(ordersRepository.findAll())
                .thenReturn(ordersList);

        List<Orders> result =
                service.fetchOrders();

        assertEquals(1, result.size());

        verify(ordersRepository).findAll();
    }
}