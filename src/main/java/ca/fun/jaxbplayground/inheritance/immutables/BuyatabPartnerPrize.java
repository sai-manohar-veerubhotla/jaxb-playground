package ca.fun.jaxbplayground.inheritance.immutables;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.immutables.value.Value;

@Value.Immutable
@SuppressWarnings({"immutables:subtype", "immutables:from"})
@XmlRootElement(name = "BuyatabPartnerPrize")
@Value.Style(
        // Annotations to copy to the generated immutable class
        passAnnotations = {XmlRootElement.class, XmlElement.class, XmlAccessorType.class}
)
public interface BuyatabPartnerPrize extends PartnerPrize {
    @XmlElement(name = "BuyatabId")
    String buyatabId();
}
