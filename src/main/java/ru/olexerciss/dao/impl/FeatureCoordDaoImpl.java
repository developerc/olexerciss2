package ru.olexerciss.dao.impl;

import ru.olexerciss.dao.FeatureCoordDao;
import ru.olexerciss.entity.FeatureCoord;

public class FeatureCoordDaoImpl extends BasicDaoImpl<FeatureCoord> implements FeatureCoordDao {
    public FeatureCoordDaoImpl(Class<FeatureCoord> entityClass) {
        super(entityClass);
    }
}
