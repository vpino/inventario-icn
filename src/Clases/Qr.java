package Clases;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Qr {

    private static final String FORMATO_IMAGEN = "gif";
    private static final String RUTA_IMAGEN = System.getProperty("user.dir") + "/src/Imagenes/qr.gif";
    private static final int ancho = 500;
    private static final int alto = 500;
    private static final int longitud = 6;

    public String generarQR(String data) {

        try {
            /*objeto que contendrá la matriz de datos a dibujar a
             sí como el Writer que nos ayudará a darle formato a los datos:*/

            BitMatrix bm;
            Writer writer = new QRCodeWriter();

            /*Posteriormente generaremos la matríz codificando los datos que
             establecimos previamente dándoles el formato que necesitamos,
             en este caso, el formato del código QR...*/
            bm = writer.encode(data, BarcodeFormat.QR_CODE, ancho, alto);

            /*Una vez hecho lo anterior necesitaremos un buffer a través del cual 
             escribir la imagen al disco duro... */
            BufferedImage image = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);

            /*Lo siguiente que realizaremos será escribir la matriz de datos 
             con dos ciclos anidados, iterando a través de lo ancho y alto de la imagen...*/
            for (int y = 0; y < ancho; y++) {
                for (int x = 0; x < alto; x++) {
                    int grayValue = (bm.get(x, y) ? 0 : 1) & 0xff;
                    image.setRGB(x, y, (grayValue == 0 ? 0 : 0xFFFFFF));
                }
            }

            /*Posteriormente escribimos la imagen en el disco duro*/
            FileOutputStream qrCode = new FileOutputStream(RUTA_IMAGEN);
            ImageIO.write(image, FORMATO_IMAGEN, qrCode);

            /* Y cerramos el flujo de datos que utilizamos: */
            qrCode.close();

            return RUTA_IMAGEN;

        } catch (Exception ex) {
            Logger.getLogger(Qr.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public StringBuffer codigoRamdon() {

        StringBuffer cadenaAleatoria = new StringBuffer();
        long milis = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random(milis);
        int i = 0;

        while (i < longitud) {
            char c = (char) r.nextInt(255);
            if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z')) {
                cadenaAleatoria.append(c);
                i++;
            }
        }

        return cadenaAleatoria;
    }

}
