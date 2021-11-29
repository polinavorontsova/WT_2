package by.bsuir.wt.lab_2.dao;

import by.bsuir.wt.lab_2.dao.impl.ApplianceDaoImpl;

/**
 * Factory class for {@link ApplianceDao}.
 */
public final class DaoFactory {
    private static final DaoFactory instance = new DaoFactory();
    private final ApplianceDao applianceDAO = new ApplianceDaoImpl();

    private DaoFactory() {
    }

    /**
     * Gets instance {@link ApplianceDao}.
     *
     * @return instance of appliance dao
     */
    public ApplianceDao getApplianceDAO() {
        return applianceDAO;
    }

    /**
     * Gets instance of {@link DaoFactory} <p>
     * Implementation of singleton for {@link DaoFactory}
     * @return the instance {@link DaoFactory}
     */
    public static DaoFactory getInstance() {
        return instance;
    }

}