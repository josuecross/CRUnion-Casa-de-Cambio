package tarea1;


public class Conversion_Nueva extends Conversion{
    //Constructor
    public Conversion_Nueva(Equivalencias_Nuevas equivalencia){
        super(equivalencia);
    }
    
    //Metodo que recibe como parametros un monto en dolares y devuelve su equivalencia en la moneda destino.
    @Override
    public float compraDolares(String monedaDestino, float montoDolares){
        float montoFinal;
        float precioCompra = getEquivalencia().precioCompra(monedaDestino);
        float aumentoCompraDolares;
        /*
        15% de la diferencia entre el precio de compra y precio de venta si la 
        cantidad de dólares a comprar es mayor o igual a 3000 y menor a 6000
        */
        if(montoDolares >= 3000 && montoDolares < 6000){
            aumentoCompraDolares = (precioCompra - getEquivalencia().precioVenta(monedaDestino)) * 0.15f;
            precioCompra+= aumentoCompraDolares;
        } 
        /*
        25% de la diferencia entre el precio de compra y precio de venta si la
        cantidad de dólares a comprar es mayor o igual a 6000 y menor a 9000
        */
        else if(montoDolares >= 6000 && montoDolares < 9000){
            aumentoCompraDolares = (precioCompra - getEquivalencia().precioVenta(monedaDestino)) * 0.25f;
            precioCompra+= aumentoCompraDolares;
        }
        /*
        35% de la diferencia entre el precio de compra y precio de venta si la
        cantidad de dólares a comprar es mayor o igual a 9000
        */
        else if(montoDolares >= 9000){
            aumentoCompraDolares = (precioCompra - getEquivalencia().precioVenta(monedaDestino)) * 0.35f;
            precioCompra+= aumentoCompraDolares;
        }
        montoFinal = montoDolares * precioCompra; //Realiza la convercion.
        this.setTotalDolaresComprados(this.getTotalDolaresComprados() + montoDolares); //Actualiza el total de dolares comprados por CRUnion.
        return montoFinal;
    }
    
     //Metodo que recibe como parametros un monto y la divisa de origen y devuelve su equivalente en dolares.
    @Override
     public float ventaDolares(String monedaOrigen, float montoDineroRecibido){
        float dolares;
        dolares = montoDineroRecibido / getEquivalencia().precioVenta(monedaOrigen); //Realiza la convercion.
        /*
        1% si la cantidad de dólares a vender es mayor o igual a 3000 y menor
        a 6000
        */
        if(dolares >= 3000 && dolares < 6000) 
            dolares*= 1.01;
        /*
        2% si la cantidad de dólares a vender es mayor o igual a 6000 y menor
        a 9000
        */
        else if(dolares >= 6000 && dolares < 9000)
            dolares*= 1.02;
        /*
        3% si la cantidad de dólares a vender es mayor o igual a 9000 
        */
        else if(dolares >= 9000)
            dolares*= 1.03;
        this.setTotalDolaresVendidos(getTotalDolaresVendidos() + dolares); //Actualiza la cantidad total de dolares vendidos de CRUnion.
        return dolares;
     }
    
}
