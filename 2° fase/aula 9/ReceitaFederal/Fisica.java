public class Fisica extends Pessoas
{
    private String rg;
    private String cpf;
    private double salMensal;
    private int quantDepen;
    
    public Fisica(String nome, String endereço, String rg, String cpf, double salMensal, int quantDepen){
        super(nome, endereço);
        this.rg = rg;
        this.cpf = cpf;
        this.salMensal = salMensal;
        this.quantDepen = quantDepen;
    }
    
    public String getRG(){
        return this.rg;
    }
    
    public String getCPF(){
        return this.cpf;
    }
    
    public boolean setSalMensal(double salMensal){
        if(salMensal >= 0){
            this.salMensal = salMensal;
            return true;
        }
        else{
            return false;
        }
    }
    
    public double getSalMensal(){
        return this.salMensal;
    }
    
    public boolean setQuantDepen(int quantDepen){
        if(quantDepen >= 0){
            this.quantDepen = quantDepen;
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public double calcImposto(){
        double imposto;
        if(this.salMensal > 0 && this.salMensal <= 500){
            imposto = 0;
        }
        else if(this.salMensal > 500 && this.salMensal <= 1000){
            imposto = this.salMensal*0.05;
            if((this.quantDepen*50) >= imposto){
                imposto = 0;
            }
            else{
                imposto = imposto - (this.quantDepen*50);
            }
        }
        else{
            imposto = this.salMensal*0.07;
            if((this.quantDepen*50) >= imposto){
                imposto = 0;
            }
            else{
                imposto = imposto - (this.quantDepen*50);
            }
        }
        return imposto;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", RG: " + this.rg + ", CPF: " +
        this.cpf + ", Salario Mensal: " + this.salMensal +
        ", Quantidade de Dependentes: " + this.quantDepen;
    }
}
