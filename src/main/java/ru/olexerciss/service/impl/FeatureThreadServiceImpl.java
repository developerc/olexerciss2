package ru.olexerciss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.olexerciss.dao.FeatureThreadDao;
import ru.olexerciss.entity.FeatureThread;
import ru.olexerciss.service.FeatureThreadService;

import java.util.List;

@Service("featureThreadService")
public class FeatureThreadServiceImpl implements FeatureThreadService {
    @Autowired
    private FeatureThreadDao featureThreadDao;

    @Override
    public FeatureThread addFeatureThread(FeatureThread featureThread) {
        return featureThreadDao.create(featureThread);
    }

    @Override
    public List<FeatureThread> getAllFeatureThreads() {
        return featureThreadDao.getList();
    }

    @Override
    public FeatureThread getFeatureThreadById(long id) {
        return featureThreadDao.getById(id);
    }

    @Override
    public FeatureThread deleteFeatureThread(long id) {
        return featureThreadDao.delete(featureThreadDao.getById(id));
    }

    @Override
    public FeatureThread updFeatureThread(FeatureThread featureThread) {
        return featureThreadDao.update(featureThread);
    }
}
