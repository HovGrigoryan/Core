package interview.immutabel;

public final class Dog {
    private final String poch;
    private final String qit;
    private final Address address;


    public Dog(String poch, String qit, Address address) {
        this.poch = poch;
        this.qit = qit;
        this.address = address;
    }

    public String getPoch() {
        return poch;
    }

    public String getQit() {
        return qit;
    }

    public Address getAddress() throws CloneNotSupportedException {
        return (Address) address.clone();
    }


}
