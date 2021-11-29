package by.bsuir.wt.lab_2.service;

import by.bsuir.wt.lab_2.service.impl.ApplianceServiceImpl;

/**
 * Represent factory for all {@link ApplianceService}
 */
public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private static final ApplianceService applianceService = new ApplianceServiceImpl();


    private ServiceFactory() {
    }

    /**
     * Gets {@link ServiceFactory} instance <p>
     * Implementation singleton
     * @return instance of {@link ServiceFactory}
     */
    public static ServiceFactory getInstance() {
        return instance;
    }

    /**
     * Get instance of {@link ApplianceServiceImpl}
     *
     * @return {@link ApplianceServiceImpl}
     */
    public ApplianceService getApplianceService(){
        return applianceService;
    }


}
