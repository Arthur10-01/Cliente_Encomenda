
package entidade;


public class Produto {
    private String name;
    private Double preco;
    
    public Produto(){
        
    }

    public Produto(String name, Double preco) {
        this.name = name;
        this.preco = preco;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public Double getPreco() {
        return preco;
    }
    
}
