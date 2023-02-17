package com.tienda_v2.service;

import com.tienda_v2.domain.Cliente;
import java.util.List;

public interface ClienteService {

    //se recupera una lista con todos los registros de la tabla cliete
    public List<Cliente> getClientes();

    // Se recupera el registro que tiene el idCIiente pasado por parámetro
    // si no existe en Ia tabla se retorna null
    public Cliente getCliente(Cliente cliente);

    // Se elimina el registro que tiene el idC1iente pasado por parámetro
    public void deleteCliente(Cliente cliente);

    // Si el objeto cliente tiene un idCIiente que existe en Ia tabla cliente
    // EI registro de actualiza con Ia nueva información
    // Si el idCIiente NO existe en Ia tabla, se crea el registro con esa información
    public void saveCliente(Cliente cliente);
}
