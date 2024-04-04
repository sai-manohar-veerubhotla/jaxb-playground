package ca.fun.jaxbplayground.inheritance.immutables;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class ImmutablesMain {

    public static void main(String[] args) {
        BuyatabPrizePartner buyatabPrizePartner = ImmutableBuyatabPrizePartner.builder()
                .name("Buyatab")
                .buyatabAccountConfig("BuyatabAccountConfig")
                .addBuyatabPartnerPrizes(ImmutableBuyatabPartnerPrize.builder()
                        .name("BuyatabPartnerPrize")
                        .buyatabId("BuyatabId")
                        .build())
                .build();

        JAXBContext jaxbContext = null;
        try {

            // this is gonna blow up
            jaxbContext = JAXBContext.newInstance(ImmutableBuyatabPrizePartner.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            // Pretty print
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(buyatabPrizePartner, System.out);

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
