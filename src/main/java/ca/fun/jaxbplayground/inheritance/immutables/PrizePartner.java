package ca.fun.jaxbplayground.inheritance.immutables;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@XmlRootElement(name = "PrizePartner")
public interface PrizePartner {

    @XmlElement(name = "Name")
    String name();

    @XmlElement(name = "PartnerPrizes")
    List<PartnerPrize> partnerPrizes();

}
