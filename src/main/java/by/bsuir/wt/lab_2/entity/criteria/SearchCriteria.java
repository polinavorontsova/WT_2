package by.bsuir.wt.lab_2.entity.criteria;

/**
 * All criteria fields for all {@link by.bsuir.wt.lab_2.entity.Appliance}
 */
public final class SearchCriteria {

    private SearchCriteria() {
    }

    /**
     * The Laptop criteria.
     */
    public enum LaptopCriteria {
        /**
         * Cost laptop criteria.
         */
        COST,
        /**
         * Battery capacity laptop criteria.
         */
        BATTERY_CAPACITY,
        /**
         * Operating system laptop criteria.
         */
        OPERATING_SYSTEM,
        /**
         * Ram laptop criteria.
         */
        RAM,
        /**
         * System memory laptop criteria.
         */
        SYSTEM_MEMORY;
    }

    /**
     * The Refrigerator criteria.
     */
    public enum RefrigeratorCriteria {
        /**
         * Cost refrigerator criteria.
         */
        COST,
        /**
         * Overall capacity refrigerator criteria.
         */
        OVERALL_CAPACITY,
        /**
         * Weight refrigerator criteria.
         */
        WEIGHT,
        /**
         * Height refrigerator criteria.
         */
        HEIGHT,
        /**
         * Width refrigerator criteria.
         */
        WIDTH
    }

    /**
     * The Teapot criteria.
     */
    public enum TeapotCriteria {
        /**
         * Cost teapot criteria.
         */
        COST,
        /**
         * Power consumption teapot criteria.
         */
        POWER_CONSUMPTION,
        /**
         * Volume teapot criteria.
         */
        VOLUME,
        /**
         * Material teapot criteria.
         */
        MATERIAL
    }

    /**
     * The Vacuum cleaner criteria.
     */
    public enum VacuumCleanerCriteria {
        /**
         * Cost vacuum cleaner criteria.
         */
        COST,
        /**
         * Power consumption vacuum cleaner criteria.
         */
        POWER_CONSUMPTION,
        /**
         * Material vacuum cleaner criteria.
         */
        MATERIAL,
        /**
         * Weight vacuum cleaner criteria.
         */
        WEIGHT
    }

}
