public class Moto extends Veiculo
{
    private int cilindradas;
    
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
    
    @Override
    public double calcularIPVA(){
        this.ipva = super.calcularIPVA();
        if(this.cilindradas>200){
            this.ipva = this.ipva;
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
