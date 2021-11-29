package by.bsuir.wt.lab_2.factory;

import by.bsuir.wt.lab_2.entity.Appliance;
import by.bsuir.wt.lab_2.factory.impl.LaptopFactory;
import by.bsuir.wt.lab_2.factory.impl.RefrigeratorFactory;
import by.bsuir.wt.lab_2.factory.impl.TeapotFactory;
import by.bsuir.wt.lab_2.factory.impl.VacuumCleanerFactory;
import org.w3c.dom.NodeList;

/**
 * Represent abstract factory for all {@link Appliance}
 */
public abstract class AbstractApplianceFactory {

    /**
     * Create appliance
     *
     * @param nodeList the node list with all fields
     * @return {@link Appliance}
     */
    public abstract Appliance createAppliance(NodeList nodeList);

    /**
     * Gets appliance factory by appliance name.
     *
     * @param applianceName the appliance name
     * @return the factory
     */
    public static AbstractApplianceFactory getFactory(String applianceName) {
        return switch (applianceName) {
            case "refrigerator" -> new RefrigeratorFactory();
            case "laptop" -> new LaptopFactory();
            case "teapot" -> new TeapotFactory();
            case "vacuumCleaner" -> new VacuumCleanerFactory();
            default -> throw new IllegalArgumentException("No such appliance creator exists");
        };
    }
}
