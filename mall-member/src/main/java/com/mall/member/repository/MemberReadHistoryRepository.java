package com.mall.member.repository;

import com.mall.member.domain.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

/**
 * 会员商品浏览历史Repository
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory,String> {

    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);

}
