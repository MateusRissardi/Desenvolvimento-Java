public class Anuncio
{
    protected String produto;
    protected double valorVenda;
    protected String cidade;
    protected String estado;
    
    public boolean setProduto(String produto){
        if(produto != null){
            this.produto = produto;
            return true;
        }
        else{
            return false;
        }
    }
    
    public String getProduto(){
        return this.produto;
    }
    
    public boolean setValorVenda(double valorVenda){
        if(valorVenda>0){
            this.valorVenda = valorVenda;
            return true;
        }
        else{
            return false;
        }
    }
    
    public double getValorVenda(){
        return this.valorVenda;
    }
    
    public boolean setCidade(String cidade){
        if(cidade != null){
            this.cidade = cidade;
            return true;
        }
        else{
            return false;
        }
    }
    
    public String getCidade(){
        return this.cidade;
    }
    
    public boolean setEstado(String estado){
        if((estado != null) && (estado.length()==2)){
            this.estado = estado;
            return true;
        }
        else{
            return false;
        }
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    public String toString(){
        return "Produto: " + this.produto + ", Valor de Venda: R$" + this.valorVenda +
        ", Cidade: " + this.cidade + ", Estado: "+  this.estado;
    }
}
