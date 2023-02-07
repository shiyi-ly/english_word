package com.english.word.mapper;

import com.english.word.entity.mybatis.SysUserConfigEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户每天推送条数 Mapper 接口
 * </p>
 *
 * @author shiyi
 * @since 2023-02-07
 */
@Mapper
public interface SysUserConfigMapper extends BaseMapper<SysUserConfigEntity> {

}
