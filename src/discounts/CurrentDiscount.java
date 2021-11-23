package discounts;

import com.hz.SalesAction;

public class CurrentDiscount {

    public static Discount getDiscountByAction(SalesAction action) {

        if (action == SalesAction.Default) return new Default();

        if (action == SalesAction.NoAction) return new NoAction();

        if (action == SalesAction.Friday) return new Friday();

        if (action == SalesAction.Christmas) return new Christmas();

        return null;
    }

}
