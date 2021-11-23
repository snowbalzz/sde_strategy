package discounts;

import com.hz.Customer;

public class Default implements Discount{
    @Override
    public double recieveDis(Customer customer, int index, int productCount) {
        return 0;
    }
}
