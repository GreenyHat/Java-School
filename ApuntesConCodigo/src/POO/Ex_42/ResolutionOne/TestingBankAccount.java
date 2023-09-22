package POO.Ex_42.ResolutionOne;

import java.util.Random;

/**
 * Esta clase se encarga de la creación de una cuenta bancaria y de
 * diversas operaciones sencillas que se pueden realizar con ella 
 * @version 1.2
 * @author GreenyHat
 */

public class TestingBankAccount {// Ej 42 de pildoras
    //Atributos de clase
    private double amount;
    private String user;
    private long accountNumber;

    /**
     * Esta es la documentación del constructor
     * 
     * @param amount Almacena la CANTIDAD de dinero ingresada en cuenta
     * @param user   Almacena el NOMBRE del usuario de la cuenta 
     * @see Bank#createNewAccount()
     */
    public TestingBankAccount(double amount, String user) {

        this.user = user;
        this.amount = amount;
        Random random = new Random();
        accountNumber = Math.abs(random.nextLong());// genero un numero aleatorio instanciando Random y a su vez le digo
                                                    // que me de un long y usando el math abs obtengo el valor absoluto
                                                    // por si me diera un numero negativo

        System.out.println("Your account number is: " + accountNumber);
    }

    //CON EL '#' INDICAMOS QUE SE USA EL METODO X DE LA CLASE Y 

    /**
     * Este método añadi dinero a una cunta
     * 
     * @param money Modifica la variable ammount, en este caso con un ingreso
     * @see Bank#transferMoney(TestingBankAccount, TestingBankAccount, double)  
     *   
     * La condición impide que se pueda "ingresar una cantidad negativa"
     */
    public void setAddMoney(double money) {

        if (money < 0) {
            System.out.println("Incorrect format");
        } else {
            this.amount += money;// se guarda en la variable de clase
        }

    }

    /**
     * Este método resta dinero a una cuenta
     * 
     * @param money Modifica la variable ammount, en este caso con un extracto
     * @see Bank#transferMoney(TestingBankAccount, TestingBankAccount, double)
     */
    public void setExtractMoney(double money) {
        this.amount -= money;
    }

    /**
     * 
     * @return Devuelve la información completa de una cuenta 
     */
    public String getAccountInfo() {
        return "Name: " + user + "\nAmount: "
                + amount + "\nAccount number: "
                + accountNumber;
    }

    /**
     * 
     * @param user1 Variable que almacena la cuenta que emite una cantidad
     * @param user2 Variable que almacena la cuenta que recibe una cantidad
     * @param total Variable que almacena el resultado de ambos amount tras la operación
     */
    public static void Transfer(TestingBankAccount user1, TestingBankAccount user2, double total) {
        user1.amount -= total;
        user2.amount += total;
    }

}

