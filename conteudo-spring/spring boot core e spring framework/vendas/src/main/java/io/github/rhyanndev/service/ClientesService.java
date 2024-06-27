package io.github.rhyanndev.service;

import io.github.rhyanndev.model.Cliente;
import io.github.rhyanndev.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    @Autowired
    public ClientesService( ClientesRepository repository) {
            this.repository = repository;
    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        //ClientesRepository clientesRepository = new ClientesRepository();
        //clientesRepository.persistir(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente) {
        // aplica validações
    }

}
