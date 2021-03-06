package com.github.oneone1995.mvolunteer.service;

import com.github.oneone1995.mvolunteer.domain.Certificate;

/**
 * Created by wangl on 2017/2/23.
 * 证书申请的业务接口
 */
public interface CertificateService {
    //申请证书
    String applyForCertificate(Certificate certificate);

    //修改证书状态
    boolean modifyCertificateStatusByVolunteerId(Integer volunteerId);
}
