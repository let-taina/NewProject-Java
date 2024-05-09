package produtos.model;

public class produtos {

	
	private int codProduto;
	private int tipo;
	private String nomeProduto;
	private int saldoEstoque;
	private float preco;
	
	public produtos(int codProduto, int tipo, String nomeProduto, int saldoEstoque, float preco) {
		this.codProduto = codProduto;
		this.tipo = tipo;
		this.nomeProduto = nomeProduto;
		this.saldoEstoque = saldoEstoque;
		this.preco = preco;
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getSaldoEstoque() {
		return saldoEstoque;
	}

	public void setSaldoEstoque(int saldoEstoque) {
		this.saldoEstoque = saldoEstoque;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public boolean saida (int quantidade) {
		if (this.getSaldoEstoque() < quantidade) {
			System.out.println("\nNão há quantidade suficiente em estoque!");
			return false;
		}
		
		this.setSaldoEstoque(this.getSaldoEstoque()- quantidade);
		return true;
	}
	
	public void adicionar (int quantidade) {
		this.setSaldoEstoque(this.getSaldoEstoque() + quantidade);
	}
	
	public void visualizar () {
		String tipo = "";
		
		switch (this.tipo) {
		case 1:
			tipo = "Bolsas";
			break;
		case 2:
			tipo = "Amigurumis";
			break;
		}
		System.out.println("\n\n-----------------------------------------------------");
		System.out.println("               Informações sobre o produto               ");
		System.out.println("---------------------------------------------------------");
		System.out.println(" Código do produto: " + this.codProduto);
		System.out.println("Tipo de produto: " + tipo);
		System.out.println("Nome do produto: " + this.nomeProduto);
		System.out.println ("Preço unitário: " + this.preco);
		System.out.println("Saldo em estoque" + "\nQuantidade: " + this.saldoEstoque 
				+ "Valor (R$) " +(this.preco * this.saldoEstoque));
		
	}
	
	
}
