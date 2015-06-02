package com.zs.domain.oauth;

import org.apache.ibatis.annotations.Param;

import com.zs.domain.shared.Repository;

import java.util.List;

/**
 * @author Shengzhao Li
 */
public interface OauthRepository extends Repository {

    OauthClientDetails findOauthClientDetails(String clientId);

    List<OauthClientDetails> findAllOauthClientDetails();

    void updateOauthClientDetailsArchive(@Param("clientId") String clientId, @Param("archive") boolean archive);

    void saveOauthClientDetails(OauthClientDetails clientDetails);
}