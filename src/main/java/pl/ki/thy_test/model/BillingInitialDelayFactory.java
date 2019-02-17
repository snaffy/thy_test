package pl.ki.thy_test.model;

import java.util.ArrayList;
import java.util.List;

public class BillingInitialDelayFactory {
    public static List<BillingInitialDelayDTO> getPossibleBillingInitialDelay() {
        return getPossibleValues();
    }

    private static List<BillingInitialDelayDTO> getPossibleValues() {
        List<BillingInitialDelayDTO> billingInitialDelayDTOS = new ArrayList<>();
        billingInitialDelayDTOS.add(new BillingInitialDelayDTO(1, BillingDelayUnit.MONTH));
        billingInitialDelayDTOS.add(new BillingInitialDelayDTO(2, BillingDelayUnit.MONTH));
        billingInitialDelayDTOS.add(new BillingInitialDelayDTO(3, BillingDelayUnit.MONTH));
        billingInitialDelayDTOS.add(new BillingInitialDelayDTO(6, BillingDelayUnit.MONTH));
        billingInitialDelayDTOS.add(new BillingInitialDelayDTO(12, BillingDelayUnit.MONTH));
        return billingInitialDelayDTOS;
    }
}
