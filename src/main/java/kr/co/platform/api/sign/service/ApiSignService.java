package kr.co.platform.api.sign.service;

import java.util.Map;

public interface ApiSignService {

	Map<String, Object> insertUserInfo(Map<String, Object> dataMap);

	Map<String, Object> loginUserProcessService(Map<String, Object> dataMap);

}
