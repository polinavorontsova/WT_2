package by.bsuir.wt.lab_2.entity;

import by.bsuir.wt.lab_2.entity.criteria.SearchCriteria;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * Represent the vacuum cleaner appliance
 */
@Getter
@ToString(callSuper = true)
public class VacuumCleaner extends Appliance {

    private final int powerConsumption;
    private final Material bodyMaterial;
    private final int weight;

    /**
     * Instantiates a new Vacuum cleaner.
     *
     * @param cost             the cost
     * @param powerConsumption the power consumption
     * @param bodyMaterial     the body material
     * @param weight           the weight
     */
    @Builder(setterPrefix = "with")
    public VacuumCleaner(int cost, int powerConsumption, Material bodyMaterial, int weight) {
        super(cost);
        this.powerConsumption = powerConsumption;
        this.bodyMaterial = bodyMaterial;
        this.weight = weight;
    }

    @Override
    public boolean isApplianceMatchedCriteria(String criteriaField, Object value) {

        SearchCriteria.VacuumCleanerCriteria vacuumCleanerCriteria = SearchCriteria.VacuumCleanerCriteria.valueOf(criteriaField);

        return switch (vacuumCleanerCriteria) {
            case POWER_CONSUMPTION -> (int) value == powerConsumption;
            case MATERIAL -> bodyMaterial.equals(Material.valueOf((String) value));
            case WEIGHT -> (int) value == weight;
            case COST -> (int) value == cost;
        };
    }
}