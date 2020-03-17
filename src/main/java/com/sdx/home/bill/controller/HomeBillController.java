package com.sdx.home.bill.controller;


import com.sdx.home.bill.entity.HomeBill;
import com.sdx.home.bill.service.IHomeBillService;
import com.sdx.home.domain.request.AddBillDomain;
import com.sdx.home.domain.request.BaseRequestDomain;
import com.sdx.home.domain.request.BillListDomain;
import com.sdx.home.domain.response.BillItem;
import com.sdx.home.domain.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author sdx
 * @since 2020-03-13
 */
@RestController
@RequestMapping(value = "bill", method = RequestMethod.POST)
public class HomeBillController {

    private IHomeBillService homeBillService;

    @Autowired
    public void setHomeBillService(IHomeBillService homeBillService) {
        this.homeBillService = homeBillService;
    }

    /**
     * 添加账单
     *
     * @param domain
     * @return
     */
    @RequestMapping("addBill")
    public Response<String> addBill(@RequestBody AddBillDomain domain) {
        Response<String> response = new Response<>();
        if (domain.getUserId() == 0) {
            response.failed("请输入用户名称");
            return response;
        } else if (domain.getMoney().isEmpty()) {
            response.failed("请输入花费");
            return response;
        }
        HomeBill bill = new HomeBill();
        bill.setMoney(domain.getMoney());
        bill.setUserId(domain.getUserId());
        bill.setNote(domain.getNote());
        bill.setUseDate(domain.getDate());
        bill.setTypeId(domain.getTypeId());
        homeBillService.save(bill);
        response.success();
        return response;
    }

    /**
     * 添加账单的所有选择选项
     *
     * @param domain
     * @return
     */
    @RequestMapping("selector")
    public Response<Object> billSelector(@RequestBody BaseRequestDomain domain) {
        Response<Object> response = new Response<>();
        Map<String, Object> map = homeBillService.querySelector();
        response.success(map);
        return response;
    }

    /**
     * 查询账单
     *
     * @param domain
     * @return
     */
    @RequestMapping("billList")
    public Response<List<BillItem>> billList(@RequestBody BillListDomain domain) {
        Response<List<BillItem>> response = new Response<>();
        List<BillItem> list = homeBillService.queryBillList(domain);
        response.success(list);
        return response;
    }
}
