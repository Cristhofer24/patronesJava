package singleton.registro;

import java.io.FileWriter;
import java.io.IOException;

public class TransacctionLogger {
    private static TransacctionLogger instance = null;

    private static final String LOG_FILE ="movimientos.csv";

    public TransacctionLogger() {
    }

    public static TransacctionLogger getInstance() {
        if (instance == null) {
            instance = new TransacctionLogger();
        }
        return instance;
    }

    public void log(String message) {
        try(FileWriter fileWriter = new FileWriter(LOG_FILE, true)){
            fileWriter.write(message + "\n");
            System.out.println("log Registrado : " + message);
        }catch (IOException e){
            System.out.println("Error al escribir el log: " + e.getMessage());
        }
    }

}
