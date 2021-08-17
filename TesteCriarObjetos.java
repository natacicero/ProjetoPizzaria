package Atividade;

public class TesteCriarObjetos {

	public static void main(String[] args) {
		
		Pizzaiolo pizzaiolo1 = new Pizzaiolo(); 
		pizzaiolo1.setNome("Roberto Carlos");
		pizzaiolo1.setturno("Noite");
		
		Pizzaiolo pizzaiolo2 = new Pizzaiolo();
		pizzaiolo2.setNome("Carlos Almeida");
		pizzaiolo2.setturno("Tarde");
		
		Comprador comprador1 = new Comprador();
		comprador1.setNome("Marcos Rocha");
		comprador1.setIdade("35");
		comprador1.setTelefone ("3993-5847");
		
		Comprador comprador2 = new Comprador();
		comprador2.setNome("Lucca Silva");
		comprador2.setIdade("29");
		comprador2.setTelefone("3958-8744");
		
		Comprador comprador3 = new Comprador();
		comprador3.setNome("Natã Silva");
		comprador3.setIdade("18");
		comprador3.setTelefone("3985-4587");
		
		Comprador comprador4 = new Comprador();
		comprador4.setNome("Nycolas Mendes");
		comprador4.setIdade("25");
		comprador4.setTelefone("95441-8565");
		
		Pizza[] pizzas = new Pizza[4];
		
		pizzas[0] = new Pizza("Mussarela","Catupiry","Batatas",25.00, pizzaiolo1, comprador3); 
		pizzas [1] = new Pizza("Calabresa","cheddar","X-Burguer", 30.00, pizzaiolo2,comprador1);
		pizzas [2] = new Pizza("Frango","Catupity","X-salada",22.00, pizzaiolo2,comprador4);
		pizzas [3] = new Pizza("Atum","cheddar","Coca-cola", 32.50, pizzaiolo1,comprador3);
		
		System.out.println("***********************************************************************");
		System.out.println("                  RELATÓRIO DE VENDAS");
		System.out.println("***********************************************************************");
		
		for(int i=0;i<pizzas.length;i++){
			System.out.println("Sabor: " + pizzas[i].getSabor());
			System.out.println("Borda: " + pizzas[i].getBorda());
			System.out.println("Acompanhamento: " + pizzas[i].getAcompanhamento());
			System.out.println("Preço: " + pizzas[i].getPreco());
			System.out.println("Desconto: " + pizzas[i].calcularDesconto(1,2));
			System.out.println("Valor com Desconto: " + pizzas[i].getValorComDesconto());
			System.out.println();
			System.out.println("************************DADOS DO PIZZAIOLO**************************");
			System.out.println("Pizzaiolo " + pizzas[i].getpizzaiolo().getNome());
			System.out.println("Turno:" + pizzas[i].getpizzaiolo().getturno());
			System.out.println();
			System.out.println("*********************DADOS DO COMPRADOR****************************");
			System.out.println("Comprador: " + pizzas[i].getComprador().getNome());
			System.out.println("Idade: " + pizzas[i].getComprador().getIdade());
			System.out.println("Telefone: " + pizzas[i].getComprador().getTelefone());
			System.out.println();
			
			System.out.println("============================================================");
			System.out.println("Quantidade de Pizzas: " + Pizza.getTotalPizzas());
			System.out.println("Preço Total (valor bruto): " + Pizza.getPrecoTotal());
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
