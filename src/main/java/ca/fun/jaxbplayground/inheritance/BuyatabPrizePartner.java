package ca.fun.jaxbplayground.inheritance;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "BuyatabPrizePartner")
public class BuyatabPrizePartner extends PrizePartner {

    private String buyatabAccountConfig;

    private List<BuyatabPartnerPrize> partnerPrizes;


    @XmlElement(name = "BuyatabAccountConfig")
    public void setBuyatabAccountConfig(String buyatabAccountConfig) {
        this.buyatabAccountConfig = buyatabAccountConfig;
    }

    public String getBuyatabAccountConfig() {
        return buyatabAccountConfig;
    }

    @XmlElement(name = "BuyatabPartnerPrizes")
    @Override
    public List<? extends PartnerPrize> getPartnerPrizes() {
        return partnerPrizes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void setPartnerPrizes(List<? extends PartnerPrize> partnerPrizes) {
        this.partnerPrizes = (List<BuyatabPartnerPrize>) partnerPrizes;
    }
}
