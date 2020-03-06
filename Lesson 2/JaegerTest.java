import java.text.SimpleDateFormat;
import java.util.Date;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger bracerPhoenix = new Jaeger("The Shanghai Shield", new Date(), "Mark-5", "USA", "Active", 70.91f,2.128f);
        Jaeger chernoAlpha = new Jaeger("Cherno Alpha (Jaeger)", new Date(), "Mark-1", "Russia", "Active", 85.34f,2.412f);

        bracerPhoenix.move();
        chernoAlpha.move();
        if(bracerPhoenix.scanKaiju() == 0) {
            bracerPhoenix.repair();
        }

        bracerPhoenix.atiKaijuMissileLauncher();
        chernoAlpha.atiKaijuMissileLauncher();
        bracerPhoenix.protectionFromShot();
        chernoAlpha.protectionFromShot();

        if(bracerPhoenix.getStatus().equals("Destroyed")) {
            bracerPhoenix.repair();
        }

        if(chernoAlpha.getStatus().equals("Destroyed")) {
            chernoAlpha.repair();
        }
    }

}