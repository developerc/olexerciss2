package ru.olexerciss.service;

import ru.olexerciss.entity.FeatureThread;

import java.util.List;

public interface FeatureThreadService {
    /**
     * method for add featureThread
     *
     * @param featureThread = new feature optical Thread for creation in DB
     * @return created featureThread
     */
    FeatureThread addFeatureThread(FeatureThread featureThread);

    /**
     * method for receiving all FeatureThreads
     *
     * @return all featureThreads
     */
    List<FeatureThread> getAllFeatureThreads();

    /**
     * method for receive specify featureThread by id
     *
     * @param id = uniq featureThread id
     * @return specify featureThread by id
     */
    FeatureThread getFeatureThreadById(long id);

    /**
     * method for featureThread delete
     *
     * @param id = featureThread's id for delete
     * @return removed featureThread
     */
    FeatureThread deleteFeatureThread(long id);

    /**
     * method for update featureThread
     *
     * @param featureThread = update existing featureThread in DB
     * @return updated featureThread
     */
    FeatureThread updFeatureThread(FeatureThread featureThread);
}
