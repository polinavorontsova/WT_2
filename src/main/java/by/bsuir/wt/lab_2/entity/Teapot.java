package by.bsuir.wt.lab_2.entity;

import by.bsuir.wt.lab_2.entity.criteria.SearchCriteria;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * Represent the teapot appliance
 */
@Getter
@ToString(callSuper = true)
public class Teapot extends Appliance {

    private final int powerConsumption;
    private final int volume;
    private final Material material;

    /**
     * Instantiates a new Teapot.
     *
     * @param cost             the cost
     * @param powerConsumption the power consumption
     * @param volume           the volume
     * @param material         the material
     */
    @Builder(setterPrefix = "with")
    public Teapot(int cost, int powerConsumption, int volume, Material material) {
        super(cost);
        this.powerConsumption = powerConsumption;
        this.volume = volume;
        this.material = material;
    }

    @Override
    public boolean isApplianceMatchedCriteria(String criteriaField, Object value) {
        SearchCriteria.TeapotCriteria teapotCriteria = SearchCriteria.TeapotCriteria.valueOf(criteriaField);

        return switch (teapotCriteria) {
            case POWER_CONSUMPTION -> (int) value == powerConsumption;
            case VOLUME -> (int) value == volume;
            case MATERIAL -> material.equals(Material.valueOf((String) value));
            case COST -> (int) value == cost;
        };
    }
}