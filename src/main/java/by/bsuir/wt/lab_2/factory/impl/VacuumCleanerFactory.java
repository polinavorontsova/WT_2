package by.bsuir.wt.lab_2.factory.impl;

import by.bsuir.wt.lab_2.entity.Material;
import by.bsuir.wt.lab_2.entity.VacuumCleaner;
import by.bsuir.wt.lab_2.entity.criteria.SearchCriteria;
import by.bsuir.wt.lab_2.factory.AbstractApplianceFactory;
import by.bsuir.wt.lab_2.entity.Appliance;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Represent the Vacuum cleaner factory.
 */
public class VacuumCleanerFactory extends AbstractApplianceFactory {
    @Override
    public Appliance createAppliance(NodeList nodeList) {
        VacuumCleaner.VacuumCleanerBuilder vacuumCleanerBuilder = VacuumCleaner.builder();
        for (int i = 0; i < nodeList.getLength(); i++) {

            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String xmlValue = nodeList.item(i).getTextContent();

                SearchCriteria.VacuumCleanerCriteria vacuumCleanerCriteria = SearchCriteria
                        .VacuumCleanerCriteria
                        .valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (vacuumCleanerCriteria) {
                    case MATERIAL -> vacuumCleanerBuilder.withBodyMaterial(Material.valueOf(xmlValue));
                    case POWER_CONSUMPTION -> vacuumCleanerBuilder.withPowerConsumption(Integer.parseInt(xmlValue));
                    case WEIGHT -> vacuumCleanerBuilder.withWeight(Integer.parseInt(xmlValue));
                    case COST -> vacuumCleanerBuilder.withCost(Integer.parseInt(xmlValue));
                }
            }
        }
        return vacuumCleanerBuilder.build();
    }
}
