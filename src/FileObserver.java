import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileObserver implements Observer {
    public void handleEvent (int temp, int presser){
        File f;
        try {
            f = File.createTempFile("TempPressure", ".txt");
            PrintWriter pw = new PrintWriter(f);
            pw.print("Погода змінилась. Температура = "+ temp +", тиск = "+ presser +".");
            pw.println();
            pw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
