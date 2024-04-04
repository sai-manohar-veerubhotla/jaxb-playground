package ca.fun.jaxbplayground.inheritance;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BuyatabPartnerPrize")
public class BuyatabPartnerPrize extends PartnerPrize {


    private String buyatabId;

    @XmlElement(name = "BuyatabId")
    public String getBuyatabId() {
        return buyatabId;
    }

    public void setBuyatabId(String buyatabId) {
        this.buyatabId = buyatabId;
    }


}
