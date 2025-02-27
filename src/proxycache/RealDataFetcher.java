package proxycache;

import java.util.concurrent.TimeUnit;

public class RealDataFetcher implements DataFetcher{
    @Override
    public String fetchData(String query) {
        System.out.println("Consultando datos para la consulta: " + query +" .....(Esto puede tardar unos segundos)" );
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "Informacion de la consulta: " + query;
    }
}
