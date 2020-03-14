package com.sdx.home.bill.mapper;

import com.sdx.home.bill.entity.HomeBill;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sdx.home.domain.request.BillListDomain;
import com.sdx.home.domain.response.BillItem;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author sdx
 * @since 2020-03-13
 */
@Repository
public interface HomeBillMapper extends BaseMapper<HomeBill> {
    List<BillItem> queryBillList(BillListDomain domain);
}
