package POO.ServiciosProcesos;

public class CicloDeVidaProcesos {
    /*
     * 1. El SO crea el proceso y pasa a estado NUEVO (el sistema reserva memoria para el)
     * 
     * 2. Cuando se termina de crear el proceso el SO lo admite y pasa a estado LISTO
     *    En el estado LISTO hay una cola de procesos, a los cuales el PLANIFICADOR del SO 
     *    les asigna un orden de cambio de estado y los va seleccionando para ejecutarse. 
     * 
     * 3. Una vez seleccionados pasan a estado EJECUCION. Puede darse el caso de que se necesite una 
     *    operacion de E/S en cuyo caso pasa al estado BLOQUEADO/ESPERA hasta que recibe la info
     *    haya pedido y entonces se ejecute
     */
    
}
