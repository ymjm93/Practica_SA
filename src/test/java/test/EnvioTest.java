/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ws.Envio;

/**
 *
 * @author yessenia
 */
public class EnvioTest {
    
    public EnvioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

 /**
     * Test of cargar_Vehiculos method, of class Envio.
     */
    @Test
    public void testCargar_Vehiculos() {
        System.out.println("cargar_Vehiculos");
        Envio instance = new Envio();
        String result = instance.cargar_Vehiculos();
        assertEquals("prueba", result);
    }

    /**
     * Test of calcular_costo_viaje method, of class Envio.
     */
    @Test
    public void testCalcular_costo_viaje() {
        System.out.println("calcular_costo_viaje");
        Envio instance = new Envio();
        String result = instance.calcular_costo_viaje(123, "prueba");
        assertEquals("prueba", result);
    }

    /**
     * Test of guardar_Transferencia method, of class Envio.
     */
    @Test
    public void testGuardar_Transferencia() {
        System.out.println("guardar_Transferencia");
        Envio instance = new Envio();
        String result = instance.guardar_Transferencia(123,123.0);
        assertEquals("prueba", result);
    }
   
}
