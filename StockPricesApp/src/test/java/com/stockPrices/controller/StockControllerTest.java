package com.stockPrices.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.stockPrices.entity.StockEntity;
import com.stockPrices.service.StockService;

public class StockControllerTest {
	
	@MockBean
	StockService stockService;
	@Test
	public void testGetAllStocks() {
		List<StockEntity> stocks=new ArrayList<StockEntity>();
		stocks.add(new StockEntity("Apple",22));
		stocks.add(new StockEntity("IBM",25));
		stocks.add(new StockEntity("Zensar",29));
		when(stockService.getAllStocks()).thenReturn(stocks);
		List<StockEntity> result=stockService.getAllStocks();
		assertEquals(stocks, result);
	}
	
	

}
