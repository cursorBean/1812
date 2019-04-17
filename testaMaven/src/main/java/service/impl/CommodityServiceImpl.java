package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CommodityDao;
import entity.Commodity;
import service.CommodityService;

@Service
public class CommodityServiceImpl implements CommodityService{
    @Autowired
	CommodityDao comDao;
	@Override
	public List<Commodity> searchAll() {

		return comDao.searchAllLazy();
	}
}
