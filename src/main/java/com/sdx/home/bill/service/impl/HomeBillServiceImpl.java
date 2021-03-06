package com.sdx.home.bill.service.impl;

import com.sdx.home.bill.entity.HomeBill;
import com.sdx.home.bill.entity.HomeBillType;
import com.sdx.home.bill.mapper.HomeBillMapper;
import com.sdx.home.bill.service.IHomeBillService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sdx.home.bill.service.IHomeBillTypeService;
import com.sdx.home.domain.request.BillListDomain;
import com.sdx.home.domain.response.BillItem;
import com.sdx.home.user.entity.User;
import com.sdx.home.user.service.IUserService;
import org.omg.CORBA.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private IUserService userService;
    private IHomeBillTypeService homeBillTypeService;

    @Autowired
    public void setHomeBillTypeService(IHomeBillTypeService homeBillTypeService) {
        this.homeBillTypeService = homeBillTypeService;
    }

    @Autowired
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public List<BillItem> queryBillList(BillListDomain domain) {
        return baseMapper.queryBillList(domain);
    }

    @Override
    public Map<String, Object> querySelector() {
        List<User> userList = userService.list();
        List<HomeBillType> typeList = homeBillTypeService.list();
        Map<String, Object> map = new HashMap<>();
        map.put("userList", userList);
        map.put("typeList", typeList);
        return map;
    }
}
