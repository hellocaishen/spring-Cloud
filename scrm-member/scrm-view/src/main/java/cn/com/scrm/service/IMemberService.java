package cn.com.scrm.service;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.Page;

import cn.com.scrm.dto.MemberDTO;
import cn.com.scrm.service.impl.MemberServiceImpl;

@FeignClient(value="member-service",fallback=MemberServiceImpl.class)
public interface IMemberService {
     
	 //查询会员
	 @RequestMapping("/findbyphone")
	 public MemberDTO findByMemberDto(@RequestParam("mobile")String mobile);
	
	 //绑定会员
	 @RequestMapping("/updateObjByMobile")
	 public void updateObjByMobile(MemberDTO dto);
     
	 //创建会员
	 @RequestMapping("/create")
	 public void insertSelective(MemberDTO dto);

	 //查询会员
	 @RequestMapping("/findbycondit")
	 public List<MemberDTO> findMemberByCondit(MemberDTO dto);
     
	 //会员状态变更
	 @RequestMapping("/updatestatus")
	 public Integer updateStatusById(MemberDTO dto);
    
	 //会员手机号变更
	 @RequestMapping("/updateMobile")
	 public Integer updatePhone(Map<String, Object> param);
    
	 //获取会员列表
	 @RequestMapping("/queryAllData")
	 public List<MemberDTO> queryAllData();
     
	 //更改会员信息
	 @RequestMapping("/updateInfo")
	 public Integer updateMemberInfo(MemberDTO dto);
	 
	 @RequestMapping("/queryAllDatas")
	 public Page<MemberDTO> queryAllDatas(@RequestParam("pageNum")int pageNum, @RequestParam("pageSize")int pageSize);
}
