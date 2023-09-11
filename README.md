# CRUnion-Casa-de-Cambio

Temas de Estudio
* Java y la programación orientada a objetos
* Programación orientada a objetos: Métodos.
* Programación orientada a objetos: Herencia y polimorfismo.
* Manipulación de estructuras de datos.

## Software de Desarrollo
NetBeans

## Desarrollo
Con base en la tarea 1, CRUnion, ha querido aplicar mejoras en el sistema de conversiones de
moneda. Es por ello que se requiere aplicar las siguientes mejoras:
* Desarrollar una interfaz gráfica (GUI) que permita el registro de nuevas monedas en la clase
Equivalencias. Para ello, debe crear una clase Equivalencias_Nuevas, que hereda de la clase
Equivalencias y que desarrolla los nuevos métodos llamados
  * Agregar_Nueva_Equivalencia (debe validar que la moneda a ingresar no exista anteriormente)
  * Actualizar_Valores_Equivalencias (debe validar que la monda a actualizar existe anteriormente)
* Desarrollar una clase Conversion_Nueva que herede de la clase Conversión mejorando los
siguientes métodos:
  * CompraDólares: el precio de compra de los dólares puede aumentar de forma proporcional a la siguiente tabla:
 
![Captura de pantalla 2023-09-10 233834](https://github.com/josuecross/CRUnion-Casa-de-Cambio/assets/85675115/6e6b19e9-d2c1-472b-8eb8-67be3157a8cf)

* VentaDolares: se cobra un impuesto sobre la cantidad final de dólares a vender, según la siguiente tabla
![image](https://github.com/josuecross/CRUnion-Casa-de-Cambio/assets/85675115/95aadd7d-a372-4db9-b9e5-a2112c4fb7a5)

La empresa busca llevar un registro de todas las personas que realizan conversiones de monedas, así como el histórico de conversiones realizadas.
Para ello, debe crear una clase nueva llamada Cliente, con los siguientes atributos y sus respectivos
métodos:
* Id Cliente
* Nombre
* Apellidos
* Nacionalidad
* EdadProgramación Intermedia Código: 00824

Esta clase, deberá ser utilizada para administrar un archivo donde el usuario podrá ingresar, borrar y
modificar clientes.

Se debe actualizar la aplicación para que a la hora de realizar la conversión de moneda, se incluya un
campo para ingresar el id de cliente. Si el cliente no existe, no se puede realizar la conversión.
Una vez que se realiza la conversión, se debe consultar al usuario si se acepta la conversión de
moneda, en cuyo caso, dicha conversión debe quedar almacenado en un archivo de registro de las
conversiones realizadas (debe contener el id del cliente)

Finalmente se debe realizar dos reportes que permitan visualizar la información almacenada. El primer
reporte mostrar la información de las conversiones que ha realizado un cliente, por lo que se debe
indicar el id del cliente a consultar.

El segundo reporte debe mostrar un resumen de las conversiones realizadas agrupando los montos
por moneda origen y moneda destino

## Validaciones importantes a tomar en cuenta
* No se puede ingresar dos personas con el mismo id.
* No se puede borrar una persona que ya tenga registros de conversiones históricas.
* Los archivos deben conservar la información entre ejecuciones.
* La edad de las personas debe ser mayor de 18 años.
* Al modificar un cliente, el id de cliente se puede modificar si y solo si no existen
registros históricos de conversiones
