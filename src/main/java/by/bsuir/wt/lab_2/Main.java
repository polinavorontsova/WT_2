package by.bsuir.wt.lab_2;

import by.bsuir.wt.lab_2.entity.Appliance;
import by.bsuir.wt.lab_2.entity.criteria.ApplianceCriteria;
import by.bsuir.wt.lab_2.service.ApplianceService;
import by.bsuir.wt.lab_2.service.ServiceFactory;
import by.bsuir.wt.lab_2.util.PrintApplianceInfo;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Appliance[] appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        /**
         * ALL TEAPOTS
         */
        ApplianceCriteria allTeapotsCriteria = new ApplianceCriteria("teapot");
        appliance = service.findByCriteria(allTeapotsCriteria);
        PrintApplianceInfo.printInfo(appliance);

        System.out.println("********************************************************");
        /**
         * FIND CHEAPEST APPLIANCE
         */

        ApplianceCriteria allAppliancesCriteria = new ApplianceCriteria();
        appliance = service.findByCriteria(allAppliancesCriteria);

        PrintApplianceInfo.printInfo(
                Arrays.stream(appliance)
                        .min(Comparator.comparing(Appliance::getCost))
                        .get()
        );
    }
}
