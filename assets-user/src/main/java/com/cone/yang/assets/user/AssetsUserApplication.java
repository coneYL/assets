package com.cone.yang.assets.user;

import com.cone.yang.assets.user.model.AssetsType;
import com.cone.yang.assets.user.model.House;
import com.cone.yang.assets.user.model.Stock;
import com.cone.yang.assets.user.model.User;
import com.cone.yang.assets.user.repository.AssetsTypeRepository;
import com.cone.yang.assets.user.repository.HouseRepository;
import com.cone.yang.assets.user.repository.StockRepository;
import com.cone.yang.assets.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

/**
 * 用户启动类
 * @version 1.0.0.1
 * @author yanglei
 */
@SpringBootApplication
public class AssetsUserApplication implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AssetsTypeRepository assetsTypeRepository;
    @Autowired
    private HouseRepository houseRepository;
    @Autowired
    private StockRepository stockRepository;

    private static final String stockCode = "10000";
    private static final String houseCode = "20000";
    public static void main(String[] args) {
        SpringApplication.run(AssetsUserApplication.class, args);
    }

    public void setUp(){
        //buildUser();
        //buildAssetsType();

        buildHouse();

        buildStock();

    }

    private void buildStock() {
        Stock stock = new Stock();
        stock.setAssetsType(assetsTypeRepository.findByCode(stockCode));
        stock.setCode("201116");
        stock.setName("信号资产");
        stock.setUnitPrice(199.89);
        stock.setAmount(1600);
        stockRepository.save(stock);
    }

    private void buildHouse() {
        House house = new House();
        house.setAssetsType(assetsTypeRepository.findByCode(houseCode));
        house.setAreaName("大悦城");
        house.setBuildingName("5号楼1单元");
        house.setDoorName("2304");
        house.setUnitPrice(1000.89);
        house.setScale(95.87);
        houseRepository.save(house);
    }

    private void buildAssetsType() {
        AssetsType assetsType = new AssetsType();
        assetsType.setCode("20000");
        assetsType.setName("房产");
        assetsType.setInUse(false);
        assetsTypeRepository.save(assetsType);
        Iterable<AssetsType> inUse = assetsTypeRepository.findByInUseIsTrue();
        inUse.forEach(model -> System.out.println(model.getCode()+"-"+model.getName()));
    }

    private void buildUser() {
        User user = new User();
        user.setName("王五");
        user.setRegisterDate(LocalDateTime.now());

        userRepository.save(user);
    }


    @Override
    public void run(String... args) throws Exception {
       setUp();
    }
}
