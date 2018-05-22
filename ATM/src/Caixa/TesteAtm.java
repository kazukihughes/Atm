package Caixa;

public class TesteAtm {

	public static void main(String[] args) {
		
		Atm c1 = new Atm("123ABC", "100", "Rua Francisco Glicerio", "Campinas", 100, 100, 100);
		
		c1.saldoDoCaixa();
		c1.sacar(370);
		c1.saldoDoCaixa();
		

	}

}
