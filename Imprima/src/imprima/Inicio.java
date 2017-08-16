package imprima;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*; 
import java.util.*;/*
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;*/
public class Inicio extends javax.swing.JFrame {
    
    public static double Finalp=0;
    public static boolean ingresado=false;
    
    public Inicio() {
        initComponents();
    }
    public static class thread1 implements Runnable{
	        public void run(){
	            for (int i=0; i<=100; i++)
                    { 
                        jProgressBar1.setValue(i);
	                jProgressBar1.repaint();
	                try
                        {
                            Thread.sleep(50);
                        } 
	                catch (InterruptedException e){}
	            }
	        }	    
	}
    @Override
    public Image getIconImage ()
    {
        Image refValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("iconos/empresa1.png"));
        return refValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consultaproducto = new javax.swing.JFrame();
        jPanel10 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel35 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jPanel66 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        ingreso = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        facturacion = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPanel70 = new javax.swing.JPanel();
        jComboBox18 = new javax.swing.JComboBox();
        jPanel67 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jComboBox17 = new javax.swing.JComboBox();
        jButton19 = new javax.swing.JButton();
        ingprodu = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel30 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel32 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jPanel33 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jPanel34 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        espeingre = new javax.swing.JDialog();
        jPanel14 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        acerca = new javax.swing.JDialog();
        jPanel16 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        antes = new javax.swing.JFrame();
        jPanel31 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel39 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel41 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        ingpape = new javax.swing.JFrame();
        jPanel43 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel49 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel50 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox();
        jPanel51 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        ingcompu = new javax.swing.JFrame();
        jPanel54 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel56 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPanel60 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel61 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox();
        jPanel62 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel63 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        consultaproducto.setTitle("Consulta");
        consultaproducto.setIconImage(getIconImage());

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar.png"))); // NOI18N
        jButton18.setText("Limpiar");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton18);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton1);

        consultaproducto.getContentPane().add(jPanel10, java.awt.BorderLayout.PAGE_END);

        jLabel1.setText("Busqueda de productos por");
        jPanel11.add(jLabel1);

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Cod" }));
        jPanel11.add(jComboBox15);

        jTextField1.setColumns(10);
        jPanel11.add(jTextField1);

        jLabel42.setText("en");
        jPanel11.add(jLabel42);

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Snacks", "Papeler", "SuministrosPC", "ServiciosTLF", "ServicioIyA" }));
        jPanel11.add(jComboBox16);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        jButton7.setText("Buscar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton7);

        consultaproducto.getContentPane().add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setEnabled(false);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("OCR A Std", 1, 14));
        jTextArea1.setRows(20);
        jScrollPane1.setViewportView(jTextArea1);

        consultaproducto.getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel35.setLayout(new java.awt.GridLayout(5, 0));

        jLabel43.setText("Snacks=Inventario Snacks");
        jPanel52.add(jLabel43);

        jPanel35.add(jPanel52);

        jLabel44.setText("Papeler= Inventario Papeleria");
        jPanel53.add(jLabel44);

        jPanel35.add(jPanel53);

        jLabel45.setText("SuministrosPC= Inventario Computacion");
        jPanel64.add(jLabel45);

        jPanel35.add(jPanel64);

        jLabel46.setText("ServiciosTLF=Precios de Servicios Telefonicos");
        jPanel65.add(jLabel46);

        jPanel35.add(jPanel65);

        jLabel47.setText("ServicioIyA=Precios de Servicios de Impresion y Anillado");
        jPanel66.add(jLabel47);

        jPanel35.add(jPanel66);

        consultaproducto.getContentPane().add(jPanel35, java.awt.BorderLayout.LINE_START);

        ingreso.setTitle("Ingrese Contraseña");
        ingreso.setIconImage(getIconImage());
        ingreso.getContentPane().setLayout(new java.awt.GridLayout(3, 0));

        jLabel2.setText("Usuario");
        jPanel5.add(jLabel2);

        jTextField2.setColumns(10);
        jPanel5.add(jTextField2);

        ingreso.getContentPane().add(jPanel5);

        jLabel3.setText("Contraseña");
        jPanel6.add(jLabel3);

        jPasswordField1.setColumns(10);
        jPanel6.add(jPasswordField1);

        ingreso.getContentPane().add(jPanel6);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ok.png"))); // NOI18N
        jButton2.setText("Ingresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        jButton6.setText("Cancelar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton6);

        ingreso.getContentPane().add(jPanel7);

        facturacion.setTitle("Facturacion");
        facturacion.setIconImage(getIconImage());

        jLabel7.setText("Factura de Producto");
        jPanel1.add(jLabel7);

        facturacion.getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imprimir.png"))); // NOI18N
        jButton4.setText("Imprimir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar.png"))); // NOI18N
        jButton20.setText("Limpiar");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        facturacion.getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jTextArea3.setColumns(20);
        jTextArea3.setEditable(false);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        facturacion.getContentPane().add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.GridLayout(2, 0));

        jPanel68.setLayout(new java.awt.GridLayout(2, 0));

        jLabel49.setText("Que tipo de Producto");
        jPanel69.add(jLabel49);

        jPanel68.add(jPanel69);

        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Snacks", "Papeler", "SuministrosPC", "ServiciosTLF", "ServicioIyA" }));
        jPanel70.add(jComboBox18);

        jPanel68.add(jPanel70);

        jPanel4.add(jPanel68);

        jPanel67.setLayout(new java.awt.GridLayout(2, 0));

        jLabel48.setText("Ingrese el Codigo del Producto a Facturar");
        jPanel71.add(jLabel48);

        jPanel67.add(jPanel71);

        jTextField8.setColumns(10);
        jTextField8.setToolTipText("Ingrese el Codigo del Producto");
        jPanel72.add(jTextField8);

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "30", "40", "50", "60", "70", "80", "90", "100", "150", "200" }));
        jPanel72.add(jComboBox17);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/factura.png"))); // NOI18N
        jButton19.setText("Añadir");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel72.add(jButton19);

        jPanel67.add(jPanel72);

        jPanel4.add(jPanel67);

        facturacion.getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_START);

        ingprodu.setTitle("Ingreso Producto");
        ingprodu.setIconImage(getIconImage());

        jLabel4.setText("Ingreso Snacks");
        jPanel8.add(jLabel4);

        ingprodu.getContentPane().add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ok.png"))); // NOI18N
        jButton8.setText("Ingresar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton8);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton3);

        ingprodu.getContentPane().add(jPanel9, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        ingprodu.getContentPane().add(jPanel12, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        ingprodu.getContentPane().add(jPanel13, java.awt.BorderLayout.LINE_START);

        jPanel28.setLayout(new java.awt.GridLayout(5, 0));

        jLabel16.setText("Codigo del Producto");
        jPanel29.add(jLabel16);

        jTextField3.setColumns(10);
        jPanel29.add(jTextField3);

        jPanel28.add(jPanel29);

        jLabel18.setText("Nombre del Producto");
        jPanel30.add(jLabel18);

        jTextField4.setColumns(10);
        jPanel30.add(jTextField4);

        jPanel28.add(jPanel30);

        jLabel34.setText("Stock del Producto");
        jPanel32.add(jLabel34);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200" }));
        jPanel32.add(jComboBox4);

        jLabel35.setText("+");
        jPanel32.add(jLabel35);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        jPanel32.add(jComboBox5);

        jPanel28.add(jPanel32);

        jLabel36.setText("Proveedor del Producto");
        jPanel33.add(jLabel36);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Frito Lay", "Manihabas", "Proesa", "Kraft", "Clajarsa SA.", "Nestle", "Ferrero", "Universal", "Arcor", "Colombina", "Tony", "Creveceria Nacional", "Sumesa", "All Natural", "Coca-Cola Company", "Tesalia", "Gssi", "Alpina", "Bazar", "Moanplus", "Inacake" }));
        jPanel33.add(jComboBox6);

        jPanel28.add(jPanel33);

        jLabel19.setText("Precio de Producto");
        jPanel34.add(jLabel19);

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0.0", "0.1", "0.2", "0.3", "0.4", "0.5", "0.6", "0.7", "0.8", "0.9", "1.0", "2.0", "3.0", "4.0", "5.0", "6.0", "7.0", "8.0", "9.0" }));
        jPanel34.add(jComboBox10);

        jLabel39.setText("+");
        jPanel34.add(jLabel39);

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0.00", "0.01", "0.02", "0.03", "0.04", "0.05", "0.06", "0.07", "0.08", "0.09" }));
        jPanel34.add(jComboBox9);

        jPanel28.add(jPanel34);

        ingprodu.getContentPane().add(jPanel28, java.awt.BorderLayout.CENTER);

        espeingre.setTitle("Espere");
        espeingre.getContentPane().setLayout(new java.awt.GridLayout(2, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11));
        jLabel5.setText("Espere mientras verificamos su identidad...");
        jPanel14.add(jLabel5);

        espeingre.getContentPane().add(jPanel14);

        jProgressBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jProgressBar1.setStringPainted(true);
        jProgressBar1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jProgressBar1StateChanged(evt);
            }
        });
        jPanel15.add(jProgressBar1);

        espeingre.getContentPane().add(jPanel15);

        acerca.setTitle("Acerca de");
        acerca.setIconImage(getIconImage());
        acerca.setModal(true);
        acerca.getContentPane().setLayout(new java.awt.GridLayout(3, 0));

        jPanel16.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Nasalization", 1, 36));
        jLabel8.setText("Imprima V 1.0");
        jPanel26.add(jLabel8);

        jPanel16.add(jPanel26, java.awt.BorderLayout.SOUTH);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logo_puce_2010.png"))); // NOI18N
        jPanel27.add(jLabel15);

        jPanel16.add(jPanel27, java.awt.BorderLayout.CENTER);

        acerca.getContentPane().add(jPanel16);

        jPanel17.setLayout(new java.awt.GridLayout(5, 0));

        jLabel9.setText("ArcaSoft produciones 2011");
        jPanel19.add(jLabel9);

        jPanel17.add(jPanel19);

        jLabel10.setText("Josue Carranza");
        jPanel20.add(jLabel10);

        jPanel17.add(jPanel20);

        jLabel12.setText("Gabriel Moreta");
        jPanel21.add(jLabel12);

        jPanel17.add(jPanel21);

        jLabel11.setText("Sergio Barba");
        jPanel22.add(jLabel11);

        jPanel17.add(jPanel22);

        jLabel13.setText("Marissa Armendariz");
        jPanel23.add(jLabel13);

        jPanel17.add(jPanel23);

        acerca.getContentPane().add(jPanel17);

        jPanel18.setLayout(new java.awt.BorderLayout());

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ok.png"))); // NOI18N
        jButton9.setText("OK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton9);

        jPanel18.add(jPanel24, java.awt.BorderLayout.PAGE_END);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/acercade.png"))); // NOI18N
        jPanel25.add(jLabel14);

        jPanel18.add(jPanel25, java.awt.BorderLayout.CENTER);

        acerca.getContentPane().add(jPanel18);

        antes.setTitle("Tipos de Producto");
        antes.setIconImage(getIconImage());
        antes.getContentPane().setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        jPanel31.setLayout(new java.awt.BorderLayout());

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/snacks.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel31.add(jButton10, java.awt.BorderLayout.CENTER);

        jLabel17.setFont(new java.awt.Font("Good Times", 0, 18));
        jLabel17.setText("SNACKS");
        jPanel39.add(jLabel17);

        jPanel31.add(jPanel39, java.awt.BorderLayout.PAGE_END);

        antes.getContentPane().add(jPanel31);

        jPanel36.setLayout(new java.awt.BorderLayout());

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/papel.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel36.add(jButton11, java.awt.BorderLayout.CENTER);

        jLabel20.setFont(new java.awt.Font("Good Times", 0, 18));
        jLabel20.setText("PAPELERIA");
        jPanel40.add(jLabel20);

        jPanel36.add(jPanel40, java.awt.BorderLayout.PAGE_END);

        antes.getContentPane().add(jPanel36);

        jPanel37.setLayout(new java.awt.BorderLayout());

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/compu.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel37.add(jButton12, java.awt.BorderLayout.CENTER);

        jLabel21.setFont(new java.awt.Font("Good Times", 0, 18));
        jLabel21.setText("COMPUTACION");
        jPanel41.add(jLabel21);

        jPanel37.add(jPanel41, java.awt.BorderLayout.PAGE_END);

        antes.getContentPane().add(jPanel37);

        jPanel38.setLayout(new java.awt.BorderLayout());

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/vovler.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel38.add(jButton13, java.awt.BorderLayout.CENTER);

        jLabel22.setFont(new java.awt.Font("Good Times", 0, 18));
        jLabel22.setText("VOLVER");
        jPanel42.add(jLabel22);

        jPanel38.add(jPanel42, java.awt.BorderLayout.PAGE_END);

        antes.getContentPane().add(jPanel38);

        ingpape.setTitle("Ingreso Producto");
        ingpape.setIconImage(getIconImage());

        jLabel23.setText("Ingreso Papeleria");
        jPanel43.add(jLabel23);

        ingpape.getContentPane().add(jPanel43, java.awt.BorderLayout.PAGE_START);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ok.png"))); // NOI18N
        jButton14.setText("Ingresar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel44.add(jButton14);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        jButton15.setText("Salir");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel44.add(jButton15);

        ingpape.getContentPane().add(jPanel44, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        ingpape.getContentPane().add(jPanel45, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        ingpape.getContentPane().add(jPanel46, java.awt.BorderLayout.LINE_START);

        jPanel47.setLayout(new java.awt.GridLayout(4, 0));

        jLabel24.setText("Codigo del Producto");
        jPanel48.add(jLabel24);

        jTextField5.setColumns(10);
        jPanel48.add(jTextField5);

        jPanel47.add(jPanel48);

        jLabel25.setText("Nombre del Producto");
        jPanel49.add(jLabel25);

        jTextField6.setColumns(10);
        jPanel49.add(jTextField6);

        jPanel47.add(jPanel49);

        jLabel26.setText("Precio");
        jPanel50.add(jLabel26);

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0.0", "0.1", "0.2", "0.3", "0.4", "0.5", "0.6", "0.7", "0.8", "0.9", "1.0", "2.0", "3.0", "4.0", "5.0", "6.0", "7.0", "8.0", "9.0" }));
        jPanel50.add(jComboBox13);

        jLabel41.setText("+");
        jPanel50.add(jLabel41);

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0.00", "0.01", "0.02", "0.03", "0.04", "0.05", "0.06", "0.07", "0.08", "0.09" }));
        jPanel50.add(jComboBox14);

        jPanel47.add(jPanel50);

        jLabel37.setText("Stock del Producto");
        jPanel51.add(jLabel37);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200" }));
        jPanel51.add(jComboBox7);

        jLabel38.setText("+");
        jPanel51.add(jLabel38);

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        jPanel51.add(jComboBox8);

        jPanel47.add(jPanel51);

        ingpape.getContentPane().add(jPanel47, java.awt.BorderLayout.CENTER);

        ingcompu.setTitle("Ingreso Producto");
        ingcompu.setIconImage(getIconImage());

        jLabel27.setText("Ingreso Computacion");
        jPanel54.add(jLabel27);

        ingcompu.getContentPane().add(jPanel54, java.awt.BorderLayout.PAGE_START);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ok.png"))); // NOI18N
        jButton16.setText("Ingresar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel55.add(jButton16);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        jButton17.setText("Salir");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel55.add(jButton17);

        ingcompu.getContentPane().add(jPanel55, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        ingcompu.getContentPane().add(jPanel56, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        ingcompu.getContentPane().add(jPanel57, java.awt.BorderLayout.LINE_START);

        jPanel58.setLayout(new java.awt.GridLayout(5, 0));

        jLabel28.setText("Codigo del Producto");
        jPanel59.add(jLabel28);

        jTextField9.setColumns(10);
        jPanel59.add(jTextField9);

        jPanel58.add(jPanel59);

        jLabel29.setText("Nombre del Producto");
        jPanel60.add(jLabel29);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CD", "DVD", "Audifonos", "Memoria USB", "Microfono", "Parlantes", "Diskette", "Mouse", "Blu Ray" }));
        jPanel60.add(jComboBox1);

        jPanel58.add(jPanel60);

        jLabel30.setText("Precio");
        jPanel61.add(jLabel30);

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0.0", "0.1", "0.2", "0.3", "0.4", "0.5", "0.6", "0.7", "0.8", "0.9", "1.0", "2.0", "3.0", "4.0", "5.0", "6.0", "7.0", "8.0", "9.0" }));
        jPanel61.add(jComboBox11);

        jLabel40.setText("+");
        jPanel61.add(jLabel40);

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0.00", "0.01", "0.02", "0.03", "0.04", "0.05", "0.06", "0.07", "0.08", "0.09" }));
        jPanel61.add(jComboBox12);

        jPanel58.add(jPanel61);

        jLabel32.setText("Stock del Producto");
        jPanel62.add(jLabel32);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200" }));
        jPanel62.add(jComboBox3);

        jLabel33.setText("+");
        jPanel62.add(jLabel33);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        jPanel62.add(jComboBox2);

        jPanel58.add(jPanel62);

        jLabel31.setText("Detalle del Producto");
        jPanel63.add(jLabel31);

        jTextField10.setColumns(10);
        jPanel63.add(jTextField10);

        jPanel58.add(jPanel63);

        ingcompu.getContentPane().add(jPanel58, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Imprima V 1.0");
        setIconImage(getIconImage());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/inicio.png"))); // NOI18N
        getContentPane().add(jLabel6, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Archivo");

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/factura.png"))); // NOI18N
        jMenuItem9.setText("Facturar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        jMenuItem1.setText("Consultar Producto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login.png"))); // NOI18N
        jMenuItem10.setText("Ingreso Inventario");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir.png"))); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Estadistica");

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/stock.png"))); // NOI18N
        jMenu4.setText("Stock");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/barras.png"))); // NOI18N
        jMenuItem6.setText("Papeleria");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/barras.png"))); // NOI18N
        jMenuItem7.setText("Computación");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/barras.png"))); // NOI18N
        jMenuItem8.setText("Snacks");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenu3.add(jMenu4);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Ayuda");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/acerca.png"))); // NOI18N
        jMenuItem4.setText("Acerca de Imprima 1.0");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        facturacion.setSize(800,500);
        facturacion.setVisible(true);
        facturacion.move(300,100);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextArea3.setText("");
        facturacion.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextField2.setText("");
        jPasswordField1.setText("");
        ingreso.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        if(ingresado==false)
        {
        ingreso.setSize(500,500);
        ingreso.setVisible(true);
        ingreso.pack();
        ingreso.move(350,250);
        }
        else
        {
            antes.setSize(500,500);
            antes.setVisible(true);
            antes.pack();
            antes.move(350,150);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        System.exit(0);     }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText("");
        consultaproducto.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        consultaproducto.setSize(500,500);
        consultaproducto.setVisible(true);
        consultaproducto.pack();
        consultaproducto.move(350,250);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ingprodu.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextField2.getText().equals("admin")&&jPasswordField1.getText().equals("admin"))
        {
            ingresado=true;
            jTextField2.setText("");
            jPasswordField1.setText("");
            espeingre.setSize(500,500);
            espeingre.setVisible(true);
            espeingre.pack();
            espeingre.move(350,250);
            ingreso.dispose();
            new Thread(new thread1()).start();
                       
        }
        else
        {
            jTextField2.setText("");
            jPasswordField1.setText("");
            jLabel5.setText("Nombre de Usuario y/o Contraseña incorrectos");
            espeingre.setSize(500,500);
            espeingre.setVisible(true);
            espeingre.pack();
            espeingre.move(350,250);
            
        }
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jProgressBar1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jProgressBar1StateChanged
        
        if(jProgressBar1.getValue()==100)
        {
            antes.setSize(500,500);
            antes.setVisible(true);
            antes.pack();
            antes.move(350,150);
            espeingre.dispose();
        }
        
    }//GEN-LAST:event_jProgressBar1StateChanged

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        acerca.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        acerca.setSize(500,500);
        acerca.setVisible(true);
        acerca.pack();
        acerca.move(350,300);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
            ingprodu.setSize(500,500);
            ingprodu.setVisible(true);
            ingprodu.pack();
            ingprodu.move(350,150);
            antes.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        antes.dispose();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        ingpape.dispose();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        ingcompu.dispose();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
            ingpape.setSize(500,500);
            ingpape.setVisible(true);
            ingpape.pack();
            ingpape.move(350,150);
            antes.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
            ingcompu.setSize(500,500);
            ingcompu.setVisible(true);
            ingcompu.pack();
            ingcompu.move(350,150);
            antes.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    int stock=Integer.parseInt((String)jComboBox4.getSelectedItem())+Integer.parseInt((String)jComboBox5.getSelectedItem());
    double prec=Double.parseDouble((String)jComboBox10.getSelectedItem())+Double.parseDouble((String)jComboBox9.getSelectedItem());
    String a= String.valueOf(prec);
    String resultado=(a.substring(0,1) +","+a.substring(2));
    Connection conexion;
    Statement sentencia;
    
    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    
    try
    {
        conexion=DriverManager.getConnection("jdbc:odbc:imprima");
        sentencia=conexion.createStatement();
        sentencia.executeUpdate("insert into Snacks (Cod, Nombre, Stock,Proveedor, Precio)values('"+jTextField3.getText()+"','"+jTextField4.getText()+"','"+stock+"','"+(String)jComboBox6.getSelectedItem()+"','"+resultado+"')");
        
    }
    catch(SQLException e)
    {
        System.out.println(e.getMessage());
    }
    jTextField3.setText("");
    jTextField4.setText("");
    ingprodu.dispose();
}//GEN-LAST:event_jButton8ActionPerformed

private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
    int stock=Integer.parseInt((String)jComboBox3.getSelectedItem())+Integer.parseInt((String)jComboBox2.getSelectedItem());
    double prec=Double.parseDouble((String)jComboBox11.getSelectedItem())+Double.parseDouble((String)jComboBox12.getSelectedItem());
    String a= String.valueOf(prec);
    String resultado=(a.substring(0,1) +","+a.substring(2));
    Connection conexion;
    Statement sentencia;
    
    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    
    try
    {
        conexion=DriverManager.getConnection("jdbc:odbc:imprima");
        sentencia=conexion.createStatement();
        sentencia.executeUpdate("insert into SuministrosPC (Cod, Nombre,Precio,Stock,Detalle)values('"+jTextField9.getText()+"','"+(String)jComboBox1.getSelectedItem()+"','"+resultado+"','"+stock+"','"+jTextField10.getText()+"')");
        
    }
    catch(SQLException e)
    {
        System.out.println(e.getMessage());
    }
    jTextField9.setText("");
    jTextField10.setText("");
    ingcompu.dispose();
}//GEN-LAST:event_jButton16ActionPerformed

private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
    int stock=Integer.parseInt((String)jComboBox7.getSelectedItem())+Integer.parseInt((String)jComboBox8.getSelectedItem());
    double prec=Double.parseDouble((String)jComboBox13.getSelectedItem())+Double.parseDouble((String)jComboBox14.getSelectedItem());
    String a= String.valueOf(prec);
    String resultado=(a.substring(0,1) +","+a.substring(2));
    Connection conexion;
    Statement sentencia;
    
    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    
    try
    {
        conexion=DriverManager.getConnection("jdbc:odbc:imprima");
        sentencia=conexion.createStatement();
        sentencia.executeUpdate("insert into Papeler (Cod, Nombre, Precio, Stock)values('"+jTextField5.getText()+"','"+jTextField6.getText()+"','"+resultado+"','"+stock+"')");
        
    }
    catch(SQLException e)
    {
        System.out.println(e.getMessage());
    }
    jTextField6.setText("");
    jTextField5.setText("");
    ingpape.dispose();
}//GEN-LAST:event_jButton14ActionPerformed

private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

    Connection conexion;
    Statement sentencia;
    ResultSet resultado;
    
    
    DefaultPieDataset data = new DefaultPieDataset();
       
    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }    

    try
    {
        conexion=DriverManager.getConnection("jdbc:odbc:imprima");
        sentencia=conexion.createStatement();
        resultado=sentencia.executeQuery("Select Nombre,Stock from Papeler ");
        
        while(resultado.next())
        {
            String nombre=resultado.getString("Nombre");
           int stock=resultado.getInt("Stock");
            data.setValue(nombre,stock);
        }
        
    }
    catch(SQLException e)
    {
        System.out.println(e.getMessage());
    }   

       JFreeChart chart = ChartFactory.createPieChart("Stock de Papeleria",data,true,true,true);
       ChartFrame frame=new ChartFrame("Stock",chart);
       frame.setIconImage(getIconImage());
       frame.pack();
       frame.setVisible(true);        
       frame.move(350,150);
       
}//GEN-LAST:event_jMenuItem6ActionPerformed

private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    Connection conexion;
    Statement sentencia;
    ResultSet resultado;
    
    
    DefaultPieDataset data = new DefaultPieDataset();
       
    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }    

    try
    {
        conexion=DriverManager.getConnection("jdbc:odbc:imprima");
        sentencia=conexion.createStatement();
        resultado=sentencia.executeQuery("Select Nombre,Stock from SuministrosPC ");
        
        while(resultado.next())
        {
            String nombre=resultado.getString("Nombre");
           int stock=resultado.getInt("Stock");
            data.setValue(nombre,stock);
        }
        
    }
    catch(SQLException e)
    {
        System.out.println(e.getMessage());
    }   

       JFreeChart chart = ChartFactory.createPieChart("Stock de Computacion",data,true,true,true);
       ChartFrame frame=new ChartFrame("Stock",chart);
       frame.setIconImage(getIconImage());
       frame.pack();
       frame.setVisible(true);        
       frame.move(350,150);
}//GEN-LAST:event_jMenuItem7ActionPerformed

private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
    Connection conexion;
    Statement sentencia;
    ResultSet resultado;
    
    
    DefaultPieDataset data = new DefaultPieDataset();
       
    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }    

    try
    {
        conexion=DriverManager.getConnection("jdbc:odbc:imprima");
        sentencia=conexion.createStatement();
        resultado=sentencia.executeQuery("Select Nombre,Stock from Snacks ");
        
        while(resultado.next())
        {
            String nombre=resultado.getString("Nombre");
           int stock=resultado.getInt("Stock");
            data.setValue(nombre,stock);
        }
        
    }
    catch(SQLException e)
    {
        System.out.println(e.getMessage());
    }   

       JFreeChart chart = ChartFactory.createPieChart("Stock de Snacks",data,true,true,true);
       ChartFrame frame=new ChartFrame("Stock",chart);
       frame.setIconImage(getIconImage());
       frame.pack();
       frame.setVisible(true);        
       frame.move(350,150);
    
   
}//GEN-LAST:event_jMenuItem8ActionPerformed

private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
jTextArea1.setText("");
}//GEN-LAST:event_jButton18ActionPerformed

private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    
    
    Connection conexion;
    Statement sentencia;
    ResultSet resultado;
       
    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }    

    try
    {
        String dato1=String.valueOf((String)jComboBox15.getSelectedItem());
        String dato2=jTextField1.getText();
        String dato3=String.valueOf((String)jComboBox16.getSelectedItem());
        
        conexion=DriverManager.getConnection("jdbc:odbc:imprima");
        sentencia=conexion.createStatement();
        resultado=sentencia.executeQuery("Select * from "+dato3+" where "+dato1+"='"+dato2+"'");
        
        if(dato3.equals("Snacks"))
        {
            while(resultado.next())
            {
                String c1=resultado.getString(1);
                String c2=resultado.getString(2);
                int c3=resultado.getInt(3);
                String c4=resultado.getString(4);
                Double c5=resultado.getDouble(5);
                
                jTextArea1.append("Codigo:"+c1+"\n");
                jTextArea1.append("Nombre:"+c2+"\n");
                jTextArea1.append("Stock:"+c3+"\n");
                jTextArea1.append("Proveedor:"+c4+"\n");
                jTextArea1.append("Precio:"+c5+"\n");
                
                jTextArea1.append("\n\n");
            }
            
        }
        

        if(dato3.equals("ServicioIyA"))
        {
            while(resultado.next())
            {
                String c1=resultado.getString(1);
                String c2=resultado.getString(2);
                double c3=resultado.getDouble(3);
                String c4=resultado.getString(4);                
                
                jTextArea1.append("Codigo:"+c1+"\n");
                jTextArea1.append("Tipo:"+c2+"\n");
                jTextArea1.append("Precio:"+c3+"\n");
                jTextArea1.append("Formato:"+c4+"\n");

                
                jTextArea1.append("\n\n");
            } 
        }       
        
        if(dato3.equals("Papeler"))
        {
            while(resultado.next())
            {
                String c1=resultado.getString(1);
                String c2=resultado.getString(2);
                double c3=resultado.getDouble(3);
                int c4=resultado.getInt(4);
                
                jTextArea1.append("Codigo:"+c1+"\n");
                jTextArea1.append("Nombre:"+c2+"\n");
                jTextArea1.append("Precio:"+c3+"\n");
                jTextArea1.append("Stock:"+c4+"\n");

                
                jTextArea1.append("\n\n");
            }            
        }           
        
        if(dato3.equals("SuministrosPC"))
        {
            while(resultado.next())
            {
                String c1=resultado.getString(1);
                String c2=resultado.getString(2);
                double c3=resultado.getDouble(3);
                int c4=resultado.getInt(4);
                String c5=resultado.getString(5);

                jTextArea1.append("Codigo:"+c1+"\n");
                jTextArea1.append("Nombre:"+c2+"\n");
                jTextArea1.append("Precio:"+c3+"\n");
                jTextArea1.append("Stock:"+c4+"\n");
                jTextArea1.append("Detalle:"+c5+"\n");

                
                jTextArea1.append("\n\n");
            }
        }
        
        if(dato3.equals("ServiciosTLF"))
        {
            while(resultado.next())
            {
                String c1=resultado.getString(1);
                String c2=resultado.getString(2);
                double c3=resultado.getDouble(3);

                jTextArea1.append("Codigo:"+c1+"\n");
                jTextArea1.append("Tipo:"+c2+"\n");
                jTextArea1.append("Detalle:"+c3+"\n");

                
                jTextArea1.append("\n\n");
            }
        }
        
        conexion.close();
        sentencia.close();

    }
    catch(SQLException e)
    {
        System.out.println(e.getMessage());
    }   
}//GEN-LAST:event_jButton7ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
     
    Connection conexion;
    Statement sentencia, s1;
    ResultSet resultado;
       
    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }    

    try
    {
        String dato2=jTextField8.getText();
        String dato3=String.valueOf((String)jComboBox18.getSelectedItem());
        
        conexion=DriverManager.getConnection("jdbc:odbc:imprima");
        sentencia=conexion.createStatement();
        s1=conexion.createStatement();
        resultado=sentencia.executeQuery("Select * from "+dato3+" where Cod='"+dato2+"'");
        
        if(dato3.equals("Snacks"))
        {
            s1.executeUpdate("update Snacks set Stock=Stock-'"+Integer.parseInt((String)jComboBox17.getSelectedItem())+"' ");
            while(resultado.next())
            {
                String c1=resultado.getString(1);
                String c2=resultado.getString(2);
                Double c5=resultado.getDouble(5);
                Finalp+=c5*Double.parseDouble((String)jComboBox17.getSelectedItem());
                
                jTextArea3.append("Codigo: "+c1+"-----");
                jTextArea3.append("---- Nombre: "+c2+"-----");
                jTextArea3.append("---- Cantidad: "+(String)jComboBox17.getSelectedItem()+"-----");
                jTextArea3.append("---- Precio: "+c5+"\n");
    
            }
            
        }
        

        if(dato3.equals("ServicioIyA"))
        {
            
            while(resultado.next())
            {
                String c1=resultado.getString(1);
                String c2=resultado.getString(2);
                double c3=resultado.getDouble(3);
                String c4=resultado.getString(4);                
                Finalp+=c3*Double.parseDouble((String)jComboBox17.getSelectedItem());
                
                jTextArea3.append("Codigo: "+c1+"---");
                jTextArea3.append("--- Tipo: "+c2+"---");
                jTextArea3.append("--- Precio: "+c3+"---");
                jTextArea3.append("--- Cantidad: "+(String)jComboBox17.getSelectedItem()+"---");
                jTextArea3.append("--- Formato:"+c4+"\n");

            } 
        }       
        
        if(dato3.equals("Papeler"))
        {
            s1.executeUpdate("update Papeler set Stock=Stock-'"+Integer.parseInt((String)jComboBox17.getSelectedItem())+"' ");
            while(resultado.next())
            {
                String c1=resultado.getString(1);
                String c2=resultado.getString(2);
                double c3=resultado.getDouble(3);
                Finalp+=c3*Double.parseDouble((String)jComboBox17.getSelectedItem());
                
                jTextArea3.append("Codigo:"+c1+"---");
                jTextArea3.append("--- Nombre:"+c2+"---");
                jTextArea3.append("--- Cantidad: "+(String)jComboBox17.getSelectedItem()+"---");
                jTextArea3.append("--- Precio:"+c3+"\n");
                

            }            
        }           
        
        if(dato3.equals("SuministrosPC"))
        {
            s1.executeUpdate("update SuministrosPC set Stock=Stock-'"+Integer.parseInt((String)jComboBox17.getSelectedItem())+"' ");
            while(resultado.next())
            {
                String c1=resultado.getString(1);
                String c2=resultado.getString(2);
                double c3=resultado.getDouble(3);
                String c5=resultado.getString(5);
                Finalp+=c3*Double.parseDouble((String)jComboBox17.getSelectedItem());

                jTextArea3.append("Codigo: "+c1+"---");
                jTextArea3.append("--- Nombre: "+c2+"---");
                jTextArea3.append("--- Precio: "+c3+"---");
                jTextArea3.append("--- Cantidad: "+(String)jComboBox17.getSelectedItem()+"---");
                jTextArea3.append("--- Detalle: "+c5+"\n");

            }
        }
        
        if(dato3.equals("ServiciosTLF"))
        {
            while(resultado.next())
            {
                String c1=resultado.getString(1);
                String c2=resultado.getString(2);
                double c3=resultado.getDouble(3);
                Finalp+=c3*Double.parseDouble((String)jComboBox17.getSelectedItem());

                jTextArea3.append("Codigo: "+c1+"---");
                jTextArea3.append("--- Tipo: "+c2+"---");
                jTextArea3.append("--- Cantidad: "+(String)jComboBox17.getSelectedItem()+"---");
                jTextArea3.append("--- Costo: "+c3+"\n");

            }
        }
        
        conexion.close();
        sentencia.close();

    }
    catch(SQLException e)
    {
        System.out.println(e.getMessage());
    }   
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextArea3.append("\n\n-------------------------------------------------------|| PVP ||---------------------------------------------------------\n"+"------------------------------------------------------>>"+Finalp+"<<--------------------------------------------------------");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        Finalp=0;
        jTextArea3.setText("");
    }//GEN-LAST:event_jButton20ActionPerformed

    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog acerca;
    private javax.swing.JFrame antes;
    private javax.swing.JFrame consultaproducto;
    private javax.swing.JDialog espeingre;
    private javax.swing.JFrame facturacion;
    private javax.swing.JFrame ingcompu;
    private javax.swing.JFrame ingpape;
    private javax.swing.JFrame ingprodu;
    private javax.swing.JFrame ingreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox16;
    private javax.swing.JComboBox jComboBox17;
    private javax.swing.JComboBox jComboBox18;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private static javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
