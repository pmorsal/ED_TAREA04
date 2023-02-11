package Cuentas;
// Esta clase simula el comportamiento de una cuenta bancaria
public class CCuenta {

//atributos
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
//constructor con diferentes paramertros
       public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
//saldo de la cuenta
    public double estado()
    {
        return getSaldo();
    }
//cantidad a ingresar en la cuenta
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
//excepcion devuelta en caso que se introduzca un número negativo o se haya puesto una cantidad > saldo
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

 //nombre del titular de la cuenta   
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el nº de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta, nº de cuenta a pasarle como parametro
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo saldo para pasarle como parametro
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return el tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés el tipoInterés para pasarle como parametro
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
}