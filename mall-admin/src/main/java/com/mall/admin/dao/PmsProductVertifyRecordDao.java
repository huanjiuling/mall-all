package com.mall.admin.dao;

import com.mall.mbg.model.PmsProductVertifyRecord;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface PmsProductVertifyRecordDao {
    int insertList(@Param("list") List<PmsProductVertifyRecord> list);
}
