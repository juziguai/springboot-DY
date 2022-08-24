package com.xtyu.toolapi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xtyu.toolapi.model.UserPO.UserPO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<UserPO> {
}
