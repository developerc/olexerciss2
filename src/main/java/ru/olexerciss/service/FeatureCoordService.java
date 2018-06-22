package ru.olexerciss.service;

import ru.olexerciss.entity.FeatureCoord;

import java.util.List;

public interface FeatureCoordService {
    /**
     * method for add featureCoord
     *
     * @param featureCoord = new feature with coordinates for creation in DB
     * @return created featureCoord
     */
    FeatureCoord addFeatureCoord(FeatureCoord featureCoord);

    /**
     * method for receiving all featureCoord
     *
     * @return all featureCoord
     */
    List<FeatureCoord> getAllFeatureCoords();

    /**
     * method for receive specify featureCoord by id
     *
     * @param id = uniq featureCoord id
     * @return specify featureCoord by id
     */
    FeatureCoord getFeatureCoordById(long id);

    /**
     * method for featureCoord delete
     *
     * @param id = featureCoord's id for delete
     * @return removed featureCoord
     */
    FeatureCoord deleteFeatureCoord(long id);

    /**
     * method for update featureCoord
     *
     * @param featureCoord = update existing featureCoord in DB
     * @return updated featureCoord
     */
    FeatureCoord updFeatureCoord(FeatureCoord featureCoord);
}
