package com.zs.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.zs.domain.dto.UserJsonDto;

/**
 * @author Shengzhao Li
 */
public interface UserService extends UserDetailsService {

    UserJsonDto loadCurrentUserJsonDto();
}