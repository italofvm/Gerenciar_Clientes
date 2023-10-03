package br.com.projeto.api.controle;

import br.com.projeto.api.modelo.Cliente;
import br.com.projeto.api.repositorio.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class Controle {

    @Autowired
    private Repositorio clienteRepository;

    @PostMapping("/")
    public Cliente cadastrar(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }


    @GetMapping("/")
    public Iterable<Cliente> selecionar() {
        return clienteRepository.findAll();
    }

    @PutMapping("/")
    public Cliente editar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @DeleteMapping("/{codigo}")
    public void remover(@PathVariable long codigo){
        clienteRepository.deleteById(codigo);
    }
}
