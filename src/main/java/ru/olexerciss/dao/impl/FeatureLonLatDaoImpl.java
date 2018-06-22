package ru.olexerciss.dao.impl;

import ru.olexerciss.dao.FeatureLonLatDao;
import ru.olexerciss.entity.FeatureLonLat;

public class FeatureLonLatDaoImpl extends BasicDaoImpl<FeatureLonLat> implements FeatureLonLatDao {
    public FeatureLonLatDaoImpl(Class<FeatureLonLat> entityClass) {
        super(entityClass);
    }
}
