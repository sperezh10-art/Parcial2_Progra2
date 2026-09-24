package com.umg.api;

import com.umg.api.model.Customer;
import com.umg.api.service.CustomerService;
import java.util.List;

public class CostumerApi {
    public static void main(String[] args) {
        CustomerService servicio = new CustomerService();
        try {
            List<Customer> clientes = servicio.getCustomers();

            if (clientes == null) {
                System.out.println("La lista de clientes está vacía");
            } else {
                System.out.println("---------- Listado Clientes ----------");

                for (Customer c: clientes){
                    System.out.println("ID: " + c.getId());
                    System.out.println("Nombre: " + c.getNombre());
                    System.out.println("Apellido: " + c.getApellido());
                }
            }

        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
