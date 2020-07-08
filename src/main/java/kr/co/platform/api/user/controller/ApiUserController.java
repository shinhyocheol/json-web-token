package kr.co.platform.api.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.co.platform.util.JSON.JSONUtil;
import kr.co.platform.util.base.BaseController;

@RestController
@RequestMapping("/user")
public class ApiUserController extends BaseController{
	
	@RequestMapping(value = {"/join"}, method = {RequestMethod.POST}, 
			params = {"id", "password"})
	public ResponseEntity<String> appUserJoin (
			ModelMap model,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			Map<String, Object> dataMap = validateParams(request);
			if(dataMap == null || dataMap.isEmpty()) {
				resultMap.put("result", false);
				return JSONUtil.returnJSON(response, resultMap, HttpStatus.BAD_REQUEST);
			}
//			resultMap = apiUserSerivce.insertUserInfo(dataMap);
			
		} catch (Exception e) {
			resultMap.put("result", false);
			return JSONUtil.returnJSON(response, resultMap, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return JSONUtil.returnJSON(response, resultMap);
	}
	
}