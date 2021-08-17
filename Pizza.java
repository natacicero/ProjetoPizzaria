package Atividade;

public class Pizza {
	
		//Construtor
		public Pizza(String sabor, String borda, String acompanhamento, double preco, Pizzaiolo pizzaiolo, Comprador comprador) {
		this.sabor = sabor;
		this.borda = borda;
		this.acompanhamento = acompanhamento ;
		this.preco = preco;
		this.pizzaiolo = pizzaiolo;
		this.comprador = comprador;
		Pizza.totalPizzas+=1;
		Pizza.precoTotal = Pizza.precoTotal + this.preco;
	}

		// Propriedade ou Atributos 

			private String sabor; 
			private String borda; 
			private String acompanhamento;   
			private double preco;
			double valorComDesconto;
			private Pizzaiolo pizzaiolo;
			private Comprador comprador;
			
			private static int totalPizzas;
			private static double precoTotal;

			// Métodos 
			    
			    double calcularDesconto(double percentualDescontoVendedor) {
			    	
			    	if(percentualDescontoVendedor>=0 && percentualDescontoVendedor<=4) {
			    		return this.preco * (percentualDescontoVendedor/100);
			    	}else if(percentualDescontoVendedor<0) {
			    		return 0.0;
			    	}else {
			    		return this.preco * 0.04;
			    	}
			    }

				double calcularDesconto(double percentualDescontoVendedor, double percentualDescontoGerente){
			    	
			    	
			    	if(percentualDescontoVendedor<0) {
			    		percentualDescontoVendedor=0;
			    	}else if(percentualDescontoVendedor>4) {
			    		percentualDescontoVendedor=4;
			    	}
			    	
			    	
			    	if(percentualDescontoGerente<0) {
			    		percentualDescontoGerente=0;
			    	}else if(percentualDescontoGerente>2) {
			    		percentualDescontoGerente=2;
			    	}
			    	
			    	double desconto = this.preco * ((percentualDescontoVendedor/100) + (percentualDescontoGerente/100));
			    	this.setValorComDesconto(this.preco - desconto);
			    	
			    	return desconto;

	}

				public String getSabor() {
					return sabor;
				}

				public void setSabor1(String sabor) {
					this.sabor = sabor;
				}

				public String getBorda() {
					return borda;
				}

				public void setBorda(String borda) {
					this.borda = borda;
				}

				public String getAcompanhamento() {
					return acompanhamento;
				}

				public void setAcompanhamento(String acompanhamento) {
					this.acompanhamento = acompanhamento;
				}

				public double getPreco() {
					return preco;
				}

				public void setPreco(double preco) {
					this.preco = preco;
				}

				public double getValorComDesconto() {
					return valorComDesconto;
				}

				public void setValorComDesconto(double valorComDesconto) {
					this.valorComDesconto = valorComDesconto;
				}

				public Pizzaiolo getpizzaiolo() {
					return pizzaiolo;
				}

				public void setPizzaiolo(Pizzaiolo pizzaiolo) {
					this.pizzaiolo = pizzaiolo;
				}

				public Comprador getComprador() {
					return comprador;
				}

				public void setComprador(Comprador comprador) {
					this.comprador = comprador;
				}

				public static int getTotalPizzas() {
					return totalPizzas;
				}

				public static void setTotalPizzas(int totalPizzas) {
					Pizza.totalPizzas = totalPizzas;
				}

				public static double getPrecoTotal() {
					return precoTotal;
				}

				public static void setPrecoTotal(double precoTotal) {
					Pizza.precoTotal = precoTotal;
				}

}
