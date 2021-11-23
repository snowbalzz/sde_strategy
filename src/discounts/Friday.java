package discounts;

import com.hz.Customer;

public class Friday implements Discount{


    @Override
    public double recieveDis(Customer customer, int index, int productCount) { return (Math.min(productCount, 80)) * 0.01; }
}
