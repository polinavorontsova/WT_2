package by.bsuir.wt.lab_2.util;

import by.bsuir.wt.lab_2.entity.Appliance;
import lombok.extern.log4j.Log4j2;

/**
 * Represent util class for print appliances info
 */
@Log4j2
public final class PrintApplianceInfo {
    private PrintApplianceInfo() {
    }

    /**
     * Print info.
     *
     * @param appliances the appliances
     */
    public static void printInfo(Appliance ... appliances) {
        if (appliances == null) {
            log.error("Appliances may not be null");
        } else if (appliances.length == 0) {
            log.info("No appliances found");
        } else {
            for (Appliance appliance : appliances) {
                System.out.println(appliance);
            }
        }
    }
}
