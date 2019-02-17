package pl.ki.thy_test.model;

public class BillingInitialDelayDTO {
    private int delay;
    private BillingDelayUnit unit;

    public BillingInitialDelayDTO(String value) {
        String[] splited = value.split(" ");
        delay = Integer.valueOf(splited[0]);
        String sUnit = splited[1].replace("s", "");
        unit = BillingDelayUnit.valueOf(sUnit.toUpperCase());
    }

    public BillingInitialDelayDTO(int delay, BillingDelayUnit unit) {
        this.delay = delay;
        this.unit = unit;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public BillingDelayUnit getUnit() {
        return unit;
    }

    public void setUnit(BillingDelayUnit unit) {
        this.unit = unit;
    }

    public BillingInitialDelayDTO getDetails(){
        return this;
    }

    @Override
    public String toString() {
        return delay + " " + unit.name().toLowerCase() + "s";
    }
}
