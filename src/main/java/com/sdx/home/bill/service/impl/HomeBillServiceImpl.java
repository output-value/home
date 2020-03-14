package com.sdx.home.bill.service.impl;

import com.sdx.home.bill.entity.HomeBill;
import com.sdx.home.bill.mapper.HomeBillMapper;
import com.sdx.home.bill.service.IHomeBillService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sdx.home.domain.request.BillListDomain;
import com.sdx.home.domain.response.BillItem;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author sdx
 * @since 2020-03-13
 */
@Service
public class HomeBillServiceImpl extends ServiceImpl<HomeBillMapper, HomeBill> implements IHomeBillService {

    @Override
    public List<BillItem> queryBillList(BillListDomain domain) {
        return baseMapper.queryBillList(domain);
    }
}
