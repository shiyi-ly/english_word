package com.english.word.service.impl;

import com.english.word.entity.mybatis.SysUserConfigEntity;
import com.english.word.mapper.SysUserConfigMapper;
import com.english.word.service.SysUserConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户每天推送条数 服务实现类
 * </p>
 *
 * @author shiyi
 * @since 2023-02-07
 */
@Service
public class SysUserConfigServiceImpl extends ServiceImpl<SysUserConfigMapper, SysUserConfigEntity> implements SysUserConfigService {

}
