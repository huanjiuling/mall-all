package com.mall.admin.service;

import com.mall.admin.dto.OssCallbackResult;
import com.mall.admin.dto.OssPolicyResult;
import javax.servlet.http.HttpServletRequest;


public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();
    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
