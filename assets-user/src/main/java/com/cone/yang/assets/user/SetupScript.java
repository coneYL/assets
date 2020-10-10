package com.cone.yang.assets.user;

import com.cone.yang.assets.user.model.*;
import com.cone.yang.assets.user.repository.*;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * 数据初始化
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/10/9 17:12
 */
@Component
public class SetupScript {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AssetsTypeRepository assetsTypeRepository;
    @Autowired
    private HouseRepository houseRepository;
    @Autowired
    private StockRepository stockRepository;
    @Autowired
    private AssetsStockInfoRepository assetsStockInfoRepository;
    @Autowired
    private AssetsHouseInfoRepository assetsHouseInfoRepository;
    @Autowired
    private UserAssetsStockInfoAssociationRepository userAssetsStockInfoAssociationRepository;
    @Autowired
    private UserAssetsHouseInfoAssciationRepository userAssetsHouseInfoAssciationRepository;

    private static final String stockCode = "10000";
    private static final String houseCode = "20000";
    public void init(){
        buildAssetsType();
        User user = buildUser();
        Stock stock = buildStock();
        House house = buildHouse();
        AssetsStockInfo assetsStockInfo = buildAssetsStockInfo(stock, 102D);
        AssetsHouseInfo assetsHouseInfo = buildAssetsHouseInfo(house, 2000D);
        buildUserAssetsStock(user,assetsStockInfo);
        buildUserAssetsHouse(user,assetsHouseInfo);
    }

    private UserAssetsHouseInfoAssciation buildUserAssetsHouse(User user, AssetsHouseInfo assetsHouseInfo) {
        UserAssetsHouseInfoAssciation userAssetsHouseInfoAssciation = new UserAssetsHouseInfoAssciation();
        userAssetsHouseInfoAssciation.setUser(user);
        userAssetsHouseInfoAssciation.setAssetsHouseInfo(assetsHouseInfo);
        return userAssetsHouseInfoAssciationRepository.save(userAssetsHouseInfoAssciation);
    }

    private UserAssetsStockInfoAssociation buildUserAssetsStock(User user, AssetsStockInfo assetsStockInfo) {
        UserAssetsStockInfoAssociation userAssetsStockInfoAssociation = new UserAssetsStockInfoAssociation();
        userAssetsStockInfoAssociation.setUser(user);
        userAssetsStockInfoAssociation.setAssetsStockInfo(assetsStockInfo);
        return userAssetsStockInfoAssociationRepository.save(userAssetsStockInfoAssociation);
    }

    private AssetsHouseInfo buildAssetsHouseInfo(House house, double currentPrice) {
        AssetsHouseInfo assetsHouseInfo = new AssetsHouseInfo();
        assetsHouseInfo.setHouse(house);
        BigDecimal currentPriceBD = new BigDecimal(currentPrice);
        BigDecimal amountBD = new BigDecimal(house.getScale());
        BigDecimal costPriceBD = new BigDecimal(house.getUnitPrice());
        assetsHouseInfo.setAssetValue(currentPriceBD.multiply(amountBD).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        assetsHouseInfo.setAssetCost(costPriceBD.multiply(amountBD).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
        assetsHouseInfo.setCurrentPrice(currentPrice);
        assetsHouseInfo.setPriceDate(LocalDateTime.now());
        return assetsHouseInfoRepository.save(assetsHouseInfo);

    }

    private AssetsStockInfo buildAssetsStockInfo(Stock stock, double currentPrice){
        AssetsStockInfo assetsInfo = new AssetsStockInfo();
        assetsInfo.setStock(stock);
        assetsInfo.setCurrentPrice(currentPrice);
        BigDecimal currentPriceBD = new BigDecimal(currentPrice);
        BigDecimal amountBD = new BigDecimal(stock.getAmount());
        BigDecimal costPriceBD = new BigDecimal(stock.getUnitPrice());
        assetsInfo.setAssetValue(currentPriceBD.multiply(amountBD).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        assetsInfo.setAssetCost(costPriceBD.multiply(amountBD).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        assetsInfo.setPriceDate(LocalDateTime.now());
       return assetsStockInfoRepository.save(assetsInfo);
    }

    private Stock buildStock() {
        Stock stock = new Stock();
        stock.setAssetsType(assetsTypeRepository.findByCode(stockCode));
        stock.setCode("201116");
        stock.setName("信号资产");
        stock.setUnitPrice(199.89);
        stock.setAmount(1600);
        stock.setPurchaseDate(LocalDateTime.now());
        return stockRepository.save(stock);
    }

    private House buildHouse() {
        House house = new House();
        house.setCode("1000102001");
        house.setAssetsType(assetsTypeRepository.findByCode(houseCode));
        house.setAreaName("大悦城");
        house.setBuildingName("5号楼1单元");
        house.setDoorName("2304");
        house.setUnitPrice(1000.89);
        house.setScale(95.87);
        house.setPurchaseDate(LocalDateTime.now());
        return houseRepository.save(house);
    }

    private void buildAssetsType() {
        AssetsType stockType = buildAssetsTypeModel(stockCode,"股票",true);
        AssetsType houseType = buildAssetsTypeModel(houseCode,"房产",true);
        ArrayList<AssetsType> assetsTypeList = Lists.newArrayList(stockType, houseType);
        assetsTypeRepository.saveAll(assetsTypeList);
        Iterable<AssetsType> inUse = assetsTypeRepository.findByInUseIsTrue();
        inUse.forEach(model -> System.out.println(model.getCode()+"-"+model.getName()));
    }
    private AssetsType buildAssetsTypeModel(String code,String name,boolean inUse){
        AssetsType assetsType = new AssetsType();
        assetsType.setCode(code);
        assetsType.setName(name);
        assetsType.setInUse(inUse);
        return assetsType;
    }

    private User buildUser() {
        User user = new User();
        user.setName("王五");
        user.setRegisterDate(LocalDateTime.now());
        return userRepository.save(user);
    }

}
