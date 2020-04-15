
package guardaequipajes;
/********************************************************************
*	El siguiente programa es un ejemplo bastante sencillo de 		*
*	impresión con JAVA. 											*
********************************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
 
 
/********************************************************************
*	La siguiente clase llamada "Impresora", es la encargada de  	*
*	establecer la fuente con que se va a imprimir, de obtener el	*
*	trabajo de impresion, la página. En esta clase hay un método	*
*	llamado imprimir, el cual recibe una cadena y la imprime.		*
********************************************************************/
class Impresora
{
    Font fuente = new Font("Dialog", Font.PLAIN, 10);
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
			pagina.setFont(fuente);
			pagina.setColor(Color.black);
                            String Luber="Luber Fandiño";
                        pagina.drawString(Luber, 60, 60);
 
			pagina.dispose();
			pj.end();
		}catch(Exception e)
		{
			System.out.println("LA IMPRESION HA SIDO CANCELADA...");
		}
	}//FIN DEL PROCEDIMIENTO imprimir(String...)
 
 
}//FIN DE LA CLASE Impresora