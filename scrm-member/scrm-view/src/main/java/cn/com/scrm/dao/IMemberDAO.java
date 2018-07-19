package cn.com.scrm.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.github.pagehelper.Page;

import cn.com.scrm.dto.MemberDTO;

@Mapper
public interface IMemberDAO {
    //通过会员查询会员信息
	MemberDTO findByMemberDto(MemberDTO dto);
    //绑定会员信息
	void updateObjByMobile(MemberDTO dto);
	//创建会员
	void insertSelective(MemberDTO dto);
	//查询会员
	List<MemberDTO> findMemberByCondit(MemberDTO dto);
	//会员状态变更
	Integer updateStatusById(MemberDTO dto);
	//会员手机号变更
	Integer updatePhone(Map<String, Object> param);
	//获取会员列表
	//List<MemberDTO> queryAllData();
	Page<MemberDTO> queryAllData();
	//更改会员信息
	Integer updateMemberInfo(MemberDTO dto);

}
