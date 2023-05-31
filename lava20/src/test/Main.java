package test;
   import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
    class Main {
        public static void main(String[] args) {
            List<Map<String, Object>> dataList = new ArrayList<>();

            Map<String,Object> appleMap = new HashMap<>();
            appleMap.put("Items", "Apple");
            appleMap.put("Price", 20.00);
            appleMap.put("Quantity", 10);

            dataList.add(appleMap);

            Map<String,Object> orangeMap = new HashMap<>();
            orangeMap.put("Items", "Orange");
            orangeMap.put("Price", 21.99);
            orangeMap.put("Quantity", 10);

            dataList.add(orangeMap);
            double totalPurchase = 0.0;
            for (Map<String,Object> item : dataList) {
                double price = (double)item.get("Price");
                double quantity = (double)item.get("Quantity");
                double subtotal = price * quantity;
                totalPurchase += subtotal;
            }
            System.out.println("Your Purchase total : " + totalPurchase);
        }
    }

