package com.mall.portal.domain;

import com.mall.mbg.model.PmsComment;
import com.mall.mbg.model.PmsCommentReplay;
import lombok.Data;
import java.util.List;


@Data
public class PmsCommentParam extends PmsComment {
    private List<PmsCommentReplay> pmsCommentReplayList;
}
