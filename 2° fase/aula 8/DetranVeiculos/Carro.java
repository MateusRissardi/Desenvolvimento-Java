public class Carro extends Veiculo
{
    private int portas;
    private double ipva;
    
    public boolean setPortas(int portas){
        if(portas>0){
            this.portas = portas;
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getPortas(){
        return this.portas;
    }
    
    public double calcularIPVA(boolean ehParticular){
        if(ehParticular == true){
            this.ipva = this.valor *0.02;
        }
        else{
            this.ipva = this.valor *0.01;
        }
        return this.ipva;
    }
    
    @Override
    public String toString(){
        return "Carro "+ super.toString() + ", Portas: " + this.portas + ", IPVA: R$" + this.df.format(this.ipva);
    }
}
