package ca.fun.jaxbplayground.inheritance.immutables;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.immutables.value.Value;

@Value.Immutable
@XmlRootElement(name = "PartnerPrize")
public interface PartnerPrize {

    @XmlElement(name = "Name")
    String name();

}
