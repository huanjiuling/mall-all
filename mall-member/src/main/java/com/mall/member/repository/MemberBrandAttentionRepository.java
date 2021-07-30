package com.mall.member.repository;

import com.mall.member.domain.MemberBrandAttention;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface MemberBrandAttentionRepository extends MongoRepository<MemberBrandAttention,String> {
    MemberBrandAttention findByMemberIdAndBrandId(Long memberId, Long brandId);
    int deleteByMemberIdAndBrandId(Long memberId, Long brandId);
    List<MemberBrandAttention> findByMemberId(Long memberId);
}
