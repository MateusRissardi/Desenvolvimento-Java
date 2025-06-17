public class Carro extends Veiculo
{
    private int portas;
    private boolean ehParticular;
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
    
    public boolean setEhParticular(boolean ehParticular){
        if(ehParticular == true){
            this.ehParticular = true;
            return true;
        }
        else{
            this.ehParticular = false;
            return false;
        }
    }
    
    public boolean getEhParticular(){
        return this.ehParticular;
    }
    
    @Override
    public double calcularIPVA(){
        this.ipva = super.calcularIPVA();
        if(this.ehParticular == true){
            this.ipva = this.ipva;
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
