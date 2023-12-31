/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template fileClientes, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1.Visual;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.Popup;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;
import tarea1.Cliente;
import tarea1.Conversion_Nueva;
import tarea1.Equivalencias_Nuevas;

/**
 *
 * @author josue
 */
public class AgregarEditarClientesJFrame extends javax.swing.JFrame {

    static Object value;
    
    private Conversion_Nueva convercion;
    private Equivalencias_Nuevas equivalencia;
    private Popup popup;
    private File fileClientes;
    private File fileTransacciones;
    private ArrayList<Cliente> clientesArray;
    private MenuJframe menu;
    /**
     * Creates new form AgregarEditarMonedas
     */
    public AgregarEditarClientesJFrame(Conversion_Nueva convercion, Equivalencias_Nuevas equivalencia) {
        initComponents();
        this.convercion = convercion;
        this.equivalencia = equivalencia;
        cargarArchivo();
        clientesArray = new ArrayList<>();
    }
    
    public String[] getEquivalencias(){
        return this.equivalencia.getDescripcionesMonedas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        iDjLabel6 = new javax.swing.JLabel();
        nombrejLabel = new javax.swing.JLabel();
        iDjTextField1 = new javax.swing.JTextField();
        nombrejTextField = new javax.swing.JTextField();
        MensajeInformacionEditarjLabel = new javax.swing.JLabel();
        apellidojTextField1 = new javax.swing.JTextField();
        apellidojLabel8 = new javax.swing.JLabel();
        nacionalidadjTextField2 = new javax.swing.JTextField();
        nacionalidadjLabel9 = new javax.swing.JLabel();
        agregarClientejButton = new javax.swing.JButton();
        edadjLabel = new javax.swing.JLabel();
        edadjTextField = new javax.swing.JTextField();
        infoAgregarClientejLabel = new javax.swing.JLabel();
        mensajeInformacionAgregarjLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientesJTable = new javax.swing.JTable();
        borrarClientejButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Agregar o editar clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Agregar Cliente");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLayeredPane1.setAutoscrolls(true);

        iDjLabel6.setText("ID Cliente ");

        nombrejLabel.setText("Nombre");

        apellidojLabel8.setText("Apellido");

        nacionalidadjLabel9.setText("Nacionalidad");

        agregarClientejButton.setText("Agregar Cliente");
        agregarClientejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarClientejButtonActionPerformed(evt);
            }
        });

        edadjLabel.setText("Edad");

        jLayeredPane1.setLayer(iDjLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(nombrejLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(iDjTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(nombrejTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(MensajeInformacionEditarjLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(apellidojTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(apellidojLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(nacionalidadjTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(nacionalidadjLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(agregarClientejButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(edadjLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(edadjTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(infoAgregarClientejLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(MensajeInformacionEditarjLabel))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombrejLabel)
                            .addComponent(iDjLabel6)
                            .addComponent(apellidojLabel8)
                            .addComponent(nacionalidadjLabel9)
                            .addComponent(edadjLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iDjTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(nombrejTextField)
                            .addComponent(apellidojTextField1)
                            .addComponent(nacionalidadjTextField2)
                            .addComponent(edadjTextField)))
                    .addComponent(agregarClientejButton)
                    .addComponent(infoAgregarClientejLabel))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLayeredPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {iDjLabel6, nombrejLabel});

        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iDjLabel6)
                    .addComponent(iDjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrejLabel)
                    .addComponent(nombrejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidojLabel8)
                    .addComponent(apellidojTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nacionalidadjLabel9)
                    .addComponent(nacionalidadjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edadjLabel)
                    .addComponent(edadjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(agregarClientejButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infoAgregarClientejLabel)
                .addGap(19, 19, 19)
                .addComponent(MensajeInformacionEditarjLabel))
        );

        clientesJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientesJTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                clientesJTablePropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(clientesJTable);
        clientesJTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        clientesJTable.getDefaultEditor(String.class).addCellEditorListener(ChangeNotification);

        borrarClientejButton.setText("Borrar");
        borrarClientejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarClientejButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Edite los campos sobre la misma tabla");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borrarClientejButton))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(mensajeInformacionAgregarjLabel))
                            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(borrarClientejButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mensajeInformacionAgregarjLabel)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Carga el archivo con los datos de los clientes
    private void cargarArchivo(){
        try {//Manejo de expeccion para la creacion del archivo.
            this.fileClientes = new File("ClientesProyecto.txt");
            this.fileTransacciones = new File("TransaccionesRealizdas.txt");
            boolean flag1 = fileClientes.createNewFile();
            boolean flag2 = fileTransacciones.createNewFile();
        }
        catch(IOException e) {
            System.out.println("Ocurrio una exepcion");
            e.printStackTrace();
        }
    }
    private Object[][] addClienteModel(Object[][] clientes, Object[] newClienteAdd) {
        Object[][] newClientesMatrix = new Object[clientes.length + 1][5]; //Crea una nueva matriz para contener los datos que se agregan
        System.arraycopy(clientes, 0, newClientesMatrix, 0, clientes.length);
        newClientesMatrix[newClientesMatrix.length - 1] = newClienteAdd;

        return newClientesMatrix;
    }
       
    /*
    Codigo adaptado de https://stackoverflow.com/questions/30564462/read-data-from-a-text-fileClientes-and-create-an-object
    Crea un array list de clientes para observar sus valores 
    */
    public Object[][] cargarArrayClientes(){
        Object[][] clientes = new String[0][5];
        String line;
        try{
            Scanner input = new Scanner(this.fileClientes);
            //input.useDelimiter(",|$|\\n");
            
            while(input.hasNextLine()) {//Obtener del archivo los valores de cada dato separado por coma
                String[] tokens = input.nextLine().split(",");
                int idCliente = Integer.parseInt(tokens[0]);
                String nombre = tokens[1];
                String apellido = tokens[2];
                String nacionalidad = tokens[3];
                int edad = Integer.parseInt(tokens[4]);
                
                Object newCliente[] = new Object[]{
                    idCliente, nombre, apellido, nacionalidad, edad
                }; //Utilizado para guardar un nuevo cliente.
                
                //El nuevo cliente es pasado al modelo del jTable
                clientes = addClienteModel(clientes, newCliente);
                
                //El cliente es agregado a la lista de clientes de la clase
                this.clientesArray.add(new Cliente(idCliente, nombre, apellido, nacionalidad, edad));
            }
            
        }
        catch(FileNotFoundException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }  
        return clientes;
    }    
    
   
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       boolean editarId = true;
       //codigo canedit
       
        clientesJTable.setModel(new javax.swing.table.DefaultTableModel(
            cargarArrayClientes(),
            new String [] {
                "ID", "NOMBRE", "APELLIDOS", "NACIONALIDAD", "EDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                editarId, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    
    //Escribe el archivo con todos los datos colocados en la Jtable para ser guardados
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            FileWriter myWriter = new FileWriter("ClientesProyecto.txt"); //Crea el objeto con archivo para poder ser utilizado
            String cliente;
            
            // Por cada iteracion concatena los valores de cada columna de cada fila 
            //como la variable cliente y la añade al archivo clientes
            for (int row = 0; row < clientesJTable.getRowCount(); row++) { 
                cliente = ""; 
                for (int col = 0; col < clientesJTable.getColumnCount(); col++) { 
                    cliente = cliente + clientesJTable.getValueAt(row, col) + ","; 
                }
                myWriter.write(cliente + "\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            } 
    }//GEN-LAST:event_formWindowClosing

    //Agrega un cliente cuando se pulsa el boton agregar
    private void agregarClientejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarClientejButtonActionPerformed
        DefaultTableModel tableModel =  (DefaultTableModel) clientesJTable.getModel();
        
        int id = 0; 
        int edad = 0;
        
        try{//manejo de exepcion si no se ingresa valor numero en la id o edad
            id = Integer.parseInt(iDjTextField1.getText());
            edad = Integer.parseInt(edadjTextField.getText()); 
        }
        catch(java.lang.NumberFormatException e){
            infoAgregarClientejLabel.setText("Verifique el formato de los datos ingresados");
            return;
        }
        
        if(id <= 0 || edad <= 0) //Valida que solo se ingresen numeros positivos en el id y edad
            infoAgregarClientejLabel.setText("No se pueden ingresar numeros negativos");
        else if(edad < 18){ //Verifica que el cliente sea mayor de 18
            infoAgregarClientejLabel.setText("Debe ser mayor de 18");
        }
        else{
            for(Cliente cliente : clientesArray ){
                if(cliente.getIDCLIENTE() == id){ //Verifica que el cliente no existe.
                    infoAgregarClientejLabel.setText("El cliente ya existe");
                    return;
                }
            }
            tableModel.addRow(new Object[]{id,nombrejTextField.getText(),apellidojTextField1.getText(),nacionalidadjTextField2.getText(),edad});
            clientesJTable.setModel(tableModel);       
        }
        
        
    // TODO add your handling code here:
    }//GEN-LAST:event_agregarClientejButtonActionPerformed

    private void borrarClientejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarClientejButtonActionPerformed
        DefaultTableModel tableModel =  (DefaultTableModel) clientesJTable.getModel(); 
        if(clientesJTable.getSelectedRow() != -1) {
               // remove selected row from the model
               tableModel.removeRow(clientesJTable.getSelectedRow());
               JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
         }
        clientesJTable.setModel(tableModel);
    }//GEN-LAST:event_borrarClientejButtonActionPerformed

    private void clientesJTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_clientesJTablePropertyChange
        
        int column = clientesJTable.getSelectedColumn();
        int row = clientesJTable.getSelectedRow();
        
        if (clientesJTable.isEditing()){
            value = clientesJTable.getModel().getValueAt(row, column);
        }
        else{
            switch(column){
                case 0:
                    for(Cliente cliente : clientesArray ){
                        if(cliente.getIDCLIENTE() == (int)clientesJTable.getModel().getValueAt(row, column)){ //Verifica que el cliente no existe.
                            JOptionPane.showMessageDialog(this, "El cliente ya existe");
                            clientesJTable.getModel().setValueAt(value, row, column);
                            return;
                        }
                        try{
                            Scanner input = new Scanner(this.fileTransacciones);
                            //input.useDelimiter(",|$|\\n");

                            while(input.hasNextLine()) {//Obtener del archivo los valores de cada dato separado por coma
                                String[] tokens = input.nextLine().split(",");
                                if(Integer.parseInt(tokens[0]) == (int)value){
                                    JOptionPane.showMessageDialog(this, "No se puede editar porque realizo operaciones");
                                    clientesJTable.getModel().setValueAt(value, row, column);
                                    return; 
                                }
                            }
            
                    }
                    catch(FileNotFoundException e) {
                        System.out.println("Exception Occurred:");
                            e.printStackTrace();
                        }  

                    }
                break;
                case 1:
                    if(clientesJTable.getModel().getValueAt(row, column).equals("")){
                        JOptionPane.showMessageDialog(this, "No puede dejar campos vacios");
                        clientesJTable.getModel().setValueAt(value, row, column);
                        return;
                    }
                break;
                case 2:
                    if(clientesJTable.getModel().getValueAt(row, column).equals("")){
                        JOptionPane.showMessageDialog(this, "No puede dejar campos vacios");
                        clientesJTable.getModel().setValueAt(value, row, column);
                        return;
                    }
                break;
                case 3:
                    if(clientesJTable.getModel().getValueAt(row, column).equals("")){
                        JOptionPane.showMessageDialog(this, "No puede dejar campos vacios");
                        clientesJTable.getModel().setValueAt(value, row, column);
                        return;
                    }
                break;
                case 4:
                    if((int)clientesJTable.getModel().getValueAt(row, column) < 18){
                        JOptionPane.showMessageDialog(this, "La edad debe ser mas de 18");
                        clientesJTable.getModel().setValueAt(value, row, column);
                        return;
                    }
                break;
            }
            
        }
        
        
    }//GEN-LAST:event_clientesJTablePropertyChange
    
    //Codigo adaptado de https://stackoverflow.com/questions/6889694/jtable-detect-cell-data-change
    //Objeto para manejar el evento al editar cualquier celda.
    CellEditorListener ChangeNotification = new CellEditorListener() {
        
        public void editingCanceled(ChangeEvent e) {
            
        }
        
        //Actualiza la lista de clientes cuando hay un cambio en alguna celda
        public void editingStopped(ChangeEvent e) {
            ArrayList<Cliente> listaClientesActualizada = new ArrayList<>();
            DefaultTableModel tableModel =  (DefaultTableModel) clientesJTable.getModel(); 
            for (int row = 0; row < clientesJTable.getRowCount(); row++) { 
                listaClientesActualizada.add(new Cliente());
                listaClientesActualizada.get(row).setIDCLIENTE((int)tableModel.getValueAt(row, 0));
                listaClientesActualizada.get(row).setNombre((String)tableModel.getValueAt(row, 1));
                listaClientesActualizada.get(row).setApellidos((String)tableModel.getValueAt(row, 2));
                listaClientesActualizada.get(row).setNacionalidad((String)tableModel.getValueAt(row, 3));
                listaClientesActualizada.get(row).setEdad((int)tableModel.getValueAt(row, 4));  
            }       
            clientesArray.clear();
            clientesArray.addAll(listaClientesActualizada);
            
        }

    };
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MensajeInformacionEditarjLabel;
    private javax.swing.JButton agregarClientejButton;
    private javax.swing.JLabel apellidojLabel8;
    private javax.swing.JTextField apellidojTextField1;
    private javax.swing.JButton borrarClientejButton;
    private javax.swing.JTable clientesJTable;
    private javax.swing.JLabel edadjLabel;
    private javax.swing.JTextField edadjTextField;
    private javax.swing.JLabel iDjLabel6;
    private javax.swing.JTextField iDjTextField1;
    private javax.swing.JLabel infoAgregarClientejLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mensajeInformacionAgregarjLabel;
    private javax.swing.JLabel nacionalidadjLabel9;
    private javax.swing.JTextField nacionalidadjTextField2;
    private javax.swing.JLabel nombrejLabel;
    private javax.swing.JTextField nombrejTextField;
    // End of variables declaration//GEN-END:variables

    /**
     * @param clientesArray the clientesArray to set
     */
    public void setClientesArray(ArrayList<Cliente> clientesArray) {
        this.clientesArray = clientesArray;
    }

    /**
     * @return the clientesArray
     */
    public ArrayList<Cliente> getClientesArray() {
        return clientesArray;
    }
    /**
     * @return the menu
     */
    public MenuJframe getMenu() {
        return menu;
    }

    /**
     * @param menu the menu to set
     */
    public void setMenu(MenuJframe menu) {
        this.menu = menu;
    }

}

