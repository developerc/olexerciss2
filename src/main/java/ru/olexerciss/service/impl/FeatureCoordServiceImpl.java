package ru.olexerciss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.olexerciss.dao.FeatureCoordDao;
import ru.olexerciss.entity.FeatureCoord;
import ru.olexerciss.service.FeatureCoordService;

import java.util.List;

@Service("featureCoordService")
public class FeatureCoordServiceImpl implements FeatureCoordService{
    @Autowired
    private FeatureCoordDao featureCoordDao;

    @Override
    public FeatureCoord addFeatureCoord(FeatureCoord featureCoord) {
        return featureCoordDao.create(featureCoord);
    }

    @Override
    public List<FeatureCoord> getAllFeatureCoords() {
        return featureCoordDao.getList();
    }

    @Override
    public FeatureCoord getFeatureCoordById(long id) {
        return featureCoordDao.getById(id);
    }

    @Override
    public FeatureCoord deleteFeatureCoord(long id) {
        return featureCoordDao.delete(featureCoordDao.getById(id));
    }

    @Override
    public FeatureCoord updFeatureCoord(FeatureCoord featureCoord) {
        return featureCoordDao.update(featureCoord);
    }

    @Override
    public List<FeatureCoord> getFeatureCoordByPropertyId(String propertyId) {
        return featureCoordDao.getFeatureCoordByPropertyId(propertyId);
    }

    @Override
    public List<FeatureCoord> delFeatureCoordByPropertyId(String propertyId) {
        return featureCoordDao.delFeatureCoordByPropertyId(propertyId);
    }

    /*@Override
    public FeatureCoord delFeatureCoordByPropertyId(String propertyId) {
        return featureCoordDao.delete(featureCoordDao.getFeatureCoordByPropertyId(propertyId));
    }*/
}
