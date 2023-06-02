public class Empregado {
    private String primeiroNome;
	private String ultimoNome;
	private double salarioMensal;

	public Empregado(String primeiroNome, String ultimoNome, double salarioMensal) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;

		if (salarioMensal > 0) {
			this.salarioMensal = salarioMensal;
		} else {
			this.salarioMensal = 0;
		}
	}

	public String getPrimeiroNome(){
		return primeiroNome;
	}

	public void setPrimeiroNome(String novoPrimeiroNome){
		primeiroNome = novoPrimeiroNome;
	}

	public String getUltimoNome(){
		return ultimoNome;
	}

	public void setUltimoNome(String novoUltimoNome){
		ultimoNome = novoUltimoNome;
	}

	public void setSalarioMensal(double novoSalarioMensal){
		if (novoSalarioMensal > 0){
			salarioMensal = novoSalarioMensal;
		}
	}

	public double getSalarioMensal(){
		return salarioMensal;
	}
}