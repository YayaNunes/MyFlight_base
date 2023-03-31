package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
  
public class VooVariasEscalas extends Voo {
    public VooVariasEscalas(Rota rota, LocalDateTime datahora, Duration duracao) {
        super(rota, datahora, duracao);
        //TODO Auto-generated constructor stub
    }
 //meu deus vai
    
     @Override
     public String toString() {
        return getStatus() + " " + getDatahora() + "("+getDuracao()+"): " + getRota() + " -> " +  getRotaFinal(); 
     }
    
}
