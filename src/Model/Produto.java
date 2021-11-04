package Model;

/**
 *
 * @author Matheus
 */
public class Produto {
    
    private int codProd, quantidade;
    private String nome;
    private double preco;
    private TipoProduto tipoProd;

    
    
    public Produto(){}
    
    public TipoProduto getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(TipoProduto tipoProd) {
        this.tipoProd = tipoProd;
    }
    
    public Produto(int codProd, int quantidade, String nome, double preco){
        this.codProd = codProd;
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
