package java_poo.heranca_polimorfismo.desafio_01;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;
    private Double peso;

    public Produto(String nome, Double preco, Integer quantidade, Double peso){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.peso = peso;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    public void setPreco (Double preco){
        this.preco = preco;
    }
    public void setQuantidade (Integer quantidade){
        this.quantidade = quantidade;
    }
    public void setPeso(Double peso){
        this.peso = peso;
    }

    public String getNome(){
        return this.nome;
    }
    public Double getPreco(){
        return this.preco;
    }
    public Integer getQuantidade(){
        return this.quantidade;
    }
    public Double getPeso(){
        return this.peso;
    }
}
