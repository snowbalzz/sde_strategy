package discounts;

import com.hz.Customer;

public class Christmas implements Discount{
    @Override
    public double recieveDis(Customer customer, int index, int productCount) {

        double discount;

        if(index == 0) {
            discount = .2;
        } else {
            discount = .125;
        }

        return discount;
    }
}