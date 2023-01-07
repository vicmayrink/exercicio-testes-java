package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTest {
	
	//Construtor deve criar o objeto com os dados corretos quando os dados forem válidos
	@Test
	public void constructorShouldCreateObjectWhenFinancingIsValid() {
		
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		Financing fin = new Financing(totalAmount, income, months);
		
		Assertions.assertEquals(fin.getTotalAmount(), totalAmount);
		Assertions.assertEquals(fin.getIncome(), income);
		Assertions.assertEquals(fin.getMonths(), months);
		
	}
	
	//Construtor deve lançar IllegalArgumentException quando os dados não forem válidos
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenFinancingIsNotValid() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Financing(100000.0, 2000.0, 40);			
		});
		
	}
	
	//setTotalAmount Deve atualizar o valor quando os dados forem válidos
	@Test
	public void setTotalAmountShouldUpdateAmountWhenFinancingIsValid() {
		
		Financing fin = new Financing(100000.0, 2000.0, 80);
		
		double newTotalAmount = 80000.0;
		fin.setTotalAmount(newTotalAmount);
		
		Assertions.assertEquals(fin.getTotalAmount(), newTotalAmount);
		
	}
	
	//setTotalAmount Deve lançar IllegalArgumentException quando os dados não forem válidos
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenFinancingIsNotValid() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = new Financing(100000.0, 2000.0, 80);
			fin.setTotalAmount(120000.0);
		});
		
	}
	
	//setIncome deve atualizar o valor quando os dados forem válidos
	@Test
	public void setIncometShouldUpdateIncomeWhenFinancingIsValid() {
		
		Financing fin = new Financing(100000.0, 2000.0, 80);
		
		double newIncome = 3000.0;
		fin.setIncome(newIncome);
		
		Assertions.assertEquals(fin.getIncome(), newIncome);
		
	}
	
	//setIncome deve lançar IllegalArgumentException quando os dados não forem válidos
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenFinancingIsNotValid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = new Financing(100000.0, 2000.0, 80);
			fin.setIncome(1900.0);
		});
		
	}
	
	//setMonths deve atualizar o valor quando os dados forem válidos
	@Test
	public void setMonthsShouldUpdateMonthsWhenFinancingIsValid() {
		
		Financing fin = new Financing(100000.0, 2000.0, 80);
		
		int newMonths = 81;
		fin.setMonths(newMonths);
		
		Assertions.assertEquals(fin.getMonths(), newMonths);
		
	}
	
	//setMonths deve lançar IllegalArgumentException quando os dados não forem válidos
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenFinancingIsNotValid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing fin = new Financing(100000.0, 2000.0, 80);
			fin.setMonths(79);
		});
	}
	
	//entry deve calcular corretamente o valor da entrada
	@Test
	public void entryShouldComputeCorrectEntryAmount() {
		Financing fin = new Financing(100000.0, 2000.0, 80);
		Assertions.assertEquals(fin.entry(), 20000.0);
	}
	
	//quota deve calcular corretamente o valor da prestação
	@Test
	public void quotaShouldComputeCorrectQuotaAmount() {
		Financing fin = new Financing(100000.0, 2000.0, 80);
		Assertions.assertEquals(fin.quota(), 1000.0);
	}

}
