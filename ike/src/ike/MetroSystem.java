package ike;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetroSystem {
	public static void main(String[] args) {
        List<MetroStation> stations = new ArrayList<>();

        // 创建地铁站点并添加到集合中
        stations.add(new MetroStation(1, "径河"));
        stations.add(new MetroStation(2, "三店"));
        stations.add(new MetroStation(3, "码头潭公园"));
        stations.add(new MetroStation(4, "东吴大道"));
        stations.add(new MetroStation(5, "五环大道"));
        stations.add(new MetroStation(6, "额头湾"));
        stations.add(new MetroStation(7, "竹叶海"));
        stations.add(new MetroStation(8, "郑大科技园站"));
        stations.add(new MetroStation(9, "舵落口"));
        stations.add(new MetroStation(10, "古田一路"));
        stations.add(new MetroStation(11, "古田二路"));
        stations.add(new MetroStation(12, "古田三路"));
        stations.add(new MetroStation(13, "古田四路"));
        stations.add(new MetroStation(14, "汉西一路"));
        stations.add(new MetroStation(15, "宗关"));
        stations.add(new MetroStation(16, "太平洋"));
        stations.add(new MetroStation(17, "硚口路"));
        stations.add(new MetroStation(18, "崇仁路"));
        stations.add(new MetroStation(19, "利济北路"));
        stations.add(new MetroStation(20, "友谊路"));
        stations.add(new MetroStation(21, "循礼门"));
        stations.add(new MetroStation(22, "大智路"));
        stations.add(new MetroStation(23, "三阳路"));
        stations.add(new MetroStation(24, "黄浦路"));
        stations.add(new MetroStation(25, "头道街"));
        stations.add(new MetroStation(26, "二七路"));
        stations.add(new MetroStation(27, "徐州新村"));
        stations.add(new MetroStation(28, "丹水池"));
        stations.add(new MetroStation(29, "新荣"));
        stations.add(new MetroStation(30, "堤角"));
        stations.add(new MetroStation(31, "滕子岗"));
        stations.add(new MetroStation(32, "滠口新城"));
        stations.add(new MetroStation(33, "郑州大学站"));
        
        
        
        // ... 其他站点

        // 为站点添加线路
        for(int i=1;i<=32;i++) {
        stations.get(i).addLine("1号线");
        }
        for (MetroStation station : stations) {
            System.out.println(station.getStationName() );
        }
    }

}


