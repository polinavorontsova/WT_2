package by.bsuir.wt.lab_2.service.validation;

import by.bsuir.wt.lab_2.entity.criteria.ApplianceCriteria;

import java.util.Objects;

/**
 * The type Validator.
 */
public class Validator {

    /**
     * Check all given criteria for valid.
     *
     * @param applianceCriteria the appliance criteria
     * @return true - if all values of criteria is valid
     */
    public static boolean isCriteriaValid(ApplianceCriteria applianceCriteria) {
        if (Objects.isNull(applianceCriteria) || Objects.isNull(applianceCriteria.getCriteria())) {
            return false;
        }

        return applianceCriteria.getCriteria()
                .entrySet()
                .stream()
                .allMatch(entry -> CriteriaValidatorFactory.getInstance()
                        .getValidator(entry.getKey())
                        .isCriteriaValueValid(entry.getValue())
                );
    }
}