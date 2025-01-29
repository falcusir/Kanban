/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import controlador.MEquipoControlador;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.MEquipoModelo;

/**
 *
 * @author Dell Core i7
 */
public class MEquipoVista extends javax.swing.JInternalFrame {

    /**
     * Creates new form CrearUsuario
     */
    MEquipoModelo mem = new MEquipoModelo();
    MEquipoControlador mec = new MEquipoControlador();
    String tipoUsuario;
    String estado;

    DefaultTableModel modelo = new DefaultTableModel();
    //TODO LO QUE RECIBO DE UNA CONSULTA SQL PUEDE SER 2 TIPOS
    //1 FILA: ObjetoModelo
    ArrayList<MEquipoModelo> listaMiembros = new ArrayList<>();

    public MEquipoVista() {
        initComponents();
        SetModel();
        txtCedula.setText(" ");
        txtNombre.setText(" ");
        txtApellido.setText(" ");
        txtFechaNac.setText(" ");
        txtCorreo.setText(" ");
        txtFechaProy.setText("");
        txtAResumen.setText(" ");
        txtAResumen.setVisible(false);

    }

    public void SetModel() {
        //Estructura estática de tipo cadena con las cabeceras o titulos de la jtable
        String[] cabecera = {"Nro.",
            "Nombres",
            "Apellidos",
            "Cedula",
            "Fecha Nacimiento",
            "Rol",
            "Correo Electrónico",
            "Fecha de Ingreso al Proyecto",
            "Estado"};
        //SOBRESCRIBIENDO EL modelo.set
        modelo.setColumnIdentifiers(cabecera);
        tblMiembrosE.setModel(modelo);
    }

    public void SetDatos() {
        Object[] datosFila = new Object[modelo.getColumnCount()]; //para dar un limite a la lista
        int nro = 1; //contador para los  números de la tabla
        // for reducido, creo un puntero de la estructura que voy a recorrer : nombre de la estructur que voy a recorrer
        //sirve para recorrer e imprimir una lista mas no para llenar 
        for (MEquipoModelo puntero : listaMiembros) {
            //CADA POSICIÓN DE DATOS FILA ES UNA CELDA DE LA FILA DE TABLA
            //SI TENGO 10 REGISTROS RECUPERADOS EN UNA CONSULTA
            //TENDRE 11 FILAS, 1 DE LA CABECERA, Y 10 DE LOS REGISTROS A MOSTRAR
            datosFila[0] = nro;
            datosFila[1] = puntero.getNombre();
            datosFila[2] = puntero.getApellido();
            datosFila[3] = puntero.getCedula();
            datosFila[4] = puntero.getFechaNac();
            datosFila[5] = puntero.getRol();
            datosFila[6] = puntero.getCorreo();
            datosFila[7] = puntero.getFechaIngesoPro();
            datosFila[8] = puntero.getEstado();
            nro++;
            modelo.addRow(datosFila);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTipoUsuario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JTextField();
        cbTipoUsuario = new javax.swing.JComboBox<>();
        cbEstado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAResumen = new javax.swing.JTextArea();
        btnCrear = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFechaProy = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMiembrosE = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollBar2 = new javax.swing.JScrollBar();

        setIconifiable(true);
        setMaximizable(true);
        setTitle("Crear Usuarios");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel1.setText("DATOS PERSONALES");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cédula:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Fecha de Nacimiento:");

        txtTipoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTipoUsuario.setText("Tipo de Usuario:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Estado:");

        txtCedula.setText("jTextField1");

        txtNombre.setText("jTextField2");

        txtApellido.setText("txtApellido");

        txtFechaNac.setText("jTextField4");

        cbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Miembro del Equipo", "Gestor de Proyecto" }));
        cbTipoUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoUsuarioItemStateChanged(evt);
            }
        });

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cbEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbEstadoItemStateChanged(evt);
            }
        });

        txtAResumen.setColumns(20);
        txtAResumen.setRows(5);
        jScrollPane1.setViewportView(txtAResumen);

        btnCrear.setBackground(new java.awt.Color(255, 204, 204));
        btnCrear.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 204, 204));
        btnGuardar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Correo Electrónico:");

        txtCorreo.setText("jTextField1");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Fecha de Ingreso al proyecto:");

        txtFechaProy.setText("jTextField4");

        btnBuscar.setBackground(new java.awt.Color(255, 204, 204));
        btnBuscar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblMiembrosE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMiembrosE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMiembrosEMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMiembrosE);

        btnActualizar.setBackground(new java.awt.Color(255, 204, 204));
        btnActualizar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(320, 320, 320))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(948, 948, 948))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtFechaProy, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtTipoUsuario)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(27, 27, 27)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnGuardar)
                                        .addGap(34, 34, 34)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(btnActualizar)
                                        .addGap(51, 51, 51)
                                        .addComponent(btnEliminar)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                .addComponent(jScrollBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtTipoUsuario)
                                            .addComponent(cbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(txtFechaProy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCrear)
                                .addComponent(btnGuardar)
                                .addComponent(btnLimpiar)
                                .addComponent(btnBuscar)))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtFechaNac.setText("");
        txtCorreo.setText("");
        txtAResumen.setText("");
        txtFechaProy.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cbTipoUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoUsuarioItemStateChanged
        // TODO add your handling code here:
        tipoUsuario = cbTipoUsuario.getSelectedItem().toString();
    }//GEN-LAST:event_cbTipoUsuarioItemStateChanged

    private void cbEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbEstadoItemStateChanged
        // TODO add your handling code here:
        estado = cbEstado.getSelectedItem().toString();
    }//GEN-LAST:event_cbEstadoItemStateChanged

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        mem.setCedula(txtCedula.getText());
        mem.setNombre(txtNombre.getText());
        mem.setApellido(txtApellido.getText());
        mem.setFechaNac(txtFechaNac.getText());
        mem.setCorreo(txtCorreo.getText());
        mem.setRol(tipoUsuario);
        mem.setFechaIngesoPro(txtFechaProy.getText());
        mem.setEstado(estado);
        txtAResumen.setVisible(true);
        txtAResumen.setText(mem.toString());

    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        mem.setCedula(txtCedula.getText());
        mem.setNombre(txtNombre.getText());
        mem.setApellido(txtApellido.getText());
        mem.setFechaNac(txtFechaNac.getText());
        mem.setCorreo(txtCorreo.getText());
        mem.setRol(tipoUsuario);
        mem.setFechaIngesoPro(txtFechaProy.getText());
        mem.setEstado(estado);

        mec.insertarMEquipo(mem);
        listaMiembros.add(mem);//añade al array list el registro q ingrese el usuario
        //this.SetDatos(); es lo mismo que setDatos()
        SetDatos(); //escribe la fila de la tabla
        limpiarTabla();
        cargarTabla();       
        //tblMiembrosE.setModel(modelo);//refresca el nuevo modelo
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String cedula = txtCedula.getText();
        limpiarTabla();
        ArrayList<Object[]> listaFilas = mec.buscarMiembroE(cedula);
        for (Object[] listaFila : listaFilas) {
            modelo.addRow(listaFila);
        }
        tblMiembrosE.setModel(modelo);

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        cargarTabla();
    }//GEN-LAST:event_formInternalFrameActivated
        //METODOS PROPIOS FRONTEND
        private void limpiarTabla(){
            int a= modelo.getRowCount()-1;
            for (int i = a; i >=0; i--) {
                modelo.removeRow(i);
            }
            //tblMiembrosE.setModel(modelo);
        }
        
        private void cargarTabla(){
            ArrayList<Object[]> listaFilas = mec.datosMEquipo();
            for (Object[] listaFila : listaFilas) {
                modelo.addRow(listaFila);
            }
            tblMiembrosE.setModel(modelo);
        }
        
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        mem.setCedula(txtCedula.getText());
        mem.setNombre(txtNombre.getText());
        mem.setApellido(txtApellido.getText());
        mem.setFechaNac(txtFechaNac.getText());
        mem.setCorreo(txtCorreo.getText());
        mem.setRol(tipoUsuario);
        mem.setFechaIngesoPro(txtFechaProy.getText());
        mem.setEstado(estado);
        
        mec.actualizarMiembroE(mem);
        limpiarTabla();
        cargarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       String cedula = txtCedula.getText();
       mec.eliminarMiembroE(cedula);
       limpiarTabla();
       cargarTabla();
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblMiembrosEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMiembrosEMouseClicked
       DefaultTableModel dtm=(DefaultTableModel)tblMiembrosE.getModel();
       
       txtNombre.setText((String) dtm.getValueAt(tblMiembrosE.getSelectedRow(), 1));
       txtApellido.setText((String) dtm.getValueAt(tblMiembrosE.getSelectedRow(), 2));
       txtCedula.setText(dtm.getValueAt(tblMiembrosE.getSelectedRow(), 3).toString());
       txtFechaNac.setText(dtm.getValueAt(tblMiembrosE.getSelectedRow(), 4).toString());
       //combo box rol
//       String rol= (String) (dtm.getValueAt(tblMiembrosE.getSelectedRow(), 5));
//       if ("Miembro del Equipo".equals(rol)){
//            cbTipoUsuario.removeAllItems();
//            cbTipoUsuario.addItem("Miembro del Equipo");
//       }
//       else if ("Administrador".equals(rol)){
//           cbTipoUsuario.removeAllItems(); 
//           cbTipoUsuario.addItem("Administrador");
//       }
//       else if ("Gestor de Proyecto".equals(rol)){
//           cbTipoUsuario.removeAllItems(); 
//           cbTipoUsuario.addItem("Gestor de Proyecto");
//       }
       txtCorreo.setText((String) dtm.getValueAt(tblMiembrosE.getSelectedRow(), 6));
       txtFechaProy.setText((String) dtm.getValueAt(tblMiembrosE.getSelectedRow(), 7).toString());
       //combo box estado
       
    }//GEN-LAST:event_tblMiembrosEMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMiembrosE;
    private javax.swing.JTextArea txtAResumen;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtFechaProy;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtTipoUsuario;
    // End of variables declaration//GEN-END:variables

}
