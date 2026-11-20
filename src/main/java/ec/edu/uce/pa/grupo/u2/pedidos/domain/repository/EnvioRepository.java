package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Envio;

public interface EnvioRepository {
    
    public void create(Envio envio);
    public Envio read(Long id);
    public void update(Envio envio);
    public void delete(Long id);

}
