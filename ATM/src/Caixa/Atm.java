package Caixa;

public class Atm {


	private int valor;
	
	private String codigo;
	private String logradouro;
	private String rua;
	private String cidade;
	private int nota_100;
	private int nota_50;
	private int nota_10;
	private int qnota_100;
	private int qnota_50;
	private int qnota_10;
	
	Atm (String codigo,String logradouro,String rua,String cidade,int nota_100,int nota_50,int nota_10){
		
		this.codigo = codigo;
		this.logradouro = logradouro;
		this.rua = rua;
		this.cidade = cidade;
		this.nota_100 = nota_100;
		this.nota_50 = nota_50;
		this.nota_10 = nota_10;
		
	}
	
	public int getNotaDe100() {
		return nota_100;
	}
	
    public int getNotaDe50() {
		return nota_50;
	}

   public int getNotaDe10() {
	   return nota_10;
   }
	
   public void setNotaDe100(int nota_100) {
	   this.nota_100 += nota_100;
   }
   
   public void setNotaDe50(int nota_50) {
	   this.nota_50 += nota_50;
   }

   public void setNotaDe10(int nota_10) {
	   this.nota_10 += nota_10;	   
   }   
   
	public void sacar(int valor) {
	
		this.valor = valor;
		
			System.out.println("\nVocê sacou:\n");
			
			if(valor >= 0 && valor <= 600) {
			
				if(nota_100 > 0) {
					qnota_100 = valor / 100;
					nota_100 = nota_100 - qnota_100;
					valor = valor % 100;
					System.out.println(qnota_100 + " de notas de 100.");
			
				} 
			
				if(nota_50 > 0) {
					qnota_50 = valor / 50;
					nota_50 = nota_50 - qnota_50;
					valor = valor % 50;
					System.out.println(qnota_50 + " de notas de 50.");
				}
			
				if(nota_10 > 0) {
					qnota_10 = valor / 10;
					nota_10 = nota_10 - qnota_10;
					valor = valor % 10;
					System.out.println(qnota_10 + " de notas de 10.");
				}
			
				}else {
					System.out.println("Não é possível realizar o saque");
				}	
	
	}	
	
	public void saldoDoCaixa () {	
		
		System.out.println("\nO caixa tem:");
		
		System.out.println("\nO caixa tem " + nota_100 + " notas de 100.");
		System.out.println("O caixa tem " + nota_50 + " notas de 50.");
		System.out.println("O caixa tem " + nota_10 + " notas de 10.");
		
	}
	
	
}

