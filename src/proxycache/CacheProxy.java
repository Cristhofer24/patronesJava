package proxycache;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements DataFetcher{

    private RealDataFetcher realDataFetcher;
    private Map<String, String> cache;

  public CacheProxy(){
      this.realDataFetcher = new RealDataFetcher();
      this.cache = new HashMap<>();
  }

    @Override
    public String fetchData(String query) {
      if(cache.containsKey(query)){
          System.out.println("Usando Cache para "+query);
          return cache.get(query);
      }
      String data = realDataFetcher.fetchData(query);
      cache.put(query, data);
        return data;
    }
}
