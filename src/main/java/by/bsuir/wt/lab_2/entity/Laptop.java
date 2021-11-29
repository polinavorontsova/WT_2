package by.bsuir.wt.lab_2.entity;

import by.bsuir.wt.lab_2.entity.criteria.SearchCriteria;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * Represent the laptop appliance
 */
@Getter
@ToString(callSuper = true)
public class Laptop extends Appliance {

    private final int batteryCapacity;
    private final String operatingSystem;
    private final int ram;
    private final int systemMemory;

    /**
     * Instantiates a new Laptop.
     *
     * @param cost            the cost
     * @param batteryCapacity the battery capacity
     * @param operatingSystem the operating system
     * @param ram             the ram
     * @param systemMemory    the system memory
     */
    @Builder(setterPrefix = "with")
    public Laptop(int cost, int batteryCapacity, String operatingSystem, int ram, int systemMemory) {
        super(cost);
        this.batteryCapacity = batteryCapacity;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.systemMemory = systemMemory;
    }

    @Override
    public boolean isApplianceMatchedCriteria(String criteriaField, Object value) {
        SearchCriteria.LaptopCriteria laptopCriteria = SearchCriteria.LaptopCriteria.valueOf(criteriaField);

        return switch (laptopCriteria) {
            case RAM -> ram == (int) value;
            case BATTERY_CAPACITY -> batteryCapacity == (int) value;
            case OPERATING_SYSTEM -> operatingSystem.equals(value);
            case SYSTEM_MEMORY -> systemMemory == (int) value;
            case COST -> (int) value == cost;
        };
    }
}
