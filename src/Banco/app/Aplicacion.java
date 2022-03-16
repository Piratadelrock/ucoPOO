package Banco.app;

import Banco.dominio.CuentaBancaria;
import Banco.dominio.Persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aplicacion {
    public static void main(String[] args) {

// ejercicio de cuenta bancaria
        Persona emmanuelJose = new Persona();
        Persona juanSebastian = new Persona();

        CuentaBancaria miCuenta = new CuentaBancaria();
        CuentaBancaria cuentaSebas = new CuentaBancaria();

        emmanuelJose.nombre = "Emmanuel Jose";
        miCuenta.titular = emmanuelJose;
        miCuenta.saldo = 316000;
        miCuenta.estado = "ACTIVA";

        juanSebastian.nombre = "Juan Sebastian";
        cuentaSebas.titular = juanSebastian;
        cuentaSebas.saldo = 0;
        cuentaSebas.estado = "ACTIVA";

        miCuenta.retirar(300000);

        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaSebas.consultarSaldo());

        boolean resultadoTransferencia = miCuenta.transferir(216000,cuentaSebas);

        System.out.println(resultadoTransferencia);
        System.out.println(miCuenta.consultarSaldo());
        System.out.println(cuentaSebas.consultarSaldo());

//

//
//        /*
//        <> el desarrollador popular dice operador diamante, oficialmente se conoce como operador genericos
//        dentro de la lista diremos de que es, por ejemplo una lista de strings, de nombres!
//        estos nombres se almacenaran dentro de la lista nombres
//        */
//
//        List<String> listaDeNombres = Arrays.asList("Sebastian", "Anderson", "Emmanuel");
//
//        //stream para trabajar con programacion funcional, anymatch para
//        // usar una funcion de si encuentra el nombre igual al especificado
//        //retornara un boolean true o false si encuentra nombres iguales a los mencionados
//
//        boolean existenMalos = listaDeNombres.stream()
//                .anyMatch(nombre -> nombre.equals("Sebastian") || nombre.equals("Anderson"));
//
//        System.out.println("existen malos? " + existenMalos);
//
//// stream: es un concepto de programacion funcional,
//// no hace parte de poo pero que se esta haciendo
//// mucho software hoy en dia nombre es como el predicado, como del foreach que se da
//// para almacenar o seleccionar los datos de la lista de nombres en la lista malos,
//
//        List<String> listaMalos = listaDeNombres.stream()
//                .filter(nombre -> nombre.equals("Sebastian") || nombre.equals("Anderson"))
//                .collect(Collectors.toList());
//
//        listaMalos.forEach(malo -> System.out.println(malo));
//
//// operador ternario: es como tirar un if pero en una linea , me evita tener que escribir ifs y hacerlo de una forma mas limpia
//// tener un forEach  pero se debe usar en una variable
//        // el operador ternario no se puede usar el procesamiento como de tipo sout y lo refactorizara a un if
//
//        listaDeNombres.forEach(x -> {
//            System.out.println(x);
//            String resultado = x.equals("Sebastian") || x.equals("Anderson") ? "Ojo son malos" : "pueden votar";
//            System.out.println(resultado);
//        });
//
//        //al ser una lista tiene un metodo llamado forEach:
//        //recibe un consumer, conocido como arrow function, lo primero es como llamare yo cada variable que esta dentro de la lista
//        //variable -> lo que quiero que se ejecute para cada elemento, eso puede ir en la misma linea, si es una sola linea
//        // si es mas de una linea se requiere un cuerpo {}
//
//        listaDeNombres.forEach(asistente -> {
//            System.out.println("llama metodo forEach" + asistente);
//        });

//        //foreach sale como for pero se escribe diferente en el parametro, tipoVariable variable : listaARecorrer
//        for (String quienEs:listaDeNombres) {
//            if(quienEs.equals("Emmanuel")){
//                System.out.println("Que mas Emmanuel");
//            }
//            System.out.println("lista for each: "+quienEs);
//        }

//        //for tradicional: para usar la iteraccion de la lista, no existe .lenght se usa .size
//            // para obtener un elemento de la lista se usa .get(i) recibe la posicion
//        for (int i = 0; i< listaDeNombres.size();i++){
//            System.out.println("lista for: "+listaDeNombres.get(i));
//        }


//        //do while: EJECUTA EL CUERPO ALMENOS UNA VEZ, SI LA CONDICION ES FALSA SE SALE
//        int contadorDo = 9;
//        do{
//            System.out.println("VAMOS EN: "+ contadorDo);
//            contadorDo++;
//        }while(contadorDo <= 10);
//
//        //while
//        int contador = 0;
//        while(contador <= 10){
//            System.out.println("VAMOS EN: "+ contador);
//            contador++;
//        }


//        //switch case
//        int mes=8;
//        String nombre= "Emmanuel";
//        switch (mes){
//            case 1:{
//                System.out.println("Es enero!");
//                break;
//            }
//            case 2:{
//                System.out.println("Es febrero!");
//                break;
//            }
//            case 3:{
//                System.out.println("Es marzo!");
//                break;
//            }
//            case 4:{
//                System.out.println("Es abril!");
//                break;
//            }
//            default: {
//                System.out.println("No es ningun mes");
//            }
//        }

//        //sesion2
//
//        //creando un objeto en base al molde, "creando una persona" y su cuenta bancaria
//        Persona emmanuel =  new Persona();
//        CuentaBancaria miCuenta = new CuentaBancaria();
//
//        emmanuel.nombre= "Emmanuel Jose";
//        emmanuel.cedula = 101010101;
//
//        miCuenta.titular = emmanuel;
//        miCuenta.saldo = 316000;
//
//        // si se ejecuta, pero debemos mostrarlo con sout miCuenta.consultarSaldo();
//        System.out.println(miCuenta.consultarSaldo());
//
//
//        //sesion1
//        System.out.println("hola mundo");


    }

}
