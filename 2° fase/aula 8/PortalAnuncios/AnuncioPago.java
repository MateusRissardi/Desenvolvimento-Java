public class AnuncioPago extends Anuncio
{
    private int quantDias;
    private double valor;
    
    public boolean setQuantDias(int quantDias){
        if(quantDias>=1){
            this.quantDias = quantDias;
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getQuantDias(){
        return this.quantDias;
    }
    
    public boolean setValor(double valor){
        if(valor>0){
            this.valor = valor;
            return true;
        }
        else{
            return false;
        }
    }
    
    public double getValor(){
        return this.valor;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Quantidade de Dias: " + this.quantDias + 
        ", Valor: R$" + this.valor;
    }
}
