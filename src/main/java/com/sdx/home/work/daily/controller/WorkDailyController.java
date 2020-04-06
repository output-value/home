package com.sdx.home.work.daily.controller;


import com.sdx.home.work.daily.entity.WorkDaily;
import com.sdx.home.work.daily.service.IWorkDailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author sdx
 * @since 2020-04-06
 */
@RestController
@RequestMapping("work")
public class WorkDailyController {
    private IWorkDailyService dailyService;

     @Autowired
    public void setDailyService(IWorkDailyService dailyService) {
        this.dailyService = dailyService;
    }

    /**
     * 添加每日的日报
     *
     * @return
     */
    @RequestMapping(value = "daily",method = RequestMethod.POST)
    public String addDailyWord(String content, String date) {
//        WorkDaily daily=new WorkDaily();
//        daily.setContent(content);
//        daily.setDate(date);
//        dailyService.getBaseMapper().insert(daily);
        return "success"+content+date;
    }
}
