package pl.ki.thy_test.model;

public class BillingForm {
    private BillingInitialDelayDTO billingInitialDelayDTO;

    public BillingForm() {
    }

    public BillingForm(BillingInitialDelayDTO billingInitialDelayDTO) {
        this.billingInitialDelayDTO = billingInitialDelayDTO;
    }

    public BillingInitialDelayDTO getBillingInitialDelayDTO() {
        return billingInitialDelayDTO;
    }

    public void setBillingInitialDelayDTO(BillingInitialDelayDTO billingInitialDelayDTO) {
        this.billingInitialDelayDTO = billingInitialDelayDTO;
    }
}
