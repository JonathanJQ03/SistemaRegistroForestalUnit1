/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.espe.proyectofinalunidad1.service;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
//ESTE ARCHIVO UNICAMENTE ES PARA VER EL FUNCIONAMIENTO DE LA API NO LE HAGAN CASO

/**
 *
 * @author jonat
 */
@WebService (serviceName = "EjemploHolaMundo")
public class EjemploHolaMundo {
    @WebMethod(operationName = "decirHolaMundo")
    public String decirHolaMundo() {
        return "¡Hola Alex Ñacato :)!";
    }
}


