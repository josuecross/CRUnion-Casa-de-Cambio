package tarea1;

public class Equivalencias_Nuevas extends Equivalencias{
    public Equivalencias_Nuevas(int cantidadEquivalencias){
        super(cantidadEquivalencias);
    }
    
    //Crea una nueva equivalencia, se valida que la moneda a ingresar no exista anteriormente
    public int agregarNuevaEquivalencia(String nombreEquivalencia, float precioCompra, float precioVenta){
        for(int i = 0; i < this.getDescripcionesMonedas().length; i++){//ciclo que recorre el array de nombres de equivalencias
            if(this.getDescripcionesMonedas()[i].toUpperCase().equals(nombreEquivalencia.toUpperCase())){
                return 0; //se retorna un 0 si se valida que existe ya la equivalencia
            }
            else if(this.getDescripcionesMonedas()[i].equals("-Vacio-")){
                this.setDescripcionesMonedas(nombreEquivalencia, i); //agrega la moneda
                this.setTablaConverciones(precioCompra, precioVenta, i); //agrega los precios de compra y venta
                return 1; //se retorna un 1 si no existe la equivalencia y se agrega la nueva
            }
        }
        return 2; // se retorna 2 si no hay mas espacios para agregar
    }
    
    //Actualiza los valores de compra y venta para una moneda.
    public int actualizarValoresEquivalencias(String nombreEquivalencia, float precioCompra, float precioVenta){
        //Recorre el array de los nombres de monedas y valida si la moneda a actualizar existe
        for(int i = 0; i < this.getDescripcionesMonedas().length; i++){
            if(this.getDescripcionesMonedas()[i].equals(nombreEquivalencia)){
                this.setTablaConverciones(precioCompra, precioVenta, i); //Actualiza la matriz con los precios de compra y venta
                return 1; //Se retorna 1 si se tuvo exito en actualizar
            }
        }
        return 0; //Retorna 0 si no se encontro la moneda a actualizar.
    }
}
