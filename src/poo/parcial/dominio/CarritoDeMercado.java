package poo.parcial.dominio;

import poo.taller.punto2b.dominio.Contacto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarritoDeMercado {
    public static final byte CAPACIDAD = 20;

    private String supermercado;
    private List<Producto> productos;

    public CarritoDeMercado(String supermercado) {
        this.supermercado = supermercado;
        this.productos = new ArrayList<>();
    }

    //public boolean agregar(Producto p) {
    //    return true;
    //}

    public Producto buscar(String nombre) {
        Producto buscarProducto = this.productos.stream().filter(producto -> {
            return producto.getNombre() == nombre;
        }).findFirst().orElse(null);

        if (buscarProducto != null) {
            System.out.println("Se encontró el producto: " + nombre);
        } else {
            System.out.println("No se encontró el producto " + nombre + "en el carrito");
        }
        return buscarProducto;
    }

    public List<String> buscarPorTipo(String tipo) {
        ArrayList<String> buscarProduct = new ArrayList<String>();
        for (int i = 0; i < this.productos.size(); i++) {
            if (this.productos.get(i).getTipo().equals(tipo)) {
                buscarProduct.add(this.productos.get(i).getTipo());
            }
        }
        System.out.println("Los productos que se encuentran agotados son: " + buscarProduct );
        return buscarProduct;
    }

    public boolean sacar(String nombre) {
        for (Producto produc: this.getProductos()) {
            if (produc.getNombre().equals(nombre) ){
                List<String> nombresProductos = this.productos.stream().map(producto -> producto.getNombre()).collect(Collectors.toList());
                int indiceProducto = nombresProductos.indexOf(nombre);
                getProductos().remove((indiceProducto + 1));
                System.out.println("Se eliminó exitosamente el producto: " + produc.getNombre() + "del carrito");
                return true;
            }
        }
        return false;
    }

    public int calcularValorTotal() {
        int totalPrecio = 0;
        for (int i = 0; i < this.productos.size(); i++) {
            totalPrecio += this.productos.get(i).getPrecio();
        }
        System.out.println(totalPrecio + " es el total de su compra");
        return totalPrecio;
    }

    public Producto obtenerProductoMasCaro() {
        this.getProductos().stream().mapToInt(Producto::getPrecio);
        int precioCaro = obtenerProductoMasCaro().getPrecio();
        for (Producto producCaro: this.getProductos()) {
            if (producCaro.getPrecio() == obtenerProductoMasCaro().getPrecio() ){
                Producto nombresProductosCaros = this.getProductos().stream()
                        .filter(producto -> {
                            return producto.getPrecio() == obtenerProductoMasCaro().getPrecio();
                        }).findFirst().orElse(null);

                return true;
            }
        }
        return false;

        }
    }

    public String getSupermercado() {
        return supermercado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setSupermercado(String supermercado) {
        this.supermercado = supermercado;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
