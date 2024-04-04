@Value.Style(
        deepImmutablesDetection = true,
        allParameters = true,
        visibility = Value.Style.ImplementationVisibility.PUBLIC,
        // Specify annotation types to be copied
        passAnnotations = {XmlRootElement.class, XmlElement.class, XmlAccessorType.class}
)
package ca.fun.jaxbplayground.inheritance.immutables;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.immutables.value.Value;
