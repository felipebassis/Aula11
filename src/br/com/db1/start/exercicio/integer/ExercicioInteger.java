package br.com.db1.start.exercicio.integer;

public class ExercicioInteger {
	private Integer valor1;
	private Integer valor2;
	
	public Integer getValor2() {
		return valor2;
	}
	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}
	public Integer getValor1() {
		return valor1;
	}
	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}
	
	public Integer soma(){
		return valor1 + valor2;
	}
	
	public Integer subtracao(){
		return valor1 - valor2;
	}
	
	public Integer multiplicacao(){
		return valor1 * valor2;
	}
	
	public Integer divisao(){
		return valor1 / valor2;
	}
	
	public Boolean par(Integer valor){
		if(0 == valor % 2){
			return true;
		}
		else{
			return false;
		}
	}
	
	public Boolean numeroMaior(Integer valor1, Integer valor2){
		if(0 < valor1.compareTo(valor2)){
			return true;
		}
		else if(0 > valor1.compareTo(valor2)){
			return false;
		}
		else{
			return null;
		}
	}
	
	public void numerosImparesAte100(Integer valor){
		for(valor = valor; valor < 100; valor = valor + 2){
			System.out.println(valor.toString());
		}
	}
}
