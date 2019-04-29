package com.kcc.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.springframework.stereotype.Service;
import com.kcc.pojo.LineInfo;
import com.kcc.pojo.LocationInfo;

@Service
public class CodeService {

  private Map<LineInfo, List<LocationInfo>> map = null;

  public LocationInfo getTourCode(String destination) {
    if (map == null) {
      map = new LinkedHashMap<>();
      map.put(new LineInfo("_1", "美洲", "_", "不限"), getLocationInfos1());
      map.put(new LineInfo("_2", "大洋洲", "_", "不限"), getLocationInfos2());
      map.put(new LineInfo("_3", "歐洲", "_", "不限"), getLocationInfos3());
      map.put(new LineInfo("_4", "亞非", "_", "不限"), getLocationInfos4());
      map.put(new LineInfo("_5", "大陸港澳", "_", "不限"), getLocationInfos5());
      map.put(new LineInfo("_6", "東北亞", "_", "不限"), getLocationInfos6());
      map.put(new LineInfo("_7", "東南亞", "_", "不限"), getLocationInfos7());
    }

    for (Entry<LineInfo, List<LocationInfo>> entry : map.entrySet()) {
      for (LocationInfo locationInfo : entry.getValue()) {
        if (locationInfo.getLocationName().indexOf(destination) > -1) {
          return locationInfo;
        }
      }
    }

    return null;
  }

  private List<LocationInfo> getLocationInfos7() {
    List<LocationInfo> locationInfos = new ArrayList<>();

    locationInfos.add(new LocationInfo("_7", "東南亞", "_A_7", "泰國", "_", "不限"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_A_7", "泰國", "_71", "曼谷"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_A_7", "泰國", "_7E", "蘇梅島"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_A_7", "泰國", "_72", "普吉島"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_A_7", "泰國", "_73", "清邁"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_A_7", "泰國", "_7A", "華欣"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_A_7", "泰國", "_7B", "芭達雅"));

    locationInfos.add(new LocationInfo("_7", "東南亞", "_B_7", "馬新", "_", "不限"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_B_7", "馬新", "_74", "吉隆坡"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_B_7", "馬新", "_75", "檳城"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_B_7", "馬新", "_76", "沙巴"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_B_7", "馬新", "_77", "新加坡"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_B_7", "馬新", "_78", "民丹島"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_B_7", "馬新", "_M5", "馬新雙國"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_B_7", "馬新", "_M6", "汶萊"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_B_7", "馬新", "_M1", "珍拉汀灣"));

    locationInfos.add(new LocationInfo("_7", "東南亞", "_C_7", "印尼", "_", "不限"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_C_7", "印尼", "_79", "峇里島"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_C_7", "印尼", "_7F", "巴淡島"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_C_7", "印尼", "_7C", "雅加達、日惹"));

    locationInfos.add(new LocationInfo("_7", "東南亞", "_E_7", "菲高棉越南", "_", "不限"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_E_7", "菲高棉越南", "_81", "菲律賓"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_E_7", "菲高棉越南", "_82", "柬埔寨"));
    locationInfos.add(new LocationInfo("_7", "東南亞", "_E_7", "菲高棉越南", "_83", "越南"));

    return locationInfos;
  }

  private List<LocationInfo> getLocationInfos6() {
    List<LocationInfo> locationInfos = new ArrayList<>();

    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_", "不限"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_A1", "東京"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_A2", "大阪"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_A3", "北陸名古屋"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_K3", "二世谷"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_A5", "九州"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_J0", "福岡"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_A6", "東北"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_A7", "北海道"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_KC", "白馬"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_N4", "名古屋自由行"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_A9", "四國、中國地區"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_KF", "邱比特"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_P3", "藏王"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_M8", "宮崎"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_99", "日本全覽"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_AV", "廣島"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_A_6", "日本", "_A0", "信州長野、群馬"));

    locationInfos.add(new LocationInfo("_6", "東北亞", "_B_6", "沖繩", "_", "不限"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_B_6", "沖繩", "_A4", "沖繩"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_B_6", "沖繩", "_J1", "石垣島"));

    locationInfos.add(new LocationInfo("_6", "東北亞", "_C_6", "韓國", "_", "不限"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_C_6", "韓國", "_", "不限"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_C_6", "韓國", "_93", "首爾"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_C_6", "韓國", "_95", "濟州島"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_C_6", "韓國", "_94", "釜山慶州"));
    locationInfos.add(new LocationInfo("_6", "東北亞", "_C_6", "韓國", "_J6", "釜山"));

    return locationInfos;
  }

  private List<LocationInfo> getLocationInfos5() {
    List<LocationInfo> locationInfos = new ArrayList<>();

    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_", "不限"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_49", "澳門、深圳珠海"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_50", "北京、天津"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_51", "上海"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_52", "江南"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_CY", "江西、南昌"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_FE", "北京"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_53", "福建、武夷山"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_54", "山東"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_5A", "山西、寧夏"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_55", "廣西、桂林、南寧"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_64", "安徽、黃山"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_ZZ", "哈爾濱"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_59", "絲路、甘肅"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_65", "西安、河南"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_56", "四川、九寨溝"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_57", "雲南、昆大麗"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_61", "西藏、青海"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_M9", "廈門"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_58", "貴州、黃果樹"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_M7", "中國"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_63", "東北三省"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_62", "重慶、長江三峽"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_68", "湖南、湖北、張家界"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_69", "海南島"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_60", "內蒙、外蒙"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_CX", "南疆、北疆"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_B1", "昆明"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_A_5", "大陸", "_B2", "青島"));

    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_B_5", "港澳珠圳", "_", "不限"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_B_5", "港澳珠圳", "_48", "香港"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_B_5", "港澳珠圳", "_49", "澳門、深圳珠海"));
    locationInfos.add(new LocationInfo("_5", "大陸港澳", "_B_5", "港澳珠圳", "_FB", "澳門"));

    return locationInfos;
  }

  private List<LocationInfo> getLocationInfos4() {
    List<LocationInfo> locationInfos = new ArrayList<>();

    locationInfos.add(new LocationInfo("_4", "亞非", "_A_4", "非洲", "_", "不限"));
    locationInfos.add(new LocationInfo("_4", "亞非", "_A_4", "非洲", "_41", "埃及"));
    locationInfos.add(new LocationInfo("_4", "亞非", "_A_4", "非洲", "_4A", "衣索比亞"));
    locationInfos.add(new LocationInfo("_4", "亞非", "_A_4", "非洲", "_43", "南非"));
    locationInfos.add(new LocationInfo("_4", "亞非", "_A_4", "非洲", "_44", "摩洛哥"));
    locationInfos.add(new LocationInfo("_4", "亞非", "_A_4", "非洲", "_4E", "納米比亞"));
    locationInfos.add(new LocationInfo("_4", "亞非", "_A_4", "非洲", "_4F", "波札那"));
    locationInfos.add(new LocationInfo("_4", "亞非", "_A_4", "非洲", "_39", "肯亞、坦尚尼亞"));

    locationInfos.add(new LocationInfo("_4", "亞非", "_B_4", "南亞", "_", "不限"));
    locationInfos.add(new LocationInfo("_4", "亞非", "_B_4", "南亞", "_86", "印度"));
    locationInfos.add(new LocationInfo("_4", "亞非", "_B_4", "南亞", "_87", "尼泊爾"));
    locationInfos.add(new LocationInfo("_4", "亞非", "_B_4", "南亞", "_89", "喀什米爾"));
    locationInfos.add(new LocationInfo("_4", "亞非", "_B_4", "南亞", "_90", "不丹"));
    locationInfos.add(new LocationInfo("_4", "亞非", "_B_4", "南亞", "_88", "斯里蘭卡"));

    locationInfos.add(new LocationInfo("_4", "亞非", "_C_4", "中東", "_", "不限"));
    locationInfos.add(new LocationInfo("_4", "亞非", "_C_4", "中東", "_42", "土耳其"));
    locationInfos.add(new LocationInfo("_4", "亞非", "_C_4", "中東", "_40", "杜拜、阿布達比"));
    locationInfos.add(new LocationInfo("_4", "亞非", "_C_4", "中東", "_38", "伊朗"));

    locationInfos.add(new LocationInfo("_4", "亞非", "_D_4", "中亞", "_", "不限"));
    locationInfos.add(new LocationInfo("_4", "亞非", "_D_4", "中亞", "_3L", "烏茲別克"));
    return locationInfos;
  }

  private List<LocationInfo> getLocationInfos3() {
    List<LocationInfo> locationInfos = new ArrayList<>();

    locationInfos.add(new LocationInfo("_3", "歐洲", "_A_3", "中西歐", "_", "不限"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_A_3", "中西歐", "_21", "中西歐多國"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_A_3", "中西歐", "_25", "法國"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_A_3", "中西歐", "_26", "英國、愛爾蘭"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_A_3", "中西歐", "_28", "德國"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_A_3", "中西歐", "_35", "瑞士"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_A_3", "中西歐", "_34", "荷蘭"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_A_3", "中西歐", "_3A", "法瑞義"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_A_3", "中西歐", "_29", "奧地利"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_A_3", "中西歐", "_3B", "德國、奧地利"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_A_3", "中西歐", "_3D", "德捷奧"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_A_3", "中西歐", "_3E", "英荷比法"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_A_3", "中西歐", "_3F", "瑞士、法國"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_A_3", "中西歐", "_2K", "南法普羅旺斯"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_A_3", "中西歐", "_2X", "德國、瑞士"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_A_3", "中西歐", "_2Y", "荷德比法"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_A_3", "中西歐", "_2Z", "荷比法"));

    locationInfos.add(new LocationInfo("_3", "歐洲", "_B_3", "東歐", "_", "不限"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_B_3", "東歐", "_22", "東歐多國"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_B_3", "東歐", "_28", "德國"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_B_3", "東歐", "_30", "捷克"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_B_3", "東歐", "_31", "俄羅斯"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_B_3", "東歐", "_2B", "保加利亞"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_B_3", "東歐", "_2F", "克羅埃西亞"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_B_3", "東歐", "_3D", "德捷奧"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_B_3", "東歐", "_2R", "奧地利、捷克"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_B_3", "東歐", "_2S", "奧捷斯匈"));

    locationInfos.add(new LocationInfo("_3", "歐洲", "_C_3", "南歐", "_", "不限"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_C_3", "南歐", "_21", "中西歐多國"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_C_3", "南歐", "_27", "義大利"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_C_3", "南歐", "_2C", "葡萄牙"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_C_3", "南歐", "_32", "西班牙"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_C_3", "南歐", "_3K", "西葡、摩洛哥"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_C_3", "南歐", "_33", "希臘"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_C_3", "南歐", "_3G", "義大利、法國"));

    locationInfos.add(new LocationInfo("_3", "歐洲", "_D_3", "北歐", "_", "不限"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_D_3", "北歐", "_23", "北歐多國"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_D_3", "北歐", "_2M", "北歐四國"));
    locationInfos.add(new LocationInfo("_3", "歐洲", "_D_3", "北歐", "_2N", "北歐冰島"));

    return locationInfos;
  }

  private List<LocationInfo> getLocationInfos2() {
    List<LocationInfo> locationInfos = new ArrayList<>();

    locationInfos.add(new LocationInfo("_2", "大洋洲", "_A_2", "澳洲", "_", "不限"));
    locationInfos.add(new LocationInfo("_2", "大洋洲", "_A_2", "澳洲", "_11", "雪梨"));
    locationInfos.add(new LocationInfo("_2", "大洋洲", "_A_2", "澳洲", "_15", "黃金海岸"));
    locationInfos.add(new LocationInfo("_2", "大洋洲", "_A_2", "澳洲", "_17", "凱恩斯"));
    locationInfos.add(new LocationInfo("_2", "大洋洲", "_A_2", "澳洲", "_1C", "雪梨、墨爾本"));
    locationInfos.add(new LocationInfo("_2", "大洋洲", "_A_2", "澳洲", "_1D", "雪梨、黃金海岸"));
    locationInfos.add(new LocationInfo("_2", "大洋洲", "_A_2", "澳洲", "_1A", "東澳全覽"));
    locationInfos.add(new LocationInfo("_2", "大洋洲", "_A_2", "澳洲", "_16", "柏斯"));
    locationInfos.add(new LocationInfo("_2", "大洋洲", "_A_2", "澳洲", "_1G", "澳洲"));

    locationInfos.add(new LocationInfo("_2", "大洋洲", "_B_2", "紐西蘭", "_", "不限"));
    locationInfos.add(new LocationInfo("_2", "大洋洲", "_B_2", "紐西蘭", "_19", "紐西蘭北島"));
    locationInfos.add(new LocationInfo("_2", "大洋洲", "_B_2", "紐西蘭", "_20", "紐西蘭南島"));
    locationInfos.add(new LocationInfo("_2", "大洋洲", "_B_2", "紐西蘭", "_1B", "紐西蘭南北島全覽"));

    locationInfos.add(new LocationInfo("_2", "大洋洲", "_C_2", "紐澳", "_", "不限"));
    locationInfos.add(new LocationInfo("_2", "大洋洲", "_C_2", "紐澳", "_C7", "澳紐、大洋洲郵輪"));

    locationInfos.add(new LocationInfo("_2", "大洋洲", "_E_2", "大洋洲島國", "_", "不限"));
    locationInfos.add(new LocationInfo("_2", "大洋洲", "_E_2", "大洋洲島國", "_1E", "大溪地"));
    locationInfos.add(new LocationInfo("_2", "大洋洲", "_E_2", "大洋洲島國", "_1F", "斐濟"));
    return locationInfos;
  }

  private List<LocationInfo> getLocationInfos1() {
    List<LocationInfo> locationInfos = new ArrayList<>();
    locationInfos.add(new LocationInfo("_1", "美洲", "_A_1", "美國", "_", "不限"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_A_1", "美國", "_01", "洛杉磯"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_A_1", "美國", "_05", "夏威夷"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_A_1", "美國", "_02", "舊金山"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_A_1", "美國", "_08", "阿拉斯加"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_A_1", "美國", "_07", "西雅圖"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_A_1", "美國", "_S8", "北美洲"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_A_1", "美國", "_N1", "美國"));

    locationInfos.add(new LocationInfo("_1", "美洲", "_C_1", "美東", "_", "不限"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_C_1", "美東", "_10", "多倫多"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_C_1", "美東", "_04", "紐約"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_C_1", "美東", "_00", "芝加哥"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_C_1", "美東", "_N1", "美國"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_C_1", "美東", "_Z1", "休士頓"));

    locationInfos.add(new LocationInfo("_1", "美洲", "_F_1", "太平洋小島", "_", "不限"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_F_1", "太平洋小島", "_91", "帛琉"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_F_1", "太平洋小島", "_92", "關島"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_F_1", "太平洋小島", "_70", "馬爾地夫"));

    locationInfos.add(new LocationInfo("_1", "美洲", "_B_1", "加拿大", "_", "不限"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_B_1", "加拿大", "_09", "溫哥華"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_B_1", "加拿大", "_10", "多倫多"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_B_1", "加拿大", "_00", "芝加哥"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_B_1", "加拿大", "_07", "西雅圖"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_B_1", "加拿大", "_N2", "加拿大"));

    locationInfos.add(new LocationInfo("_1", "美洲", "_E_1", "中南美洲", "_", "不限"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_E_1", "中南美洲", "_S3", "阿根廷"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_E_1", "中南美洲", "_S9", "南美洲"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_E_1", "中南美洲", "_S4", "南極"));
    locationInfos.add(new LocationInfo("_1", "美洲", "_E_1", "中南美洲", "_S7", "中美洲"));

    return locationInfos;
  }
}
