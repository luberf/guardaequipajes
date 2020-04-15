package guardaequipajes;

import java.text.SimpleDateFormat;
import java.sql.*;
import java.sql.Timestamp;
import Atxy2k.CustomTextField.RestrictedTextField;
import java.util.*;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import static java.lang.Integer.sum;
import static java.lang.Long.sum;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.Map;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class Pantalla_Inicio extends javax.swing.JFrame {
   JFileChooser RealizarBackupMySQL=new JFileChooser();     
   int clicks=76308;
   
    public Pantalla_Inicio() {
        
        initComponents();
                
        RestrictedTextField restricted = new RestrictedTextField(cedula);
        restricted.setLimit(10);
        restricted.setOnlyNums(true);
        
        SpinnerNumberModel mal = new SpinnerNumberModel();
        mal.setMaximum(50);//numero maximo de articulos por guardar
        mal.setMinimum(0);//numero minimo de articulos por guardar
        maleta.setModel(mal);
        
        SpinnerNumberModel caj = new SpinnerNumberModel();
        caj.setMaximum(50);
        caj.setMinimum(0);
        caja.setModel(caj);
        
        SpinnerNumberModel bol = new SpinnerNumberModel();
        bol.setMaximum(50);
        bol.setMinimum(0);
        bolsa.setModel(bol);
        
        SpinnerNumberModel enc = new SpinnerNumberModel();
        enc.setMaximum(50);
        enc.setMinimum(0);
        encomienda.setModel(enc);
        
        SpinnerNumberModel est = new SpinnerNumberModel();
        est.setMaximum(50);
        est.setMinimum(0);
        estopa.setModel(est);
        
        SpinnerNumberModel otr = new SpinnerNumberModel();
        otr.setMaximum(50);
        otr.setMinimum(0);
        otro.setModel(otr);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cedula = new javax.swing.JTextField();
        consultar = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        Maleta = new javax.swing.JLabel();
        Caja = new javax.swing.JLabel();
        Bolsa = new javax.swing.JLabel();
        Estopa = new javax.swing.JLabel();
        Encomienda = new javax.swing.JLabel();
        Otro = new javax.swing.JLabel();
        Cedula = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        Retirar_Articulo = new javax.swing.JButton();
        maleta = new javax.swing.JSpinner();
        caja = new javax.swing.JSpinner();
        bolsa = new javax.swing.JSpinner();
        encomienda = new javax.swing.JSpinner();
        estopa = new javax.swing.JSpinner();
        otro = new javax.swing.JSpinner();
        numeromaletas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ValorCancelar = new javax.swing.JTextField();
        fracciones = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cuadre = new javax.swing.JButton();
        num_fracciones = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        numclicks = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GUARDA EQUIPAJES");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        cedula.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cedula.setToolTipText("");
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        getContentPane().add(cedula);
        cedula.setBounds(533, 31, 793, 103);

        consultar.setBackground(new java.awt.Color(0, 255, 255));
        consultar.setFont(new java.awt.Font("Roboto", 0, 60)); // NOI18N
        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        getContentPane().add(consultar);
        consultar.setBounds(550, 170, 310, 85);

        ingresar.setBackground(new java.awt.Color(0, 255, 255));
        ingresar.setFont(new java.awt.Font("Roboto", 0, 60)); // NOI18N
        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar);
        ingresar.setBounds(180, 170, 251, 85);

        Maleta.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        Maleta.setText("Maleta");
        getContentPane().add(Maleta);
        Maleta.setBounds(630, 320, 180, 64);

        Caja.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        Caja.setText("Caja");
        getContentPane().add(Caja);
        Caja.setBounds(630, 400, 130, 64);

        Bolsa.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        Bolsa.setText("Bolsa");
        getContentPane().add(Bolsa);
        Bolsa.setBounds(630, 480, 160, 64);

        Estopa.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        Estopa.setText("Estopa");
        getContentPane().add(Estopa);
        Estopa.setBounds(980, 400, 200, 64);

        Encomienda.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        Encomienda.setText("Recomendado");
        getContentPane().add(Encomienda);
        Encomienda.setBounds(980, 320, 370, 64);

        Otro.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        Otro.setText("Otro");
        getContentPane().add(Otro);
        Otro.setBounds(980, 480, 130, 64);

        Cedula.setFont(new java.awt.Font("Roboto", 1, 80)); // NOI18N
        Cedula.setText("CEDULA");
        getContentPane().add(Cedula);
        Cedula.setBounds(120, 30, 360, 103);

        tabladatos.setFont(new java.awt.Font("Roboto", 0, 45)); // NOI18N
        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        tabladatos.setToolTipText("");
        tabladatos.setAutoscrolls(false);
        tabladatos.setEditingColumn(1);
        tabladatos.setEditingRow(1);
        tabladatos.setGridColor(new java.awt.Color(204, 204, 255));
        tabladatos.setRequestFocusEnabled(false);
        tabladatos.setRowHeight(72);
        jScrollPane1.setViewportView(tabladatos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 570, 1316, 102);

        Retirar_Articulo.setBackground(new java.awt.Color(0, 255, 255));
        Retirar_Articulo.setFont(new java.awt.Font("Roboto", 0, 60)); // NOI18N
        Retirar_Articulo.setText("Retirar");
        Retirar_Articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Retirar_ArticuloActionPerformed(evt);
            }
        });
        getContentPane().add(Retirar_Articulo);
        Retirar_Articulo.setBounds(970, 170, 290, 80);

        maleta.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        getContentPane().add(maleta);
        maleta.setBounds(540, 310, 87, 68);

        caja.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        getContentPane().add(caja);
        caja.setBounds(540, 390, 87, 68);

        bolsa.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        getContentPane().add(bolsa);
        bolsa.setBounds(540, 470, 87, 68);

        encomienda.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        getContentPane().add(encomienda);
        encomienda.setBounds(890, 310, 87, 68);

        estopa.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        getContentPane().add(estopa);
        estopa.setBounds(890, 390, 87, 68);

        otro.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        getContentPane().add(otro);
        otro.setBounds(890, 470, 87, 68);

        numeromaletas.setEditable(false);
        numeromaletas.setFont(new java.awt.Font("Roboto", 3, 50)); // NOI18N
        numeromaletas.setForeground(new java.awt.Color(102, 0, 0));
        numeromaletas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numeromaletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeromaletasActionPerformed(evt);
            }
        });
        numeromaletas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                numeromaletasPropertyChange(evt);
            }
        });
        getContentPane().add(numeromaletas);
        numeromaletas.setBounds(380, 310, 111, 70);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 50)); // NOI18N
        jLabel1.setText("CANCELAR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 480, 280, 54);

        ValorCancelar.setEditable(false);
        ValorCancelar.setFont(new java.awt.Font("Roboto", 3, 50)); // NOI18N
        ValorCancelar.setForeground(new java.awt.Color(204, 0, 0));
        ValorCancelar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ValorCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(ValorCancelar);
        ValorCancelar.setBounds(340, 470, 190, 70);

        fracciones.setFont(new java.awt.Font("Roboto", 0, 50)); // NOI18N
        fracciones.setText("Fracciones");
        getContentPane().add(fracciones);
        fracciones.setBounds(40, 390, 270, 64);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 50)); // NOI18N
        jLabel2.setText("Articulos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 310, 210, 64);

        cuadre.setText("OK");
        cuadre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuadreMousePressed(evt);
            }
        });
        cuadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadreActionPerformed(evt);
            }
        });
        getContentPane().add(cuadre);
        cuadre.setBounds(0, 0, 73, 23);

        num_fracciones.setEditable(false);
        num_fracciones.setFont(new java.awt.Font("Roboto", 3, 50)); // NOI18N
        num_fracciones.setForeground(new java.awt.Color(102, 0, 0));
        num_fracciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num_fracciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_fraccionesActionPerformed(evt);
            }
        });
        num_fracciones.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                num_fraccionesPropertyChange(evt);
            }
        });
        getContentPane().add(num_fracciones);
        num_fracciones.setBounds(380, 390, 111, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azul.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1380, 710);

        numclicks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numclicksActionPerformed(evt);
            }
        });
        getContentPane().add(numclicks);
        numclicks.setBounds(0, 30, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        ConexionBD con = new ConexionBD();
        Connection cn = con.Conexion();
        
        DefaultTableModel modelo;
        modelo = new DefaultTableModel();
        
        modelo.addColumn("CEDULA");
        modelo.addColumn("MALETA");
        modelo.addColumn("BOLSA");
        modelo.addColumn("ESTOPA");
        modelo.addColumn("CAJA");
        modelo.addColumn("ENCOMIENDA");
        modelo.addColumn("OTRO");
        modelo.addColumn("CODIGO");
        modelo.addColumn("FECHA DE INGRESO");
        tabladatos.setModel(modelo);
        
        String sql = "SELECT * FROM `cliente` WHERE `codigo` = "+cedula.getText()+"";//realizar una busqueda solo el numero de cedula que se necesita 
        String datos[] = new String[9];
        Statement st= null;
        if(st != null || cedula.getText() == null)
        {
            System.out.println("Se consulto: "+cedula.getText()+"");
        try 
        {
           st = cn.createStatement();
           ResultSet rs = st.executeQuery(sql);
           while(rs.next())
           {
               this.tabladatos.getColumnModel().getColumn(0).setPreferredWidth(220);//aqui se modifica el ancho de las columnas
               this.tabladatos.getColumnModel().getColumn(1).setPreferredWidth(4);
               this.tabladatos.getColumnModel().getColumn(2).setPreferredWidth(4);
               this.tabladatos.getColumnModel().getColumn(3).setPreferredWidth(4);
               this.tabladatos.getColumnModel().getColumn(4).setPreferredWidth(4);
               this.tabladatos.getColumnModel().getColumn(5).setPreferredWidth(4);
               this.tabladatos.getColumnModel().getColumn(6).setPreferredWidth(4);
               this.tabladatos.getColumnModel().getColumn(7).setPreferredWidth(100);
               this.tabladatos.getColumnModel().getColumn(8).setPreferredWidth(420);
               datos[0]=rs.getString(1);//imprimimos la tabla con los datos que encontramos
               datos[1]=rs.getString(2);
               datos[2]=rs.getString(3);
               datos[3]=rs.getString(4);
               datos[4]=rs.getString(5);
               datos[5]=rs.getString(6);
               datos[6]=rs.getString(7);
               datos[7]=rs.getString(8);
               datos[8]=rs.getString(9);
               modelo.addRow(datos);
               //JOptionPane.showMessageDialog(null, rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(5)+rs.getString(6)+rs.getString(7)); //imprime el valor de cada uno por separad o, no los suma
           }
           tabladatos.setModel(modelo);
           cedula.setText(null);
           
        
   //inicio de comparar fechas        
   java.util.Date fecha1 = new java.util.Date();
   java.util.Date fecha2 = new java.util.Date();
   
   String fechainicio = this.tabladatos.getValueAt(0, 8).toString();//llamo a la fecha de la tabla tipo string
        Date fechaingreso = null;
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//describo el tipo de formato que voy a usar
            try 
            {
                    // PARSEO STRING A DATE
                    fechaingreso = sdf.parse(fechainicio);                   
                   
            } catch (ParseException e) {
 
                    System.out.println("Se ha producido un error en el parseo");//en el caso que tengamos un error os informa
            }
            
   //java.util.Date fecha = new java.util.Date();
   java.util.Date fechaMayor = fecha1;
   java.util.Date fechaMenor = fechaingreso;
   Map resultadoMap = new HashMap();
 
   /* Verificamos cual es la mayor de las dos fechas, para no tener sorpresas al momento
    * de realizar la resta.
    */
   if (fecha1.compareTo(fecha2) > 0)
   {
       System.out.println("mayor ");
       //fechaMenor = fecha2;
   }else
   {
      // System.out.println("menor ");
    fechaMayor = fecha2;
   }
 
  //los milisegundos
   long diferenciaMils = fechaMayor.getTime() - fechaMenor.getTime();
 
   //obtenemos los segundos
   long segundos = diferenciaMils / 1000;
      //System.out.println(segundos);
   //obtenemos las horas
   long horas = segundos / 3600;
   //restamos las horas para continuar con minutos
   segundos -= horas*3600;
   //igual que el paso anterior
   long minutos = segundos /60;
   segundos -= minutos*60;
   
    //System.out.println(horas);//imprimo el numero de horas de diferencia entre la fecha y la fecha actual
    
    long f=1; //f representa el numero de fracciones
    while ( horas >= 12)
    {
            horas -= 12;
            if(horas == 0 && minutos <=15 )
            {
                f --;
            } 
            f ++;
    }
    
    num_fracciones.setText(Long.toString(f));//muestro en el campo grafico el numero de fracciones
    //System.out.println("el numero de fracciones es "+f);
 
   //ponemos los resultados en un mapa :-)
   resultadoMap.put("horas",Long.toString(horas));
   resultadoMap.put("minutos",Long.toString(minutos));
   resultadoMap.put("segundos",Long.toString(segundos));
   
   System.out.println(resultadoMap); 
   
            
        //java.util.Date fechaactual = new java.util.Date();//siempre es la fecha actual
        //Prueba pr= new Prueba();
        //pr.getDiferencia(fechaactual, fechaingreso);//comparo la fecha actual con la fecha de ingreso articulo que estaba en string y la converti en date.
        //System.out.println(fechaactual);
        //System.out.println(fechaingreso);
           
       } catch (SQLException ex) 
       {
           //System.out.println("el valor no puede ser 0");
           Logger.getLogger(Pantalla_Inicio.class.getName()).log(Level.SEVERE, null, ex);
       }
       
        long n1;
        long n2;
        long n3;
        long n4;
        long n5;
        long n6;
        long n7 = 0;
        long frac = 0;
        frac=Long.parseLong(num_fracciones.getText().toString());//Obtengo el numero de fracciones y lo comvierto de string a long para poderlo multiplicar con el numero de horas y el numero de maletas
        
            n1=Long.parseLong(this.tabladatos.getValueAt(0, 1).toString()); //en la fila 0 colimna 1 guardo ese valor como long para luego sumarlo con la siguiente columna y asi con todas
            long c1 = n1;
            long r1 = c1;
            ValorCancelar.setText(String.valueOf(r1));
            
            n2=Long.parseLong(this.tabladatos.getValueAt(0, 2).toString());
            long c2 = n2;
            long r2 = c1 + c2;
            ValorCancelar.setText(String.valueOf(r2));
            
            n3=Long.parseLong(this.tabladatos.getValueAt(0, 3).toString());
            long c3 = n3;
            long r3 = c1 + c2 + c3;
            ValorCancelar.setText(String.valueOf(r3));
            
            n4=Long.parseLong(this.tabladatos.getValueAt(0, 4).toString());
            long c4 = n4;
            long r4 = c1 + c2 + c3 + c4;
            ValorCancelar.setText(String.valueOf(r4));
            
            n5=Long.parseLong(this.tabladatos.getValueAt(0, 5).toString());
            long c5 = n5;
            long r5 = c1 + c2 + c3 + c4 + c5;
            ValorCancelar.setText(String.valueOf(r5));
            
            n6=Long.parseLong(this.tabladatos.getValueAt(0, 6).toString());
            long c6 = n6;
            long r6 = c1 + c2 + c3 + c4 + c5 +c6;
            long r7 = r6 * 3000;// tengo y ala suma de todos los articulos y los multiplico por 3mil
            long r8 = r7 * frac;// aqui multiplico el numero de maletas por 3mil y eso lo multiplico por el numero de fracciones
            numeromaletas.setText(String.valueOf(r6));// ya tengo el numero de maletas y lo imprimo como r6
            ValorCancelar.setText(String.valueOf(r8));// ya tengo el valor entonces lo imprimo como r7
            con.getClose();
            }else
        {
            System.out.println("Se consulto el articulo :" + cedula.getText());
        }
            
            cedula.setText(null);//aqui dejamos el formulario en blanco para que lo puedan volver a usar
            maleta.setValue(0);
            bolsa.setValue(0);
            estopa.setValue(0);
            caja.setValue(0);
            encomienda.setValue(0);
            otro.setValue(0);
        
    }//GEN-LAST:event_consultarActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
            ConexionBD con = new ConexionBD();
            Connection cn = con.Conexion();

            try 
            {
                PreparedStatement pps =cn.prepareStatement("INSERT INTO cliente(cedula, maleta, bolsa, estopa, caja, encomienda, otro, fecha_ingreso) VALUES(?,?,?,?,?,?,?,?)");
                
                pps.setString(1, cedula.getText());
                long ce=Long.parseLong(cedula.getText());//guardamos los valores de la caja de texto como long
                pps.setString(2, maleta.getValue().toString());
                long ma=Long.parseLong(maleta.getValue().toString());
                pps.setString(3, bolsa.getValue().toString());
                long bo=Long.parseLong(bolsa.getValue().toString());
                pps.setString(4, estopa.getValue().toString());
                long es=Long.parseLong(estopa.getValue().toString());
                pps.setString(5, caja.getValue().toString());
                long ca=Long.parseLong(caja.getValue().toString());
                pps.setString(6, encomienda.getValue().toString());
                long en=Long.parseLong(encomienda.getValue().toString());
                pps.setString(7, otro.getValue().toString());
                long ot=Long.parseLong(otro.getValue().toString());
                java.util.Date fecha_entrada = new java.util.Date(); 
                Timestamp fecha_ingreso = new Timestamp(fecha_entrada.getTime());
                pps.setTimestamp(8, fecha_ingreso);
                pps.executeUpdate();
                
            }catch (SQLException ex)
            {
                Logger.getLogger(Pantalla_Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            long n1;
            long n2;
            long n3;
            long n4;
            long n5;
            long n6;
        
            n1=Long.parseLong(maleta.getValue().toString()); //en la fila 0 colimna 1 guardo ese valor como long para luego sumarlo con la siguiente columna y asi con todas
            long c1 = n1;
            long r1 = c1;
            
            n2=Long.parseLong(bolsa.getValue().toString());
            long c2 = n2;
            long r2 = c1 + c2;
            
            n3=Long.parseLong(caja.getValue().toString());
            long c3 = n3;
            long r3 = c1 + c2 + c3;
            
            n4=Long.parseLong(encomienda.getValue().toString());
            long c4 = n4;
            long r4 = c1 + c2 + c3 + c4;
            
            n5=Long.parseLong(estopa.getValue().toString());
            long c5 = n5;
            long r5 = c1 + c2 + c3 + c4 + c5;
            
            n6=Long.parseLong(otro.getValue().toString());
            long c6 = n6;
            long r6 = c1 + c2 + c3 + c4 + c5 +c6;
            numeromaletas.setText(String.valueOf(r6));// ya tengo el numero de maletas y lo imprimo como r6
            
        DefaultTableModel modelo;
        modelo = new DefaultTableModel();
        
        modelo.addColumn("CEDULA");
        modelo.addColumn("MALETA");
        modelo.addColumn("BOLSA");
        modelo.addColumn("ESTOPA");
        modelo.addColumn("CAJA");
        modelo.addColumn("ENCOMIENDA");
        modelo.addColumn("OTRO");
        modelo.addColumn("CODIGO");
        modelo.addColumn("FECHA DE INGRESO");
        tabladatos.setModel(modelo);
        
        String sql = "SELECT * FROM `cliente` WHERE `cedula` = "+cedula.getText()+" ORDER BY codigo DESC";//realizar una busqueda solo el numero de cedula que se necesita
          
        String datos[] = new String[9];
        Statement st;
        try 
        {
           st = cn.createStatement();
           ResultSet rs = st.executeQuery(sql);
           while(rs.next())
           {
               this.tabladatos.getColumnModel().getColumn(0).setPreferredWidth(220);//aqui se modifica el ancho de las columnas
               this.tabladatos.getColumnModel().getColumn(1).setPreferredWidth(4);
               this.tabladatos.getColumnModel().getColumn(2).setPreferredWidth(4);
               this.tabladatos.getColumnModel().getColumn(3).setPreferredWidth(4);
               this.tabladatos.getColumnModel().getColumn(4).setPreferredWidth(4);
               this.tabladatos.getColumnModel().getColumn(5).setPreferredWidth(4);
               this.tabladatos.getColumnModel().getColumn(6).setPreferredWidth(4);
               this.tabladatos.getColumnModel().getColumn(7).setPreferredWidth(100);
               this.tabladatos.getColumnModel().getColumn(8).setPreferredWidth(420);
               datos[0]=rs.getString(1);//imprimimos la tabla con los datos que encontramos
               datos[1]=rs.getString(2);
               datos[2]=rs.getString(3);
               datos[3]=rs.getString(4);
               datos[4]=rs.getString(5);
               datos[5]=rs.getString(6);
               datos[6]=rs.getString(7);
               datos[7]=rs.getString(8);
               datos[8]=rs.getString(9);
               modelo.addRow(datos);
               //JOptionPane.showMessageDialog(null, rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(5)+rs.getString(6)+rs.getString(7)); //imprime el valor de cada uno por separad o, no los suma
           }
           tabladatos.setModel(modelo);
        }
           catch(Exception e) 
           {      
           }
        
            class Impresora
            {
                Font fuente1 = new Font("Dialog", Font.BOLD, 10);//tarifa valida 12 horas
                Font fuente2 = new Font("Dialog", Font.ITALIC, 6);//regimen, nit,nombre, ubicacion
                Font fuente3 = new Font("Dialog", Font.PLAIN, 10);//datos del recibo
                Font fuente4 = new Font("Dialog", Font.BOLD, 9);//Logo de la empresa
                Font fuente5 = new Font("Dialog", Font.ITALIC, 7);//Condiciones
                Font fuente6 = new Font("Dialog", Font.BOLD, 12);//Imprecion bodega
                Font fuente7 = new Font("Dialog", Font.BOLD, 18);//Factura de venta
                Font fuente8 = new Font("Dialog", Font.BOLD, 14);//Factura de venta
                PrintJob pj;
                Graphics pagina;
                
            /********************************************************************
            *	A continuación el constructor de la clase. Aquí lo único que	*
            *	hago es tomar un objeto de impresion.							*
            ********************************************************************/
            Impresora()
            {
		pj = Toolkit.getDefaultToolkit().getPrintJob(new Frame(), "TM-T20II", null);
                String cadena = "MI TICKET";
            }
            /********************************************************************
            *	A continuación el método "imprimir(String)", el encargado de 	*
            *	colocar en el objeto gráfico la cadena que se le pasa como 		*
            *	parámetro y se imprime.											*
            ********************************************************************/
            public void imprimir()
            {
		//LO COLOCO EN UN try/catch PORQUE PUEDEN CANCELAR LA IMPRESION
		try
		{
                    //TIKETE DE LA BODEGA
                    pagina = pj.getGraphics();
                    pagina.setFont(fuente1);
                    pagina.setColor(Color.black);
                    pagina.setFont(fuente8);
                    pagina.drawString(cedula.getText(), 20, 14);
                    pagina.setFont(fuente6);
                    pagina.drawString("Numero de articulos", 20, 28);
                    pagina.drawString(numeromaletas.getText(), 20, 38);
                    pagina.drawString("Maleta", 20, 48);
                    pagina.drawString(maleta.getValue().toString(), 20, 58);
                    pagina.drawString("Bolsa", 108, 48);
                    pagina.drawString(bolsa.getValue().toString(), 108, 58);
                    pagina.drawString("Estopa", 20, 68);
                    pagina.drawString(estopa.getValue().toString(), 20, 78);
                    pagina.drawString("Caja", 108, 68);
                    pagina.drawString(caja.getValue().toString(), 108, 78);
                    pagina.drawString("Recomendado", 20, 88);
                    pagina.drawString(encomienda.getValue().toString(), 20, 98);
                    pagina.drawString("Otro", 108, 88);
                    pagina.drawString(otro.getValue().toString(), 108, 98);
                    pagina.drawString("Fecha de Ingreso", 100, 8);
                    SimpleDateFormat fechaact2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//TRANSFORMAMOS LA FECHA ACTUAL TIPO DATE A STRING
                    String fechaya2 = fechaact2.format(new Date());//PARA IMPRIMIRLO EN EL RECIBO COMO STRING
                    pagina.drawString(fechaya2, 100, 18);//IMPRIMIMOS EN EL RECIBO LA FECHA Y HORA DEL MOMENTO INGRESADO
                    pagina.setFont(fuente7);        
                    //pagina.drawString("Factura de venta", 20, 108);
                    pagina.drawString(tabladatos.getValueAt(0, 7).toString(), 160, 68);
                    pagina.dispose();
                    pagina = pj.getGraphics();
                    pagina.setFont(fuente1);
                    pagina.setColor(Color.black);
                    pagina.drawString("GUARDA EQUIPAJES POPAYAN", 45, 8);
                    pagina.setFont(fuente2);
                    pagina.drawString("Regimen Simplificado", 90, 14);
                    pagina.drawString("34.549.232-3", 100, 19);
                    pagina.drawString("Maria del Carmen Chito Narvaez", 72, 24);
                    pagina.drawString("Terminal de Transportes Popayán", 70, 29);
                    pagina.drawString("Parte sur local 42", 90, 34);
                    pagina.setFont(fuente4);
                    pagina.drawString("TARIFA VALIDA POR 12 HORAS", 51, 42);
                    pagina.setFont(fuente4);
                    pagina.drawString("Factura de venta", 80, 52);
                    pagina.drawString("Numero de articulos", 73, 76);
                    pagina.setFont(fuente4);
                    pagina.drawString(numeromaletas.getText(), 115, 84);
                    pagina.setFont(fuente3);
                    pagina.drawString("Fecha de Ingreso", 78, 60);
                    SimpleDateFormat fechaact = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//TRANSFORMAMOS LA FECHA ACTUAL TIPO DATE A STRING
                    String fechaya = fechaact.format(new Date());//PARA IMPRIMIRLO EN EL RECIBO COMO STRING
                    pagina.drawString(fechaya, 70, 68);//IMPRIMIMOS EN EL RECIBO LA FECHA Y HORA DEL MOMENTO INGRESADO
                    pagina.setFont(fuente4);
                    pagina.drawString("Telefono", 100, 92);
                    pagina.setFont(fuente3);
                    pagina.drawString("3186404456", 90, 100);
                    pagina.setFont(fuente5);
                    pagina.drawString("Esta Factura de Venta se asimila en sus afectos legales a la", 10, 109);
                    pagina.drawString("Letra  de  Cambio  según  Art.  774 del  codigo de Comercio.", 10, 115);
                    pagina.drawString("-SEÑOR USUARIO: En caso de  pérdida parcial o total de su", 10, 121);
                    pagina.drawString("mercancia, la  Empresa Indemnizará únicamente por el valor", 10, 127);
                    pagina.drawString("declarado  en remesa   ARTICULO  1031  DEL  C.  DE  C. Si", 10, 133);
                    pagina.drawString("transcurrido  un  (1)  MES  el depositario  no  ha retirado  su", 10, 139);
                    pagina.drawString("equipaje  dejado  en  deposito, autoriza  al  depositario  para", 10, 145);
                    pagina.drawString("hacer   entrega   de   él   a  titulo  gratuito  a  una  entidad  de", 10, 151);
                    pagina.drawString("Beneficiencia.    NO    NOS   REMPONSABILIZAMOS   POR", 10, 157);
                    pagina.drawString("ARTICULOS DE VALOR; DINERO JOYAS, DEJADAS,EN SU", 10, 163);
                    pagina.drawString("EQUIPAJE,   NI   ACEPTAMOS   ENTREGAS   PARCIALES", 10, 169);
                    pagina.setFont(fuente3);
                    pagina.drawString("Factura de venta", 80, 177);
                    pagina.setFont(fuente8);
                    pagina.drawString(tabladatos.getValueAt(0, 7).toString(), 103, 188);
                    pagina.setFont(fuente4);
                    pagina.drawString("VALOR $3.000 LA UNIDAD", 58, 197);
                    pagina.dispose();
                    pj.end();
		}catch(Exception e)
		{
			System.out.println("LA IMPRESION HA SIDO CANCELADA...");
		}
            }//FIN DEL PROCEDIMIENTO imprimir()//Imprimir Recibo del cliente y de la bodega
            }//FIN DE LA CLASE Impresora
            Impresora imp=new Impresora();
            imp.imprimir();
            System.out.println("Se ingreso: "+tabladatos.getValueAt(0, 7).toString()+"");
            con.getClose();
            
            modelo.setColumnCount(0);//dejamos la tabla en cero
            modelo.setRowCount(0);//dejamos la tabla en cero
            cedula.setText(null);//aqui dejamos el formulario en blanco para que lo puedan volver a usar desde cedula
            maleta.setValue(0);
            bolsa.setValue(0);
            estopa.setValue(0);
            caja.setValue(0);
            encomienda.setValue(0);
            otro.setValue(0);
            ValorCancelar.setText(null);
            numeromaletas.setText(null);
            num_fracciones.setText(null);
        
    }//GEN-LAST:event_ingresarActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void Retirar_ArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Retirar_ArticuloActionPerformed
        ConexionBD con = new ConexionBD();
        Connection cn = con.Conexion();
        
        ConexionBDII cone = new ConexionBDII();
        Connection conex = cone.Conexion();


        class Impresora
            {
                Font fuente1 = new Font("Dialog", Font.BOLD, 10);//tarifa valida 12 horas
                Font fuente2 = new Font("Dialog", Font.ITALIC, 6);//regimen, nit,nombre, ubicacion
                Font fuente3 = new Font("Dialog", Font.PLAIN, 10);//datos del recibo
                Font fuente4 = new Font("Dialog", Font.BOLD, 9);//Logo de la empresa
                Font fuente5 = new Font("Dialog", Font.ITALIC, 7);//Condiciones
                Font fuente6 = new Font("Dialog", Font.BOLD, 12);//Imprecion bodega
                PrintJob pj;
                Graphics pagina;
                
            /********************************************************************
            *	A continuación el constructor de la clase. Aquí lo único que	*
            *	hago es tomar un objeto de impresion.							*
            ********************************************************************/
            Impresora()
            {
		pj = Toolkit.getDefaultToolkit().getPrintJob(new Frame(), "TM-T20II", null);
                String cadena = "MI TICKET";
            }
            /********************************************************************
            *	A continuación el método "imprimir(String)", el encargado de 	*
            *	colocar en el objeto gráfico la cadena que se le pasa como 		*
            *	parámetro y se imprime.											*
            ********************************************************************/
            public void imprimir()
            {
		//LO COLOCO EN UN try/catch PORQUE PUEDEN CANCELAR LA IMPRESION
		try
		{
                    pagina = pj.getGraphics();
                    pagina.setFont(fuente1);
                    pagina.setColor(Color.black);
                    pagina.drawString("GUARDA EQUIPAJES POPAYAN", 45, 8);
                    pagina.setFont(fuente2);
                    pagina.drawString("Regimen Simplificado", 90, 14);
                    pagina.drawString("34.549.232-3", 100, 19);
                    pagina.drawString("Maria del Carmen Chito Narvaez", 72, 24);
                    pagina.drawString("Terminal de Transportes Popayán", 70, 29);
                    pagina.drawString("Parte sur local 42", 90, 34);
                    pagina.setFont(fuente4);
                    pagina.drawString("TARIFA VALIDA POR 12 HORAS", 51, 42);
                    pagina.setFont(fuente3);
                    pagina.drawString("Numero de articulos", 20, 52);
                    pagina.drawString(numeromaletas.getText(), 20, 61);
                    pagina.drawString("Persona que guardo", 20, 71);
                    pagina.drawString(tabladatos.getValueAt(0, 0).toString(), 20, 80);
                    pagina.drawString("Fracciones", 20, 90);
                    pagina.drawString(num_fracciones.getText(), 20, 99);
                    pagina.drawString("Valor Cancelado", 20, 109);
                    pagina.drawString(ValorCancelar.getText(), 20, 118);
                    pagina.drawString("Fecha de ingreso", 20, 128);
                    pagina.drawString(tabladatos.getValueAt(0, 8).toString(), 20, 137);
                    pagina.drawString("Fecha de egreso", 20, 147);
                    SimpleDateFormat fechaact = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//TRANSFORMAMOS LA FECHA ACTUAL TIPO DATE A STRING
                    String fechaya = fechaact.format(new Date());//PARA IMPRIMIRLO EN EL RECIBO COMO STRING
                    pagina.drawString(fechaya, 20, 156);//IMPRIMIMOS EN EL RECIBO LA FECHA Y HORA DEL MOMENTO INGRESADO
                    pagina.drawString("Telefono", 20, 166);
                    pagina.drawString("3186404456", 20, 175);
                    pagina.drawString("Factura de venta", 20, 185);
                    pagina.drawString(tabladatos.getValueAt(0, 7).toString(), 20, 194);
                    pagina.dispose();
                    pj.end();
                    System.out.println("Se retiro: "+fechaya+"");
		}catch(Exception e)
		{
			System.out.println("LA IMPRESION HA SIDO CANCELADA...");
		}
            }//FIN DEL PROCEDIMIENTO imprimir()//Imprimir Recibo del cliente y de la bodega
            }//FIN DE LA CLASE Impresora
            Impresora imp=new Impresora();
            imp.imprimir();
         
            try 
            {
                PreparedStatement pps =conex.prepareStatement("INSERT INTO clientesalida(cedula, maleta, bolsa, estopa, caja, encomienda, otro,codigo,fecha_ingreso,valorcancelar, numeromaletas) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
                
                pps.setString(1, this.tabladatos.getValueAt(0, 0).toString());//pps modifica el string de la base de datos colocandole en la posicion 1 el dato que ya tengo en la tabla, en este caso la fila 0 y columna 0 que son las primeras
                pps.setString(2, this.tabladatos.getValueAt(0, 1).toString());
                pps.setString(3, this.tabladatos.getValueAt(0, 2).toString());
                pps.setString(4, this.tabladatos.getValueAt(0, 3).toString());
                pps.setString(5, this.tabladatos.getValueAt(0, 4).toString());
                pps.setString(6, this.tabladatos.getValueAt(0, 5).toString());
                pps.setString(7, this.tabladatos.getValueAt(0, 6).toString());
                pps.setString(8, this.tabladatos.getValueAt(0, 7).toString());
                pps.setString(9, this.tabladatos.getValueAt(0, 8).toString());
                pps.setString(10, ValorCancelar.getText());
                pps.setString(11, numeromaletas.getText());
                pps.executeUpdate();
            }catch (SQLException ex)
            {
                Logger.getLogger(Pantalla_Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Se saco: "+this.tabladatos.getValueAt(0, 7).toString()+"");
            
            try {
                PreparedStatement pst = cn.prepareStatement("DELETE FROM `cliente` WHERE `codigo` = "+this.tabladatos.getValueAt(0, 7).toString()+"");
                pst.executeUpdate();
            } 
            catch (Exception e) 
            {
            }
            con.getClose();
            cone.getClose();
            
        DefaultTableModel modelo;
        modelo = new DefaultTableModel();
        modelo.addColumn("CEDULA");
        modelo.addColumn("MALETA");
        modelo.addColumn("BOLSA");
        modelo.addColumn("ESTOPA");
        modelo.addColumn("CAJA");
        modelo.addColumn("ENCOMIENDA");
        modelo.addColumn("OTRO");
        modelo.addColumn("CODIGO");
        modelo.addColumn("FECHA DE INGRESO");
        tabladatos.setModel(modelo);
        modelo.setColumnCount(0);//dejamos la tabla en cero
        modelo.setRowCount(0);//dejamos la tabla en cero
        cedula.setText(null);//aqui dejamos el formulario en blanco para que lo puedan volver a usar
        maleta.setValue(0);
        bolsa.setValue(0);
        estopa.setValue(0);
        caja.setValue(0);
        encomienda.setValue(0);
        otro.setValue(0);
        ValorCancelar.setText(null);
        numeromaletas.setText(null);
        num_fracciones.setText(null);
        
    }//GEN-LAST:event_Retirar_ArticuloActionPerformed

    private void numeromaletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeromaletasActionPerformed
        
    }//GEN-LAST:event_numeromaletasActionPerformed

    private void numeromaletasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_numeromaletasPropertyChange
        
    }//GEN-LAST:event_numeromaletasPropertyChange

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       //timer=new Timer(1000,new cronometro());
       //timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void ValorCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorCancelarActionPerformed

    private void num_fraccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_fraccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_fraccionesActionPerformed

    private void num_fraccionesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_num_fraccionesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_num_fraccionesPropertyChange

    private void cuadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadreActionPerformed
            ConexionBDII cone = new ConexionBDII();
            Connection conex = cone.Conexion();
            
            int conf =JOptionPane.showConfirmDialog(null, "Realmente desea realizar esta accion?", "¡¡¡ALERTA!!!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if(conf == 0)
            {
            class Impresora
            {
                Font fuente6 = new Font("Dialog", Font.BOLD, 12);//Imprecion bodega
                PrintJob pj;
                Graphics pagina;
                
            /********************************************************************
            *	A continuación el constructor de la clase. Aquí lo único que	*
            *	hago es tomar un objeto de impresion.							*
            ********************************************************************/
            Impresora()
            {
		pj = Toolkit.getDefaultToolkit().getPrintJob(new Frame(), "TM-T20II", null);
                String cadena = "MI TICKET";
            }
            /********************************************************************
            *	A continuación el método "imprimir(String)", el encargado de 	*
            *	colocar en el objeto gráfico la cadena que se le pasa como 		*
            *	parámetro y se imprime.											*
            ********************************************************************/
            public void imprimir()
            {
		//LO COLOCO EN UN try/catch PORQUE PUEDEN CANCELAR LA IMPRESION
		try
		{
                    //TIKETE DE LA BODEGA
                    pagina = pj.getGraphics();
                    pagina.setColor(Color.black);
                    pagina.setFont(fuente6);
                    pagina.drawString("Total Dia", 20, 8);
                    String sql = "SELECT sum(valorcancelar) FROM clientesalida";
                    Statement pst;
        
                    try
                        {
                        pst = conex.prepareStatement(sql);
                        ResultSet rs = pst.executeQuery(sql);
                        if(rs.next())
                            {
                                String sum=rs.getString("sum(valorcancelar)");
                                String txt_sum=sum;
                                System.out.println(txt_sum);
                                pagina.drawString(txt_sum, 20, 18);
                            }
        
                        }catch(Exception e)
                            {
                                JOptionPane.showConfirmDialog(null, e);
                            }
                    String sum;
                    
                    pagina.drawString("Numero de articulos guardados", 20, 28);
                  
                    String sqld = "SELECT sum(numeromaletas) FROM clientesalida";
                    Statement mlt;
        
                    try
                    {
                    mlt = conex.prepareStatement(sqld);
                    ResultSet rsd = mlt.executeQuery(sqld);
                    if(rsd.next())
                        {
                            String sumd=rsd.getString("sum(numeromaletas)");
                            String txt_sumd=sumd;
                            System.out.println(txt_sumd);
                            pagina.drawString(txt_sumd, 20, 38);
                        }
        
                    }catch(Exception e)
                    {
                        JOptionPane.showConfirmDialog(null, e);
                    }
                    pagina.drawString("recibo codigo:", 20, 48);
                    pagina.drawString(numclicks.getText(), 20, 58);
                    pj.end();
                    }catch(Exception e)
                    {
			System.out.println("LA IMPRESION HA SIDO CANCELADA...");
                    }
                    }//FIN DEL PROCEDIMIENTO imprimir()//Imprimir Recibo del cliente y de la bodega
                    }//FIN DE LA CLASE Impresora
                    Impresora imp=new Impresora();
                    imp.imprimir(); 
                    
                    Calendar c=Calendar.getInstance();
                    String fecha=String.valueOf(c.get(Calendar.DATE));
                    fecha=fecha+"-"+String.valueOf(c.get(Calendar.MONTH));
                    fecha=fecha+"-"+String.valueOf(c.get(Calendar.YEAR));
        
                    RealizarBackupMySQL.setSelectedFile(new File ("Guarda"));
                    try
                    {
                    Runtime runtime = Runtime.getRuntime();
                    File backupFile = new File(String.valueOf("C:\\Users\\FELIPE\\Documents\\"+RealizarBackupMySQL.getSelectedFile().toString())
                        +"_"+fecha+clicks+".sql");
                    FileWriter fw = new FileWriter(backupFile);
                    Process child = runtime.exec("C:\\xampp\\mysql\\bin\\mysqldump --opt --password= --user=root "
                        + "--databases guardasalida -R --skip-tz-utc"); 
                    InputStreamReader irs = new InputStreamReader(child.getInputStream());
                    BufferedReader br = new BufferedReader(irs);

                    String line;
                    while( (line=br.readLine()) != null ) 
                    {
                        fw.write(line + "\n");
                    }
                    fw.close();
                    irs.close();
                    br.close();

                    }catch(Exception e)
                    {
                    }
                    try 
                    {
                        PreparedStatement deltab = conex.prepareStatement("DELETE FROM `guardasalida`.`clientesalida`");
                        deltab.executeUpdate();
                    } catch (Exception e) 
                        {
                        }
                    }
                    cone.getClose();
    }//GEN-LAST:event_cuadreActionPerformed

    private void cuadreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuadreMousePressed
        clicks++;
        System.out.println(clicks);
        numclicks.setText(clicks + " Cuadre");
    }//GEN-LAST:event_cuadreMousePressed

    private void numclicksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numclicksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numclicksActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Inicio().setVisible(true);
            }
            
        });
    }
    private Timer timer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bolsa;
    private javax.swing.JLabel Caja;
    private javax.swing.JLabel Cedula;
    private javax.swing.JLabel Encomienda;
    private javax.swing.JLabel Estopa;
    private javax.swing.JLabel Maleta;
    private javax.swing.JLabel Otro;
    private javax.swing.JButton Retirar_Articulo;
    private javax.swing.JTextField ValorCancelar;
    private javax.swing.JSpinner bolsa;
    private javax.swing.JSpinner caja;
    private javax.swing.JTextField cedula;
    private javax.swing.JButton consultar;
    private javax.swing.JButton cuadre;
    private javax.swing.JSpinner encomienda;
    private javax.swing.JSpinner estopa;
    private javax.swing.JLabel fracciones;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner maleta;
    private javax.swing.JTextField num_fracciones;
    private javax.swing.JTextField numclicks;
    private javax.swing.JTextField numeromaletas;
    private javax.swing.JSpinner otro;
    private javax.swing.JTable tabladatos;
    // End of variables declaration//GEN-END:variables
}
