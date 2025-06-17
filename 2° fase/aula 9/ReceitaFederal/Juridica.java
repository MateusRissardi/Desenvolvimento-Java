public class Juridica extends Pessoas
{
    private String cnpj;
    private double faturamento;
    private int enquadramento;
    
    public Juridica(String nome, String endereço, String cnpj, double faturamento, int enquadramento){
        super(nome, endereço);
        this.cnpj = cnpj;
        this.faturamento = faturamento;
        this.enquadramento = enquadramento;
    }
    
    public String getCNPJ(){
        return this.cnpj;
    }
    
    public boolean setFaturamento(double faturamento){
        if(faturamento > 0){
            this.faturamento = faturamento;
            return true;
        }
        else{
            return false;
        }
    }
    
    public double getFaturamento(){
        return this.faturamento;
    }
    
    public boolean setEnquadramento(int enquadramento){
        if(enquadramento>=1 && enquadramento<=3){
            this.enquadramento = enquadramento;
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getEnquadramento(){
        return this.enquadramento;
    }
    
    @Override
    public double calcImposto(){
        double imposto = 69;
        if(this.enquadramento == 1){
            imposto = this.faturamento * 0.02;
        }
        if(this.enquadramento == 2){
            imposto = this.faturamento * 0.05;
        }
        if(this.enquadramento == 3){
            imposto = this.faturamento * 0.15;
        }
        return imposto;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", CNPJ : " + this.cnpj + ", Faturamento: "
        + this.faturamento + ", Enquadramento: " + this.enquadramento;
    }
}
