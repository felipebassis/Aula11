package br.com.db1.start.exercicio.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.start.exercicio.integer.ExercicioInteger;

public class ExercicioIntegerTest {
	
	ExercicioInteger exercicioInteger = new ExercicioInteger();
	
	@Before
	public void init(){
		exercicioInteger.setValor1(20);
		Assert.assertTrue(20 == exercicioInteger.getValor1());
	}
	
	
	
		
	
}
