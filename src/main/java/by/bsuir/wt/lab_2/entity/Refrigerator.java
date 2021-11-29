package by.bsuir.wt.lab_2.entity;

import by.bsuir.wt.lab_2.entity.criteria.SearchCriteria;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * Represent the refrigerator appliance.
 */
@Getter
@ToString(callSuper = true)
public class Refrigerator extends Appliance {

    private final int overallCapacity;
    private final int weight;
    private final int height;
    private final int width;

    /**
     * Instantiates a new Refrigerator.
     *
     * @param cost            the cost
     * @param overallCapacity the overall capacity
     * @param weight          the weight
     * @param height          the height
     * @param width           the width
     */
    @Builder(setterPrefix = "with")
    public Refrigerator(int cost, int overallCapacity, int weight, int height, int width) {
        super(cost);
        this.overallCapacity = overallCapacity;
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean isApplianceMatchedCriteria(String criteriaField, Object value) {
        SearchCriteria.RefrigeratorCriteria refrigeratorCriteria = SearchCriteria.RefrigeratorCriteria.valueOf(criteriaField);

        return switch (refrigeratorCriteria) {
            case WEIGHT -> (int) value == weight;
            case HEIGHT -> (int) value == height;
            case WIDTH -> (int) value == width;
            case OVERALL_CAPACITY -> (int) value == overallCapacity;
            case COST -> (int) value == cost;
        };
    }
}
