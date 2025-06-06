import java.util.ArrayList;
public class Detran
{
    private String estado;
    ArrayList<Veiculo> veiculos;
    
    public Detran(String estado){
        this.estado = estado;
        this.veiculos = new ArrayList<Veiculo>();
    }
    
    public boolean setEstado(String estado){
        if((estado != null) && (estado.length() == 2)){
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
    
    public void addVeiculo(Veiculo umVeiculo){
        veiculos.add(umVeiculo);
    }
    
    public String toString(){
        String texto = "Estado: " + this.estado + "\n";
        for(Veiculo umVeic : this.veiculos){
            texto += umVeic.toString() + "\n";
        }
        return texto;
    }
}
