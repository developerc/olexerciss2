package ru.olexerciss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.olexerciss.dao.FeatureLonLatDao;
import ru.olexerciss.entity.FeatureLonLat;
import ru.olexerciss.service.FeatureLonLatService;

import java.util.List;

@Service("featureLonLatService")
public class FeatureLonLatServiceImpl implements FeatureLonLatService{
    @Autowired
    private FeatureLonLatDao featureLonLatDao;

    @Override
    public FeatureLonLat addFeatureLonLat(FeatureLonLat featureLonLat) {
        return featureLonLatDao.create(featureLonLat);
    }

    @Override
    public List<FeatureLonLat> getAllFeatureLonLats() {
        return featureLonLatDao.getList();
    }

    @Override
    public FeatureLonLat getFeatureLonLatById(long id) {
        return featureLonLatDao.getById(id);
    }

    @Override
    public FeatureLonLat deleteFeatureLonLat(long id) {
        return featureLonLatDao.delete(featureLonLatDao.getById(id));
    }

    @Override
    public FeatureLonLat updFeatureLonLat(FeatureLonLat featureLonLat) {
        return featureLonLatDao.update(featureLonLat);
    }
}
