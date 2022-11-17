package pe.com.mass.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.mass.entity.ClienteEntity;
import pe.com.mass.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteRepository repositoriocliente;
    @Override
    public List<ClienteEntity> findALL() {
        return repositoriocliente.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ClienteEntity> findAllCustom() {
        return repositoriocliente.findAllCustom(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<ClienteEntity> findById(Long id) {
        return repositoriocliente.findById(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ClienteEntity add(ClienteEntity c) {
        return repositoriocliente.save(c); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ClienteEntity update(ClienteEntity c) {
        ClienteEntity objcliente= repositoriocliente.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objcliente);
        return repositoriocliente.save(objcliente);
    }

    @Override
    public ClienteEntity delete(ClienteEntity c) {
        ClienteEntity objcliente= repositoriocliente.getById(c.getCodigo());
        objcliente.setEstado(false);
        return repositoriocliente.save(objcliente);
    }
    
}
