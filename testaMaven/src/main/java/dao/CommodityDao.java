package dao;

import java.util.List;

import entity.Commodity;

public interface CommodityDao {
	public List<Commodity> searchAll();
	public List<Commodity> searchAllLazy();
}
