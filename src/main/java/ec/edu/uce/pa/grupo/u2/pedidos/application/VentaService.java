package ec.edu.uce.pa.grupo.u2.pedidos.application;

import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Venta;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.VentaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional
public class VentaService {

    @Inject
    private VentaRepository ventaRepository;

    public void guardar(Venta venta) {
        this.ventaRepository.create(venta);
    }

    public Optional<Venta> buscarPorId(Long id) {
        return this.ventaRepository.read(id);
    }

    public Optional<Venta> buscarPorNumero(String numeroVenta) {
        return this.ventaRepository.readByNumber(numeroVenta);
    } 

    public void actualizar(Venta venta) {
        this.ventaRepository.update(venta);
    }

    public void borrar(Long id) { 
        this.ventaRepository.delete(id);
    }
}
