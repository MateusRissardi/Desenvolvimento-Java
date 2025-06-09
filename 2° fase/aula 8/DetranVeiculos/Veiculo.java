import java.text.DecimalFormat;
public class Veiculo
{
    protected String modelo;
    protected int ano;
    protected String placa;
    protected double valor;
    protected double ipva;
    protected DecimalFormat df = new DecimalFormat("#.00");
    
    public boolean setModelo(String modelo){
        if(modelo!=null){
            this.modelo = modelo;
            return true;
        }
        else{
            return false;
        }
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public boolean setAno(int ano){
        if(ano >= 1920){
            this.ano = ano;
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public boolean setPlaca(String placa){
        if(placa!=null){
            this.placa = placa;
            return true;
        }
        else{
            return false;
        }
    }
    
    public String getPlaca(){
        return this.placa;
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
    
    public double calcularIPVA(){
        this.ipva = valor * 0.02;
        return this.ipva;
    }
    
    public String toString(){
        return "Modelo: " + this.modelo + ", Ano: " + this.ano + 
        " , Placa: " + this.placa + ", Valor: R$" + df.format(this.valor) + ", IPVA: R$" + this.df.format(this.ipva); 
    }
}
