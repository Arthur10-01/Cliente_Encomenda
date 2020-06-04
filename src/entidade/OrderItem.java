
package entidade;


public class OrderItem {
    private Integer quantidade;
    private Double preco;
    
    private Produto produto;
    public OrderItem(){
        
    }

    public OrderItem(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }
    public Double subTotal(){
     double subTotal =  preco * quantidade;
     return subTotal;
    }
    
      @Override
	public String toString() {
		return produto.getName() + ", Preço: "
                        + preco +", Quantidade: "
                        + quantidade +", SubTotal: $"
                        + String.format("%.2f",subTotal());
 	}
}
