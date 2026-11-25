package ec.edu.uce.pa.grupo.u2.pedidos.application;

import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Envio;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.EnvioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class EnvioService {

    @Inject
    private EnvioRepository envioRepository;

    public void guardar(Envio envio) {
        this.envioRepository.create(envio);
    }
    
    public Optional<Envio> findById(Long id) {
        return this.envioRepository.read(id);
    }

    public Optional<Envio> findByTransportista(String transportista) {
        
        return this.envioRepository.readByTransportista(transportista);
    }

    public void actualizar(Envio envio){
        this.envioRepository.update(envio);
    }

    public void eliminar(Long id) {
        this.envioRepository.delete(id);
    }
}
