
public class funcionarios{
private String nome;
private double horaTrabalho;
private double horaSalario;
private int dependentes;

public funcionarios(String nome){
    this.nome = nome;
    this.horaTrabalho = 0;
    this.horaSalario = 0;
    this.dependentes = 0;
}

public boolean setNome (String nome){
     if(nome!=null){
         this.nome = nome;
         return true;
     }
     else{
         return false;
     }
    }

public String getNome(){
    return this.nome;
}

public boolean setHoraTrabalho (double horaTrabalho){
     if(horaTrabalho>=1){
         this.horaTrabalho = horaTrabalho;
         return true;
     }
     else{
         return false;
     }
    }

public double getHoraTrabalho(){
    return this.horaTrabalho;
}
public boolean setHoraSalario (double horaSalario){
     if(horaSalario>=1){
         this.horaSalario = horaSalario;
         return true;
     }
     else{
         return false;
     }
    }

public double getHoraSalario(){
    return this.horaSalario;
}

public boolean setDependentes (int dependentes){
     if(dependentes>=0){
         this.dependentes = dependentes;
         return true;
     }
     else{
         return false;
     }
    }

public int getDependentes(){
    return this.dependentes;
}

public double calcularSalarioBruto(){
     double salariobruto = this.horaTrabalho * this.horaSalario + (50*this.dependentes);
     return salariobruto;
    }

public double calcularINSS(){
     double salariobruto = calcularSalarioBruto();
     double inss = 0;
     if(salariobruto<=1000){
        inss = salariobruto*0.085;
        return inss;
     }
     else{
        inss = salariobruto*0.09;
        return inss;   
     }
    }

public double calcularIR(){
     double ir = 0;
     if(calcularSalarioBruto()<500){
        return ir;
     }
     else if(calcularSalarioBruto()>500 && calcularSalarioBruto()<100){
        ir = calcularSalarioBruto()*0.05;
        return ir;   
     }
     else{
         ir = calcularSalarioBruto()*0.07;
         return ir;
     }
    }
    
public double calcularSalarioLiquido(){
     double salarioliquido = calcularSalarioBruto() - calcularINSS() - calcularIR();
     return salarioliquido;
    }
    
public String toString(){
    return "Nome: " + getNome() + ", Dependentes: " + getDependentes() + ", SalHora: " + getHoraSalario() + ", Qtd. Horas Trab: " + getHoraTrabalho() + ", Sal. Bruto: " + calcularSalarioBruto() + ", INSS: " + calcularINSS() + ", IR: " + calcularIR() + ", Sal. Liquido: " + calcularSalarioLiquido();
}
    
}
