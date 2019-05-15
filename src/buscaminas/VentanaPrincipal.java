package buscaminas;

import buscaminas.Cuadro;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame implements ActionListener {
    /*Se crea la clase venta y se extienede al JFrame indicando la implicacion de interfaz grafica
    y se implementa el ActionListener para el uso del public void actionPerformed(ActionEvent e) */
    
    int contadorMinas = 0;
    int numeroCuadros = 0;
    int contador = 0;
    
   // Se instancian variables

    public VentanaPrincipal() {
        initComponents();//Carga los objetos puesto en el JFrame
        setSize(600,500);//Se elige el tamaño del tablero
        setLocationRelativeTo(null);//se da ubicación centrada
        }

    public void actionPerformed(ActionEvent e){ 
        /*Un evento ActionEvent se produce: al pulsar un botón (Button)o al hacer doble clic en un elemento de lista (List)
        o al pulsar INTRO en una caja de texto (TextFiel)o al elegir un menú (MenuItem)o entre otros*/
        
        Cuadro temp2 = (Cuadro)e.getSource();//e = Manejador de eventos
        if(temp2.estaMinado()){  
                temp2.setBackground(Color.RED); //se le da color rojo si hay una mina
                javax.swing.JOptionPane.showMessageDialog(this, "¡¡¡Perdiste!!! pisaste una mina");
                this.contador=0;  // Para empezar denuevo              
            }
        
        else{
            temp2.setBackground(Color.GREEN);//se le da color verde si no hay mina
            contador++;//si no haymina el contador aumenta
            if((numeroCuadros-contadorMinas)==contador)
                javax.swing.JOptionPane.showMessageDialog(this, "¡¡¡GANASTE!!!");
        }        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dimesionTablero = new javax.swing.JLabel();
        jLabel_filas = new javax.swing.JLabel();
        jLabel_Columnas = new javax.swing.JLabel();
        filas = new javax.swing.JTextField();
        columnas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panel_juego = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        dimesionTablero.setText("Elija la dimensión del tablero");

        jLabel_filas.setText("Filas");

        jLabel_Columnas.setText("Columnas");

        filas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filasActionPerformed(evt);
            }
        });

        columnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnasActionPerformed(evt);
            }
        });

        jButton1.setText("Empezar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dimesionTablero)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_filas, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(filas))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Columnas)
                            .addComponent(columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(dimesionTablero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_filas)
                    .addComponent(jLabel_Columnas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(columnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout panel_juegoLayout = new javax.swing.GroupLayout(panel_juego);
        panel_juego.setLayout(panel_juegoLayout);
        panel_juegoLayout.setHorizontalGroup(
            panel_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_juegoLayout.setVerticalGroup(
            panel_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panel_juego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_juego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filasActionPerformed
        
    }//GEN-LAST:event_filasActionPerformed

    private void columnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnasActionPerformed
       
    }//GEN-LAST:event_columnasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        iniciar();//Constructor que ejecuta el metodo iniciar
        this.paintAll(this.getGraphics());//Pinta interfaz grafica y refleja botones
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();//cierra una ventana
        //System.exit(0); cierra toda la aplicacion
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) { //Arroja el sistema con la creación de la interfaz gráfica
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
       
    //METODO INICIO DEL JUEGO
    
    private void iniciar(){
        
      try {     //Evalua codigo 
        
        this.panel_juego.removeAll(); // Reinicia el jeugo al darle en empezar
        int nFilas = Integer.parseInt(this.filas.getText()); //Obtiene el valor del numero de fijas y lo guarda en nFilas
        int nCol = Integer.parseInt(this.columnas.getText()); //Obtiene el valor del numero de columnas y lo guarda en nCol
                
        this.panel_juego.setLayout(new java.awt.GridLayout(nFilas,nCol)); // Crear una matriz, totalmente configurada
        this.numeroCuadros = nFilas*nCol;
        this.contadorMinas=0;// Cada vez que se reinicie el juego este quedará el 0
                
        for(int f=0;f<nFilas;f++){       //Ciclo filas     
            for(int c=0;c<nCol;c++){    //Ciclo Columnas
                Cuadro temp = new Cuadro();
                temp.addActionListener(this);
                if(temp.estaMinado()) 
                    this.contadorMinas++;//Si el cuadro esta minado se añade al contador de minas
                temp.setVisible(true);
                this.panel_juego.add(temp);   
                //El cuadro de la mina se añade al panel de juego
                
              }
          }       
       }        
      catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(this, "Elije las dimensiones del tablero");
            // Muestra en pantalla el error geneado
        }       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField columnas;
    private javax.swing.JLabel dimesionTablero;
    private javax.swing.JTextField filas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel_Columnas;
    private javax.swing.JLabel jLabel_filas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_juego;
    // End of variables declaration//GEN-END:variables
}