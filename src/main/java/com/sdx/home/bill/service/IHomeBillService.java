package com.sdx.home.bill.service;

import com.sdx.home.bill.entity.HomeBill;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sdx.home.domain.request.BillListDomain;
import com.sdx.home.domain.response.BillItem;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author sdx
 * @since 2020-03-13
 */
public interface IHomeBillService extends IService<HomeBill> {
    /**
     * 根据条件查询所有符合条件的账单列表
     *
     * @param domain
     * @return
     */
    List<BillItem> queryBillList(BillListDomain domain);
}
