import java.util.HashMap;
import java.util.Map;

public class BusinessInteractionFactory {
    private static Map<String, BusinessInteraction> biMap = new HashMap<String, BusinessInteraction>();
    public BusinessInteractionFactory() {
        biMap.put("CustomerInsert", new CustomerInsertStrategy());
        biMap.put("ProductBalance", new ProductBalanceStrategy());
    }
    public BusinessInteraction getBusinessInteractionStrategy(String app) {
        if (!biMap.containsKey(app)) {
            throw new RuntimeException("Invalid app");
        }
        return biMap.get(app);
    }
}
