package by.bsuir.wt.lab_2.factory.impl;

import by.bsuir.wt.lab_2.entity.Material;
import by.bsuir.wt.lab_2.entity.Teapot;
import by.bsuir.wt.lab_2.entity.criteria.SearchCriteria;
import by.bsuir.wt.lab_2.factory.AbstractApplianceFactory;
import by.bsuir.wt.lab_2.entity.Appliance;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Represent the Teapot factory.
 */
public class TeapotFactory extends AbstractApplianceFactory {
    @Override
    public Appliance createAppliance(NodeList nodeList) {
        Teapot.TeapotBuilder teapotBuilder = Teapot.builder();
        for (int i = 0; i < nodeList.getLength(); i++) {

            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String xmlValue = nodeList.item(i).getTextContent();

                SearchCriteria.TeapotCriteria teapotCriteria = SearchCriteria
                        .TeapotCriteria
                        .valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (teapotCriteria) {
                    case MATERIAL -> teapotBuilder.withMaterial(Material.valueOf(xmlValue));
                    case POWER_CONSUMPTION -> teapotBuilder.withPowerConsumption(Integer.parseInt(xmlValue));
                    case VOLUME -> teapotBuilder.withVolume(Integer.parseInt(xmlValue));
                    case COST -> teapotBuilder.withCost(Integer.parseInt(xmlValue));
                }
            }
        }
        return teapotBuilder.build();
    }
}
