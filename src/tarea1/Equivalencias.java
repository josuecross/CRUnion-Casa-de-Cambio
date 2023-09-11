package tarea1;

//ESta clase contiene la informacion utilizada para la convercion de divisas por parte de CRUnion
public abstract class Equivalencias {
    private String[] descripcionesMonedas;
    private float[][] tablaConverciones;
    
    public Equivalencias(){
        //Las monedas con las que se puede realizar conversion de divisas.
        this.descripcionesMonedas = new String[]{
            "Dólar Estado Unidense",
            "Euros", 
            "Colones",
            "Pesos Mexicanos",
            "Córdobas Oro",
            "Pesos Argentinos",
            "Libras Esterlina",
            "Yen"                   
        };
        
        //Precio de compra y venta de dolares en las distintas divisas ofrecidas. TABLA CONVERSIONES
        this.tablaConverciones = new float[][]{
            {0.85f, 0.91f},
            {660f, 670f},
            {20f, 20.5f},
            {33f, 36f},
            {110f, 112.5f},
            {0.70f, 0.76f},
            {119f, 122.5f}
        };     
    }//fin de constructor default
    
    public Equivalencias(int cantidadEquivalencias){
               
         //Las monedas con las que se puede realizar conversion de divisas.
        this.descripcionesMonedas = new String[]{
            "Dólar Estado Unidense",
            "Euros", 
            "Colones",
            "Pesos Mexicanos",
            "Córdobas Oro",
            "Pesos Argentinos",
            "Libras Esterlina",
            "Yen",
            "-Vacio-",
            "-Vacio-",
            "-Vacio-",
            "-Vacio-",
            "-Vacio-",
            "-Vacio-",
            "-Vacio-",
            "-Vacio-",
            "-Vacio-",
            "-Vacio-",
            "-Vacio-",
            "-Vacio-",
            "-Vacio-",
            "-Vacio-",
            "-Vacio-",
            "-Vacio-",
        };
        
        //Precio de compra y venta de dolares en las distintas divisas ofrecidas- TABLA CONVERSIONES
        this.tablaConverciones = new float[][]{
            {1,1},
            {0.85f, 0.91f},
            {660f, 670f},
            {20f, 20.5f},
            {33f, 36f},
            {110f, 112.5f},
            {0.70f, 0.76f},
            {119f, 122.5f},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
            {0,0},
        };    
        
    }
    
    //recibe el tipo de moneda origen (por ejemplo Euros) y
    //devuelve el valor del precio de compra según la tabla Tabla_conversiones
    public float precioCompra(String monedaOrigen){
        for (int i = 0; i < 7; i++) {
            if(monedaOrigen == getDescripcionesMonedas()[i]){
                return getTablaConverciones()[i][0];
            }
        }
        return -1;
    }
    
    // recibe el tipo de moneda origen (por ejemplo Euros) y devuelve el
    //valor del precio de venta según la tabla Tabla_conversiones
    public float precioVenta(String monedaOrigen){
        for (int i = 0; i < 7; i++) {
            if(monedaOrigen == getDescripcionesMonedas()[i]){
                return getTablaConverciones()[i][1];
            }
        }
        return -1;
    }
    
    /*recibe el tipo de moneda origen y devuelve la fila en la que
    se encuentra la misma, esto para poder conocer la fila donde se encuentra el valor de compra y
    venta de la moneda en la tabla Tabla_conversiones.*/
    public int posicionMoneda(String monedaOrigen){
        for (int i = 0; i < 7; i++) {
            if(monedaOrigen == getDescripcionesMonedas()[i]){
                return i;
            }
        }
        return -1;
    }   

    /**
     * @return the descripcionesMonedas
     */
    public String[] getDescripcionesMonedas() {
        return descripcionesMonedas;
    }

    /**
     * @param descripcionesMonedas the descripcionesMonedas to set
     */
    public void setDescripcionesMonedas(String descripcionesMonedas, int indice) {
        this.descripcionesMonedas[indice] = descripcionesMonedas;
    }

    /**
     * @return the tablaConverciones
     */
    public float[][] getTablaConverciones() {
        return tablaConverciones;
    }

    /**
     * @param tablaConverciones the tablaConverciones to set
     */
    public void setTablaConverciones(float tablaConvercionesCompra, float tablaConversionesVenta, int indice) {
        this.tablaConverciones[indice][0] = tablaConvercionesCompra;
        this.tablaConverciones[indice][1] = tablaConversionesVenta;
    }
}//fin de clase Equivalencias
