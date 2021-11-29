package by.bsuir.wt.lab_2.factory.impl;

import by.bsuir.wt.lab_2.entity.Laptop;
import by.bsuir.wt.lab_2.entity.Refrigerator;
import by.bsuir.wt.lab_2.entity.criteria.SearchCriteria;
import by.bsuir.wt.lab_2.factory.AbstractApplianceFactory;
import by.bsuir.wt.lab_2.entity.Appliance;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Represent the Refrigerator factory.
 */
public class RefrigeratorFactory extends AbstractApplianceFactory {
    @Override
    public Appliance createAppliance(NodeList nodeList) {
        Refrigerator.RefrigeratorBuilder refrigeratorBuilder = Refrigerator.builder();
        for (int i = 0; i < nodeList.getLength(); i++) {

            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String xmlValue = nodeList.item(i).getTextContent();

                SearchCriteria.RefrigeratorCriteria refrigeratorCriteria = SearchCriteria
                        .RefrigeratorCriteria
                        .valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (refrigeratorCriteria) {
                    case OVERALL_CAPACITY -> refrigeratorBuilder.withOverallCapacity(Integer.parseInt(xmlValue));
                    case HEIGHT -> refrigeratorBuilder.withHeight(Integer.parseInt(xmlValue));
                    case WEIGHT -> refrigeratorBuilder.withWeight(Integer.parseInt(xmlValue));
                    case WIDTH -> refrigeratorBuilder.withWidth(Integer.parseInt(xmlValue));
                    case COST -> refrigeratorBuilder.withCost(Integer.parseInt(xmlValue));
                }
            }
        }
        return refrigeratorBuilder.build();
    }
}
