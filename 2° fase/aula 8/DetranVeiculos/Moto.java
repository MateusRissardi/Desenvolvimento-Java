public class Moto extends Veiculo
{
    private int cilindradas;
    private double ipva;
    
    public boolean setCilindradas(int cilindradas){
        if(cilindradas > 0){
            this.cilindradas = cilindradas;
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getCilindradas(){
        return this.cilindradas;
    }
    
    public double calcularIPVA(){
        if(this.cilindradas>200){
            this.ipva = this.valor * 0.02;
        }
        else{
            this.ipva = 0;
        }
        return this.ipva;
    }
    
    @Override
    public String toString(){
        return "Moto "+ super.toString()+ ", Cilindradas: " + this.cilindradas + ", IPVA: R$" + this.df.format(this.ipva);
    }
}
