package tarea1;

//Esta clase maneja los procedimientos para la realizacion de converciones de diviza por parte de CRUnion
public abstract class Conversion {
    private Equivalencias_Nuevas equivalencia;
    private float totalDolaresComprados;
    private float totalDolaresVendidos;
    
    //Constructor de la clase;
    public Conversion(Equivalencias_Nuevas equivalencia){
        this.equivalencia = equivalencia;
        this.totalDolaresComprados = 0;
        this.totalDolaresVendidos = 0;
    }
    
    //Realiza la convercion de dinero desde una moneda origen hacia una moneda destino.
    public float convercionMoneda(String monedaOrigen, String monedaDestino, float dineroInicial){
        float dolares;
        float dineroFinal;
        if(monedaOrigen == "Dólar Estado Unidense"){
            dolares = dineroInicial;
            dineroFinal = compraDolares(monedaDestino, dolares);
        } //Si la moneda origen es dolares, CRUnion no necesita vender dolares.
        else if(monedaDestino == "Dólar Estado Unidense"){
            dineroFinal = ventaDolares(monedaOrigen, dineroInicial);
        }//Si la moneda destino es dolares, CRUnion necesita unicamente venderselos.
        else{
            dolares = ventaDolares(monedaOrigen, dineroInicial);
            dineroFinal = compraDolares(monedaDestino, dolares);
        }//En otro caso se realiza una venta de dolares primero y luego son comprados por CRUnion en la moneda destino.
        
        
        return dineroFinal;
    }
    
    //Metodo que recibe como parametros un monto y la divisa de origen y devuelve su equivalente en dolares.
    public abstract float ventaDolares(String monedaOrigen, float montoDineroRecibido);
    
    //Metodo que recibe como parametros un monto en dolares y devuelve su equivalencia en la moneda destino.
    public abstract float compraDolares(String monedaDestino, float montoDolares);

    /**
     * @return the totalDolaresComprados
     */
    public float getTotalDolaresComprados() {
        return totalDolaresComprados;
    }

    /**
     * @return the totalDolaresVendidos
     */
    public float getTotalDolaresVendidos() {
        return totalDolaresVendidos;
    }

    /**
     * @return the equivalencia
     */
    public Equivalencias_Nuevas getEquivalencia() {
        return equivalencia;
    }

    /**
     * @param equivalencia the equivalencia to set
     */
    public void setEquivalencia(Equivalencias_Nuevas equivalencia) {
        this.equivalencia = equivalencia;
    }

    /**
     * @param totalDolaresComprados the totalDolaresComprados to set
     */
    public void setTotalDolaresComprados(float totalDolaresComprados) {
        this.totalDolaresComprados = totalDolaresComprados;
    }

    /**
     * @param totalDolaresVendidos the totalDolaresVendidos to set
     */
    public void setTotalDolaresVendidos(float totalDolaresVendidos) {
        this.totalDolaresVendidos = totalDolaresVendidos;
    }
}
