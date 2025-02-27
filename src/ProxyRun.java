import proxycache.CacheProxy;
import proxycache.DataFetcher;

public class ProxyRun {
    public static void main(String[] args) {
        DataFetcher proxy = new CacheProxy();

        System.out.println(proxy.fetchData("Datos Empresariales"));
        System.out.println(proxy.fetchData("Datos Empresariales"));

    }
}
