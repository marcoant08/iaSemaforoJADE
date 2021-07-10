
package iasemaforojade;

/**
 *
 * @author MarcoAntônio, Italo, Wellison
 */
public class IaSemaforoJADE {
    public static void main(String[] args) {
        String[] args1 = {"-gui"};
        String[] args2 = {"-container","Sensor1:iasemaforojade.Sensor;"+
                "Sensor2:iasemaforojade.Sensor;"};
        String[] args3 = {"-container","Semaforo1:iasemaforojade.Semaforo;"+
                "Semaforo2:iasemaforojade.Semaforo;"};
        String[] args4 = {"-container", "Plano:iasemaforojade.Plano;"};
        
        jade.Boot.main(args1);
        jade.Boot.main(args2);
        jade.Boot.main(args3);
        jade.Boot.main(args4);
    }
}
