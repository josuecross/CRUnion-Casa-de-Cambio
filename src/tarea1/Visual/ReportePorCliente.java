/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1.Visual;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import tarea1.Cliente;

/**
 *
 * @author josue
 */
public class ReportePorCliente extends javax.swing.JFrame {
    File fileClientes;
    /**
     * Creates new form ReportePorCliente
     */
    public ReportePorCliente() {
        initComponents();
        cargarArchivo();
    }
    
    private void cargarArchivo(){
        try {
            this.fileClientes = new File("TransaccionesRealizdas.txt");
            boolean flag = fileClientes.createNewFile();
            if (flag) {
                System.out.println("Se creo el archivo");
            }
            else {
                System.out.println("El archivo ya existe");
            }
        }
        catch(IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }
    
    public Object[][] cargarModelo(String idCliente){
        Object[][] transacciones = new String[0][4];
        String line;
        String monedaOrigen = "";
        String montoOrigen = "";
        String monedaDestino = "";
        String montoDestino = "";
        try{
            Scanner input = new Scanner(this.fileClientes);
            //input.useDelimiter(",|$|\\n");
            
            while(input.hasNextLine()) {//Obtener del archivo los valores de cada dato separado por coma
                String[] tokens = input.nextLine().split(",");
                if(tokens[0].equals(idCliente)){
                    monedaOrigen = tokens[1];
                    montoOrigen = tokens[2];
                    monedaDestino = tokens[3];
                    montoDestino = tokens[4];
                }
                
                
                Object newTransaccion[] = new Object[]{
                    monedaOrigen, montoOrigen, monedaDestino, montoDestino
                }; //Utilizado para guardar un nuevo cliente.
                
                //El nuevo cliente es pasado al modelo del jTable
                transacciones = addTransaccion(transacciones, newTransaccion);
            }
            
        }
        catch(FileNotFoundException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }  
        return transacciones;
    }
    
    private Object[][] addTransaccion(Object[][] transacciones, Object[] newTransaccion) {
        Object[][] newTransaccionesMatrix = new Object[transacciones.length + 1][5]; //Crea una nueva matriz para contener los datos que se agregan
        System.arraycopy(transacciones, 0, newTransaccionesMatrix, 0, transacciones.length);
        newTransaccionesMatrix[newTransaccionesMatrix.length - 1] = newTransaccion;

        return newTransaccionesMatrix;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idjLabel = new javax.swing.JLabel();
        idjTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        transaccionesClienteTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setTitle("Reporte de clientes");

        idjLabel.setText("Digite el Id:");

        transaccionesClienteTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Moneda Origen", "Monto Origen", "Moneda Destino", "Monto Destino"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(transaccionesClienteTable1);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(idjLabel)
                        .addGap(34, 34, 34)
                        .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idjLabel)
                    .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        transaccionesClienteTable1.setModel(new javax.swing.table.DefaultTableModel(
                cargarModelo(idjTextField.getText()),
            new String [] {
                "Moneda Origen", "Monto Origen", "Moneda Destino", "Monto Destino"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idjLabel;
    private javax.swing.JTextField idjTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable transaccionesClienteTable1;
    // End of variables declaration//GEN-END:variables
}
