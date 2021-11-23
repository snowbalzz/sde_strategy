package discounts;

import com.hz.Customer;

public class NoAction implements Discount{
    @Override
    public double recieveDis(Customer customer, int index, int productCount) {

        if(customer.isRegular()){
            return  .15;
        }

        return 0;
    }
}
