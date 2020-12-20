package abc.day1220.model;

import java.util.Collection;
import java.util.HashMap;

public class ShoppingCart {
    HashMap<Integer, GoodsItem> items = null;

    public ShoppingCart() {
        items = new HashMap<Integer, GoodsItem>();
    }

    //添加商品
    public void add(GoodsItem goodsItem) {
        int productid = goodsItem.getProduct().getId();
        if (items.containsKey(productid)) {
            GoodsItem item = items.get(productid);
            item.setQuantity(item.getQuantity() + goodsItem.getQuantity());
        } else {
            items.put(productid, goodsItem);
        }
    }

    //删除一件产品
    public void delete(Integer productid) {
        if (items.containsKey(productid)) {
            GoodsItem item = items.get(productid);
            item.setQuantity(item.getQuantity() - 1);
            if (item.getQuantity() <= 0) {
                items.remove(productid);
            }
        }
    }

    //计算商品总价
    public double getTotal() {
        double amount = 0;
        for (Integer key : items.keySet()) {
            amount += items.get(key).getQuantity() * items.get(key).getProduct().getPrice();
        }
        return roundOff(amount);
    }

    //保留两位小数
    private double roundOff(double amount) {
        long value = Math.round(amount * 100);
        return value / 100;
    }

    //清空购物车
    public void clear() {
        items.clear();
    }

    public Collection<GoodsItem> getItems() {
        return items.values();
    }
}
