package ca.fun.jaxbplayground.inheritance;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.util.List;

public class InheritanceMain {

    public static void main(String[] args) {
        try {

            PartnerPrize partnerPrize = new PartnerPrize();
            partnerPrize.setName("Partner Prize");

            PrizePartner prizePartner = new PrizePartner();
            prizePartner.setName("Prize Partner");
            prizePartner.setPartnerPrizes(List.of(partnerPrize));

            BuyatabPartnerPrize buyatabPartnerPrize = new BuyatabPartnerPrize();
            buyatabPartnerPrize.setName("Buyatab Partner Prize");
            buyatabPartnerPrize.setBuyatabId("12345");

            BuyatabPrizePartner buyatabPrizePartner = new BuyatabPrizePartner();
            buyatabPrizePartner.setName("Buyatab Prize Partner");
            buyatabPrizePartner.setBuyatabAccountConfig("Buyatab Account Config");
            buyatabPrizePartner.setPartnerPrizes(List.of(buyatabPartnerPrize));


            JAXBContext jaxbContext = JAXBContext.newInstance(PrizePartner.class,
                    BuyatabPrizePartner.class,
                    PartnerPrize.class,
                    BuyatabPartnerPrize.class);


            Marshaller marshaller = jaxbContext.createMarshaller();

            // Pretty print
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Marshal the prizePartner object to System.out
            marshaller.marshal(prizePartner, System.out);

            System.out.println();

            // Marshal the buyatabPrizePartner object to System.out
            marshaller.marshal(buyatabPrizePartner, System.out);

            System.out.println();

            // Marshal the partnerPrize object to System.out
            marshaller.marshal(partnerPrize, System.out);

            System.out.println();

            // Marshal the buyatabPartnerPrize object to System.out
            marshaller.marshal(buyatabPartnerPrize, System.out);

            System.out.println();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
