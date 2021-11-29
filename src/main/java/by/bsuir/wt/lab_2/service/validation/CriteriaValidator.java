package by.bsuir.wt.lab_2.service.validation;

/**
 * The functional interface of validator for criteria.
 */
@FunctionalInterface
public interface CriteriaValidator {
    /**
     * Check criteria value for valid. <p>
     * if value is {@link String} -> check is not null and empty <p>
     * if value is {@link Integer} -> check value > 0 <p>
     * if value is {@link by.bsuir.wt.lab_2.entity.Material} -> does the given material exist
     * @return true - if value is valid
     */
    boolean isCriteriaValueValid(Object value);
}
