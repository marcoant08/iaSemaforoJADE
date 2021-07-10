
package iasemaforojade;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
/**
 *
 * @author MarcoAntônio, Italo, Wellison
 */
public class Semaforo extends Agent {
    public Integer tempoSe1 = 0, tempoSe2 = 0;

    public Integer getTempoSe1() {
        return tempoSe1;
    }

    public void setTempoSe1(Integer tempoSe1) {
        this.tempoSe1 = tempoSe1;
    }

    public Integer getTempoSe2() {
        return tempoSe2;
    }

    public void setTempoSe2(Integer tempoSe2) {
        this.tempoSe2 = tempoSe2;
    }
    
    @Override
    protected void setup(){
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                //recebe mensagem de outro agente
                ACLMessage msg = receive();
                if(msg!=null){
                    //seta o tempo em que o semáforo vai ficar verde
                    if(msg.getContent().substring(0, 1).equals("1")){
                        setTempoSe1(Integer.parseInt(msg.getContent().substring(1)));
                   };
                    if(msg.getContent().substring(0, 1).equals("2")){
                        setTempoSe2(Integer.parseInt(msg.getContent().substring(1)));
                    }
                    
                }else block();
            }
        });
    }
    
}
