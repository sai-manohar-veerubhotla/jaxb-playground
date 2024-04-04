package ca.fun.jaxbplayground.inheritance.immutables;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@SuppressWarnings({"immutables:subtype", "immutables:from"})
@Value.Modifiable
@XmlRootElement(name = "BuyatabPrizePartner")
@Value.Style(
        // Annotations to copy to the generated immutable class
        passAnnotations = {XmlRootElement.class, XmlElement.class, XmlAccessorType.class}
)
public interface BuyatabPrizePartner extends PrizePartner {

    @XmlElement(name = "BuyatabAccountConfig")
    String buyatabAccountConfig();

    @XmlElement(name = "BuyatabPartnerPrizes")
    List<BuyatabPartnerPrize> buyatabPartnerPrizes();

}
