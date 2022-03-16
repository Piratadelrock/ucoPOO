package Banco.dominio;

import java.util.Date;

public class CuentaBancaria {

//atributos
    public Banco banco;
    public String tipo; //corriente o de ahorros
    public Persona titular;
    public String numero; //
    public double saldo;
    public Date fechaApertura;
    public String contrasena;
    public String estado;

//metodos
    public String consultarSaldo(){
        return "Hola " + this.titular.nombre +", Su saldo es: " + this.saldo;
    }

    public boolean retirar(double valorARetirar){

        if (valorARetirar <= saldo && estado.equals("ACTIVA")){
            saldo = saldo - valorARetirar;
            return true;
        }else{
            return false;
        }
    }

    public boolean consignar(double valorAConsignar){
        if (valorAConsignar > 0 && this.estado.equals("ACTIVA")){
            this.saldo += valorAConsignar;
            return true;
        }else{
            return false;
        }
    }

    public boolean transferir(double valorAtransferir, CuentaBancaria cuentaDestino) {
        //  this se refiere al objeto actual, se refiere a retirar de esta cuenta origen
        //  tambien se puede dejar de usar this, pero es una buena practica
        return this.retirar(valorAtransferir) && cuentaDestino.consignar(valorAtransferir);

//    da error si al realizar el retiro no se valida porque estaria realizandose el retiro y la consignacion al tiempo

//        boolean procesoRetiro = this.retirar(valorAtransferir);
//        if(procesoRetiro){
//            boolean procesoConsignacion = cuentaDestino.consignar(valorAtransferir);
//            boolean procesoTransferencia = procesoRetiro && procesoConsignacion;
//            return procesoTransferencia;
//        }
//        else
//        {
//            return false;
//
//        }

        //        sin refactorizar codigo repetido
        //        if (valorAtransferir <= saldo && cuentaDestino.estado.equals("ACTIVA")){
        //            cuentaDestino.saldo  += valorAtransferir;
        //            saldo -= valorAtransferir;
        //
        //            return true;
        //        }else{
        //            return false;
        //        }
    }

}
