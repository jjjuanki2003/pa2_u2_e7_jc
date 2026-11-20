package ec.edu.uce.pa.grupo.u2.pedidos.application;

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
    
    public Envio findById(Long id) {
        return this.envioRepository.read(id);
    }

    public void actualizar(Envio envio){
        this.envioRepository.update(envio);
    }

    public void eliminar(Long id) {
        this.envioRepository.delete(id);
    }
}
