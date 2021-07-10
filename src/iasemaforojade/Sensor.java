
package iasemaforojade;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MarcoAntônio, Italo, Wellison
 */
public class Sensor extends Agent {
    public Integer flux1 = 0, flux2 = 0;

    public Integer getFlux1() {
        return flux1;
    }

    public void setFlux1(Integer flux1) {
        this.flux1 = flux1;
    }

    public Integer getFlux2() {
        return flux2;
    }

    public void setFlux2(Integer flux2) {
        this.flux2 = flux2;
    }

    
    
    @Override
    protected void setup() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Sensor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                observarFluxos();//determina os fluxos
                enviarFluxo(getFlux1(),getFlux2());
                
                try {
                    Thread.sleep(10000);//espera 10s antes de começar um novo ciclo
                } catch (InterruptedException ex) {
                    Logger.getLogger(Sensor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void observarFluxos(){//determina os fluxos
        Random rd = new Random();
        setFlux1(rd.nextInt(30));
        setFlux2(rd.nextInt(30));
    }
    
    public void enviarFluxo(Integer fluxo1, Integer fluxo2){
        ACLMessage msg1 = new ACLMessage(ACLMessage.INFORM);
        msg1.setContent(fluxo1.toString());
        msg1.addReceiver(new AID("Plano", AID.ISLOCALNAME));
        send(msg1);
        ACLMessage msg2 = new ACLMessage(ACLMessage.INFORM);
        msg2.setContent(fluxo2.toString());
        msg2.addReceiver(new AID("Plano", AID.ISLOCALNAME));
        send(msg2);
    }
}
