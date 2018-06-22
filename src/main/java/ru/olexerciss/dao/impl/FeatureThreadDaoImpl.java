package ru.olexerciss.dao.impl;

import ru.olexerciss.dao.FeatureThreadDao;
import ru.olexerciss.entity.FeatureThread;

public class FeatureThreadDaoImpl extends BasicDaoImpl<FeatureThread> implements FeatureThreadDao {
    public FeatureThreadDaoImpl(Class<FeatureThread> entityClass) {
        super(entityClass);
    }
}
