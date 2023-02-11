package Cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, 200);
    }

    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    private static class CCuenta {

        public CCuenta() {
        }

        private CCuenta(String antonio_López, String string, int i, int i0) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private double estado() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void retirar(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void ingresar(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}