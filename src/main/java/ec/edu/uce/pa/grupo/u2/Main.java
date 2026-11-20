package ec.edu.uce.pa.grupo.u2;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import ec.edu.uce.pa.grupo.u2.pedidos.application.ClienteService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.EnvioService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.PagoService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.PedidoService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.ProductoService;
import ec.edu.uce.pa.grupo.u2.pedidos.application.VentaService;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Envio;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pago;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Producto;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Venta;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

    

@QuarkusMain 
public class Main implements QuarkusApplication {

    @Inject 
    private PedidoService pedidoService;

    @Inject 
    private ClienteService clienteService;

    @Inject
    private EnvioService envioService;

    @Inject
    private PagoService pagoService;

    @Inject
    private ProductoService productoService;

    @Inject
    private VentaService ventaService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {

        Cliente cliente = new Cliente();
        cliente.setNombre("Juanki");
        cliente.setApellido("Caranqui");
        cliente.setCedula("1754103164");
        cliente.setTelefono("+593 9957 061 20");
        this.clienteService.guardar(cliente);
        
        Envio envio = new Envio();
        envio.setDireccionDestino("San Juan de Calderón");
        envio.setFechaEnvio(LocalDateTime.now());
        envio.setFechaEntrega(LocalDateTime.now());
        envio.setTransportista("Ismael");
        this.envioService.guardar(envio);

        Pago pago = new Pago();
        pago.setMonto(new BigDecimal("888.8"));
        pago.setFechaPago(LocalDateTime.of(2025, 1, 19, 20, 8));
        pago.setMetodoPago("Paypal");
        pago.setEstado("Pagado");
        this.pagoService.guardar(pago);

        Pedido pedido = new Pedido();
        pedido.setProducto("pc");
        pedido.setPrecio(200.0);
        pedido.setFecha(LocalDateTime.now());
        this.pedidoService.guardar(pedido);

        Producto producto = new Producto();
        producto.setNombre("Laptop");
        producto.setDescripcion("ASUS TUF GAMING");
        producto.setPrecio(new BigDecimal("444.2"));
        producto.setStock(1);
        this.productoService.guardar(producto);

        Venta venta = new Venta();
        venta.setNumeroVenta(1);
        venta.setFecha(LocalDateTime.now());
        venta.setSubtotal(new BigDecimal("900"));
        venta.setDescuento(new BigDecimal("0.08"));
        venta.setTotal(venta.getSubtotal().subtract(venta.getSubtotal().multiply(venta.getDescuento())));
        ventaService.guardar(venta);
        return 0;


    }


}
