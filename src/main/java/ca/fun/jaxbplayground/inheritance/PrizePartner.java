package ca.fun.jaxbplayground.inheritance;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "PrizePartner")
public class PrizePartner {

    private String name;

    private List<? extends PartnerPrize> partnerPrizes;

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "PartnerPrizes")
    public List<? extends PartnerPrize> getPartnerPrizes() {
        return partnerPrizes;
    }

    public void setPartnerPrizes(List<? extends PartnerPrize> partnerPrizes) {
        this.partnerPrizes = partnerPrizes;
    }


}
