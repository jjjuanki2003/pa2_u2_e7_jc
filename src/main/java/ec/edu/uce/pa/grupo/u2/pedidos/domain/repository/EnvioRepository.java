package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Envio;

public interface EnvioRepository {
    
    public void create(Envio envio);
    public Optional<Envio> read(Long id);
    public Optional<Envio> readByTransportista(String transportista);
    public List<Envio> readAll();
    public void update(Envio envio);
    public void delete(Long id);

    
}
