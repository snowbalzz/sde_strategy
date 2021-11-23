package discounts;

import com.hz.Customer;
import products.Product;

public interface Discount {
    double recieveDis(Customer customer, int index, int productCount);
}
